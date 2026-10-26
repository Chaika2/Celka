package celestial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqo_3 implements BooleanSupplier {
   rqo_3(Path var1, Path var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return "rename " + this.id_class + " to " + this.id_break;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.move(this.id_class, this.id_break);
         return true;
      } catch (IOException var2) {
         rqR_2.id_catch.error("Failed to rename", var2);
         return false;
      }
   }
}
