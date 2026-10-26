package celestial;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public final class rhj_3 {
   public rhj_3() {
   }

   public static void id_class(an_3 var0, float var1) {
      rjU_2 var2 = var0.rv();
      if (var2.id_catch() != (double)0.0F) {
         float var3 = rfU_2.id_class(an_3.id_case(var2));
         Float var8 = (float)(rfU_2.id_protected(var2.id_protected, var2.id_break) * (double)(180F / (float)Math.PI)) + 90.0F;
         var0.id_throws[15] = var8;
         Float var9 = (float)(rfU_2.id_protected((double)var3, var2.id_byte) * (double)(180F / (float)Math.PI)) - 90.0F;

         Float var10;
         for(var0.id_throws[16] = var9; (Float)var0.id_throws[16] - (Float)var0.id_throws[18] < -180.0F; var0.id_throws[18] = var10) {
            var10 = (Float)var0.id_throws[18] - 360.0F;
         }

         while((Float)var0.id_throws[16] - (Float)var0.id_throws[18] >= 180.0F) {
            Float var11 = (Float)var0.id_throws[18] + 360.0F;
            var0.id_throws[18] = var11;
         }

         while((Float)var0.id_throws[15] - (Float)var0.id_throws[17] < -180.0F) {
            Float var12 = (Float)var0.id_throws[17] - 360.0F;
            var0.id_throws[17] = var12;
         }

         while((Float)var0.id_throws[15] - (Float)var0.id_throws[17] >= 180.0F) {
            Float var13 = (Float)var0.id_throws[17] + 360.0F;
            var0.id_throws[17] = var13;
         }

         Float var14 = rfU_2.id_catch(var1, (Float)var0.id_throws[18], (Float)var0.id_throws[16]);
         var0.id_throws[16] = var14;
         Float var15 = rfU_2.id_catch(var1, (Float)var0.id_throws[17], (Float)var0.id_throws[15]);
         var0.id_throws[15] = var15;
      }

   }

   public static rfo_3 id_class(rYB var0, Class<? extends iB_2> var1, rjU_2 var2, rjU_2 var3, rfl_3 var4, Predicate<an_3> var5, float var6) {
      double var7 = Double.MAX_VALUE;
      an_3 var9 = null;
      Pair var10 = Pair.of(rpr_3.UP, var2);

      for(an_3 var12 : var0.id_class(var1, var4, var5)) {
         rfl_3 var13 = var12.rN().id_class((double)var6);
         Optional var14 = var13.id_byte(var2, var3);
         var10 = (Pair)var14.orElse(var10);
         if (var14.isPresent()) {
            double var15 = var2.id_implements((rjU_2)((Pair)var14.get()).getRight());
            if (var15 < var7) {
               var9 = var12;
               var7 = var15;
            }
         }
      }

      return var9 == null ? null : new rfo_3(var9, (rpr_3)var10.getLeft(), (rjU_2)var10.getRight());
   }

   public static rfo_3 id_class(rYB var0, an_3 var1, rjU_2 var2, rjU_2 var3, rfl_3 var4, Predicate<an_3> var5) {
      double var6 = Double.MAX_VALUE;
      an_3 var8 = null;

      for(an_3 var10 : var0.id_break(var1, var4, var5)) {
         rfl_3 var11 = var10.rN().id_class((double)0.3F);
         Optional var12 = var11.id_break(var2, var3);
         if (var12.isPresent()) {
            double var13 = var2.id_implements((rjU_2)var12.get());
            if (var13 < var6) {
               var8 = var10;
               var6 = var13;
            }
         }
      }

      return var8 == null ? null : new rfo_3(var8);
   }

   public static rpm_3 id_class(iB_2 var0, rdb_3 var1) {
      return var0.ss().id_break() == var1 ? rpm_3.MAIN_HAND : rpm_3.OFF_HAND;
   }

   public static rhm_3 id_class(iB_2 var0, rdn_3 var1, float var2) {
      rxb_3 var3 = (rxb_3)(var1.id_break() instanceof rxb_3 ? var1.id_break() : rdy_3.OO);
      rhm_3 var4 = var3.id_class((rYB)var0.id_throws[7], var1, var0);
      var4.id_class(var0, var2);
      if (var1.id_break() == rdy_3.kz && var4 instanceof rhF_2) {
         ((rhF_2)var4).id_break(var1);
      }

      return var4;
   }

   public static rjG_2 id_class(an_3 var0, Predicate<an_3> var1) {
      return id_class(var0, var1, var0.rN().id_break(var0.rv()).id_class((double)1.0F));
   }

   public static rjG_2 id_class(an_3 var0, Predicate<an_3> var1, rfl_3 var2) {
      rjU_2 var3 = var0.rv();
      rYB var4 = (rYB)var0.id_throws[7];
      rjU_2 var5 = var0.Ps();
      rjU_2 var6 = var5.id_throws(var3);
      Object var7 = var4.id_class(new rjB_2(var5, var6, rjS_2.COLLIDER, rjs_3.NONE, var0));
      if (((rjG_2)var7).id_byte() != rjM_2.MISS) {
         var6 = ((rjG_2)var7).id_case();
      }

      rfo_3 var8 = id_class(var4, var0, var5, var6, var2, var1);
      if (var8 != null) {
         var7 = var8;
      }

      return (rjG_2)var7;
   }

   public static rfo_3 id_class(an_3 var0, rjU_2 var1, rjU_2 var2, rfl_3 var3, Predicate<an_3> var4, double var5) {
      rYB var7 = (rYB)var0.id_throws[7];
      double var8 = var5;
      an_3 var10 = null;
      rjU_2 var11 = null;

      for(an_3 var14 : var7.id_break(var0, var3, var4)) {
         ArrayList var15 = new ArrayList();
         var15.add(var14.rN().id_class((double)var14.f()));

         for(rfl_3 var17 : var15) {
            Optional var18 = var17.id_break(var1, var2);
            if (var17.id_case(var1)) {
               if (var8 >= (double)0.0F) {
                  var10 = var14;
                  var11 = (rjU_2)var18.orElse(var1);
                  var8 = (double)0.0F;
               }
            } else if (var18.isPresent()) {
               rjU_2 var19 = (rjU_2)var18.get();
               double var20 = var1.id_implements(var19);
               if (var20 < var8 || var8 == (double)0.0F) {
                  if (var14.PO() == var0.PO()) {
                     if (var8 == (double)0.0F) {
                        var10 = var14;
                        var11 = var19;
                     }
                  } else {
                     var10 = var14;
                     var11 = var19;
                     var8 = var20;
                  }
               }
            }
         }
      }

      return var10 == null ? null : new rfo_3(var10, var11);
   }

   public static rfo_3 id_class(an_3 var0, an_3 var1, rjU_2 var2, rjU_2 var3, double var4) {
      double var6 = var4 * var4;
      an_3 var8 = null;
      rjU_2 var9 = null;
      rfl_3 var10 = var1.rN().id_class((double)var1.f());
      Optional var11 = var10.id_break(var2, var3);
      if (var10.id_case(var2)) {
         if (var6 >= (double)0.0F) {
            var8 = var1;
            var9 = (rjU_2)var11.orElse(var2);
         }
      } else if (var11.isPresent()) {
         rjU_2 var12 = (rjU_2)var11.get();
         double var13 = var2.id_implements(var12);
         if (var13 < var6 || var6 == (double)0.0F) {
            if (var1.PO() == var0.PO()) {
               if (var6 == (double)0.0F) {
                  var8 = var1;
                  var9 = var12;
               }
            } else {
               var8 = var1;
               var9 = var12;
            }
         }
      }

      return var8 == null ? null : new rfo_3(var8, var9);
   }
}
