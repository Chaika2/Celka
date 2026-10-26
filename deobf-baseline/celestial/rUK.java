package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUK extends rUO<rUV> {
   public rUK(Codec<rUV> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUV var5) {
      boolean var6 = false;
      int var7 = var3.nextInt(8) - var3.nextInt(8);
      int var8 = var3.nextInt(8) - var3.nextInt(8);
      int var9 = var1.id_class(rKv_1.OCEAN_FLOOR, var4.b_() + var7, var4.d_() + var8);
      rfH_2 var10 = new rfH_2(var4.b_() + var7, var9, var4.d_() + var8);
      if (var1.id_byte(var10).id_class(xu_3.id_try)) {
         boolean var11 = var3.nextDouble() < (double)var5.id_break;
         xc_3 var12 = var11 ? xu_3.rP.id_continue() : xu_3.rr.id_continue();
         if (var12.id_class(var1, var10)) {
            if (var11) {
               xc_3 var13 = var12.id_class(zu_3.id_final, rCf_1.UPPER);
               rfH_2 var14 = var10.id_final();
               if (var1.id_byte(var14).id_class(xu_3.id_try)) {
                  var1.id_class(var10, var12, 2);
                  var1.id_class(var14, var13, 2);
               }
            } else {
               var1.id_class(var10, var12, 2);
            }

            var6 = true;
         }
      }

      return var6;
   }
}
