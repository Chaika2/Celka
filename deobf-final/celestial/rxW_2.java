package celestial;

import java.util.Objects;
import java.util.Optional;

public class rxW_2 extends rdb_3 {
   public rxW_2(rdO_2 var1) {
      super(var1);
   }

   public static void class_(rRg_1 var0, rfH_2 var1, int var2) {
      if (var2 == 0) {
         var2 = 15;
      }

      xc_3 var3 = var0.byte_(var1);
      if (!var3.catch_()) {
         double var4 = 0.5;
         double var6;
         if (var3.class_(xu_3.try_)) {
            var2 *= 3;
            var6 = 1.0;
            var4 = 3.0;
         } else if (var3.implements_(var0, var1)) {
            var1 = var1.final_();
            var2 *= 3;
            var4 = 3.0;
            var6 = 1.0;
         } else {
            var6 = var3.finally_(var0, var1).byte_(rpB_2.Y);
         }

         var0.class_(rLQ.char_, (double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, 0.0, 0.0, 0.0);

         for (int var8 = 0; var8 < var2; var8++) {
            double var9 = private_.nextGaussian() * 0.02;
            double var11 = private_.nextGaussian() * 0.02;
            double var13 = private_.nextGaussian() * 0.02;
            double var15 = 0.5 - var4;
            double var17 = (double)var1.b_() + var15 + private_.nextDouble() * var4 * 2.0;
            double var19 = (double)var1.c_() + private_.nextDouble() * var6;
            double var21 = (double)var1.d_() + var15 + private_.nextDouble() * var4 * 2.0;
            if (!var0.byte_(new rfH_2(var17, var19, var21).break_()).catch_()) {
               var0.class_(rLQ.char_, var17, var19, var21, var9, var11, var13);
            }
         }
      }
   }

   public static boolean class_(rdn_3 var0, rYB var1, rfH_2 var2, rpr_3 var3) {
      if (var1.byte_(var2).class_(xu_3.try_) && var1.break_(var2).throws_() == 8) {
         if (!(var1 instanceof rrEm_1)) {
            return true;
         } else {
            label79:
            for (int var4 = 0; var4 < 128; var4++) {
               rfH_2 var5 = var2;
               xc_3 var6 = xu_3.rr.continue_();

               for (int var7 = 0; var7 < var4 / 16; var7++) {
                  var5 = var5.break_(private_.nextInt(3) - 1, (private_.nextInt(3) - 1) * private_.nextInt(3) / 2, private_.nextInt(3) - 1);
                  if (var1.byte_(var5).new_(var1, var5)) {
                     continue label79;
                  }
               }

               Optional var9 = var1.protected_(var5);
               if (Objects.equals(var9, Optional.of(rYl_1.double_)) || Objects.equals(var9, Optional.of(rYl_1.P))) {
                  if (var4 == 0 && var3 != null && var3.final_().protected_()) {
                     var6 = rls_3.E.class_(var1.int_).continue_().class_(dd_3.final_, var3);
                  } else if (private_.nextInt(4) == 0) {
                     var6 = rls_3.S.class_(private_).continue_();
                  }
               }

               if (var6.break_().class_(rls_3.E)) {
                  for (int var8 = 0; !var6.class_((rRR)var1, var5) && var8 < 4; var8++) {
                     var6 = var6.class_(dd_3.final_, rpb_3.HORIZONTAL.class_(private_));
                  }
               }

               if (var6.class_((rRR)var1, var5)) {
                  xc_3 var10 = var1.byte_(var5);
                  if (var10.class_(xu_3.try_) && var1.break_(var5).throws_() == 8) {
                     var1.class_(var5, var6, 3);
                  } else if (var10.class_(xu_3.rr) && private_.nextInt(10) == 0) {
                     ((kX_2)xu_3.rr).class_((rrEm_1)var1, private_, var5, var10);
                  }
               }
            }

            var0.catch_(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean class_(rdn_3 var0, rYB var1, rfH_2 var2) {
      xc_3 var3 = var1.byte_(var2);
      if (var3.break_() instanceof kX_2) {
         kX_2 var4 = (kX_2)var3.break_();
         if (var4.class_(var1, var2, var3, var1.continue_)) {
            if (var1 instanceof rrEm_1) {
               if (var4.class_(var1, var1.int_, var2, var3)) {
                  var4.class_((rrEm_1)var1, var1.int_, var2, var3);
               }

               var0.catch_(1);
            }

            return true;
         }
      }

      return false;
   }

   @Override
   public ryZ_2 class_(rdH_2 var1) {
      rYB var2 = var1.int_();
      rfH_2 var3 = var1.class_();
      rfH_2 var4 = var3.break_(var1.finally_());
      if (class_(var1.volatile_(), var2, var3)) {
         if (!var2.continue_) {
            var2.byte_(2005, var3, 0);
         }

         return ryZ_2.class_(var2.continue_);
      } else {
         xc_3 var5 = var2.byte_(var3);
         boolean var6 = var5.protected_(var2, var3, var1.finally_());
         if (var6 && class_(var1.volatile_(), var2, var4, var1.finally_())) {
            if (!var2.continue_) {
               var2.byte_(2005, var4, 0);
            }

            return ryZ_2.class_(var2.continue_);
         } else {
            return ryZ_2.PASS;
         }
      }
   }
}
