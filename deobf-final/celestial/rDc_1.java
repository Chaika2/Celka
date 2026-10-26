package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDc_1 extends rUO<rUV> {
   private static final xc_3 class_ = xu_3.hs
      .continue_()
      .class_(xP_2.int_, Integer.valueOf(1))
      .class_(xP_2.new_, rCy_1.NONE)
      .class_(xP_2.continue_, Integer.valueOf(0));
   private static final xc_3 b = class_.class_(xP_2.new_, rCy_1.LARGE).class_(xP_2.continue_, Integer.valueOf(1));
   private static final xc_3 M = class_.class_(xP_2.new_, rCy_1.LARGE);
   private static final xc_3 O = class_.class_(xP_2.new_, rCy_1.SMALL);

   public rDc_1(Codec<rUV> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUV var5) {
      int var6 = 0;
      rfw_3 var7 = var4.new_();
      rfw_3 var8 = var4.new_();
      if (var1.finally_(var7)) {
         if (xu_3.hs.continue_().class_(var1, var7)) {
            int var9 = var3.nextInt(12) + 5;
            if (var3.nextFloat() < var5.break_) {
               int var10 = var3.nextInt(4) + 1;

               for (int var11 = var4.b_() - var10; var11 <= var4.b_() + var10; var11++) {
                  for (int var12 = var4.d_() - var10; var12 <= var4.d_() + var10; var12++) {
                     int var13 = var11 - var4.b_();
                     int var14 = var12 - var4.d_();
                     if (var13 * var13 + var14 * var14 <= var10 * var10) {
                        var8.class_(var11, var1.class_(rKv_1.WORLD_SURFACE, var11, var12) - 1, var12);
                        if (break_(var1.byte_(var8).break_())) {
                           var1.class_(var8, xu_3.native_.continue_(), 2);
                        }
                     }
                  }
               }
            }

            for (int var15 = 0; var15 < var9 && var1.finally_(var7); var15++) {
               var1.class_(var7, class_, 2);
               var7.byte_(rpr_3.UP, 1);
            }

            if (var7.c_() - var4.c_() >= 3) {
               var1.class_(var7, b, 2);
               var1.class_(var7.byte_(rpr_3.DOWN, 1), M, 2);
               var1.class_(var7.byte_(rpr_3.DOWN, 1), O, 2);
            }
         }

         var6++;
      }

      return var6 > 0;
   }
}
