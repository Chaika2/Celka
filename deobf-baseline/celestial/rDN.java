package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDN extends rUO<rUa_1> {
   public rDN(Codec<rUa_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUa_1 var5) {
      boolean var6 = false;
      int var7 = var5.id_byte.id_class(var3);

      for (int var8 = var4.b_() - var7; var8 <= var4.b_() + var7; var8++) {
         for (int var9 = var4.d_() - var7; var9 <= var4.d_() + var7; var9++) {
            int var10 = var8 - var4.b_();
            int var11 = var9 - var4.d_();
            if (var10 * var10 + var11 * var11 <= var7 * var7) {
               for (int var12 = var4.c_() - var5.id_protected; var12 <= var4.c_() + var5.id_protected; var12++) {
                  rfH_2 var13 = new rfH_2(var8, var12, var9);
                  xd_3 var14 = var1.id_byte(var13).id_break();

                  for (xc_3 var16 : var5.id_throws) {
                     if (var16.id_class(var14)) {
                        var1.id_class(var13, var5.id_break, 2);
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
