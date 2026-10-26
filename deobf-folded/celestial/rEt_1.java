package celestial;

import java.util.EnumSet;
import java.util.Random;

class rEt_1 extends rBk_1 {
   private final rEy_1 id_class;

   @Override
   public void id_byte() {
      Random var1 = this.id_class.Sa();
      double var2 = this.id_class.rx() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var4 = this.id_class.re() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      double var6 = this.id_class.BO() + (double)((var1.nextFloat() * 2.0F - 1.0F) * 16.0F);
      this.id_class.id_super().id_class(var2, var4, var6, 1.0);
   }

   public rEt_1(rEy_1 var1) {
      this.id_class = var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   @Override
   public boolean id_class() {
      rPY var1 = this.id_class.id_super();
      if (!var1.id_break()) {
         return true;
      } else {
         double var2 = var1.id_protected() - this.id_class.rx();
         double var4 = var1.id_throws() - this.id_class.re();
         double var6 = var1.id_case() - this.id_class.BO();
         double var8 = var2 * var2 + var4 * var4 + var6 * var6;
         return var8 < 1.0 || var8 > 3600.0;
      }
   }

   @Override
   public boolean id_break() {
      return false;
   }
}
