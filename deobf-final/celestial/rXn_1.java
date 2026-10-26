package celestial;

import java.util.Random;

public class rXn_1 {
   private static final Random class_ = new Random();

   public static void class_(rYB var0, rfH_2 var1, rqs_3<rdn_3> var2) {
      var2.forEach(var2x -> class_(var0, (double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2x));
   }

   public static void class_(rYB var0, double var1, double var3, double var5, rdn_3 var7) {
      double var8 = (double)aI_2.short_.extends_();
      double var10 = 1.0 - var8;
      double var12 = var8 / 2.0;
      double var14 = Math.floor(var1) + class_.nextDouble() * var10 + var12;
      double var16 = Math.floor(var3) + class_.nextDouble() * var10;
      double var18 = Math.floor(var5) + class_.nextDouble() * var10 + var12;

      while (!var7.class_()) {
         rsE_2 var20 = new rsE_2(var0, var14, var16, var18, var7.class_(class_.nextInt(21) + 10));
         float var21 = 0.05F;
         var20.catch_(class_.nextGaussian() * 0.05F, class_.nextGaussian() * 0.05F + 0.2F, class_.nextGaussian() * 0.05F);
         var0.a_(var20);
      }
   }

   public static void class_(rYB var0, rfH_2 var1, rXu_1 var2) {
      class_(var0, (double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2);
   }

   private static void class_(rYB var0, double var1, double var3, double var5, rXu_1 var7) {
      for (int var8 = 0; var8 < var7.else_(); var8++) {
         class_(var0, var1, var3, var5, var7.extends_(var8));
      }
   }

   public static void class_(rYB var0, an_3 var1, rXu_1 var2) {
      class_(var0, var1.rx(), var1.re(), var1.BO(), var2);
   }
}
