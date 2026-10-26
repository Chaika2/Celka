package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reH_2 extends rUO<rDm_1> {
   private static final ImmutableList<xd_3> class_ = ImmutableList.of(xu_3.while_, xu_3.SP, xu_3.SB, xu_3.SS, xu_3.Ss, xu_3.re, xu_3.rD);
   private static final rpr_3[] b = rpr_3.values();

   public reH_2(Codec<rDm_1> var1) {
      super(var1);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDm_1 var5) {
      boolean var6 = false;
      boolean var7 = var3.nextDouble() < 0.9;
      int var8 = var7 ? var5.protected_().class_(var3) : 0;
      int var9 = var7 ? var5.protected_().class_(var3) : 0;
      boolean var10 = var7 && var8 != 0 && var9 != 0;
      int var11 = var5.byte_().class_(var3);
      int var12 = var5.byte_().class_(var3);
      int var13 = Math.max(var11, var12);

      for (rfH_2 var15 : rfH_2.class_(var4, var11, 0, var12)) {
         if (var15.implements_(var4) > var13) {
            break;
         }

         if (class_(var1, var15, var5)) {
            if (var10) {
               var6 = true;
               this.class_(var1, var15, var5.break_());
            }

            rfH_2 var16 = var15.break_(var8, 0, var9);
            if (class_(var1, var16, var5)) {
               var6 = true;
               this.class_(var1, var16, var5.class_());
            }
         }
      }

      return var6;
   }

   private static boolean class_(rRg_1 var0, rfH_2 var1, rDm_1 var2) {
      xc_3 var3 = var0.byte_(var1);
      if (var3.class_(var2.class_().break_())) {
         return false;
      } else if (class_.contains(var3.break_())) {
         return false;
      } else {
         for (rpr_3 var7 : b) {
            boolean var8 = var0.byte_(var1.break_(var7)).catch_();
            if (var8 && var7 != rpr_3.UP || !var8 && var7 == rpr_3.UP) {
               return false;
            }
         }

         return true;
      }
   }
}
