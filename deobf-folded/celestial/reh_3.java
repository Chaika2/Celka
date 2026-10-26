package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reh_3 extends rUO<rUt_1> {
   private static final rpr_3[] id_class = rpr_3.values();

   public reh_3(Codec<rUt_1> var1) {
      super(var1);
   }

   public static void id_class(rRg_1 var0, Random var1, rfw_3 var2, int var3, int var4, int var5) {
      for (int var6 = 0; var6 <= var3; var6++) {
         if (var0.id_finally(var2)) {
            if (var6 == var3 || !var0.id_finally(var2.id_break())) {
               var0.id_class(var2, xu_3.XC.id_continue().id_class(Je_1.id_int, Integer.valueOf(rfU_2.id_class(var1, var4, var5))), 2);
               break;
            }

            var0.id_class(var2, xu_3.Xl.id_continue(), 2);
         }

         var2.id_class(rpr_3.DOWN);
      }
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      if (!var1.id_finally(var4)) {
         return false;
      } else {
         xc_3 var6 = var1.id_byte(var4.id_final());
         if (!var6.id_class(xu_3.PR) && !var6.id_class(xu_3.bg)) {
            return false;
         } else {
            this.id_class(var1, var3, var4);
            this.id_break(var1, var3, var4);
            return true;
         }
      }
   }

   private void id_class(rRg_1 var1, Random var2, rfH_2 var3) {
      var1.id_class(var3, xu_3.bg.id_continue(), 2);
      rfw_3 var4 = new rfw_3();
      rfw_3 var5 = new rfw_3();

      for (int var6 = 0; var6 < 200; var6++) {
         var4.id_class(var3, var2.nextInt(6) - var2.nextInt(6), var2.nextInt(2) - var2.nextInt(5), var2.nextInt(6) - var2.nextInt(6));
         if (var1.id_finally(var4)) {
            int var7 = 0;

            for (rpr_3 var11 : id_class) {
               xc_3 var12 = var1.id_byte(var5.id_class(var4, var11));
               if (var12.id_class(xu_3.PR) || var12.id_class(xu_3.bg)) {
                  var7++;
               }

               if (var7 > 1) {
                  break;
               }
            }

            if (var7 == 1) {
               var1.id_class(var4, xu_3.bg.id_continue(), 2);
            }
         }
      }
   }

   private void id_break(rRg_1 var1, Random var2, rfH_2 var3) {
      rfw_3 var4 = new rfw_3();

      for (int var5 = 0; var5 < 100; var5++) {
         var4.id_class(var3, var2.nextInt(8) - var2.nextInt(8), var2.nextInt(2) - var2.nextInt(7), var2.nextInt(8) - var2.nextInt(8));
         if (var1.id_finally(var4)) {
            xc_3 var6 = var1.id_byte(var4.id_final());
            if (var6.id_class(xu_3.PR) || var6.id_class(xu_3.bg)) {
               int var7 = rfU_2.id_class(var2, 1, 8);
               if (var2.nextInt(6) == 0) {
                  var7 *= 2;
               }

               if (var2.nextInt(5) == 0) {
                  var7 = 1;
               }

               byte var8 = 17;
               byte var9 = 25;
               id_class(var1, var2, var4, var7, 17, 25);
            }
         }
      }
   }
}
