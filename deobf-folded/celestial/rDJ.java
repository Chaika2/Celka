package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDJ extends rDb_1 {
   public rDJ(Codec<rUV> var1) {
      super(var1, 128);
      this.id_finally = ImmutableSet.of(
         xu_3.id_break,
         xu_3.id_byte,
         xu_3.id_throws,
         xu_3.id_catch,
         xu_3.id_finally,
         xu_3.id_extends,
         new xd_3[]{xu_3.id_native, xu_3.id_implements, xu_3.PR, xu_3.PY, xu_3.Po, xu_3.XL, xu_3.Xz, xu_3.bg, xu_3.XN, xu_3.PK, xu_3.Ju}
      );
      this.id_extends = ImmutableSet.of(rXG.id_throws, rXG.id_byte);
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
      int var17 = var13 | var15 << 4 | var14 << 8;
      if (var3.get(var17)) {
         return false;
      } else {
         var3.set(var17);
         var5.id_class(var11, var14, var12);
         if (this.id_class(var1.id_byte(var5))) {
            xc_3 var18;
            if (var14 <= 31) {
               var18 = id_implements.id_catch();
            } else {
               var18 = id_catch;
            }

            var1.id_class(var5, var18, false);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   protected float id_class(Random var1) {
      return (var1.nextFloat() * 2.0F + var1.nextFloat()) * 2.0F;
   }

   @Override
   protected int id_class() {
      return 10;
   }

   @Override
   protected int id_break(Random var1) {
      return var1.nextInt(this.id_native);
   }

   @Override
   protected double id_break() {
      return 5.0;
   }
}
