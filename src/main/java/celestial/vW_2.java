/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.vk_3;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class vW_2
implements AutoCloseable {
    private final WatchService id_class;
    private final Path id_break;

    public vW_2(File file) throws IOException {
        this.id_break = file.toPath();
        this.id_class = this.id_break.getFileSystem().newWatchService();
        try {
            this.id_class(this.id_break);
            try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(this.id_break);){
                for (Path path : directoryStream) {
                    if (!Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) continue;
                    this.id_class(path);
                }
            }
        }
        catch (Exception exception) {
            this.id_class.close();
            throw exception;
        }
    }

    public boolean id_class() throws IOException {
        WatchKey watchKey;
        boolean bl = false;
        while ((watchKey = this.id_class.poll()) != null) {
            for (WatchEvent<?> watchEvent : watchKey.pollEvents()) {
                Path path;
                bl = true;
                if (watchKey.watchable() != this.id_break || watchEvent.kind() != StandardWatchEventKinds.ENTRY_CREATE || !Files.isDirectory(path = this.id_break.resolve((Path)watchEvent.context()), LinkOption.NOFOLLOW_LINKS)) continue;
                this.id_class(path);
            }
            watchKey.reset();
        }
        return bl;
    }

    private void id_class(Path path) throws IOException {
        path.register(this.id_class, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);
    }

    public static vW_2 id_class(File file) {
        try {
            return new vW_2(file);
        }
        catch (IOException iOException) {
            vk_3.id_implements.warn("Failed to initialize pack directory {} monitoring", (Object)file, (Object)iOException);
            return null;
        }
    }

    @Override
    public void close() throws IOException {
        this.id_class.close();
    }
}

