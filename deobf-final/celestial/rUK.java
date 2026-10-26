package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUK extends rUO<rUV> {
   public rUK(Codec<rUV> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUV var5) {
      boolean var6 = false;
      int var7 = var3.nextInt(8) - var3.nextInt(8);
      int var8 = var3.nextInt(8) - var3.nextInt(8);
      int var9 = var1.class_(rKv_1.OCEAN_FLOOR, var4.b_() + var7, var4.d_() + var8);
      rfH_2 var10 = new rfH_2(var4.b_() + var7, var9, var4.d_() + var8);
      if (var1.byte_(var10).class_(xu_3.try_)) {
         boolean var11 = var3.nextDouble() < (double)var5.break_;
         xc_3 var12 = var11 ? xu_3.rP.continue_() : xu_3.rr.continue_();
         if (var12.class_(var1, var10)) {
            if (var11) {
               xc_3 var13 = var12.class_(zu_3.final_, rCf_1.UPPER);
               rfH_2 var14 = var10.final_();
               if (var1.byte_(var14).class_(xu_3.try_)) {
                  var1.class_(var10, var12, 2);
                  var1.class_(var14, var13, 2);
               }
            } else {
               var1.class_(var10, var12, 2);
            }

            var6 = true;
         }
      }

      return var6;
   }
}
