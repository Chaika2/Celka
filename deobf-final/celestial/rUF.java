package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUF extends rUO<rUt_1> {
   public rUF(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfw_3 var6 = new rfw_3();
      rfw_3 var7 = new rfw_3();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = var4.b_() + var8;
            int var11 = var4.d_() + var9;
            int var12 = var1.class_(rKv_1.MOTION_BLOCKING, var10, var11);
            var6.class_(var10, var12, var11);
            var7.class_(var6).byte_(rpr_3.DOWN, 1);
            rYG var13 = var1.implements_(var6);
            if (var13.class_(var1, var7, false)) {
               var1.class_(var7, xu_3.PT.continue_(), 2);
            }

            if (var13.break_(var1, var6)) {
               var1.class_(var6, xu_3.Pq.continue_(), 2);
               xc_3 var14 = var1.byte_(var7);
               if (var14.break_(We_1.volatile_)) {
                  var1.class_(var7, var14.class_(We_1.volatile_, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
