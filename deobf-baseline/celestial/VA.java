package celestial;

import java.util.function.BooleanSupplier;

public class VA extends Vu_1 {
   private final BooleanSupplier id_class;

   public VA(String var1, int var2, String var3, BooleanSupplier var4) {
      super(var1, Vi_1.KEYSYM, var2, var3);
      this.id_class = var4;
   }

   @Override
   public void id_class(boolean var1) {
      if (this.id_class.getAsBoolean()) {
         if (var1) {
            super.id_class(!this.id_protected());
         }
      } else {
         super.id_class(var1);
      }
   }
}
