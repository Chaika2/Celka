package launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Builds the command line for the Celestial client and starts it in a separate
 * JVM.
 *
 * <p>The launcher window itself stays open and keeps the log of the game
 * process. The child JVM starts {@code offline.launcher.OfflineLauncher}, which
 * is exactly what the Gradle {@code run}/{@code runClient} tasks use, so the
 * patched classes from {@code run/celestial-fix} are picked up in the same
 * way.</p>
 */
public final class GameLauncher {
    /** Entry point of the actual game bootstrap. */
    public static final String MAIN_CLASS = "offline.launcher.OfflineLauncher";

    public static final int DEFAULT_WIDTH = 1280;
    public static final int DEFAULT_HEIGHT = 720;

    private GameLauncher() {
    }

    /**
     * Starts the client and streams its output into {@code log}.
     *
     * @param username nickname for the offline session (1-16 characters)
     * @param log      receives every line printed by the game process
     * @return the running process
     */
    public static Process start(String username, Consumer<String> log) throws IOException {
        File gameDir = gameDir();
        File assetsDir = assetsDir();
        File nativesDir = nativesDir();

        log.accept("[launcher] Ник: " + username);
        log.accept("[launcher] Папка игры: " + gameDir.getAbsolutePath());
        log.accept("[launcher] Ресурсы: " + assetsDir.getAbsolutePath()
            + (hasAssets(assetsDir) ? "" : "  (ВНИМАНИЕ: indexes/1.16.json не найден)"));
        log.accept("[launcher] Нативные библиотеки: " + nativesDir.getAbsolutePath());
        File fix = fixDir(gameDir);
        log.accept("[launcher] Патч клиента: " + (fix == null ? "не найден" : fix.getAbsolutePath()));
        log.accept("[launcher] Запуск клиента...");

        List<String> command = buildCommand(username, gameDir, assetsDir, nativesDir);

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.directory(gameDir);
        builder.redirectErrorStream(true);

        Process process = builder.start();
        Thread pump = new Thread(() -> pumpOutput(process, log), "celestial-game-log");
        pump.setDaemon(true);
        pump.start();
        return process;
    }

    /** Full command line, exposed for troubleshooting. */
    public static List<String> buildCommand(String username) {
        File gameDir = gameDir();
        return buildCommand(username, gameDir, assetsDir(), nativesDir());
    }

    private static List<String> buildCommand(String username, File gameDir, File assetsDir, File nativesDir) {
        List<String> command = new ArrayList<>();
        command.add(javaExecutable());

        // --- JVM flags: kept in sync with configureClientExec() in build.gradle ---
        command.add("-Xms512m");
        command.add("-Xmx4g");
        command.add("-Djava.library.path=" + nativesDir.getAbsolutePath());
        command.add("-Djna.library.path=" + nativesDir.getAbsolutePath());
        command.add("-Dorg.lwjgl.librarypath=" + nativesDir.getAbsolutePath());
        command.add("-Djna.tmpdir=" + nativesDir.getAbsolutePath());
        command.add("-Dsun.net.client.defaultConnectTimeout=1500");
        command.add("-Dsun.net.client.defaultReadTimeout=1500");
        command.add("-Dlog4j2.formatMsgNoLookups=true");
        command.add("--add-opens=java.base/java.lang=ALL-UNNAMED");
        command.add("--add-opens=java.base/java.lang.reflect=ALL-UNNAMED");
        command.add("--add-opens=java.base/java.net=ALL-UNNAMED");
        command.add("--add-opens=java.base/java.nio=ALL-UNNAMED");
        command.add("--add-opens=java.base/jdk.internal.misc=ALL-UNNAMED");
        command.add("--add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
        command.add("--add-opens=jdk.unsupported/sun.misc=ALL-UNNAMED");
        command.add("--add-exports=java.base/jdk.internal.misc=ALL-UNNAMED");

        // Deterministic patch lookup, independent of the working directory.
        File fix = fixDir(gameDir);
        if (fix != null) {
            command.add("-Dcelestial.aq1fix=" + fix.getAbsolutePath());
        }

        command.add("-cp");
        command.add(System.getProperty("java.class.path"));
        command.add(MAIN_CLASS);

        // --- game arguments ---
        command.add("--username");
        command.add(username);
        command.add("--version");
        command.add("Beta 1.16.5");
        command.add("--gameDir");
        command.add(gameDir.getAbsolutePath());
        command.add("--assetsDir");
        command.add(assetsDir.getAbsolutePath());
        command.add("--assetIndex");
        command.add("1.16");
        command.add("--uuid");
        command.add(offlineUuid(username));
        command.add("--accessToken");
        command.add("0");
        command.add("--userType");
        command.add("legacy");
        command.add("--versionType");
        command.add("release");
        command.add("--userProperties");
        command.add("{}");
        command.add("--width");
        command.add(Integer.toString(DEFAULT_WIDTH));
        command.add("--height");
        command.add(Integer.toString(DEFAULT_HEIGHT));
        return command;
    }

    /** Same UUID a vanilla offline server would assign to this nickname. */
    public static String offlineUuid(String username) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + username).getBytes(StandardCharsets.UTF_8)).toString();
    }

    public static File gameDir() {
        File dir = new File(projectRoot(), "run");
        if (!dir.isDirectory() && !dir.mkdirs()) {
            return new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        }
        return dir.getAbsoluteFile();
    }

    public static File assetsDir() {
        List<File> candidates = new ArrayList<>();
        candidates.add(new File(projectRoot(), "run/assets"));
        candidates.add(new File(projectRoot().getParentFile() == null ? projectRoot() : projectRoot().getParentFile(), "Celestial/assets"));
        candidates.add(new File("C:/Celestial/assets"));
        String appData = System.getenv("APPDATA");
        if (appData != null) {
            candidates.add(new File(appData, ".minecraft/assets"));
            candidates.add(new File(appData, "CollapseLoader/assets"));
        }
        for (File candidate : candidates) {
            if (hasAssets(candidate)) {
                return candidate.getAbsoluteFile();
            }
        }
        return new File(projectRoot(), "run/assets").getAbsoluteFile();
    }

    public static File nativesDir() {
        List<File> candidates = new ArrayList<>();
        File appHome = appHome();
        if (appHome != null) {
            candidates.add(new File(appHome, "natives"));
        }
        candidates.add(new File(projectRoot(), "natives"));
        String appData = System.getenv("APPDATA");
        if (appData != null) {
            candidates.add(new File(appData, "CollapseLoader/natives-windows"));
            candidates.add(new File(appData, "CollapseLoader/natives"));
        }
        for (File candidate : candidates) {
            if (candidate.isDirectory()) {
                return candidate.getAbsoluteFile();
            }
        }
        return new File(projectRoot(), "natives").getAbsoluteFile();
    }

    /** Directory with the patched {@code celestial/Aq_1.class} and {@code celestial/rrnD_2.class}. */
    public static File fixDir(File gameDir) {
        List<File> candidates = new ArrayList<>();
        // Bundled inside the jpackage app-image (app/celestial-fix) -- preferred so
        // a copied launcher still applies the patches.
        File appHome = appHome();
        if (appHome != null) {
            candidates.add(new File(appHome, "celestial-fix"));
        }
        candidates.add(new File(gameDir, "celestial-fix"));
        candidates.add(new File(projectRoot(), "build/celestial-fix"));
        candidates.add(new File(projectRoot(), "celestial-fix"));
        for (File candidate : candidates) {
            if (new File(candidate, "celestial/Aq_1.class").isFile()
                || new File(candidate, "celestial/rrnD_2.class").isFile()) {
                return candidate.getAbsoluteFile();
            }
        }
        return null;
    }

    /**
     * Directory that holds the launcher jar: {@code build/classes/java/main} for
     * a Gradle run, or {@code <app>/app} inside a jpackage app-image. Used to
     * find the bundled natives and patched classes.
     */
    public static File appHome() {
        try {
            File self = new File(GameLauncher.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            return self.isDirectory() ? self.getAbsoluteFile() : self.getParentFile();
        } catch (Exception ignored) {
            return null;
        }
    }

    public static boolean hasAssets(File dir) {
        return dir != null && new File(dir, "indexes/1.16.json").isFile();
    }

    /** Project root (the folder with build.gradle), or the working directory when installed elsewhere. */
    public static File projectRoot() {
        File dir = new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
        for (int i = 0; i < 10 && dir != null; i++) {
            if (new File(dir, "build.gradle").isFile()
                || new File(dir, "gradlew.bat").isFile()
                || new File(dir, "settings.gradle").isFile()) {
                return dir;
            }
            dir = dir.getParentFile();
        }

        // Installed layout (installDist): <app>/lib/*.jar -> <app>/
        try {
            File self = new File(GameLauncher.class.getProtectionDomain().getCodeSource().getLocation().toURI());
            File home = self.isDirectory() ? self : self.getParentFile();
            if (home != null && home.getName().equals("lib")) {
                home = home.getParentFile();
            }
            if (home != null) {
                return home.getAbsoluteFile();
            }
        } catch (Exception ignored) {
            // fall through
        }
        return new File(System.getProperty("user.dir", ".")).getAbsoluteFile();
    }

    private static String javaExecutable() {
        boolean windows = System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");
        String exe = windows ? "java.exe" : "java";

        List<File> candidates = new ArrayList<>();
        String home = System.getProperty("java.home", "");
        if (!home.isEmpty()) {
            candidates.add(new File(new File(home, "bin"), exe));
        }
        File appHome = appHome();
        if (appHome != null) {
            // jpackage app-image layout: <app>/runtime/bin/java.exe
            candidates.add(new File(new File(appHome, "runtime/bin"), exe));
        }
        String javaHome = System.getenv("JAVA_HOME");
        if (javaHome != null && !javaHome.isEmpty()) {
            candidates.add(new File(new File(javaHome, "bin"), exe));
        }
        for (File candidate : candidates) {
            if (candidate.isFile()) {
                return candidate.getAbsolutePath();
            }
        }
        // Last resort: rely on PATH.
        return exe;
    }

    private static void pumpOutput(Process process, Consumer<String> log) {
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                log.accept(line);
            }
        } catch (IOException error) {
            log.accept("[launcher] Чтение лога остановлено: " + error.getMessage());
        }
    }
}
