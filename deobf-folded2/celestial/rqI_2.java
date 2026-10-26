package celestial;

import java.util.function.Function;

public class rqI_2 {
   public static rjC_2 id_class(rRq_1 var0, rfH_2 var1) {
      xc_3 var2 = var0.id_byte(var1);
      return var2.id_class(rls_3.F) || var2.id_break() instanceof zv_3 && var2.id_byte(zv_3.id_volatile) ? rjw_3.id_class() : var2.id_extends(var0, var1);
   }

   public static double id_class(rfH_2 var0, int var1, Function<rfH_2, rjC_2> var2) {
      rfw_3 var3 = var0.id_new();
      int var4 = 0;

      while (var4 < var1) {
         rjC_2 var5 = (rjC_2)var2.apply(var3);
         if (!var5.id_break()) {
            return (double)(var0.c_() + var4) + var5.id_break(rpB_2.Y);
         }

         var4++;
         var3.id_class(rpr_3.UP);
      }

      return Double.POSITIVE_INFINITY;
   }

   public static rjU_2 id_class(aI_2<?> var0, rRT var1, rfH_2 var2, boolean var3) {
      if (var3 && var0.id_class(var1.id_byte(var2))) {
         return null;
      } else {
         double var4 = var1.id_class(id_class((rRq_1)var1, var2), () -> id_class((rRq_1)var1, var2.id_break()));
         if (!id_class(var4)) {
            return null;
         } else if (var3 && var4 <= 0.0 && var0.id_class(var1.id_byte(var2.id_break()))) {
            return null;
         } else {
            rjU_2 var6 = rjU_2.id_class(var2, var4);
            return var1.id_byte((an_3)null, var0.id_volatile().id_class(var6)).allMatch(rjC_2::id_break) ? var6 : null;
         }
      }
   }

   public static int[][] id_class(rpr_3 var0) {
      rpr_3 var1 = var0.id_catch();
      rpr_3 var2 = var1.id_case();
      rpr_3 var3 = var0.id_case();
      return new int[][]{
         {var1.id_implements(), var1.id_extends()},
         {var2.id_implements(), var2.id_extends()},
         {var3.id_implements() + var1.id_implements(), var3.id_extends() + var1.id_extends()},
         {var3.id_implements() + var2.id_implements(), var3.id_extends() + var2.id_extends()},
         {var0.id_implements() + var1.id_implements(), var0.id_extends() + var1.id_extends()},
         {var0.id_implements() + var2.id_implements(), var0.id_extends() + var2.id_extends()},
         {var3.id_implements(), var3.id_extends()},
         {var0.id_implements(), var0.id_extends()}
      };
   }

   public static boolean id_class(double var0) {
      return !Double.isInfinite(var0) && var0 < 1.0;
   }

   public static boolean id_class(rRT var0, iB_2 var1, rfl_3 var2) {
      return var0.id_byte(var1, var2).allMatch(rjC_2::id_break);
   }

   public static rjU_2 id_class(rRT var0, double var1, double var3, double var5, iB_2 var7, iM_2 var8) {
      if (id_class(var3)) {
         rjU_2 var9 = new rjU_2(var1, var3, var5);
         if (id_class(var0, var7, var7.id_catch(var8).id_protected(var9))) {
            return var9;
         }
      }

      return null;
   }
}
