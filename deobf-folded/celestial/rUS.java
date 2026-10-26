package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUS extends rUO<rUt_1> {
   public rUS(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      float var6 = (float)(var3.nextInt(3) + 4);

      for (int var7 = 0; var6 > 0.5F; var7--) {
         for (int var8 = rfU_2.id_protected(-var6); var8 <= rfU_2.id_case(var6); var8++) {
            for (int var9 = rfU_2.id_protected(-var6); var9 <= rfU_2.id_case(var6); var9++) {
               if ((float)(var8 * var8 + var9 * var9) <= (var6 + 1.0F) * (var6 + 1.0F)) {
                  this.id_class(var1, var4.id_break(var8, var7, var9), xu_3.Sh.id_continue());
               }
            }
         }

         var6 = (float)((double)var6 - ((double)var3.nextInt(2) + 0.5));
      }

      return true;
   }
}
