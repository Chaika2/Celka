package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDN extends rUO<rUa_1> {
   public rDN(Codec<rUa_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUa_1 var5) {
      boolean var6 = false;
      int var7 = var5.byte_.class_(var3);

      for (int var8 = var4.b_() - var7; var8 <= var4.b_() + var7; var8++) {
         for (int var9 = var4.d_() - var7; var9 <= var4.d_() + var7; var9++) {
            int var10 = var8 - var4.b_();
            int var11 = var9 - var4.d_();
            if (var10 * var10 + var11 * var11 <= var7 * var7) {
               for (int var12 = var4.c_() - var5.protected_; var12 <= var4.c_() + var5.protected_; var12++) {
                  rfH_2 var13 = new rfH_2(var8, var12, var9);
                  xd_3 var14 = var1.byte_(var13).break_();

                  for (xc_3 var16 : var5.throws_) {
                     if (var16.class_(var14)) {
                        var1.class_(var13, var5.break_, 2);
                        var6 = true;
                        break;
                     }
                  }
               }
            }
         }
      }

      return var6;
   }
}
