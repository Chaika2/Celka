package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class rDk_1<C extends rDX> {
   public static final rDk_1<rUV> class_ = class_("cave", new rDb_1(rUV.class_, 256));
   public static final rDk_1<rUV> break_ = class_("nether_cave", new rDJ(rUV.class_));
   public static final rDk_1<rUV> byte_ = class_("canyon", new rDG(rUV.class_));
   public static final rDk_1<rUV> protected_ = class_("underwater_canyon", new rDx_1(rUV.class_));
   public static final rDk_1<rUV> throws_ = class_("underwater_cave", new rDd_1(rUV.class_));
   protected static final xc_3 case_ = xu_3.class_.continue_();
   protected static final xc_3 catch_ = xu_3.hb.continue_();
   protected static final rXE private_ = rXG.byte_.private_();
   protected static final rXE implements_ = rXG.throws_.private_();
   protected Set<xd_3> finally_ = ImmutableSet.of(
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
         xu_3.Ei
      }
   );
   protected Set<rXs_1> extends_ = ImmutableSet.of(rXG.byte_);
   private final Codec<rDM<C>> volatile_;
   protected final int native_;

   public Codec<rDM<C>> byte_() {
      return this.volatile_;
   }

   public rDk_1(Codec<C> var1, int var2) {
      this.native_ = var2;
      this.volatile_ = var1.fieldOf("config").xmap(this::class_, rDM::class_).codec();
   }

   private boolean class_(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var5 == var1 || var5 == var2 - 1 || var6 == var3 || var6 == var4 - 1;
   }

   protected boolean class_(roC_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      rfw_3 var10 = new rfw_3();

      for (int var11 = var4; var11 < var5; var11++) {
         for (int var12 = var8; var12 < var9; var12++) {
            for (int var13 = var6 - 1; var13 <= var7 + 1; var13++) {
               if (this.extends_.contains(var1.break_(var10.class_(var11 + var2 * 16, var13, var12 + var3 * 16)).class_())) {
                  return true;
               }

               if (var13 != var7 + 1 && !this.class_(var4, var5, var8, var9, var11, var12)) {
                  var13 = var7;
               }
            }
         }
      }

      return false;
   }

   protected boolean class_(xc_3 var1, xc_3 var2) {
      return this.class_(var1) || (var1.class_(xu_3.throw_) || var1.class_(xu_3.char_)) && !var2.volatile_().class_(rlG_2.break_);
   }

   protected boolean class_(xc_3 var1) {
      return this.finally_.contains(var1.break_());
   }

   protected boolean class_(int var1, int var2, double var3, double var5, int var7, int var8, float var9) {
      double var10 = (double)(var1 * 16 + 8);
      double var12 = (double)(var2 * 16 + 8);
      double var14 = var3 - var10;
      double var16 = var5 - var12;
      double var18 = (double)(var8 - var7);
      double var20 = (double)(var9 + 2.0F + 16.0F);
      return var14 * var14 + var16 * var16 - var18 * var18 <= var20 * var20;
   }

   protected abstract boolean class_(double var1, double var3, double var5, int var7);

   private static <C extends rDX, F extends rDk_1<C>> F class_(String var0, F var1) {
      return rVL.class_(rVL.y, var0, (F)var1);
   }

   public rDM<C> class_(C var1) {
      return new rDM<>(this, var1);
   }

   protected boolean class_(
      roC_2 var1,
      Function<rfH_2, rYG> var2,
      long var3,
      int var5,
      int var6,
      int var7,
      double var8,
      double var10,
      double var12,
      double var14,
      double var16,
      BitSet var18
   ) {
      Random var19 = new Random(var3 + (long)var6 + (long)var7);
      double var20 = (double)(var6 * 16 + 8);
      double var22 = (double)(var7 * 16 + 8);
      if (!(var8 < var20 - 16.0 - var14 * 2.0)
         && !(var12 < var22 - 16.0 - var14 * 2.0)
         && !(var8 > var20 + 16.0 + var14 * 2.0)
         && !(var12 > var22 + 16.0 + var14 * 2.0)) {
         int var24 = Math.max(rfU_2.byte_(var8 - var14) - var6 * 16 - 1, 0);
         int var25 = Math.min(rfU_2.byte_(var8 + var14) - var6 * 16 + 1, 16);
         int var26 = Math.max(rfU_2.byte_(var10 - var16) - 1, 1);
         int var27 = Math.min(rfU_2.byte_(var10 + var16) + 1, this.native_ - 8);
         int var28 = Math.max(rfU_2.byte_(var12 - var14) - var7 * 16 - 1, 0);
         int var29 = Math.min(rfU_2.byte_(var12 + var14) - var7 * 16 + 1, 16);
         if (this.class_(var1, var6, var7, var24, var25, var26, var27, var28, var29)) {
            return false;
         } else {
            boolean var30 = false;
            rfw_3 var31 = new rfw_3();
            rfw_3 var32 = new rfw_3();
            rfw_3 var33 = new rfw_3();

            for (int var34 = var24; var34 < var25; var34++) {
               int var35 = var34 + var6 * 16;
               double var36 = ((double)var35 + 0.5 - var8) / var14;

               for (int var38 = var28; var38 < var29; var38++) {
                  int var39 = var38 + var7 * 16;
                  double var40 = ((double)var39 + 0.5 - var12) / var14;
                  if (!(var36 * var36 + var40 * var40 >= 1.0)) {
                     MutableBoolean var42 = new MutableBoolean(false);

                     for (int var43 = var27; var43 > var26; var43--) {
                        double var44 = ((double)var43 - 0.5 - var10) / var16;
                        if (!this.class_(var36, var44, var40, var43)) {
                           var30 |= this.class_(var1, var2, var18, var19, var31, var32, var33, var5, var6, var7, var35, var39, var34, var43, var38, var42);
                        }
                     }
                  }
               }
            }

            return var30;
         }
      } else {
         return false;
      }
   }

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
         xc_3 var18 = var1.byte_(var5);
         xc_3 var19 = var1.byte_(var6.class_(var5, rpr_3.UP));
         if (var18.class_(xu_3.implements_) || var18.class_(xu_3.Bi)) {
            var16.setTrue();
         }

         if (!this.class_(var18, var19)) {
            return false;
         } else {
            if (var14 < 11) {
               var1.class_(var5, implements_.catch_(), false);
            } else {
               var1.class_(var5, catch_, false);
               if (var16.isTrue()) {
                  var7.class_(var5, rpr_3.DOWN);
                  if (var1.byte_(var7).class_(xu_3.finally_)) {
                     var1.class_(var7, ((rYG)var2.apply(var5)).throws_().throws_().class_(), false);
                  }
               }
            }

            return true;
         }
      }
   }

   public abstract boolean class_(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, C var10);

   public abstract boolean class_(Random var1, int var2, int var3, C var4);

   public int protected_() {
      return 4;
   }
}
