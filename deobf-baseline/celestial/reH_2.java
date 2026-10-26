package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reH_2 extends rUO<rDm_1> {
   private static final ImmutableList<xd_3> id_class = ImmutableList.of(xu_3.id_while, xu_3.SP, xu_3.SB, xu_3.SS, xu_3.Ss, xu_3.re, xu_3.rD);
   private static final rpr_3[] b = rpr_3.values();

   public reH_2(Codec<rDm_1> var1) {
      super(var1);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rDm_1 var5) {
      boolean var6 = false;
      boolean var7 = var3.nextDouble() < 0.9;
      int var8 = var7 ? var5.id_protected().id_class(var3) : 0;
      int var9 = var7 ? var5.id_protected().id_class(var3) : 0;
      boolean var10 = var7 && var8 != 0 && var9 != 0;
      int var11 = var5.id_byte().id_class(var3);
      int var12 = var5.id_byte().id_class(var3);
      int var13 = Math.max(var11, var12);

      for (rfH_2 var15 : rfH_2.id_class(var4, var11, 0, var12)) {
         if (var15.id_implements(var4) > var13) {
            break;
         }

         if (id_class(var1, var15, var5)) {
            if (var10) {
               var6 = true;
               this.id_class(var1, var15, var5.id_break());
            }

            rfH_2 var16 = var15.id_break(var8, 0, var9);
            if (id_class(var1, var16, var5)) {
               var6 = true;
               this.id_class(var1, var16, var5.id_class());
            }
         }
      }

      return var6;
   }

   private static boolean id_class(rRg_1 var0, rfH_2 var1, rDm_1 var2) {
      xc_3 var3 = var0.id_byte(var1);
      if (var3.id_class(var2.id_class().id_break())) {
         return false;
      } else if (id_class.contains(var3.id_break())) {
         return false;
      } else {
         for (rpr_3 var7 : b) {
            boolean var8 = var0.id_byte(var1.id_break(var7)).id_catch();
            if (var8 && var7 != rpr_3.UP || !var8 && var7 == rpr_3.UP) {
               return false;
            }
         }

         return true;
      }
   }
}
