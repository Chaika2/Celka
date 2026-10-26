package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUQ extends rUO<rUz_1> {
   public rUQ(Codec<rUz_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUz_1 var5) {
      rfw_3 var6 = new rfw_3();

      for (int var7 = 0; var7 < 16; var7++) {
         for (int var8 = 0; var8 < 16; var8++) {
            int var9 = var4.b_() + var7;
            int var10 = var4.d_() + var8;
            int var11 = var5.break_;
            var6.class_(var9, var11, var10);
            if (var1.byte_(var6).catch_()) {
               var1.class_(var6, var5.byte_, 2);
            }
         }
      }

      return true;
   }
}
