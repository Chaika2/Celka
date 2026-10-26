package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class res_3 extends rUO<rUt_1> {
   public res_3(Codec<rUt_1> var1) {
      super(var1);
   }

   private static boolean class_(rRg_1 var0, rfw_3 var1) {
      do {
         var1.byte_(0, -1, 0);
         if (rYB.super_(var1)) {
            return false;
         }
      } while (var0.byte_(var1).catch_());

      var1.byte_(0, 1, 0);
      return true;
   }

   public static void class_(rRg_1 var0, Random var1, rfw_3 var2, int var3, int var4, int var5) {
      for (int var6 = 1; var6 <= var3; var6++) {
         if (var0.finally_(var2)) {
            if (var6 == var3 || !var0.finally_(var2.final_())) {
               var0.class_(var2, xu_3.XH.continue_().class_(Je_1.int_, Integer.valueOf(rfU_2.class_(var1, var4, var5))), 2);
               break;
            }

            var0.class_(var2, xu_3.Xy.continue_(), 2);
         }

         var2.class_(rpr_3.UP);
      }
   }

   private static boolean class_(rRg_1 var0, rfH_2 var1) {
      if (!var0.finally_(var1)) {
         return true;
      } else {
         xc_3 var2 = var0.byte_(var1.break_());
         return !var2.class_(xu_3.PR) && !var2.class_(xu_3.Xz) && !var2.class_(xu_3.XN);
      }
   }

   public static boolean class_(rRg_1 var0, Random var1, rfH_2 var2, int var3, int var4, int var5) {
      if (class_(var0, var2)) {
         return false;
      } else {
         break_(var0, var1, var2, var3, var4, var5);
         return true;
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      return class_(var1, var3, var4, 8, 4, 8);
   }

   private static void break_(rRg_1 var0, Random var1, rfH_2 var2, int var3, int var4, int var5) {
      rfw_3 var6 = new rfw_3();

      for (int var7 = 0; var7 < var3 * var3; var7++) {
         var6.class_(var2).byte_(rfU_2.class_(var1, -var3, var3), rfU_2.class_(var1, -var4, var4), rfU_2.class_(var1, -var3, var3));
         if (class_(var0, var6) && !class_(var0, (rfH_2)var6)) {
            int var8 = rfU_2.class_(var1, 1, var5);
            if (var1.nextInt(6) == 0) {
               var8 *= 2;
            }

            if (var1.nextInt(5) == 0) {
               var8 = 1;
            }

            byte var9 = 17;
            byte var10 = 25;
            class_(var0, var1, var6, var8, 17, 25);
         }
      }
   }
}
