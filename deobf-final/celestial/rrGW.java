package celestial;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class rrGW extends SimpleFileVisitor<Path> {
   rrGW(rrGk_1 var1, Path var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   public FileVisitResult class_(Path var1, IOException var2) throws IOException {
      if (var2 != null) {
         throw var2;
      } else {
         if (var1.equals(this.break_.byte_)) {
            this.break_.break_.close();
            Files.deleteIfExists(this.class_);
         }

         Files.delete(var1);
         return FileVisitResult.CONTINUE;
      }
   }

   public FileVisitResult class_(Path var1, BasicFileAttributes var2) throws IOException {
      if (!var1.equals(this.class_)) {
         rrGd_1.class_.debug("Deleting {}", var1);
         Files.delete(var1);
      }

      return FileVisitResult.CONTINUE;
   }
}
