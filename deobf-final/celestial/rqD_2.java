package celestial;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqD_2 implements BooleanSupplier {
   rqD_2(Path var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "verify that " + this.class_ + " is deleted";
   }

   @Override
   public boolean getAsBoolean() {
      return !Files.exists(this.class_);
   }
}
