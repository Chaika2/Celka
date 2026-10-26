package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUD extends rUO<rUJ> {
   public rUD(Codec<rUJ> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUJ var5) {
      int var6 = 0;
      int var7 = var5.break_().class_(var3);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var3.nextInt(8) - var3.nextInt(8);
         int var10 = var3.nextInt(8) - var3.nextInt(8);
         int var11 = var1.class_(rKv_1.OCEAN_FLOOR, var4.b_() + var9, var4.d_() + var10);
         rfH_2 var12 = new rfH_2(var4.b_() + var9, var11, var4.d_() + var10);
         xc_3 var13 = xu_3.hr.continue_().class_(Wy_1.volatile_, Integer.valueOf(var3.nextInt(4) + 1));
         if (var1.byte_(var12).class_(xu_3.try_) && var13.class_(var1, var12)) {
            var1.class_(var12, var13, 2);
            var6++;
         }
      }

      return var6 > 0;
   }
}
