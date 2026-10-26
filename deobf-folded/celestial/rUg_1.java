package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUg_1 extends rUO<rDH> {
   public rUg_1(Codec<rDH> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDH var5) {
      xc_3 var6 = var5.id_break.id_class(var3, var4);
      rfH_2 var7;
      if (var5.id_extends) {
         var7 = var1.id_class(rKv_1.WORLD_SURFACE_WG, var4);
      } else {
         var7 = var4;
      }

      int var8 = 0;
      rfw_3 var9 = new rfw_3();

      for (int var10 = 0; var10 < var5.id_case; var10++) {
         var9.id_class(
            var7,
            var3.nextInt(var5.id_catch + 1) - var3.nextInt(var5.id_catch + 1),
            var3.nextInt(var5.id_private + 1) - var3.nextInt(var5.id_private + 1),
            var3.nextInt(var5.id_implements + 1) - var3.nextInt(var5.id_implements + 1)
         );
         rfH_2 var11 = var9.id_break();
         xc_3 var12 = var1.id_byte(var11);
         if ((var1.id_finally(var9) || var5.id_finally && var1.id_byte(var9).id_byte().id_throws())
            && var6.id_class(var1, var9)
            && (var5.id_protected.isEmpty() || var5.id_protected.contains(var12.id_break()))
            && !var5.id_throws.contains(var12)
            && (
               !var5.id_native
                  || var1.id_break(var11.id_byte()).id_class(rlG_2.id_break)
                  || var1.id_break(var11.id_extends()).id_class(rlG_2.id_break)
                  || var1.id_break(var11.id_private()).id_class(rlG_2.id_break)
                  || var1.id_break(var11.id_protected()).id_class(rlG_2.id_break)
            )) {
            var5.id_byte.id_class(var1, var9, var6, var3);
            var8++;
         }
      }

      return var8 > 0;
   }
}
