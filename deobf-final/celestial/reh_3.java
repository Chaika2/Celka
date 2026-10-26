package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reh_3 extends rUO<rUt_1> {
   private static final rpr_3[] class_ = rpr_3.values();

   public reh_3(Codec<rUt_1> var1) {
      super(var1);
   }

   public static void class_(rRg_1 var0, Random var1, rfw_3 var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 <= var3; var6++) {
         if (var0.finally_(var2)) {
            if (var6 == var3 || !var0.finally_(var2.break_())) {
               var0.class_(var2, xu_3.XC.continue_().class_(Je_1.int_, Integer.valueOf(rfU_2.class_(var1, var4, var5))), 2);
               break;
            }

            var0.class_(var2, xu_3.Xl.continue_(), 2);
         }

         var2.class_(rpr_3.DOWN);
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (!var1.finally_(var4)) {
         return false;
      } else {
         xc_3 var6 = var1.byte_(var4.final_());
         if (!var6.class_(xu_3.PR) && !var6.class_(xu_3.bg)) {
            return false;
         } else {
            this.class_(var1, var3, var4);
            this.break_(var1, var3, var4);
            return true;
         }
      }
   }

   private void class_(rRg_1 var1, Random var2, rfH_2 var3) {
      var1.class_(var3, xu_3.bg.continue_(), 2);
      rfw_3 var4 = new rfw_3();
      rfw_3 var5 = new rfw_3();

      for (int var6 = 0; var6 < 200; var6++) {
         var4.class_(var3, var2.nextInt(6) - var2.nextInt(6), var2.nextInt(2) - var2.nextInt(5), var2.nextInt(6) - var2.nextInt(6));
         if (var1.finally_(var4)) {
            int var7 = 0;

            for (rpr_3 var11 : class_) {
               xc_3 var12 = var1.byte_(var5.class_(var4, var11));
               if (var12.class_(xu_3.PR) || var12.class_(xu_3.bg)) {
                  var7++;
               }

               if (var7 > 1) {
                  break;
               }
            }

            if (var7 == 1) {
               var1.class_(var4, xu_3.bg.continue_(), 2);
            }
         }
      }
   }

   private void break_(rRg_1 var1, Random var2, rfH_2 var3) {
      rfw_3 var4 = new rfw_3();

      for (int var5 = 0; var5 < 100; var5++) {
         var4.class_(var3, var2.nextInt(8) - var2.nextInt(8), var2.nextInt(2) - var2.nextInt(7), var2.nextInt(8) - var2.nextInt(8));
         if (var1.finally_(var4)) {
            xc_3 var6 = var1.byte_(var4.final_());
            if (var6.class_(xu_3.PR) || var6.class_(xu_3.bg)) {
               int var7 = rfU_2.class_(var2, 1, 8);
               if (var2.nextInt(6) == 0) {
                  var7 *= 2;
               }

               if (var2.nextInt(5) == 0) {
                  var7 = 1;
               }

               byte var8 = 17;
               byte var9 = 25;
               class_(var1, var2, var4, var7, 17, 25);
            }
         }
      }
   }
}
