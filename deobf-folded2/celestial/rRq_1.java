package celestial;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface rRq_1 {
   xc_3 id_byte(rfH_2 var1);

   default rff_3 id_class(rjU_2 var1, rjU_2 var2, rfH_2 var3, rjC_2 var4, xc_3 var5, boolean var6) {
      rff_3 var7 = var4.id_class(var1, var2, var3, var6);
      if (var7 != null) {
         rff_3 var8 = var5.id_volatile(this, var3).id_class(var1, var2, var3, var6);
         if (var8 != null && var8.id_case().id_protected(var1).id_catch() < var7.id_case().id_protected(var1).id_catch()) {
            return var7.id_class(var8.id_break());
         }
      }

      return var7;
   }

   default rff_3 id_class(rjB_2 var1) {
      return this.id_class(var1, false);
   }

   default double id_class(rjC_2 var1, Supplier<rjC_2> var2) {
      if (!var1.id_break()) {
         return var1.id_byte(rpB_2.Y);
      } else {
         double var3 = ((rjC_2)var2.get()).id_byte(rpB_2.Y);
         return var3 >= 1.0 ? var3 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   static <T> T id_class(rjB_2 var0, BiFunction<rjB_2, rfH_2, T> var1, Function<rjB_2, T> var2) {
      rjU_2 var3 = var0.id_break();
      rjU_2 var4 = var0.id_class();
      if (var3.equals(var4)) {
         return (T)var2.apply(var0);
      } else {
         double var5 = rfU_2.id_protected(-1.0E-7, var4.id_break, var3.id_break);
         double var7 = rfU_2.id_protected(-1.0E-7, var4.id_byte, var3.id_byte);
         double var9 = rfU_2.id_protected(-1.0E-7, var4.id_protected, var3.id_protected);
         double var11 = rfU_2.id_protected(-1.0E-7, var3.id_break, var4.id_break);
         double var13 = rfU_2.id_protected(-1.0E-7, var3.id_byte, var4.id_byte);
         double var15 = rfU_2.id_protected(-1.0E-7, var3.id_protected, var4.id_protected);
         int var17 = rfU_2.id_byte(var11);
         int var18 = rfU_2.id_byte(var13);
         int var19 = rfU_2.id_byte(var15);
         rfw_3 var20 = new rfw_3(var17, var18, var19);
         Object var21 = var1.apply(var0, var20);
         if (var21 != null) {
            return (T)var21;
         } else {
            double var22 = var5 - var11;
            double var24 = var7 - var13;
            double var26 = var9 - var15;
            int var28 = rfU_2.id_finally(var22);
            int var29 = rfU_2.id_finally(var24);
            int var30 = rfU_2.id_finally(var26);
            double var31 = var28 == 0 ? Double.MAX_VALUE : (double)var28 / var22;
            double var33 = var29 == 0 ? Double.MAX_VALUE : (double)var29 / var24;
            double var35 = var30 == 0 ? Double.MAX_VALUE : (double)var30 / var26;
            double var37 = var31 * (var28 > 0 ? 1.0 - rfU_2.id_catch(var11) : rfU_2.id_catch(var11));
            double var39 = var33 * (var29 > 0 ? 1.0 - rfU_2.id_catch(var13) : rfU_2.id_catch(var13));
            double var41 = var35 * (var30 > 0 ? 1.0 - rfU_2.id_catch(var15) : rfU_2.id_catch(var15));

            while (var37 <= 1.0 || var39 <= 1.0 || var41 <= 1.0) {
               if (var37 < var39) {
                  if (var37 < var41) {
                     var17 += var28;
                     var37 += var31;
                  } else {
                     var19 += var30;
                     var41 += var35;
                  }
               } else if (var39 < var41) {
                  var18 += var29;
                  var39 += var33;
               } else {
                  var19 += var30;
                  var41 += var35;
               }

               Object var43 = var1.apply(var0, var20.id_class(var17, var18, var19));
               if (var43 != null) {
                  return (T)var43;
               }
            }

            return (T)var2.apply(var0);
         }
      }
   }

   ryO_2 id_class(rfH_2 var1);

   default Stream<xc_3> id_class(rfl_3 var1) {
      return rfH_2.id_class(var1).map(this::id_byte);
   }

   default rff_3 id_class(rjB_2 var1, boolean var2) {
      return id_class(var1, (var2x, var3) -> {
         xc_3 var4 = this.id_byte(var3);
         rXE var5 = this.id_break(var3);
         rjU_2 var6 = var2x.id_break();
         rjU_2 var7 = var2x.id_class();
         rjC_2 var8 = var2x.id_class(var4, this, var3);
         rff_3 var9 = this.id_class(var6, var7, var3, var8, var4, var2);
         rjC_2 var10 = var2x.id_class(var5, this, var3);
         rff_3 var11 = var10.id_class(var6, var7, var3, var2);
         double var12 = var9 == null ? Double.MAX_VALUE : var2x.id_break().id_implements(var9.id_case());
         double var14 = var11 == null ? Double.MAX_VALUE : var2x.id_break().id_implements(var11.id_case());
         return var12 <= var14 ? var9 : var11;
      }, var0 -> {
         rjU_2 var1x = var0.id_break().id_protected(var0.id_class());
         return rff_3.id_class(var0.id_class(), rpr_3.id_class(var1x.id_break, var1x.id_byte, var1x.id_protected), new rfH_2(var0.id_class()));
      });
   }

   rXE id_break(rfH_2 var1);

   default rff_3 id_break(rjB_2 var1) {
      return id_class(var1, (var2, var3) -> {
         xc_3 var4 = this.id_byte(var3);
         rXE var5 = this.id_break(var3);
         rjU_2 var6 = var2.id_break();
         rjU_2 var7 = var2.id_class();
         rjC_2 var8 = var2.id_class(var4, this, var3);
         rrAk_1 var9 = rrAk_1.id_class(this.id_class(var6, var7, var3, var8, var4, false), var1, var4);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(var9);
         rff_3 var10 = var9.id_break();
         rjC_2 var11 = var2.id_class(var5, this, var3);
         rff_3 var12 = var11.id_class(var6, var7, var3, false);
         double var13 = var10 == null ? Double.MAX_VALUE : var2.id_break().id_implements(var10.id_case());
         double var15 = var12 == null ? Double.MAX_VALUE : var2.id_break().id_implements(var12.id_case());
         return var13 <= var15 ? var10 : var12;
      }, var0 -> {
         rjU_2 var1x = var0.id_break().id_protected(var0.id_class());
         return rff_3.id_class(var0.id_class(), rpr_3.id_class(var1x.id_break, var1x.id_byte, var1x.id_protected), new rfH_2(var0.id_class()));
      });
   }

   default int id_catch(rfH_2 var1) {
      return this.id_byte(var1).id_case();
   }

   default int id_try() {
      return 256;
   }

   default int id_while() {
      return 15;
   }

   default double id_private(rfH_2 var1) {
      return this.id_class(this.id_byte(var1).id_extends(this, var1), () -> {
         rfH_2 var2 = var1.id_break();
         return this.id_byte(var2).id_extends(this, var2);
      });
   }
}
