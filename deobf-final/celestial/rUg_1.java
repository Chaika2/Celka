package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rUg_1 extends rUO<rDH> {
   public rUg_1(Codec<rDH> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDH var5) {
      xc_3 var6 = var5.break_.class_(var3, var4);
      rfH_2 var7;
      if (var5.extends_) {
         var7 = var1.class_(rKv_1.WORLD_SURFACE_WG, var4);
      } else {
         var7 = var4;
      }

      int var8 = 0;
      rfw_3 var9 = new rfw_3();

      for (int var10 = 0; var10 < var5.case_; var10++) {
         var9.class_(
            var7,
            var3.nextInt(var5.catch_ + 1) - var3.nextInt(var5.catch_ + 1),
            var3.nextInt(var5.private_ + 1) - var3.nextInt(var5.private_ + 1),
            var3.nextInt(var5.implements_ + 1) - var3.nextInt(var5.implements_ + 1)
         );
         rfH_2 var11 = var9.break_();
         xc_3 var12 = var1.byte_(var11);
         if ((var1.finally_(var9) || var5.finally_ && var1.byte_(var9).byte_().throws_())
            && var6.class_(var1, var9)
            && (var5.protected_.isEmpty() || var5.protected_.contains(var12.break_()))
            && !var5.throws_.contains(var12)
            && (
               !var5.native_
                  || var1.break_(var11.byte_()).class_(rlG_2.break_)
                  || var1.break_(var11.extends_()).class_(rlG_2.break_)
                  || var1.break_(var11.private_()).class_(rlG_2.break_)
                  || var1.break_(var11.protected_()).class_(rlG_2.break_)
            )) {
            var5.byte_.class_(var1, var9, var6, var3);
            var8++;
         }
      }

      return var8 > 0;
   }
}
