package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUD extends rUO<rUJ> {
   public rUD(Codec<rUJ> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUJ var5) {
      int var6 = 0;
      int var7 = var5.id_break().id_class(var3);

      for (int var8 = 0; var8 < var7; var8++) {
         int var9 = var3.nextInt(8) - var3.nextInt(8);
         int var10 = var3.nextInt(8) - var3.nextInt(8);
         int var11 = var1.id_class(rKv_1.OCEAN_FLOOR, var4.b_() + var9, var4.d_() + var10);
         rfH_2 var12 = new rfH_2(var4.b_() + var9, var11, var4.d_() + var10);
         xc_3 var13 = xu_3.hr.id_continue().id_class(Wy_1.id_volatile, Integer.valueOf(var3.nextInt(4) + 1));
         if (var1.id_byte(var12).id_class(xu_3.id_try) && var13.id_class(var1, var12)) {
            var1.id_class(var12, var13, 2);
            var6++;
         }
      }

      return var6 > 0;
   }
}
