package celestial;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqU_2 implements BooleanSupplier {
   rqU_2(Path var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "verify that " + this.id_class + " is present";
   }

   @Override
   public boolean getAsBoolean() {
      return Files.isRegularFile(this.id_class);
   }
}
