package celestial;

public class rrzb_3 {
   public static double class_(int var0) {
      double var1 = (double)var0 / 4096.0;
      var1 *= 0.995;
      double var3 = var1 * 2.0 - 1.0;
      var3 = rfU_2.class_(var3, -1.0, 1.0);
      return (double)rfU_2.class_(1.0 - var3 * var3);
   }

   public static int class_(yQ_2 var0) {
      roQ_2[] var1 = var0.volatile_().byte_();
      if (var1 == null) {
         return 0;
      } else {
         int var2 = var0.throws_().c_() >> 4;
         roQ_2 var3 = var1[var2];
         return var3 == null ? 0 : var3.extends_();
      }
   }

   public static double break_(yQ_2 var0) {
      int var1 = class_(var0);
      return class_(var1);
   }
}
