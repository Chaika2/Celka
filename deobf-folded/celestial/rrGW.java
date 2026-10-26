package celestial;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class rrGW extends SimpleFileVisitor<Path> {
   rrGW(rrGk_1 var1, Path var2) {
      this.id_break = var1;
      this.id_class = var2;
   }

   public FileVisitResult id_class(Path var1, IOException var2) throws IOException {
      if (var2 != null) {
         throw var2;
      } else {
         if (var1.equals(this.id_break.id_byte)) {
            this.id_break.id_break.close();
            Files.deleteIfExists(this.id_class);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      }
   }

   public FileVisitResult id_class(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.id_class)) {
         rrGd_1.id_class.debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }
}
