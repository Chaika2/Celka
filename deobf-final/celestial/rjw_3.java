package celestial;

import com.google.common.math.DoubleMath;
import com.google.common.math.IntMath;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

public final class rjw_3 {
   private static final rjC_2 break_ = rqR_2.class_((Supplier<rjy_3>)(() -> {
      rjd_3 var0 = new rjd_3(1, 1, 1);
      var0.class_(0, 0, 0, true, true);
      return new rjy_3(var0);
   }));
   public static final rjC_2 class_ = class_(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final rjC_2 byte_ = new rjl_3(
      new rjd_3(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static boolean byte_(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)rqR_2.byte_(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.apply(true, true);
      } else if (var0.break_()) {
         return var2.apply(false, !var1.break_());
      } else if (var1.break_()) {
         return var2.apply(!var0.break_(), false);
      } else {
         boolean var3 = var2.apply(true, false);
         boolean var4 = var2.apply(false, true);

         for (rpB_2 var8 : ryF_2.AXES) {
            if (var0.byte_(var8) < var1.break_(var8) - 1.0E-7) {
               return var3 || var4;
            }

            if (var1.byte_(var8) < var0.break_(var8) - 1.0E-7) {
               return var3 || var4;
            }
         }

         rjc_3 var9 = class_(1, var0.class_(rpB_2.X), var1.class_(rpB_2.X), var3, var4);
         rjc_3 var10 = class_(var9.class_().size() - 1, var0.class_(rpB_2.Y), var1.class_(rpB_2.Y), var3, var4);
         rjc_3 var11 = class_((var9.class_().size() - 1) * (var10.class_().size() - 1), var0.class_(rpB_2.Z), var1.class_(rpB_2.Z), var3, var4);
         return class_(var9, var10, var11, var0.class_, var1.class_, var2);
      }
   }

   protected static rjc_3 class_(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var5 = var1.size() - 1;
      int var6 = var2.size() - 1;
      if (var1 instanceof rjW_2 && var2 instanceof rjW_2) {
         long var7 = class_(var5, var6);
         if ((long)var0 * var7 <= 256L) {
            return new rjk_3(var5, var6);
         }
      }

      if (var1.getDouble(var5) < var2.getDouble(0) - 1.0E-7) {
         return new rjv_3(var1, var2, false);
      } else if (var2.getDouble(var6) < var1.getDouble(0) - 1.0E-7) {
         return new rjv_3(var2, var1, true);
      } else if (var5 != var6 || !Objects.equals(var1, var2)) {
         return new rjZ_2(var1, var2, var3, var4);
      } else if (var1 instanceof rjA_2) {
         return (rjc_3)var1;
      } else {
         return (rjc_3)(var2 instanceof rjA_2 ? (rjc_3)var2 : new rjA_2(var1));
      }
   }

   public static rjC_2 class_(rjC_2 var0, rpr_3 var1) {
      if (var0 == break_()) {
         return break_();
      } else {
         rpB_2 var2 = var1.final_();
         boolean var3;
         int var4;
         if (var1.throws_() == rpG_2.POSITIVE) {
            var3 = DoubleMath.fuzzyEquals(var0.byte_(var2), 1.0, 1.0E-7);
            var4 = var0.class_.byte_(var2) - 1;
         } else {
            var3 = DoubleMath.fuzzyEquals(var0.break_(var2), 0.0, 1.0E-7);
            var4 = 0;
         }

         return (rjC_2)(!var3 ? class_() : new rjn_3(var0, var2, var4));
      }
   }

   public static boolean class_(rjC_2 var0, rjC_2 var1, rpr_3 var2) {
      if (var0 == break_() && var1 == break_()) {
         return true;
      } else if (var1.break_()) {
         return false;
      } else {
         rpB_2 var3 = var2.final_();
         rpG_2 var4 = var2.throws_();
         rjC_2 var5 = var4 == rpG_2.POSITIVE ? var0 : var1;
         rjC_2 var6 = var4 == rpG_2.POSITIVE ? var1 : var0;
         rjN_2 var7 = var4 == rpG_2.POSITIVE ? rjN_2.throws_ : rjN_2.byte_;
         return DoubleMath.fuzzyEquals(var5.byte_(var3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals(var6.break_(var3), 0.0, 1.0E-7)
            && !byte_(new rjn_3(var5, var3, var5.class_.byte_(var3) - 1), new rjn_3(var6, var3, 0), var7);
      }
   }

   private static int class_(double var0, double var2, double var4) {
      return var0 > 0.0 ? rfU_2.byte_(var4 + var0) + 1 : rfU_2.byte_(var2 + var0) - 1;
   }

   private static double class_(rfl_3 var0, rRR var1, double var2, rjm_3 var4, ryF_2 var5, Stream<rjC_2> var6) {
      if (var0.break_() < 1.0E-6 || var0.byte_() < 1.0E-6 || var0.protected_() < 1.0E-6) {
         return var2;
      } else if (Math.abs(var2) < 1.0E-7) {
         return 0.0;
      } else {
         ryF_2 var7 = var5.class_();
         rpB_2 var8 = var7.class_(rpB_2.X);
         rpB_2 var9 = var7.class_(rpB_2.Y);
         rpB_2 var10 = var7.class_(rpB_2.Z);
         rfw_3 var11 = new rfw_3();
         int var12 = rfU_2.byte_(var0.class_(var8) - 1.0E-7) - 1;
         int var13 = rfU_2.byte_(var0.break_(var8) + 1.0E-7) + 1;
         int var14 = rfU_2.byte_(var0.class_(var9) - 1.0E-7) - 1;
         int var15 = rfU_2.byte_(var0.break_(var9) + 1.0E-7) + 1;
         double var16 = var0.class_(var10) - 1.0E-7;
         double var18 = var0.break_(var10) + 1.0E-7;
         boolean var20 = var2 > 0.0;
         int var21 = var20 ? rfU_2.byte_(var0.break_(var10) - 1.0E-7) - 1 : rfU_2.byte_(var0.class_(var10) + 1.0E-7) + 1;
         int var22 = class_(var2, var16, var18);
         int var23 = var20 ? 1 : -1;

         for (int var24 = var21; var20 ? var24 <= var22 : var24 >= var22; var24 += var23) {
            for (int var25 = var12; var25 <= var13; var25++) {
               for (int var26 = var14; var26 <= var15; var26++) {
                  int var27 = 0;
                  if (var25 == var12 || var25 == var13) {
                     var27++;
                  }

                  if (var26 == var14 || var26 == var15) {
                     var27++;
                  }

                  if (var24 == var21 || var24 == var22) {
                     var27++;
                  }

                  if (var27 < 3) {
                     var11.class_(var7, var25, var26, var24);
                     xc_3 var28 = var1.byte_(var11);
                     if ((var27 != 1 || var28.protected_()) && (var27 != 2 || var28.class_(xu_3.rc))) {
                        var2 = var28.break_(var1, var11, var4)
                           .class_(var10, var0.protected_((double)(-var11.b_()), (double)(-var11.c_()), (double)(-var11.d_())), var2);
                        if (Math.abs(var2) < 1.0E-7) {
                           return 0.0;
                        }

                        var22 = class_(var2, var16, var18);
                     }
                  }
               }
            }
         }

         double[] var29 = new double[]{var2};
         var6.forEach(var3 -> var29[0] = var3.class_(var10, var0, var29[0]));
         return var29[0];
      }
   }

   public static double class_(rpB_2 var0, rfl_3 var1, rRR var2, double var3, rjm_3 var5, Stream<rjC_2> var6) {
      return class_(var1, var2, var3, var5, ryF_2.class_(var0, rpB_2.Z), var6);
   }

   public static rjC_2 class_() {
      return byte_;
   }

   private static int class_(double var0, double var2) {
      if (!(var0 < -1.0E-7) && !(var2 > 1.0000001)) {
         for (int var4 = 0; var4 <= 3; var4++) {
            double var5 = var0 * (double)(1 << var4);
            double var7 = var2 * (double)(1 << var4);
            boolean var9 = Math.abs(var5 - Math.floor(var5)) < 1.0E-7;
            boolean var10 = Math.abs(var7 - Math.floor(var7)) < 1.0E-7;
            if (var9 && var10) {
               return var4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   protected static long class_(int var0, int var1) {
      return (long)var0 * (long)(var1 / IntMath.gcd(var0, var1));
   }

   public static rjC_2 class_(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      return break_(var0, var1, var2).byte_();
   }

   public static rjC_2 class_(rjC_2 var0, rjC_2... var1) {
      return Arrays.stream(var1).reduce(var0, rjw_3::class_);
   }

   public static rjC_2 class_(rjC_2 var0, rjC_2 var1) {
      return class_(var0, var1, rjN_2.package_);
   }

   public static double class_(rpB_2 var0, rfl_3 var1, Stream<rjC_2> var2, double var3) {
      Iterator var5 = var2.iterator();

      while (var5.hasNext()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         }

         var3 = ((rjC_2)var5.next()).class_(var0, var1, var3);
      }

      return var3;
   }

   public static rjC_2 class_(rfl_3 var0) {
      int var1 = class_(var0.class_, var0.protected_);
      int var2 = class_(var0.break_, var0.throws_);
      int var3 = class_(var0.byte_, var0.case_);
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         if (var1 == 0 && var2 == 0 && var3 == 0) {
            return var0.throws_(0.5, 0.5, 0.5) ? break_() : class_();
         } else {
            int var4 = 1 << var1;
            int var5 = 1 << var2;
            int var6 = 1 << var3;
            int var7 = (int)Math.round(var0.class_ * (double)var4);
            int var8 = (int)Math.round(var0.protected_ * (double)var4);
            int var9 = (int)Math.round(var0.break_ * (double)var5);
            int var10 = (int)Math.round(var0.throws_ * (double)var5);
            int var11 = (int)Math.round(var0.byte_ * (double)var6);
            int var12 = (int)Math.round(var0.case_ * (double)var6);
            rjd_3 var13 = new rjd_3(var4, var5, var6, var7, var9, var11, var8, var10, var12);

            for (long var14 = (long)var7; var14 < (long)var8; var14++) {
               for (long var16 = (long)var9; var16 < (long)var10; var16++) {
                  for (long var18 = (long)var11; var18 < (long)var12; var18++) {
                     var13.class_((int)var14, (int)var16, (int)var18, false, true);
                  }
               }
            }

            return new rjy_3(var13);
         }
      } else {
         return new rjl_3(
            break_.class_, new double[]{var0.class_, var0.protected_}, new double[]{var0.break_, var0.throws_}, new double[]{var0.byte_, var0.case_}
         );
      }
   }

   public static rjC_2 class_(double var0, double var2, double var4, double var6, double var8, double var10) {
      return class_(new rfl_3(var0, var2, var4, var6, var8, var10));
   }

   private static boolean class_(rjc_3 var0, rjc_3 var1, rjc_3 var2, rjp_3 var3, rjp_3 var4, rjN_2 var5) {
      return !var0.class_(
         (var5x, var6, var7) -> var1.class_(
               (var6x, var7x, var8) -> var2.class_((var7xx, var8x, var9) -> !var5.apply(var3.byte_(var5x, var6x, var7xx), var4.byte_(var6, var7x, var8x)))
            )
      );
   }

   public static rjC_2 break_() {
      return break_;
   }

   public static rjC_2 break_(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)rqR_2.byte_(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.apply(true, true) ? var0 : class_();
      } else {
         boolean var3 = var2.apply(true, false);
         boolean var4 = var2.apply(false, true);
         if (var0.break_()) {
            return var4 ? var1 : class_();
         } else if (var1.break_()) {
            return var3 ? var0 : class_();
         } else {
            rjc_3 var5 = class_(1, var0.class_(rpB_2.X), var1.class_(rpB_2.X), var3, var4);
            rjc_3 var6 = class_(var5.class_().size() - 1, var0.class_(rpB_2.Y), var1.class_(rpB_2.Y), var3, var4);
            rjc_3 var7 = class_((var5.class_().size() - 1) * (var6.class_().size() - 1), var0.class_(rpB_2.Z), var1.class_(rpB_2.Z), var3, var4);
            rjd_3 var8 = rjd_3.class_(var0.class_, var1.class_, var5, var6, var7, var2);
            return (rjC_2)(var5 instanceof rjk_3 && var6 instanceof rjk_3 && var7 instanceof rjk_3
               ? new rjy_3(var8)
               : new rjl_3(var8, var5.class_(), var6.class_(), var7.class_()));
         }
      }
   }

   public static boolean break_(rjC_2 var0, rjC_2 var1) {
      if (var0 == break_() || var1 == break_()) {
         return true;
      } else {
         return var0.break_() && var1.break_() ? false : !byte_(break_(), break_(var0, var1, rjN_2.package_), rjN_2.throws_);
      }
   }

   public static boolean break_(rjC_2 var0, rjC_2 var1, rpr_3 var2) {
      if (var0 != break_() && var1 != break_()) {
         rpB_2 var3 = var2.final_();
         rpG_2 var4 = var2.throws_();
         rjC_2 var5 = var4 == rpG_2.POSITIVE ? var0 : var1;
         rjC_2 var6 = var4 == rpG_2.POSITIVE ? var1 : var0;
         if (!DoubleMath.fuzzyEquals(var5.byte_(var3), 1.0, 1.0E-7)) {
            var5 = class_();
         }

         if (!DoubleMath.fuzzyEquals(var6.break_(var3), 0.0, 1.0E-7)) {
            var6 = class_();
         }

         return !byte_(break_(), break_(new rjn_3(var5, var3, var5.class_.byte_(var3) - 1), new rjn_3(var6, var3, 0), rjN_2.package_), rjN_2.throws_);
      } else {
         return true;
      }
   }
}
