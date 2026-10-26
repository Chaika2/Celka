package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUS extends rUO<rUt_1> {
   public rUS(Codec<rUt_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      float var6 = (float)(var3.nextInt(3) + 4);

      for (int var7 = 0; var6 > 0.5F; var7--) {
         for (int var8 = rfU_2.protected_(-var6); var8 <= rfU_2.case_(var6); var8++) {
            for (int var9 = rfU_2.protected_(-var6); var9 <= rfU_2.case_(var6); var9++) {
               if ((float)(var8 * var8 + var9 * var9) <= (var6 + 1.0F) * (var6 + 1.0F)) {
                  this.class_(var1, var4.break_(var8, var7, var9), xu_3.Sh.continue_());
               }
            }
         }

         var6 = (float)((double)var6 - ((double)var3.nextInt(2) + 0.5));
      }

      return true;
   }
}
