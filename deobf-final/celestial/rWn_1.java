package celestial;

import java.util.Random;

public final class rWn_1 implements rWK {
   final int protected_;
   final float throws_;

   public rWn_1(int var1, float var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   @Override
   public rqO_2 class_() {
      return byte_;
   }

   public static rWn_1 class_(int var0, float var1) {
      return new rWn_1(var0, var1);
   }

   @Override
   public int class_(Random var1) {
      int var2 = 0;

      for (int var3 = 0; var3 < this.protected_; var3++) {
         if (var1.nextFloat() < this.throws_) {
            var2++;
         }
      }

      return var2;
   }
}
