package celestial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqK_2 implements BooleanSupplier {
   rqK_2(Path var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "delete old " + this.class_;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.deleteIfExists(this.class_);
         return true;
      } catch (IOException var2) {
         rqR_2.catch_.warn("Failed to delete", var2);
         return false;
      }
   }
}
