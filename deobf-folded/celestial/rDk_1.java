package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public abstract class rDk_1<C extends rDX> {
   public static final rDk_1<rUV> id_class = id_class("cave", new rDb_1(rUV.id_class, 256));
   public static final rDk_1<rUV> id_break = id_class("nether_cave", new rDJ(rUV.id_class));
   public static final rDk_1<rUV> id_byte = id_class("canyon", new rDG(rUV.id_class));
   public static final rDk_1<rUV> id_protected = id_class("underwater_canyon", new rDx_1(rUV.id_class));
   public static final rDk_1<rUV> id_throws = id_class("underwater_cave", new rDd_1(rUV.id_class));
   protected static final xc_3 id_case = xu_3.id_class.id_continue();
   protected static final xc_3 id_catch = xu_3.hb.id_continue();
   protected static final rXE id_private = rXG.id_byte.id_private();
   protected static final rXE id_implements = rXG.id_throws.id_private();
   protected Set<xd_3> id_finally = ImmutableSet.of(
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
         xu_3.Ei
      }
   );
   protected Set<rXs_1> id_extends = ImmutableSet.of(rXG.id_byte);
   private final Codec<rDM<C>> id_volatile;
   protected final int id_native;

   public Codec<rDM<C>> id_byte() {
      return this.id_volatile;
   }

   public rDk_1(Codec<C> var1, int var2) {
      this.id_native = var2;
      this.id_volatile = var1.fieldOf("config").xmap(this::id_class, rDM::id_class).codec();
   }

   private boolean id_class(int var1, int var2, int var3, int var4, int var5, int var6) {
      return var5 == var1 || var5 == var2 - 1 || var6 == var3 || var6 == var4 - 1;
   }

   protected boolean id_class(roC_2 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      rfw_3 var10 = new rfw_3();

      for (int var11 = var4; var11 < var5; var11++) {
         for (int var12 = var8; var12 < var9; var12++) {
            for (int var13 = var6 - 1; var13 <= var7 + 1; var13++) {
               if (this.id_extends.contains(var1.id_break(var10.id_class(var11 + var2 * 16, var13, var12 + var3 * 16)).id_class())) {
                  return true;
               }

               if (var13 != var7 + 1 && !this.id_class(var4, var5, var8, var9, var11, var12)) {
                  var13 = var7;
               }
            }
         }
      }

      return false;
   }

   protected boolean id_class(xc_3 var1, xc_3 var2) {
      return this.id_class(var1) || (var1.id_class(xu_3.id_throw) || var1.id_class(xu_3.id_char)) && !var2.id_volatile().id_class(rlG_2.id_break);
   }

   protected boolean id_class(xc_3 var1) {
      return this.id_finally.contains(var1.id_break());
   }

   protected boolean id_class(int var1, int var2, double var3, double var5, int var7, int var8, float var9) {
      double var10 = (double)(var1 * 16 + 8);
      double var12 = (double)(var2 * 16 + 8);
      double var14 = var3 - var10;
      double var16 = var5 - var12;
      double var18 = (double)(var8 - var7);
      double var20 = (double)(var9 + 2.0F + 16.0F);
      return var14 * var14 + var16 * var16 - var18 * var18 <= var20 * var20;
   }

   protected abstract boolean id_class(double var1, double var3, double var5, int var7);

   private static <C extends rDX, F extends rDk_1<C>> F id_class(String var0, F var1) {
      return rVL.id_class(rVL.y, var0, (F)var1);
   }

   public rDM<C> id_class(C var1) {
      return new rDM<>(this, var1);
   }

   protected boolean id_class(
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
         int var24 = Math.max(rfU_2.id_byte(var8 - var14) - var6 * 16 - 1, 0);
         int var25 = Math.min(rfU_2.id_byte(var8 + var14) - var6 * 16 + 1, 16);
         int var26 = Math.max(rfU_2.id_byte(var10 - var16) - 1, 1);
         int var27 = Math.min(rfU_2.id_byte(var10 + var16) + 1, this.id_native - 8);
         int var28 = Math.max(rfU_2.id_byte(var12 - var14) - var7 * 16 - 1, 0);
         int var29 = Math.min(rfU_2.id_byte(var12 + var14) - var7 * 16 + 1, 16);
         if (this.id_class(var1, var6, var7, var24, var25, var26, var27, var28, var29)) {
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
                        if (!this.id_class(var36, var44, var40, var43)) {
                           var30 |= this.id_class(var1, var2, var18, var19, var31, var32, var33, var5, var6, var7, var35, var39, var34, var43, var38, var42);
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
         xc_3 var18 = var1.id_byte(var5);
         xc_3 var19 = var1.id_byte(var6.id_class(var5, rpr_3.UP));
         if (var18.id_class(xu_3.id_implements) || var18.id_class(xu_3.Bi)) {
            var16.setTrue();
         }

         if (!this.id_class(var18, var19)) {
            return false;
         } else {
            if (var14 < 11) {
               var1.id_class(var5, id_implements.id_catch(), false);
            } else {
               var1.id_class(var5, id_catch, false);
               if (var16.isTrue()) {
                  var7.id_class(var5, rpr_3.DOWN);
                  if (var1.id_byte(var7).id_class(xu_3.id_finally)) {
                     var1.id_class(var7, ((rYG)var2.apply(var5)).id_throws().id_throws().id_class(), false);
                  }
               }
            }

            return true;
         }
      }
   }

   public abstract boolean id_class(roC_2 var1, Function<rfH_2, rYG> var2, Random var3, int var4, int var5, int var6, int var7, int var8, BitSet var9, C var10);

   public abstract boolean id_class(Random var1, int var2, int var3, C var4);

   public int id_protected() {
      return 4;
   }
}
