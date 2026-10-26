package celestial;

import java.util.Random;

public class rXn_1 {
   private static final Random id_class = new Random();

   public static void id_class(rYB var0, rfH_2 var1, rqs_3<rdn_3> var2) {
      var2.forEach(var2x -> id_class(var0, (double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2x));
   }

   public static void id_class(rYB var0, double var1, double var3, double var5, rdn_3 var7) {
      double var8 = (double)aI_2.id_short.id_extends();
      double var10 = 1.0 - var8;
      double var12 = var8 / 2.0;
      double var14 = Math.floor(var1) + id_class.nextDouble() * var10 + var12;
      double var16 = Math.floor(var3) + id_class.nextDouble() * var10;
      double var18 = Math.floor(var5) + id_class.nextDouble() * var10 + var12;

      while (!var7.id_class()) {
         rsE_2 var20 = new rsE_2(var0, var14, var16, var18, var7.id_class(id_class.nextInt(21) + 10));
         float var21 = 0.05F;
         var20.id_catch(id_class.nextGaussian() * 0.05F, id_class.nextGaussian() * 0.05F + 0.2F, id_class.nextGaussian() * 0.05F);
         var0.a_(var20);
      }
   }

   public static void id_class(rYB var0, rfH_2 var1, rXu_1 var2) {
      id_class(var0, (double)var1.b_(), (double)var1.c_(), (double)var1.d_(), var2);
   }

   private static void id_class(rYB var0, double var1, double var3, double var5, rXu_1 var7) {
      for (int var8 = 0; var8 < var7.id_else(); var8++) {
         id_class(var0, var1, var3, var5, var7.id_extends(var8));
      }
   }

   public static void id_class(rYB var0, an_3 var1, rXu_1 var2) {
      id_class(var0, var1.rx(), var1.re(), var1.BO(), var2);
   }
}
