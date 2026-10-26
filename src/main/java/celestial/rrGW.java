/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrGd_1;
import celestial.rrGk_1;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class rrGW
extends SimpleFileVisitor<Path> {
    public final /* synthetic */ Path id_class;
    public final /* synthetic */ rrGk_1 id_break;

    public rrGW(rrGk_1 rrGk_12, Path path) {
        this.id_break = rrGk_12;
        this.id_class = path;
    }

    public FileVisitResult id_class(Path path, IOException iOException) throws IOException {
        if (iOException != null) {
            throw iOException;
        }
        if (path.equals(this.id_break.id_byte)) {
            this.id_break.id_break.close();
            Files.deleteIfExists(this.id_class);
        }
        Files.delete(path);
        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult id_class(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (!path.equals(this.id_class)) {
            rrGd_1.id_class.debug("Deleting {}", (Object)path);
            Files.delete(path);
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
        return this.id_class((Path)object, basicFileAttributes);
    }

    @Override
    public /* synthetic */ FileVisitResult postVisitDirectory(Object object, IOException iOException) throws IOException {
        return this.id_class((Path)object, iOException);
    }
}

