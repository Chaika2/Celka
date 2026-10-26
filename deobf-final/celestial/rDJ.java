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
      this.finally_ = ImmutableSet.of(
         xu_3.break_,
         xu_3.byte_,
         xu_3.throws_,
         xu_3.catch_,
         xu_3.finally_,
         xu_3.extends_,
         new xd_3[]{xu_3.native_, xu_3.implements_, xu_3.PR, xu_3.PY, xu_3.Po, xu_3.XL, xu_3.Xz, xu_3.bg, xu_3.XN, xu_3.PK, xu_3.Ju}
      );
      this.extends_ = ImmutableSet.of(rXG.throws_, rXG.byte_);
   }

   @Override
   protected boolean class_(
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
         var5.class_(var11, var14, var12);
         if (this.class_(var1.byte_(var5))) {
            xc_3 var18;
            if (var14 <= 31) {
               var18 = implements_.catch_();
            } else {
               var18 = catch_;
            }

            var1.class_(var5, var18, false);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   protected float class_(Random var1) {
      return (var1.nextFloat() * 2.0F + var1.nextFloat()) * 2.0F;
   }

   @Override
   protected int class_() {
      return 10;
   }

   @Override
   protected int break_(Random var1) {
      return var1.nextInt(this.native_);
   }

   @Override
   protected double break_() {
      return 5.0;
   }
}
