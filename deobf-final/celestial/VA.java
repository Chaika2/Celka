package celestial;

import java.util.function.BooleanSupplier;

public class VA extends Vu_1 {
   private final BooleanSupplier class_;

   public VA(String var1, int var2, String var3, BooleanSupplier var4) {
      super(var1, Vi_1.KEYSYM, var2, var3);
      this.class_ = var4;
   }

   @Override
   public void class_(boolean var1) {
      if (this.class_.getAsBoolean()) {
         if (var1) {
            super.class_(!this.protected_());
         }
      } else {
         super.class_(var1);
      }
   }
}
