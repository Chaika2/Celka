package celestial;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class iX_2 {
   public static rjU_2 byte_(aA_2 var0, int var1, int var2, rjU_2 var3) {
      rjU_2 var4 = var0.Ps().protected_(var3);
      return class_(var0, var1, var2, 0, var4, true, (float) (Math.PI / 2), var0::class_, false, 0, 0, true);
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2, rjU_2 var3, double var4) {
      rjU_2 var6 = var3.class_(var0.rx(), var0.re(), var0.BO());
      return class_(var0, var1, var2, 0, var6, true, var4, var0::class_, false, 0, 0, true);
   }

   private static rjU_2 class_(
      aA_2 var0,
      int var1,
      int var2,
      int var3,
      rjU_2 var4,
      boolean var5,
      double var6,
      ToDoubleFunction<rfH_2> var8,
      boolean var9,
      int var10,
      int var11,
      boolean var12
   ) {
      rLy_1 var13 = var0.public_();
      Random var14 = var0.Sa();
      boolean var15;
      if (var0.k()) {
         var15 = var0.J().class_(var0.Ps(), (double)(var0.d() + (float)var1) + 1.0);
      } else {
         var15 = false;
      }

      boolean var16 = false;
      double var17 = Double.NEGATIVE_INFINITY;
      rfH_2 var19 = var0.Bs();

      for (int var20 = 0; var20 < 10; var20++) {
         rfH_2 var21 = class_(var14, var1, var2, var3, var4, var6);
         if (var21 != null) {
            int var22 = var21.b_();
            int var23 = var21.c_();
            int var24 = var21.d_();
            if (var0.k() && var1 > 1) {
               rfH_2 var25 = var0.J();
               if (var0.rx() > (double)var25.b_()) {
                  var22 -= var14.nextInt(var1 / 2);
               } else {
                  var22 += var14.nextInt(var1 / 2);
               }

               if (var0.BO() > (double)var25.d_()) {
                  var24 -= var14.nextInt(var1 / 2);
               } else {
                  var24 += var14.nextInt(var1 / 2);
               }
            }

            rfH_2 var29 = new rfH_2((double)var22 + var0.rx(), (double)var23 + var0.re(), (double)var24 + var0.BO());
            if (var29.c_() >= 0 && var29.c_() <= ((rYB)var0.throws_[7]).try_() && (!var15 || var0.private_(var29)) && (!var12 || var13.class_(var29))) {
               if (var9) {
                  var29 = class_(
                     var29, var14.nextInt(var10 + 1) + var11, ((rYB)var0.throws_[7]).try_(), var1x -> ((rYB)var0.throws_[7]).byte_(var1x).byte_().break_()
                  );
               }

               if (var5 || !((rYB)var0.throws_[7]).break_(var29).class_(rlG_2.break_)) {
                  rLp_1 var26 = rLf_1.class_((rYB)var0.throws_[7], var29.new_());
                  if (var0.class_(var26) == 0.0F) {
                     double var27 = var8.applyAsDouble(var29);
                     if (var27 > var17) {
                        var17 = var27;
                        var19 = var29;
                        var16 = true;
                     }
                  }
               }
            }
         }
      }

      return var16 ? rjU_2.protected_(var19) : null;
   }

   private static rfH_2 class_(Random var0, int var1, int var2, int var3, rjU_2 var4, double var5) {
      if (var4 != null && !(var5 >= Math.PI)) {
         double var18 = rfU_2.protected_(var4.protected_, var4.break_) - (float) (Math.PI / 2);
         double var19 = var18 + (double)(2.0F * var0.nextFloat() - 1.0F) * var5;
         double var11 = Math.sqrt(var0.nextDouble()) * (double)rfU_2.class_ * (double)var1;
         double var13 = -var11 * Math.sin(var19);
         double var15 = var11 * Math.cos(var19);
         if (!(Math.abs(var13) > (double)var1) && !(Math.abs(var15) > (double)var1)) {
            int var17 = var0.nextInt(2 * var2 + 1) - var2 + var3;
            return new rfH_2(var13, (double)var17, var15);
         } else {
            return null;
         }
      } else {
         int var7 = var0.nextInt(2 * var1 + 1) - var1;
         int var8 = var0.nextInt(2 * var2 + 1) - var2 + var3;
         int var9 = var0.nextInt(2 * var1 + 1) - var1;
         return new rfH_2(var7, var8, var9);
      }
   }

   static rfH_2 class_(rfH_2 var0, int var1, int var2, Predicate<rfH_2> var3) {
      if (var1 < 0) {
         throw new IllegalArgumentException("aboveSolidAmount was " + var1 + ", expected >= 0");
      } else if (!var3.test(var0)) {
         return var0;
      } else {
         rfH_2 var4 = var0.final_();

         while (var4.c_() < var2 && var3.test(var4)) {
            var4 = var4.final_();
         }

         rfH_2 var5 = var4;

         while (var5.c_() < var2 && var5.c_() - var4.c_() < var1) {
            rfH_2 var6 = var5.final_();
            if (var3.test(var6)) {
               break;
            }

            var5 = var6;
         }

         return var5;
      }
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2, ToDoubleFunction<rfH_2> var3) {
      return class_(var0, var1, var2, 0, (rjU_2)null, false, 0.0, var3, true, 0, 0, true);
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2, rjU_2 var3, float var4, int var5, int var6) {
      return class_(var0, var1, var2, 0, var3, false, (double)var4, var0::class_, true, var5, var6, true);
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2, int var3, rjU_2 var4, double var5) {
      return class_(var0, var1, var2, var3, var4, true, var5, var0::class_, true, 0, 0, false);
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2, rjU_2 var3) {
      rjU_2 var4 = var3.class_(var0.rx(), var0.re(), var0.BO());
      return class_(var0, var1, var2, 0, var4, false, (float) (Math.PI / 2), var0::class_, true, 0, 0, true);
   }

   public static rjU_2 class_(aA_2 var0, int var1, int var2) {
      return class_(var0, var1, var2, 0, (rjU_2)null, true, (float) (Math.PI / 2), var0::class_, false, 0, 0, true);
   }

   public static rjU_2 break_(aA_2 var0, int var1, int var2) {
      return class_(var0, var1, var2, var0::class_);
   }

   public static rjU_2 break_(aA_2 var0, int var1, int var2, rjU_2 var3) {
      rjU_2 var4 = var3.class_(var0.rx(), var0.re(), var0.BO());
      return class_(var0, var1, var2, 0, var4, true, (float) (Math.PI / 2), var0::class_, false, 0, 0, true);
   }

   public static rjU_2 break_(aA_2 var0, int var1, int var2, int var3, rjU_2 var4, double var5) {
      rjU_2 var7 = var4.class_(var0.rx(), var0.re(), var0.BO());
      return class_(var0, var1, var2, var3, var7, false, var5, var0::class_, true, 0, 0, false);
   }

   public static rjU_2 protected_(aA_2 var0, int var1, int var2, rjU_2 var3) {
      rjU_2 var4 = var0.Ps().protected_(var3);
      return class_(var0, var1, var2, 0, var4, false, (float) (Math.PI / 2), var0::class_, true, 0, 0, true);
   }
}
