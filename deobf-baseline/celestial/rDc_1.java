package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class rDc_1 extends rUO<rUV> {
   private static final xc_3 id_class = xu_3.hs
      .id_continue()
      .id_class(xP_2.id_int, Integer.valueOf(1))
      .id_class(xP_2.id_new, rCy_1.NONE)
      .id_class(xP_2.id_continue, Integer.valueOf(0));
   private static final xc_3 b = id_class.id_class(xP_2.id_new, rCy_1.LARGE).id_class(xP_2.id_continue, Integer.valueOf(1));
   private static final xc_3 M = id_class.id_class(xP_2.id_new, rCy_1.LARGE);
   private static final xc_3 O = id_class.id_class(xP_2.id_new, rCy_1.SMALL);

   public rDc_1(Codec<rUV> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUV var5) {
      int var6 = 0;
      rfw_3 var7 = var4.id_new();
      rfw_3 var8 = var4.id_new();
      if (var1.id_finally(var7)) {
         if (xu_3.hs.id_continue().id_class(var1, var7)) {
            int var9 = var3.nextInt(12) + 5;
            if (var3.nextFloat() < var5.id_break) {
               int var10 = var3.nextInt(4) + 1;

               for (int var11 = var4.b_() - var10; var11 <= var4.b_() + var10; var11++) {
                  for (int var12 = var4.d_() - var10; var12 <= var4.d_() + var10; var12++) {
                     int var13 = var11 - var4.b_();
                     int var14 = var12 - var4.d_();
                     if (var13 * var13 + var14 * var14 <= var10 * var10) {
                        var8.id_class(var11, var1.id_class(rKv_1.WORLD_SURFACE, var11, var12) - 1, var12);
                        if (id_break(var1.id_byte(var8).id_break())) {
                           var1.id_class(var8, xu_3.id_native.id_continue(), 2);
                        }
                     }
                  }
               }
            }

            for (int var15 = 0; var15 < var9 && var1.id_finally(var7); var15++) {
               var1.id_class(var7, id_class, 2);
               var7.id_byte(rpr_3.UP, 1);
            }

            if (var7.c_() - var4.c_() >= 3) {
               var1.id_class(var7, b, 2);
               var1.id_class(var7.id_byte(rpr_3.DOWN, 1), M, 2);
               var1.id_class(var7.id_byte(rpr_3.DOWN, 1), O, 2);
            }
         }

         var6++;
      }

      return var6 > 0;
   }
}
