package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDd_1 extends rDb_1 {
   public rDd_1(Codec<rUV> var1) {
      super(var1, 256);
      this.id_finally = ImmutableSet.of(
         xu_3.id_break,
         xu_3.id_byte,
         xu_3.id_throws,
         xu_3.id_catch,
         xu_3.id_finally,
         xu_3.id_extends,
         new xd_3[]{
            xu_3.id_native,
            xu_3.id_implements,
            xu_3.Ee,
            xu_3.sw,
            xu_3.sI,
            xu_3.sf,
            xu_3.sj,
            xu_3.sV,
            xu_3.sg,
            xu_3.sR,
            xu_3.sY,
            xu_3.so,
            xu_3.sK,
            xu_3.sD,
            xu_3.sU,
            xu_3.se,
            xu_3.sa,
            xu_3.si,
            xu_3.Er,
            xu_3.F,
            xu_3.GI,
            xu_3.Bi,
            xu_3.Pq,
            xu_3.id_throw,
            xu_3.id_char,
            xu_3.id_try,
            xu_3.id_instanceof,
            xu_3.rg,
            xu_3.id_class,
            xu_3.hb,
            xu_3.Ei
         }
      );
   }

   protected static boolean id_class(
      rDk_1<?> var0, roC_2 var1, BitSet var2, Random var3, rfw_3 var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12
   ) {
      if (var11 >= var5) {
         return false;
      } else {
         int var13 = var10 | var12 << 4 | var11 << 8;
         if (var2.get(var13)) {
            return false;
         } else {
            var2.set(var13);
            var4.id_class(var8, var11, var9);
            xc_3 var14 = var1.id_byte(var4);
            if (!var0.id_class(var14)) {
               return false;
            } else if (var11 == 10) {
               float var20 = var3.nextFloat();
               if ((double)var20 < 0.25) {
                  var1.id_class(var4, xu_3.bV.id_continue(), false);
                  var1.id_int().id_class(var4, xu_3.bV, 0);
               } else {
                  var1.id_class(var4, xu_3.rg.id_continue(), false);
               }

               return true;
            } else if (var11 < 10) {
               var1.id_class(var4, xu_3.id_instanceof.id_continue(), false);
               return false;
            } else {
               boolean var15 = false;

               for (rpr_3 var17 : rpb_3.HORIZONTAL) {
                  int var18 = var8 + var17.id_implements();
                  int var19 = var9 + var17.id_extends();
                  if (var18 >> 4 != var6 || var19 >> 4 != var7 || var1.id_byte(var4.id_class(var18, var11, var19)).id_catch()) {
                     var1.id_class(var4, id_private.id_catch(), false);
                     var1.id_new().id_class(var4, id_private.id_class(), 0);
                     var15 = true;
                     break;
                  }
               }

               var4.id_class(var8, var11, var9);
               if (!var15) {
                  var1.id_class(var4, id_private.id_catch(), false);
                  return true;
               } else {
                  return true;
               }
            }
         }
      }
   }

   @Override
   protected boolean id_class(
      roC_2 var1,
      Function<rfH_2, rYG> var2,
      BitSet var3,
      Random var4,
      rfw_3 var5,
      rfw_3 var6,
      rfw_3 var7,
      int var8,
      int var9,
      int var10,
      int var11,
      int var12,
      int var13,
      int var14,
      int var15,
      MutableBoolean var16
   ) {
      return id_class(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }

   @Override
   protected boolean id_class(roC_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
   }
}
