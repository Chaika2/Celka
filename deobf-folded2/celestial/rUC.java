package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUC extends rUO<rUt_1> {
   public rUC(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      int var6 = 0;
      int var7 = var1.id_class(rKv_1.OCEAN_FLOOR, var4.b_(), var4.d_());
      rfH_2 var8 = new rfH_2(var4.b_(), var7, var4.d_());
      if (var1.id_byte(var8).id_class(xu_3.id_try)) {
         xc_3 var9 = xu_3.OM.id_continue();
         xc_3 var10 = xu_3.OO.id_continue();
         int var11 = 1 + var3.nextInt(10);

         for (int var12 = 0; var12 <= var11; var12++) {
            if (var1.id_byte(var8).id_class(xu_3.id_try) && var1.id_byte(var8.id_final()).id_class(xu_3.id_try) && var10.id_class(var1, var8)) {
               if (var12 == var11) {
                  var1.id_class(var8, var9.id_class(kN_2.id_int, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var6++;
               } else {
                  var1.id_class(var8, var10, 2);
               }
            } else if (var12 > 0) {
               rfH_2 var13 = var8.id_break();
               if (var9.id_class(var1, var13) && !var1.id_byte(var13.id_break()).id_class(xu_3.OM)) {
                  var1.id_class(var13, var9.id_class(kN_2.id_int, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var6++;
               }
               break;
            }

            var8 = var8.id_final();
         }
      }

      return var6 > 0;
   }
}
