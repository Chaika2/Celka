package celestial;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public interface rRq_1 {
   xc_3 byte_(rfH_2 var1);

   default rff_3 class_(rjU_2 var1, rjU_2 var2, rfH_2 var3, rjC_2 var4, xc_3 var5, boolean var6) {
      rff_3 var7 = var4.class_(var1, var2, var3, var6);
      if (var7 != null) {
         rff_3 var8 = var5.volatile_(this, var3).class_(var1, var2, var3, var6);
         if (var8 != null && var8.case_().protected_(var1).catch_() < var7.case_().protected_(var1).catch_()) {
            return var7.class_(var8.break_());
         }
      }

      return var7;
   }

   default rff_3 class_(rjB_2 var1) {
      return this.class_(var1, false);
   }

   default double class_(rjC_2 var1, Supplier<rjC_2> var2) {
      if (!var1.break_()) {
         return var1.byte_(rpB_2.Y);
      } else {
         double var3 = ((rjC_2)var2.get()).byte_(rpB_2.Y);
         return var3 >= 1.0 ? var3 - 1.0 : Double.NEGATIVE_INFINITY;
      }
   }

   static <T> T class_(rjB_2 var0, BiFunction<rjB_2, rfH_2, T> var1, Function<rjB_2, T> var2) {
      rjU_2 var3 = var0.break_();
      rjU_2 var4 = var0.class_();
      if (var3.equals(var4)) {
         return (T)var2.apply(var0);
      } else {
         double var5 = rfU_2.protected_(-1.0E-7, var4.break_, var3.break_);
         double var7 = rfU_2.protected_(-1.0E-7, var4.byte_, var3.byte_);
         double var9 = rfU_2.protected_(-1.0E-7, var4.protected_, var3.protected_);
         double var11 = rfU_2.protected_(-1.0E-7, var3.break_, var4.break_);
         double var13 = rfU_2.protected_(-1.0E-7, var3.byte_, var4.byte_);
         double var15 = rfU_2.protected_(-1.0E-7, var3.protected_, var4.protected_);
         int var17 = rfU_2.byte_(var11);
         int var18 = rfU_2.byte_(var13);
         int var19 = rfU_2.byte_(var15);
         rfw_3 var20 = new rfw_3(var17, var18, var19);
         Object var21 = var1.apply(var0, var20);
         if (var21 != null) {
            return (T)var21;
         } else {
            double var22 = var5 - var11;
            double var24 = var7 - var13;
            double var26 = var9 - var15;
            int var28 = rfU_2.finally_(var22);
            int var29 = rfU_2.finally_(var24);
            int var30 = rfU_2.finally_(var26);
            double var31 = var28 == 0 ? Double.MAX_VALUE : (double)var28 / var22;
            double var33 = var29 == 0 ? Double.MAX_VALUE : (double)var29 / var24;
            double var35 = var30 == 0 ? Double.MAX_VALUE : (double)var30 / var26;
            double var37 = var31 * (var28 > 0 ? 1.0 - rfU_2.catch_(var11) : rfU_2.catch_(var11));
            double var39 = var33 * (var29 > 0 ? 1.0 - rfU_2.catch_(var13) : rfU_2.catch_(var13));
            double var41 = var35 * (var30 > 0 ? 1.0 - rfU_2.catch_(var15) : rfU_2.catch_(var15));

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

               Object var43 = var1.apply(var0, var20.class_(var17, var18, var19));
               if (var43 != null) {
                  return (T)var43;
               }
            }

            return (T)var2.apply(var0);
         }
      }
   }

   ryO_2 class_(rfH_2 var1);

   default Stream<xc_3> class_(rfl_3 var1) {
      return rfH_2.class_(var1).map(this::byte_);
   }

   default rff_3 class_(rjB_2 var1, boolean var2) {
      return class_(var1, (var2x, var3) -> {
         xc_3 var4 = this.byte_(var3);
         rXE var5 = this.break_(var3);
         rjU_2 var6 = var2x.break_();
         rjU_2 var7 = var2x.class_();
         rjC_2 var8 = var2x.class_(var4, this, var3);
         rff_3 var9 = this.class_(var6, var7, var3, var8, var4, var2);
         rjC_2 var10 = var2x.class_(var5, this, var3);
         rff_3 var11 = var10.class_(var6, var7, var3, var2);
         double var12 = var9 == null ? Double.MAX_VALUE : var2x.break_().implements_(var9.case_());
         double var14 = var11 == null ? Double.MAX_VALUE : var2x.break_().implements_(var11.case_());
         return var12 <= var14 ? var9 : var11;
      }, var0 -> {
         rjU_2 var1x = var0.break_().protected_(var0.class_());
         return rff_3.class_(var0.class_(), rpr_3.class_(var1x.break_, var1x.byte_, var1x.protected_), new rfH_2(var0.class_()));
      });
   }

   rXE break_(rfH_2 var1);

   default rff_3 break_(rjB_2 var1) {
      return class_(var1, (var2, var3) -> {
         xc_3 var4 = this.byte_(var3);
         rXE var5 = this.break_(var3);
         rjU_2 var6 = var2.break_();
         rjU_2 var7 = var2.class_();
         rjC_2 var8 = var2.class_(var4, this, var3);
         rrAk_1 var9 = rrAk_1.class_(this.class_(var6, var7, var3, var8, var4, false), var1, var4);
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(var9);
         rff_3 var10 = var9.break_();
         rjC_2 var11 = var2.class_(var5, this, var3);
         rff_3 var12 = var11.class_(var6, var7, var3, false);
         double var13 = var10 == null ? Double.MAX_VALUE : var2.break_().implements_(var10.case_());
         double var15 = var12 == null ? Double.MAX_VALUE : var2.break_().implements_(var12.case_());
         return var13 <= var15 ? var10 : var12;
      }, var0 -> {
         rjU_2 var1x = var0.break_().protected_(var0.class_());
         return rff_3.class_(var0.class_(), rpr_3.class_(var1x.break_, var1x.byte_, var1x.protected_), new rfH_2(var0.class_()));
      });
   }

   default int catch_(rfH_2 var1) {
      return this.byte_(var1).case_();
   }

   default int try_() {
      return 256;
   }

   default int while_() {
      return 15;
   }

   default double private_(rfH_2 var1) {
      return this.class_(this.byte_(var1).extends_(this, var1), () -> {
         rfH_2 var2 = var1.break_();
         return this.byte_(var2).extends_(this, var2);
      });
   }
}
