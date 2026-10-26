package celestial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqK_2 implements BooleanSupplier {
   rqK_2(Path var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "delete old " + this.id_class;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.deleteIfExists(this.id_class);
         return true;
      } catch (IOException var2) {
         rqR_2.id_catch.warn("Failed to delete", var2);
         return false;
      }
   }
}
