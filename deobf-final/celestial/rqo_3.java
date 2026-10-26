package celestial;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.BooleanSupplier;

class rqo_3 implements BooleanSupplier {
   rqo_3(Path var1, Path var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return "rename " + this.class_ + " to " + this.break_;
   }

   @Override
   public boolean getAsBoolean() {
      try {
         Files.move(this.class_, this.break_);
         return true;
      } catch (IOException var2) {
         rqR_2.catch_.error("Failed to rename", var2);
         return false;
      }
   }
}
