package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDu_1 extends rUO<rDV> {
   private static final ImmutableList<xd_3> class_ = ImmutableList.of(
      xu_3.instanceof_, xu_3.while_, xu_3.bV, xu_3.PY, xu_3.SP, xu_3.SB, xu_3.SS, xu_3.Ss, xu_3.re, xu_3.rD
   );

   public rDu_1(Codec<rDV> var1) {
      super(var1);
   }

   private static rfH_2 class_(rRg_1 var0, rfw_3 var1, int var2) {
      while (var1.c_() < var0.try_() && var2 > 0) {
         var2--;
         xc_3 var3 = var0.byte_(var1);
         if (class_.contains(var3.break_())) {
            return null;
         }

         if (var3.catch_()) {
            return var1;
         }

         var1.class_(rpr_3.UP);
      }

      return null;
   }

   private static boolean class_(rRg_1 var0, int var1, rfH_2 var2) {
      xc_3 var3 = var0.byte_(var2);
      return var3.catch_() || var3.class_(xu_3.instanceof_) && var2.c_() <= var1;
   }

   private static boolean class_(rRg_1 var0, int var1, rfw_3 var2) {
      if (!class_(var0, var1, (rfH_2)var2)) {
         return false;
      } else {
         xc_3 var3 = var0.byte_(var2.class_(rpr_3.DOWN));
         var2.class_(rpr_3.UP);
         return !var3.catch_() && !class_.contains(var3.break_());
      }
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDV var5) {
      int var6 = var2.case_();
      if (!class_(var1, var6, var4.new_())) {
         return false;
      } else {
         int var7 = var5.break_().class_(var3);
         boolean var8 = var3.nextFloat() < 0.9F;
         int var9 = Math.min(var7, var8 ? 5 : 8);
         int var10 = var8 ? 50 : 15;
         boolean var11 = false;

         for (rfH_2 var13 : rfH_2.class_(var3, var10, var4.b_() - var9, var4.c_(), var4.d_() - var9, var4.b_() + var9, var4.c_(), var4.d_() + var9)) {
            int var14 = var7 - var13.implements_(var4);
            if (var14 >= 0) {
               var11 |= this.class_(var1, var6, var13, var14, var5.class_().class_(var3));
            }
         }

         return var11;
      }
   }

   private static rfH_2 class_(rRg_1 var0, int var1, rfw_3 var2, int var3) {
      while (var2.c_() > 1 && var3 > 0) {
         var3--;
         if (class_(var0, var1, var2)) {
            return var2;
         }

         var2.class_(rpr_3.DOWN);
      }

      return null;
   }

   private boolean class_(rRg_1 var1, int var2, rfH_2 var3, int var4, int var5) {
      boolean var6 = false;

      for (rfH_2 var8 : rfH_2.break_(var3.b_() - var5, var3.c_(), var3.d_() - var5, var3.b_() + var5, var3.c_(), var3.d_() + var5)) {
         int var9 = var8.implements_(var3);
         rfH_2 var10 = class_(var1, var2, var8) ? class_(var1, var2, var8.new_(), var9) : class_(var1, var8.new_(), var9);
         if (var10 != null) {
            int var11 = var4 - var9 / 2;

            for (rfw_3 var12 = var10.new_(); var11 >= 0; var11--) {
               if (class_(var1, var2, (rfH_2)var12)) {
                  this.class_(var1, var12, xu_3.PK.continue_());
                  var12.class_(rpr_3.UP);
                  var6 = true;
               } else {
                  if (!var1.byte_(var12).class_(xu_3.PK)) {
                     break;
                  }

                  var12.class_(rpr_3.UP);
               }
            }
         }
      }

      return var6;
   }
}
