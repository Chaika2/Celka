package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDx_1 extends rDG {
   public rDx_1(Codec<rUV> var1) {
      super(var1);
      this.finally_ = ImmutableSet.of(
         xu_3.break_,
         xu_3.byte_,
         xu_3.throws_,
         xu_3.catch_,
         xu_3.finally_,
         xu_3.extends_,
         new xd_3[]{
            xu_3.native_,
            xu_3.implements_,
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
            xu_3.throw_,
            xu_3.char_,
            xu_3.try_,
            xu_3.instanceof_,
            xu_3.rg,
            xu_3.class_,
            xu_3.hb
         }
      );
   }

   @Override
   protected boolean class_(roC_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      return false;
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
      return rDd_1.class_(this, var1, var3, var4, var5, var8, var9, var10, var11, var12, var13, var14, var15);
   }
}
