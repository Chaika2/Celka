/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.io.Files
 */
package celestial;

import celestial.rrGk_1;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class rrGz_1
extends SimpleFileVisitor<Path> {
    public final /* synthetic */ Path id_class;
    public final /* synthetic */ ZipOutputStream id_break;
    public final /* synthetic */ rrGk_1 id_byte;

    public rrGz_1(rrGk_1 rrGk_12, Path path, ZipOutputStream zipOutputStream) {
        this.id_byte = rrGk_12;
        this.id_class = path;
        this.id_break = zipOutputStream;
    }

    public FileVisitResult id_class(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        if (path.endsWith("session.lock")) {
            return FileVisitResult.CONTINUE;
        }
        String string = this.id_class.resolve(this.id_byte.id_byte.relativize(path)).toString().replace('\\', '/');
        ZipEntry zipEntry = new ZipEntry(string);
        this.id_break.putNextEntry(zipEntry);
        Files.asByteSource((File)path.toFile()).copyTo((OutputStream)this.id_break);
        this.id_break.closeEntry();
        return FileVisitResult.CONTINUE;
    }

    @Override
    public /* synthetic */ FileVisitResult visitFile(Object object, BasicFileAttributes basicFileAttributes) throws IOException {
        return this.id_class((Path)object, basicFileAttributes);
    }
}

