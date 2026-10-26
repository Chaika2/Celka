package celestial;

import java.util.EnumSet;
import java.util.Random;

class rEt_1 extends rBk_1 {
   private final rEy_1 class_;

   @Override
   public void byte_() {
      Random var1 = this.class_.Sa();
      double var2 = this.class_.rx() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var4 = this.class_.re() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var6 = this.class_.BO() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.class_.super_().class_(var2, var4, var6, 1.0);
   }

   public rEt_1(rEy_1 var1) {
      this.class_ = var1;
      this.class_(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean class_() {
      rPY var1 = this.class_.super_();
      if (!var1.break_()) {
         return true;
      } else {
         double var2 = var1.protected_() - this.class_.rx();
         double var4 = var1.throws_() - this.class_.re();
         double var6 = var1.case_() - this.class_.BO();
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         return var8 < 1.0 || var8 > 3600.0;
      }
   }

   @Override
   public boolean break_() {
      return false;
   }
}
