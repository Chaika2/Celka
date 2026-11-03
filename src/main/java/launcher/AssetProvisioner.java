package launcher;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/**
 * Makes sure the vanilla Minecraft assets (sounds, languages, sounds.json, ...)
 * are available locally.
 *
 * <p>They are not part of the client jar, so a launcher copied to a clean
 * machine is completely silent until they are downloaded. The asset index is
 * bundled with the launcher; the indexed objects are fetched once from the
 * official Mojang CDN and cached in {@code <game>/assets/objects}.</p>
 */
final class AssetProvisioner {
    private static final String ASSET_INDEX = "1.16";
    private static final String INDEX_RESOURCE = "/assets/indexes/" + ASSET_INDEX + ".json";
    private static final String OBJECT_CDN = "https://resources.download.minecraft.net/";
    private static final int DOWNLOAD_THREADS = 8;
    private static final int ATTEMPTS = 4;
    private static final int PROGRESS_STEP = 100;

    private AssetProvisioner() {
    }

    /** Downloads whatever is missing; failures are reported but never abort the launch. */
    static void ensureAssets(File assetsDir, Consumer<String> log) {
        try {
            ensureAssetsOrThrow(assetsDir, log);
        } catch (Exception error) {
            log.accept("[launcher] Ресурсы не готовы: " + error.getMessage());
            log.accept("[launcher] Игра запустится без звуков; скачивание повторится при следующем запуске.");
        }
    }

    private static void ensureAssetsOrThrow(File assetsDir, Consumer<String> log) throws Exception {
        File indexFile = new File(assetsDir, "indexes/" + ASSET_INDEX + ".json");
        if (!indexFile.isFile()) {
            if (!copyBundledIndex(indexFile)) {
                throw new IOException("встроенный индекс ресурсов не найден (" + INDEX_RESOURCE + ")");
            }
            log.accept("[launcher] Индекс ресурсов распакован: " + indexFile.getAbsolutePath());
        }

        List<AssetEntry> entries = readIndex(indexFile);
        Path objectsDir = new File(assetsDir, "objects").toPath();

        List<AssetEntry> missing = new ArrayList<>();
        long missingBytes = 0;
        for (AssetEntry entry : entries) {
            Path target = objectsDir.resolve(entry.prefix()).resolve(entry.hash);
            if (Files.isRegularFile(target) && Files.size(target) == entry.size) {
                continue;
            }
            missing.add(entry);
            missingBytes += entry.size;
        }

        if (missing.isEmpty()) {
            log.accept("[launcher] Ресурсы на месте: " + assetsDir.getAbsolutePath());
            return;
        }

        if (hasAnyObject(objectsDir)) {
            log.accept("[launcher] Докачиваю недостающие ресурсы: " + missing.size()
                + " файлов, " + megabytes(missingBytes));
        } else {
            log.accept("[launcher] Первый запуск: скачиваю ресурсы Minecraft ("
                + missing.size() + " файлов, " + megabytes(missingBytes) + ") с Mojang.");
            log.accept("[launcher] Это делается один раз и может занять несколько минут.");
        }

        downloadAll(objectsDir, missing, log);
    }

    private static boolean copyBundledIndex(File indexFile) throws IOException {
        try (InputStream input = AssetProvisioner.class.getResourceAsStream(INDEX_RESOURCE)) {
            if (input == null) {
                return false;
            }
            Files.createDirectories(indexFile.getParentFile().toPath());
            Path target = indexFile.toPath();
            Path temp = target.resolveSibling(target.getFileName() + ".tmp");
            Files.copy(input, temp, StandardCopyOption.REPLACE_EXISTING);
            move(temp, target);
            return true;
        }
    }

    private static List<AssetEntry> readIndex(File indexFile) throws IOException {
        try (Reader reader = Files.newBufferedReader(indexFile.toPath(), StandardCharsets.UTF_8)) {
            JsonObject root = new JsonParser().parse(reader).getAsJsonObject();
            JsonObject objects = root.getAsJsonObject("objects");
            if (objects == null) {
                throw new IOException("в индексе ресурсов нет списка objects");
            }
            List<AssetEntry> entries = new ArrayList<>(objects.size());
            for (Map.Entry<String, JsonElement> item : objects.entrySet()) {
                JsonObject value = item.getValue().getAsJsonObject();
                entries.add(new AssetEntry(
                    item.getKey(),
                    value.get("hash").getAsString(),
                    value.get("size").getAsLong()));
            }
            return entries;
        } catch (RuntimeException error) {
            throw new IOException("не удалось разобрать индекс ресурсов: " + error.getMessage(), error);
        }
    }

    private static boolean hasAnyObject(Path objectsDir) {
        if (!Files.isDirectory(objectsDir)) {
            return false;
        }
        try (java.util.stream.Stream<Path> children = Files.list(objectsDir)) {
            return children.findAny().isPresent();
        } catch (IOException ignored) {
            return false;
        }
    }

    private static void downloadAll(Path objectsDir, List<AssetEntry> missing, Consumer<String> log)
        throws IOException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
            .connectTimeout(Duration.ofSeconds(20))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();

        ExecutorService pool = Executors.newFixedThreadPool(DOWNLOAD_THREADS, task -> {
            Thread thread = new Thread(task, "celestial-assets");
            thread.setDaemon(true);
            return thread;
        });

        try {
            CompletionService<Void> completion = new ExecutorCompletionService<>(pool);
            for (AssetEntry entry : missing) {
                completion.submit(() -> {
                    download(client, objectsDir, entry);
                    return null;
                });
            }

            int failures = 0;
            String lastFailure = null;
            for (int finished = 1; finished <= missing.size(); finished++) {
                try {
                    completion.take().get();
                } catch (ExecutionException error) {
                    failures++;
                    lastFailure = String.valueOf(error.getCause());
                }
                if (finished % PROGRESS_STEP == 0 || finished == missing.size()) {
                    log.accept("[launcher] Ресурсы: " + finished + "/" + missing.size()
                        + " (" + (finished * 100 / missing.size()) + "%)");
                }
            }

            if (failures == 0) {
                log.accept("[launcher] Ресурсы загружены.");
            } else {
                log.accept("[launcher] Не удалось скачать " + failures + " файл(ов): " + lastFailure);
                log.accept("[launcher] Игра запустится, но часть звуков может отсутствовать.");
            }
        } finally {
            pool.shutdownNow();
        }
    }

    private static void download(HttpClient client, Path objectsDir, AssetEntry entry)
        throws IOException, InterruptedException {
        Path target = objectsDir.resolve(entry.prefix()).resolve(entry.hash);
        if (Files.isRegularFile(target) && Files.size(target) == entry.size) {
            return;
        }

        Files.createDirectories(target.getParent());
        Path temp = target.resolveSibling(entry.hash + ".tmp");
        URI uri = URI.create(OBJECT_CDN + entry.prefix() + "/" + entry.hash);

        IOException last = null;
        for (int attempt = 1; attempt <= ATTEMPTS; attempt++) {
            try {
                HttpRequest request = HttpRequest.newBuilder(uri)
                    .timeout(Duration.ofSeconds(90))
                    .GET()
                    .build();
                HttpResponse<InputStream> response = client.send(request,
                    HttpResponse.BodyHandlers.ofInputStream());
                if (response.statusCode() != 200) {
                    response.body().close();
                    throw new IOException("HTTP " + response.statusCode() + " for " + uri);
                }
                try (InputStream input = response.body();
                     OutputStream output = Files.newOutputStream(temp)) {
                    input.transferTo(output);
                }
                long actual = Files.size(temp);
                if (actual != entry.size) {
                    throw new IOException("size mismatch for " + entry.hash
                        + ": expected " + entry.size + ", got " + actual);
                }
                move(temp, target);
                return;
            } catch (IOException error) {
                last = error;
                Files.deleteIfExists(temp);
                if (attempt < ATTEMPTS) {
                    Thread.sleep(300L * attempt);
                }
            }
        }
        throw new IOException("cannot download " + entry.name + ": "
            + (last == null ? "unknown error" : last.getMessage()), last);
    }

    private static void move(Path source, Path target) throws IOException {
        try {
            Files.move(source, target,
                StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
        } catch (AtomicMoveNotSupportedException ignored) {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        }
    }

    private static String megabytes(long bytes) {
        return String.format(Locale.ROOT, "%.0f МБ", bytes / (1024.0 * 1024.0));
    }

    private static final class AssetEntry {
        private final String name;
        private final String hash;
        private final long size;

        private AssetEntry(String name, String hash, long size) {
            this.name = name;
            this.hash = hash;
            this.size = size;
        }

        private String prefix() {
            return hash.substring(0, 2);
        }
    }
}
