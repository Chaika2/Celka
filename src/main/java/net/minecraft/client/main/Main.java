package net.minecraft.client.main;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.security.MessageDigest;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class Main {
    private static final String CDN_BASE =
        "https://huggingface.co/datasets/Collapsecdn/collapsecdn/resolve/main/";
    private static final String LIBRARIES_ARCHIVE = "misc/celestial-libraries.zip";

    private Main() {
    }

    public static void main(String[] args) throws Throwable {
        File sourceJar = sourceJar();
        File appHome = appHome(sourceJar);
        File root = resolveCollapseLoaderRoot(sourceJar);

        // The packaged launcher ships the complete runtime inside the app-image
        // (app/celestial-libraries/celestial-client-remapped.jar plus the jars
        // next to it). Use that copy when present: it makes the launcher fully
        // offline and avoids the HuggingFace download that times out on some
        // networks. Only a real CollapseLoader installation falls back to the
        // CDN path below.
        List<File> libraryJars = bundledLibraryJars(appHome);
        if (libraryJars.isEmpty()) {
            configureNativeLibraries(root);
            File libraries = new File(root, "celestial-libraries");
            ensureLibraries(root, libraries);
            libraryJars = jarsIn(libraries);
            if (libraryJars.isEmpty()) {
                throw new IOException("Celestial libraries folder contains no JAR files: " + libraries);
            }
        } else {
            configureNativeLibraries(appHome, root);
            System.out.println("Celestial libraries: bundled " + libraryJars.size()
                + " JARs from " + appHome.getAbsolutePath());
        }

        List<URL> classpath = new ArrayList<>();
        for (File file : libraryJars) {
            classpath.add(file.toURI().toURL());
        }

        File aq1Fix = resolveAq1FixDir();
        if (aq1Fix != null) {
            classpath.add(0, aq1Fix.toURI().toURL());
            System.out.println("Celestial Aq_1 fix: " + aq1Fix.getAbsolutePath());
        }

        File packetTap = resolvePacketTapDir();
        if (packetTap != null) {
            classpath.add(0, packetTap.toURI().toURL());
            System.out.println("Celestial packet tap: " + packetTap.getAbsolutePath());
        }

        URLClassLoader runtime = new URLClassLoader(
            classpath.toArray(new URL[0]),
            ClassLoader.getPlatformClassLoader()
        );
        Thread.currentThread().setContextClassLoader(runtime);

        try {
            Class<?> realMain = Class.forName("net.minecraft.client.main.Main", true, runtime);
            try {
                realMain.getMethod("main", String[].class).invoke(null, (Object) args);
            } catch (InvocationTargetException error) {
                throw error.getCause();
            }
        } finally {
        }
    }

    private static File resolveAq1FixDir() {
        String override = System.getProperty("celestial.aq1fix");
        if (override != null && !override.isBlank()) {
            File dir = new File(override);
            if (new File(dir, "celestial/Aq_1.class").isFile()) {
                return dir.getAbsoluteFile();
            }
        }
        File workingDir = new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        File parent = workingDir.getParentFile();
        File[] candidates = new File[] {
            new File(workingDir, "celestial-fix"),
            new File(workingDir, "build/celestial-fix"),
            parent == null ? null : new File(parent, "build/celestial-fix"),
            parent == null ? null : new File(parent, "celestial-fix")
        };
        for (File dir : candidates) {
            if (dir != null && new File(dir, "celestial/Aq_1.class").isFile()) {
                return dir.getAbsoluteFile();
            }
        }
        return null;
    }

    private static File resolvePacketTapDir() {
        String override = System.getProperty("celestial.packettap");
        if (override != null && !override.isBlank()) {
            File dir = new File(override);
            if (new File(dir, "celestial/ruk_3.class").isFile()) {
                return dir.getAbsoluteFile();
            }
        }
        File workingDir = new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        File parent = workingDir.getParentFile();
        File[] candidates = new File[] {
            new File(workingDir, "packettap"),
            new File(workingDir, "build/packettap"),
            parent == null ? null : new File(parent, "build/packettap"),
            parent == null ? null : new File(parent, "packettap")
        };
        for (File dir : candidates) {
            if (dir != null && new File(dir, "celestial/ruk_3.class").isFile()) {
                return dir.getAbsoluteFile();
            }
        }
        return null;
    }

    private static File sourceJar() throws Exception {
        java.security.CodeSource cs = Main.class.getProtectionDomain().getCodeSource();
        if (cs != null) {
            java.net.URL loc = cs.getLocation();
            if (loc != null) {
                File located = new File(loc.toURI()).getAbsoluteFile();
                if (located.exists()) {
                    return located;
                }
            }
        }

        // The game bootstrap is copied into the client's own classloader
        // (celestial.rrzu_3 defines it manually), so its CodeSource can be
        // null. The launcher JAR is always on the class path, use it instead.
        File launcher = findOnClassPath("celestial-launcher.jar");
        if (launcher != null) {
            return launcher;
        }
        return new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
    }

    private static File findOnClassPath(String fileName) {
        String classPath = System.getProperty("java.class.path", "");
        for (String entry : classPath.split(Pattern.quote(File.pathSeparator))) {
            if (entry.isBlank()) {
                continue;
            }
            File file = new File(entry);
            if (file.isFile() && file.getName().equalsIgnoreCase(fileName)) {
                return file.getAbsoluteFile();
            }
        }
        return null;
    }

    /**
     * Directory of a self-contained launcher (the jpackage app-image), or
     * {@code null} for a Gradle run / CollapseLoader installation.
     */
    private static File appHome(File sourceJar) {
        if (sourceJar != null && sourceJar.isFile() && sourceJar.getParentFile() != null) {
            File directory = sourceJar.getParentFile();
            if (isStandaloneApp(directory)) {
                return directory;
            }
        }

        File launcher = findOnClassPath("celestial-launcher.jar");
        if (launcher != null && launcher.getParentFile() != null
            && isStandaloneApp(launcher.getParentFile())) {
            return launcher.getParentFile();
        }

        // The game working directory is <app>/run inside the packaged launcher.
        File current = new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        for (int i = 0; i < 4 && current != null; i++) {
            if (isStandaloneApp(current)) {
                return current;
            }
            current = current.getParentFile();
        }
        return null;
    }

    private static boolean isStandaloneApp(File directory) {
        if (directory == null) {
            return false;
        }
        return new File(directory, "celestial-client-app.jar").isFile()
            || new File(directory, "celestial-libraries/celestial-client-remapped.jar").isFile();
    }

    /**
     * JARs to feed into the nested game classloader when the launcher ships
     * its runtime. The launcher JAR itself is excluded: it contains this
     * bootstrap class and the loader is asked to find the real
     * {@code net.minecraft.client.main.Main} in the client JAR.
     */
    private static List<File> bundledLibraryJars(File appHome) {
        if (appHome == null) {
            return List.of();
        }

        File librariesDir = new File(appHome, "celestial-libraries");
        if (!new File(librariesDir, "celestial-client-remapped.jar").isFile()) {
            return List.of();
        }

        Map<String, File> byName = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (File jar : jarsIn(librariesDir)) {
            byName.putIfAbsent(jar.getName(), jar);
        }
        for (File jar : jarsIn(appHome)) {
            String name = jar.getName().toLowerCase(Locale.ROOT);
            if (name.equals("celestial-launcher.jar") || name.equals("celestial-client-app.jar")) {
                continue;
            }
            byName.putIfAbsent(jar.getName(), jar);
        }
        return new ArrayList<>(byName.values());
    }

    private static List<File> jarsIn(File directory) {
        List<File> result = new ArrayList<>();
        File[] files = directory == null ? null : directory.listFiles(
            (dir, name) -> name.toLowerCase(Locale.ROOT).endsWith(".jar"));
        if (files != null) {
            java.util.Arrays.sort(files, Comparator.comparing(File::getName));
            for (File file : files) {
                if (file.isFile()) {
                    result.add(file);
                }
            }
        }
        return result;
    }

    private static File resolveCollapseLoaderRoot(File sourceJar) {
        if (sourceJar.isFile()) {
            File clientFolder = sourceJar.getParentFile();
            File customClients = clientFolder == null ? null : clientFolder.getParentFile();
            File root = customClients == null ? null : customClients.getParentFile();
            if (root != null && (new File(root, "custom_clients").isDirectory()
                || new File(root, "libraries").isDirectory())) {
                return root;
            }
        }

        File current = new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        for (int i = 0; i < 8 && current != null; i++) {
            if (new File(current, "custom_clients").isDirectory()
                || new File(current, "celestial-libraries").isDirectory()) {
                return current;
            }
            current = current.getParentFile();
        }

        String os = System.getProperty("os.name", "").toLowerCase();
        String home = System.getProperty("user.home", ".");
        if (os.contains("win")) {
            String appData = System.getenv("APPDATA");
            return new File(appData == null ? home : appData, "CollapseLoader");
        }
        if (os.contains("mac")) {
            return new File(home, "Library/Application Support/CollapseLoader");
        }
        String xdg = System.getenv("XDG_DATA_HOME");
        return new File(xdg == null ? home + "/.local/share" : xdg, "CollapseLoader");
    }

    private static void configureNativeLibraries(File root) {
        configureNativeLibraries(null, root);
    }

    private static void configureNativeLibraries(File appHome, File root) {
        String os = System.getProperty("os.name", "").toLowerCase();
        List<File> roots = new ArrayList<>();
        if (appHome != null) {
            roots.add(appHome);
        }
        if (root != null && !root.equals(appHome)) {
            roots.add(root);
        }

        List<File> candidates = new ArrayList<>();
        for (File base : roots) {
            if (os.contains("win")) {
                candidates.add(new File(base, "natives-windows"));
                candidates.add(new File(base, "natives"));
            } else if (os.contains("mac")) {
                candidates.add(new File(base, "natives-macos"));
                candidates.add(new File(base, "natives-macos-arm64"));
                candidates.add(new File(base, "natives"));
            } else {
                candidates.add(new File(base, "natives-linux"));
                candidates.add(new File(base, "natives"));
            }
        }

        String configured = System.getProperty("java.library.path");
        if (configured != null) {
            for (String value : configured.split(java.util.regex.Pattern.quote(File.pathSeparator))) {
                if (!value.isBlank()) {
                    candidates.add(new File(value));
                }
            }
        }

        for (File nativeDirectory : candidates) {
            if (nativeDirectory.isDirectory()) {
                String path = nativeDirectory.getAbsolutePath();
                System.setProperty("java.library.path", path);
                System.setProperty("jna.library.path", path);
                System.setProperty("jna.tmpdir", path);
                System.setProperty("org.lwjgl.librarypath", path);
                System.out.println("Celestial natives: " + path);
                return;
            }
        }
    }

    private static void ensureLibraries(File root, File libraries) throws Exception {
        if (verifyLibraries(libraries)) {
            System.out.println("Celestial libraries: verified " + libraries.getAbsolutePath());
            return;
        }

        if (!root.exists() && !root.mkdirs()) {
            throw new IOException("Cannot create CollapseLoader root: " + root);
        }

        File archive = new File(root, ".celestial-libraries.zip.part");
        File extracting = new File(root, ".celestial-libraries.extracting");
        deleteRecursively(extracting.toPath());
        Files.createDirectories(extracting.toPath());

        String url = CDN_BASE + LIBRARIES_ARCHIVE;
        System.out.println("Celestial libraries are missing. Downloading " + url);
        HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(20))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();
        HttpRequest request = HttpRequest.newBuilder(URI.create(url))
            .timeout(Duration.ofMinutes(5))
            .GET()
            .build();
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());
        if (response.statusCode() != 200) {
            throw new IOException("CDN returned HTTP " + response.statusCode() + " for " + url);
        }
        Files.write(archive.toPath(), response.body());

        unzip(archive.toPath(), extracting.toPath());
        if (!verifyLibraries(extracting)) {
            throw new IOException("Downloaded Celestial libraries failed manifest verification");
        }

        deleteRecursively(libraries.toPath());
        Files.move(extracting.toPath(), libraries.toPath(), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(archive.toPath());
        System.out.println("Celestial libraries installed: " + libraries.getAbsolutePath());
    }

    private static boolean verifyLibraries(File directory) throws Exception {
        File manifest = new File(directory, "manifest.txt");
        if (!manifest.isFile()) {
            return false;
        }

        int checked = 0;
        for (String line : Files.readAllLines(manifest.toPath(), StandardCharsets.UTF_8)) {
            String trimmed = line.trim();
            int separator = trimmed.indexOf(':');
            if (separator <= 0) {
                continue;
            }
            String relative = trimmed.substring(0, separator);
            String expected = trimmed.substring(separator + 1).trim().toLowerCase();
            Path base = directory.toPath().toAbsolutePath().normalize();
            Path file = base.resolve(relative).normalize();
            if (!file.startsWith(base) || !Files.isRegularFile(file)) {
                return false;
            }
            String actual = sha256(file);
            if (!actual.equals(expected)) {
                return false;
            }
            checked++;
        }
        return checked > 0;
    }

    private static String sha256(Path file) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (java.io.InputStream input = Files.newInputStream(file)) {
            byte[] buffer = new byte[8192];
            int read;
            while ((read = input.read(buffer)) >= 0) {
                if (read > 0) {
                    digest.update(buffer, 0, read);
                }
            }
        }
        return HexFormat.of().formatHex(digest.digest());
    }

    private static void unzip(Path archive, Path destination) throws IOException {
        Path base = destination.toAbsolutePath().normalize();
        try (ZipInputStream input = new ZipInputStream(Files.newInputStream(archive))) {
            ZipEntry entry;
            byte[] buffer = new byte[8192];
            while ((entry = input.getNextEntry()) != null) {
                Path target = base.resolve(entry.getName()).normalize();
                if (!target.startsWith(base)) {
                    throw new IOException("Unsafe ZIP entry: " + entry.getName());
                }
                if (entry.isDirectory()) {
                    Files.createDirectories(target);
                } else {
                    Files.createDirectories(target.getParent());
                    try (java.io.OutputStream output = Files.newOutputStream(target)) {
                        int read;
                        while ((read = input.read(buffer)) >= 0) {
                            if (read > 0) {
                                output.write(buffer, 0, read);
                            }
                        }
                    }
                }
                input.closeEntry();
            }
        }
    }

    private static void deleteRecursively(Path path) throws IOException {
        if (!Files.exists(path)) {
            return;
        }
        try (java.util.stream.Stream<Path> paths = Files.walk(path)) {
            paths.sorted(Comparator.reverseOrder()).forEach(item -> {
                try {
                    Files.deleteIfExists(item);
                } catch (IOException error) {
                    throw new RuntimeException(error);
                }
            });
        } catch (RuntimeException error) {
            if (error.getCause() instanceof IOException) {
                throw (IOException) error.getCause();
            }
            throw error;
        }
    }
}
