package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class res_3 extends rUO<rUt_1> {
   public res_3(Codec<rUt_1> var1) {
      super(var1);
   }

   private static boolean id_class(rRg_1 var0, rfw_3 var1) {
      do {
         var1.id_byte(0, -1, 0);
         if (rYB.id_super(var1)) {
            return false;
         }
      } while (var0.id_byte(var1).id_catch());

      var1.id_byte(0, 1, 0);
      return true;
   }

   public static void id_class(rRg_1 var0, Random var1, rfw_3 var2, int var3, int var4, int var5) {
      for (int var6 = 1; var6 <= var3; var6++) {
         if (var0.id_finally(var2)) {
            if (var6 == var3 || !var0.id_finally(var2.id_final())) {
               var0.id_class(var2, xu_3.XH.id_continue().id_class(Je_1.id_int, Integer.valueOf(rfU_2.id_class(var1, var4, var5))), 2);
               break;
            }

            var0.id_class(var2, xu_3.Xy.id_continue(), 2);
         }

         var2.id_class(rpr_3.UP);
      }
   }

   private static boolean id_class(rRg_1 var0, rfH_2 var1) {
      if (!var0.id_finally(var1)) {
         return true;
      } else {
         xc_3 var2 = var0.id_byte(var1.id_break());
         return !var2.id_class(xu_3.PR) && !var2.id_class(xu_3.Xz) && !var2.id_class(xu_3.XN);
      }
   }

   public static boolean id_class(rRg_1 var0, Random var1, rfH_2 var2, int var3, int var4, int var5) {
      if (id_class(var0, var2)) {
         return false;
      } else {
         id_break(var0, var1, var2, var3, var4, var5);
         return true;
      }
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      return id_class(var1, var3, var4, 8, 4, 8);
   }

   private static void id_break(rRg_1 var0, Random var1, rfH_2 var2, int var3, int var4, int var5) {
      rfw_3 var6 = new rfw_3();

      for (int var7 = 0; var7 < var3 * var3; var7++) {
         var6.id_class(var2).id_byte(rfU_2.id_class(var1, -var3, var3), rfU_2.id_class(var1, -var4, var4), rfU_2.id_class(var1, -var3, var3));
         if (id_class(var0, var6) && !id_class(var0, (rfH_2)var6)) {
            int var8 = rfU_2.id_class(var1, 1, var5);
            if (var1.nextInt(6) == 0) {
               var8 *= 2;
            }

            if (var1.nextInt(5) == 0) {
               var8 = 1;
            }

            byte var9 = 17;
            byte var10 = 25;
            id_class(var0, var1, var6, var8, 17, 25);
         }
      }
   }
}
