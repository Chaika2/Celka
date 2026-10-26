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
   private static final rjC_2 id_break = rqR_2.id_class((Supplier<rjy_3>)(() -> {
      rjd_3 var0 = new rjd_3(1, 1, 1);
      var0.id_class(0, 0, 0, true, true);
      return new rjy_3(var0);
   }));
   public static final rjC_2 id_class = id_class(
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.NEGATIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY,
      Double.POSITIVE_INFINITY
   );
   private static final rjC_2 id_byte = new rjl_3(
      new rjd_3(0, 0, 0), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0}), new DoubleArrayList(new double[]{0.0})
   );

   public static boolean id_byte(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)rqR_2.id_byte(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.apply(true, true);
      } else if (var0.id_break()) {
         return var2.apply(false, !var1.id_break());
      } else if (var1.id_break()) {
         return var2.apply(!var0.id_break(), false);
      } else {
         boolean var3 = var2.apply(true, false);
         boolean var4 = var2.apply(false, true);

         for (rpB_2 var8 : ryF_2.AXES) {
            if (var0.id_byte(var8) < var1.id_break(var8) - 1.0E-7) {
               return var3 || var4;
            }

            if (var1.id_byte(var8) < var0.id_break(var8) - 1.0E-7) {
               return var3 || var4;
            }
         }

         rjc_3 var9 = id_class(1, var0.id_class(rpB_2.X), var1.id_class(rpB_2.X), var3, var4);
         rjc_3 var10 = id_class(var9.id_class().size() - 1, var0.id_class(rpB_2.Y), var1.id_class(rpB_2.Y), var3, var4);
         rjc_3 var11 = id_class((var9.id_class().size() - 1) * (var10.id_class().size() - 1), var0.id_class(rpB_2.Z), var1.id_class(rpB_2.Z), var3, var4);
         return id_class(var9, var10, var11, var0.id_class, var1.id_class, var2);
      }
   }

   protected static rjc_3 id_class(int var0, DoubleList var1, DoubleList var2, boolean var3, boolean var4) {
      int var5 = var1.size() - 1;
      int var6 = var2.size() - 1;
      if (var1 instanceof rjW_2 && var2 instanceof rjW_2) {
         long var7 = id_class(var5, var6);
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

   public static rjC_2 id_class(rjC_2 var0, rpr_3 var1) {
      if (var0 == id_break()) {
         return id_break();
      } else {
         rpB_2 var2 = var1.id_final();
         boolean var3;
         int var4;
         if (var1.id_throws() == rpG_2.POSITIVE) {
            var3 = DoubleMath.fuzzyEquals(var0.id_byte(var2), 1.0, 1.0E-7);
            var4 = var0.id_class.id_byte(var2) - 1;
         } else {
            var3 = DoubleMath.fuzzyEquals(var0.id_break(var2), 0.0, 1.0E-7);
            var4 = 0;
         }

         return (rjC_2)(!var3 ? id_class() : new rjn_3(var0, var2, var4));
      }
   }

   public static boolean id_class(rjC_2 var0, rjC_2 var1, rpr_3 var2) {
      if (var0 == id_break() && var1 == id_break()) {
         return true;
      } else if (var1.id_break()) {
         return false;
      } else {
         rpB_2 var3 = var2.id_final();
         rpG_2 var4 = var2.id_throws();
         rjC_2 var5 = var4 == rpG_2.POSITIVE ? var0 : var1;
         rjC_2 var6 = var4 == rpG_2.POSITIVE ? var1 : var0;
         rjN_2 var7 = var4 == rpG_2.POSITIVE ? rjN_2.id_throws : rjN_2.id_byte;
         return DoubleMath.fuzzyEquals(var5.id_byte(var3), 1.0, 1.0E-7)
            && DoubleMath.fuzzyEquals(var6.id_break(var3), 0.0, 1.0E-7)
            && !id_byte(new rjn_3(var5, var3, var5.id_class.id_byte(var3) - 1), new rjn_3(var6, var3, 0), var7);
      }
   }

   private static int id_class(double var0, double var2, double var4) {
      return var0 > 0.0 ? rfU_2.id_byte(var4 + var0) + 1 : rfU_2.id_byte(var2 + var0) - 1;
   }

   private static double id_class(rfl_3 var0, rRR var1, double var2, rjm_3 var4, ryF_2 var5, Stream<rjC_2> var6) {
      if (var0.id_break() < 1.0E-6 || var0.id_byte() < 1.0E-6 || var0.id_protected() < 1.0E-6) {
         return var2;
      } else if (Math.abs(var2) < 1.0E-7) {
         return 0.0;
      } else {
         ryF_2 var7 = var5.id_class();
         rpB_2 var8 = var7.id_class(rpB_2.X);
         rpB_2 var9 = var7.id_class(rpB_2.Y);
         rpB_2 var10 = var7.id_class(rpB_2.Z);
         rfw_3 var11 = new rfw_3();
         int var12 = rfU_2.id_byte(var0.id_class(var8) - 1.0E-7) - 1;
         int var13 = rfU_2.id_byte(var0.id_break(var8) + 1.0E-7) + 1;
         int var14 = rfU_2.id_byte(var0.id_class(var9) - 1.0E-7) - 1;
         int var15 = rfU_2.id_byte(var0.id_break(var9) + 1.0E-7) + 1;
         double var16 = var0.id_class(var10) - 1.0E-7;
         double var18 = var0.id_break(var10) + 1.0E-7;
         boolean var20 = var2 > 0.0;
         int var21 = var20 ? rfU_2.id_byte(var0.id_break(var10) - 1.0E-7) - 1 : rfU_2.id_byte(var0.id_class(var10) + 1.0E-7) + 1;
         int var22 = id_class(var2, var16, var18);
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
                     var11.id_class(var7, var25, var26, var24);
                     xc_3 var28 = var1.id_byte(var11);
                     if ((var27 != 1 || var28.id_protected()) && (var27 != 2 || var28.id_class(xu_3.rc))) {
                        var2 = var28.id_break(var1, var11, var4)
                           .id_class(var10, var0.id_protected((double)(-var11.b_()), (double)(-var11.c_()), (double)(-var11.d_())), var2);
                        if (Math.abs(var2) < 1.0E-7) {
                           return 0.0;
                        }

                        var22 = id_class(var2, var16, var18);
                     }
                  }
               }
            }
         }

         double[] var29 = new double[]{var2};
         var6.forEach(var3 -> var29[0] = var3.id_class(var10, var0, var29[0]));
         return var29[0];
      }
   }

   public static double id_class(rpB_2 var0, rfl_3 var1, rRR var2, double var3, rjm_3 var5, Stream<rjC_2> var6) {
      return id_class(var1, var2, var3, var5, ryF_2.id_class(var0, rpB_2.Z), var6);
   }

   public static rjC_2 id_class() {
      return id_byte;
   }

   private static int id_class(double var0, double var2) {
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

   protected static long id_class(int var0, int var1) {
      return (long)var0 * (long)(var1 / IntMath.gcd(var0, var1));
   }

   public static rjC_2 id_class(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      return id_break(var0, var1, var2).id_byte();
   }

   public static rjC_2 id_class(rjC_2 var0, rjC_2... var1) {
      return Arrays.stream(var1).reduce(var0, rjw_3::id_class);
   }

   public static rjC_2 id_class(rjC_2 var0, rjC_2 var1) {
      return id_class(var0, var1, rjN_2.id_package);
   }

   public static double id_class(rpB_2 var0, rfl_3 var1, Stream<rjC_2> var2, double var3) {
      Iterator var5 = var2.iterator();

      while (var5.hasNext()) {
         if (Math.abs(var3) < 1.0E-7) {
            return 0.0;
         }

         var3 = ((rjC_2)var5.next()).id_class(var0, var1, var3);
      }

      return var3;
   }

   public static rjC_2 id_class(rfl_3 var0) {
      int var1 = id_class(var0.id_class, var0.id_protected);
      int var2 = id_class(var0.id_break, var0.id_throws);
      int var3 = id_class(var0.id_byte, var0.id_case);
      if (var1 >= 0 && var2 >= 0 && var3 >= 0) {
         if (var1 == 0 && var2 == 0 && var3 == 0) {
            return var0.id_throws(0.5, 0.5, 0.5) ? id_break() : id_class();
         } else {
            int var4 = 1 << var1;
            int var5 = 1 << var2;
            int var6 = 1 << var3;
            int var7 = (int)Math.round(var0.id_class * (double)var4);
            int var8 = (int)Math.round(var0.id_protected * (double)var4);
            int var9 = (int)Math.round(var0.id_break * (double)var5);
            int var10 = (int)Math.round(var0.id_throws * (double)var5);
            int var11 = (int)Math.round(var0.id_byte * (double)var6);
            int var12 = (int)Math.round(var0.id_case * (double)var6);
            rjd_3 var13 = new rjd_3(var4, var5, var6, var7, var9, var11, var8, var10, var12);

            for (long var14 = (long)var7; var14 < (long)var8; var14++) {
               for (long var16 = (long)var9; var16 < (long)var10; var16++) {
                  for (long var18 = (long)var11; var18 < (long)var12; var18++) {
                     var13.id_class((int)var14, (int)var16, (int)var18, false, true);
                  }
               }
            }

            return new rjy_3(var13);
         }
      } else {
         return new rjl_3(
            id_break.id_class,
            new double[]{var0.id_class, var0.id_protected},
            new double[]{var0.id_break, var0.id_throws},
            new double[]{var0.id_byte, var0.id_case}
         );
      }
   }

   public static rjC_2 id_class(double var0, double var2, double var4, double var6, double var8, double var10) {
      return id_class(new rfl_3(var0, var2, var4, var6, var8, var10));
   }

   private static boolean id_class(rjc_3 var0, rjc_3 var1, rjc_3 var2, rjp_3 var3, rjp_3 var4, rjN_2 var5) {
      return !var0.id_class(
         (var5x, var6, var7) -> var1.id_class(
               (var6x, var7x, var8) -> var2.id_class((var7xx, var8x, var9) -> !var5.apply(var3.id_byte(var5x, var6x, var7xx), var4.id_byte(var6, var7x, var8x)))
            )
      );
   }

   public static rjC_2 id_break() {
      return id_break;
   }

   public static rjC_2 id_break(rjC_2 var0, rjC_2 var1, rjN_2 var2) {
      if (var2.apply(false, false)) {
         throw (IllegalArgumentException)rqR_2.id_byte(new IllegalArgumentException());
      } else if (var0 == var1) {
         return var2.apply(true, true) ? var0 : id_class();
      } else {
         boolean var3 = var2.apply(true, false);
         boolean var4 = var2.apply(false, true);
         if (var0.id_break()) {
            return var4 ? var1 : id_class();
         } else if (var1.id_break()) {
            return var3 ? var0 : id_class();
         } else {
            rjc_3 var5 = id_class(1, var0.id_class(rpB_2.X), var1.id_class(rpB_2.X), var3, var4);
            rjc_3 var6 = id_class(var5.id_class().size() - 1, var0.id_class(rpB_2.Y), var1.id_class(rpB_2.Y), var3, var4);
            rjc_3 var7 = id_class((var5.id_class().size() - 1) * (var6.id_class().size() - 1), var0.id_class(rpB_2.Z), var1.id_class(rpB_2.Z), var3, var4);
            rjd_3 var8 = rjd_3.id_class(var0.id_class, var1.id_class, var5, var6, var7, var2);
            return (rjC_2)(var5 instanceof rjk_3 && var6 instanceof rjk_3 && var7 instanceof rjk_3
               ? new rjy_3(var8)
               : new rjl_3(var8, var5.id_class(), var6.id_class(), var7.id_class()));
         }
      }
   }

   public static boolean id_break(rjC_2 var0, rjC_2 var1) {
      if (var0 == id_break() || var1 == id_break()) {
         return true;
      } else {
         return var0.id_break() && var1.id_break() ? false : !id_byte(id_break(), id_break(var0, var1, rjN_2.id_package), rjN_2.id_throws);
      }
   }

   public static boolean id_break(rjC_2 var0, rjC_2 var1, rpr_3 var2) {
      if (var0 != id_break() && var1 != id_break()) {
         rpB_2 var3 = var2.id_final();
         rpG_2 var4 = var2.id_throws();
         rjC_2 var5 = var4 == rpG_2.POSITIVE ? var0 : var1;
         rjC_2 var6 = var4 == rpG_2.POSITIVE ? var1 : var0;
         if (!DoubleMath.fuzzyEquals(var5.id_byte(var3), 1.0, 1.0E-7)) {
            var5 = id_class();
         }

         if (!DoubleMath.fuzzyEquals(var6.id_break(var3), 0.0, 1.0E-7)) {
            var6 = id_class();
         }

         return !id_byte(
            id_break(), id_break(new rjn_3(var5, var3, var5.id_class.id_byte(var3) - 1), new rjn_3(var6, var3, 0), rjN_2.id_package), rjN_2.id_throws
         );
      } else {
         return true;
      }
   }
}
