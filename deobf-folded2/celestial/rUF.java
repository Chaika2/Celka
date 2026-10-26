package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUF extends rUO<rUt_1> {
   public rUF(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfw_3 var6 = new rfw_3();
      rfw_3 var7 = new rfw_3();

      for (int var8 = 0; var8 < 16; var8++) {
         for (int var9 = 0; var9 < 16; var9++) {
            int var10 = var4.b_() + var8;
            int var11 = var4.d_() + var9;
            int var12 = var1.id_class(rKv_1.MOTION_BLOCKING, var10, var11);
            var6.id_class(var10, var12, var11);
            var7.id_class(var6).id_byte(rpr_3.DOWN, 1);
            rYG var13 = var1.id_implements(var6);
            if (var13.id_class(var1, var7, false)) {
               var1.id_class(var7, xu_3.PT.id_continue(), 2);
            }

            if (var13.id_break(var1, var6)) {
               var1.id_class(var6, xu_3.Pq.id_continue(), 2);
               xc_3 var14 = var1.id_byte(var7);
               if (var14.id_break(We_1.id_volatile)) {
                  var1.id_class(var7, var14.id_class(We_1.id_volatile, Boolean.valueOf(true)), 2);
               }
            }
         }
      }

      return true;
   }
}
