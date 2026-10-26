package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDu_1 extends rUO<rDV> {
   private static final ImmutableList<xd_3> id_class = ImmutableList.of(
      xu_3.id_instanceof, xu_3.id_while, xu_3.bV, xu_3.PY, xu_3.SP, xu_3.SB, xu_3.SS, xu_3.Ss, xu_3.re, xu_3.rD
   );

   public rDu_1(Codec<rDV> var1) {
      super(var1);
   }

   private static rfH_2 id_class(rRg_1 var0, rfw_3 var1, int var2) {
      while (var1.c_() < var0.id_try() && var2 > 0) {
         var2--;
         xc_3 var3 = var0.id_byte(var1);
         if (id_class.contains(var3.id_break())) {
            return null;
         }

         if (var3.id_catch()) {
            return var1;
         }

         var1.id_class(rpr_3.UP);
      }

      return null;
   }

   private static boolean id_class(rRg_1 var0, int var1, rfH_2 var2) {
      xc_3 var3 = var0.id_byte(var2);
      return var3.id_catch() || var3.id_class(xu_3.id_instanceof) && var2.c_() <= var1;
   }

   private static boolean id_class(rRg_1 var0, int var1, rfw_3 var2) {
      if (!id_class(var0, var1, (rfH_2)var2)) {
         return false;
      } else {
         xc_3 var3 = var0.id_byte(var2.id_class(rpr_3.DOWN));
         var2.id_class(rpr_3.UP);
         return !var3.id_catch() && !id_class.contains(var3.id_break());
      }
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDV var5) {
      int var6 = var2.id_case();
      if (!id_class(var1, var6, var4.id_new())) {
         return false;
      } else {
         int var7 = var5.id_break().id_class(var3);
         boolean var8 = var3.nextFloat() < 0.9F;
         int var9 = Math.min(var7, var8 ? 5 : 8);
         int var10 = var8 ? 50 : 15;
         boolean var11 = false;

         for (rfH_2 var13 : rfH_2.id_class(var3, var10, var4.b_() - var9, var4.c_(), var4.d_() - var9, var4.b_() + var9, var4.c_(), var4.d_() + var9)) {
            int var14 = var7 - var13.id_implements(var4);
            if (var14 >= 0) {
               var11 |= this.id_class(var1, var6, var13, var14, var5.id_class().id_class(var3));
            }
         }

         return var11;
      }
   }

   private static rfH_2 id_class(rRg_1 var0, int var1, rfw_3 var2, int var3) {
      while (var2.c_() > 1 && var3 > 0) {
         var3--;
         if (id_class(var0, var1, var2)) {
            return var2;
         }

         var2.id_class(rpr_3.DOWN);
      }

      return null;
   }

   private boolean id_class(rRg_1 var1, int var2, rfH_2 var3, int var4, int var5) {
      boolean var6 = false;

      for (rfH_2 var8 : rfH_2.id_break(var3.b_() - var5, var3.c_(), var3.d_() - var5, var3.b_() + var5, var3.c_(), var3.d_() + var5)) {
         int var9 = var8.id_implements(var3);
         rfH_2 var10 = id_class(var1, var2, var8) ? id_class(var1, var2, var8.id_new(), var9) : id_class(var1, var8.id_new(), var9);
         if (var10 != null) {
            int var11 = var4 - var9 / 2;

            for (rfw_3 var12 = var10.id_new(); var11 >= 0; var11--) {
               if (id_class(var1, var2, (rfH_2)var12)) {
                  this.id_class(var1, var12, xu_3.PK.id_continue());
                  var12.id_class(rpr_3.UP);
                  var6 = true;
               } else {
                  if (!var1.id_byte(var12).id_class(xu_3.PK)) {
                     break;
                  }

                  var12.id_class(rpr_3.UP);
               }
            }
         }
      }

      return var6;
   }
}
