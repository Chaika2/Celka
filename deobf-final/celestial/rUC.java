package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUC extends rUO<rUt_1> {
   public rUC(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      int var6 = 0;
      int var7 = var1.class_(rKv_1.OCEAN_FLOOR, var4.b_(), var4.d_());
      rfH_2 var8 = new rfH_2(var4.b_(), var7, var4.d_());
      if (var1.byte_(var8).class_(xu_3.try_)) {
         xc_3 var9 = xu_3.OM.continue_();
         xc_3 var10 = xu_3.OO.continue_();
         int var11 = 1 + var3.nextInt(10);

         for (int var12 = 0; var12 <= var11; var12++) {
            if (var1.byte_(var8).class_(xu_3.try_) && var1.byte_(var8.final_()).class_(xu_3.try_) && var10.class_(var1, var8)) {
               if (var12 == var11) {
                  var1.class_(var8, var9.class_(kN_2.int_, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var6++;
               } else {
                  var1.class_(var8, var10, 2);
               }
            } else if (var12 > 0) {
               rfH_2 var13 = var8.break_();
               if (var9.class_(var1, var13) && !var1.byte_(var13.break_()).class_(xu_3.OM)) {
                  var1.class_(var13, var9.class_(kN_2.int_, Integer.valueOf(var3.nextInt(4) + 20)), 2);
                  var6++;
               }
               break;
            }

            var8 = var8.final_();
         }
      }

      return var6 > 0;
   }
}
