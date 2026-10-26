package celestial;

import java.util.function.Function;

public class rqI_2 {
   public static rjC_2 class_(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.byte_(var1);
      return var2.class_(rls_3.F) || var2.break_() instanceof zv_3 && var2.byte_(zv_3.volatile_) ? rjw_3.class_() : var2.extends_(var0, var1);
   }

   public static double class_(rfH_2 var0, int var1, Function<rfH_2, rjC_2> var2) {
      rfw_3 var3 = var0.new_();
      int var4 = 0;

      while (var4 < var1) {
         rjC_2 var5 = (rjC_2)var2.apply(var3);
         if (!var5.break_()) {
            return (double)(var0.c_() + var4) + var5.break_(rpB_2.Y);
         }

         var4++;
         var3.class_(rpr_3.UP);
      }

      return Double.POSITIVE_INFINITY;
   }

   public static rjU_2 class_(aI_2<?> var0, rRT var1, rfH_2 var2, boolean var3) {
      if (var3 && var0.class_(var1.byte_(var2))) {
         return null;
      } else {
         double var4 = var1.class_(class_((rRq_1)var1, var2), () -> class_((rRq_1)var1, var2.break_()));
         if (!class_(var4)) {
            return null;
         } else if (var3 && var4 <= 0.0 && var0.class_(var1.byte_(var2.break_()))) {
            return null;
         } else {
            rjU_2 var6 = rjU_2.class_(var2, var4);
            return var1.byte_((an_3)null, var0.volatile_().class_(var6)).allMatch(rjC_2::break_) ? var6 : null;
         }
      }
   }

   public static int[][] class_(rpr_3 var0) {
      rpr_3 var1 = var0.catch_();
      rpr_3 var2 = var1.case_();
      rpr_3 var3 = var0.case_();
      return new int[][]{
         {var1.implements_(), var1.extends_()},
         {var2.implements_(), var2.extends_()},
         {var3.implements_() + var1.implements_(), var3.extends_() + var1.extends_()},
         {var3.implements_() + var2.implements_(), var3.extends_() + var2.extends_()},
         {var0.implements_() + var1.implements_(), var0.extends_() + var1.extends_()},
         {var0.implements_() + var2.implements_(), var0.extends_() + var2.extends_()},
         {var3.implements_(), var3.extends_()},
         {var0.implements_(), var0.extends_()}
      };
   }

   public static boolean class_(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean class_(rRT var0, iB_2 var1, rfl_3 var2) {
      return var0.byte_(var1, var2).allMatch(rjC_2::break_);
   }

   public static rjU_2 class_(rRT var0, double var1, double var3, double var5, iB_2 var7, iM_2 var8) {
      if (class_(var3)) {
         rjU_2 var9 = new rjU_2(var1, var3, var5);
         if (class_(var0, var7, var7.catch_(var8).protected_(var9))) {
            return var9;
         }
      }

      return null;
   }
}
