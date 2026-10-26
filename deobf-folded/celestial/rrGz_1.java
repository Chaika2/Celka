package celestial;

import com.google.common.io.Files;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class rrGz_1 extends SimpleFileVisitor<Path> {
   rrGz_1(rrGk_1 var1, Path var2, ZipOutputStream var3) {
      this.id_byte = var1;
      this.id_class = var2;
      this.id_break = var3;
   }

   public FileVisitResult id_class(Path var1, BasicFileAttributes var2) throws IOException {
      if (var1.endsWith("session.lock")) {
         return FileVisitResult.CONTINUE;
      } else {
         String var3 = this.id_class.resolve(this.id_byte.id_byte.relativize(var1)).toString().replace('\\', '/');
         ZipEntry var4 = new ZipEntry(var3);
         this.id_break.putNextEntry(var4);
         Files.asByteSource(var1.toFile()).copyTo(this.id_break);
         this.id_break.closeEntry();
         return FileVisitResult.CONTINUE;
      }
   }
}
