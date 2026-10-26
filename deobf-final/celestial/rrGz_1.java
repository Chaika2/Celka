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
      this.byte_ = var1;
      this.class_ = var2;
      this.break_ = var3;
   }

   public FileVisitResult class_(Path var1, BasicFileAttributes var2) throws IOException {
      if (var1.endsWith("session.lock")) {
         return FileVisitResult.CONTINUE;
      } else {
         String var3 = this.class_.resolve(this.byte_.byte_.relativize(var1)).toString().replace('\\', '/');
         ZipEntry var4 = new ZipEntry(var3);
         this.break_.putNextEntry(var4);
         Files.asByteSource(var1.toFile()).copyTo(this.break_);
         this.break_.closeEntry();
         return FileVisitResult.CONTINUE;
      }
   }
}
