package celestial;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqU_2 implements BooleanSupplier {
   rqU_2(Path var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return "verify that " + this.class_ + " is present";
   }

   @Override
   public boolean getAsBoolean() {
      return Files.isRegularFile(this.class_);
   }
}
