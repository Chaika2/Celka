package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GG extends Ev_1 {
   private static String[] continue_;
   private static double[] super_;
   private static short[] this_;
   private static boolean[] else_;
   private static byte[] synchronized_;

   @Override
   public EA byte_(EA var1) {
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if ((Integer)((Ps_1)this.new_[1]).volatile_().break_[1] < (Integer)((rU_2)this.new_[3]).break_[1]) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         xc_3 var2 = bw_3.class_((Ps_1)this.new_[1], (rU_2)this.new_[3]);
         if (EF.byte_(var2) && EF.throws_((Ps_1)this.new_[1], (rU_2)this.new_[4])) {
            var1.class_(new En_1(PJ.class_(((Ps_1)this.new_[1]).finally_(), Pu_1.class_((rU_2)this.new_[4]), ((Ps_1)this.new_[1]).protected_()), false));
            rjU_2 var17 = Pu_1.class_((rU_2)this.new_[4]);
            if (Math.abs(((Ps_1)this.new_[1]).catch_().Ps().break_ - var17.break_) > 0.2
               || Math.abs(((Ps_1)this.new_[1]).catch_().Ps().protected_ - var17.protected_) > 0.2) {
               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
            }

            return ((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4]) ? var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]) : var1;
         } else {
            boolean var3 = var2.break_() != xu_3.PJ && var2.break_() != xu_3.BD ? else_[18] : else_[17];
            boolean var4 = var2.break_() == xu_3.BD ? true : else_[20];
            PX var5 = PJ.class_(
               ((Ps_1)this.new_[1]).finally_(),
               Pu_1.class_((rU_2)this.new_[6]),
               new PX((Float)((Ps_1)this.new_[1]).catch_().throws_[15], (Float)((Ps_1)this.new_[1]).catch_().throws_[16])
            );
            if (!var3) {
               var1.class_(new En_1(new PX((Float)((Ps_1)this.new_[1]).catch_().throws_[15], var5.protected_()), true));
            }

            boolean var6 = !EF.break_((Ps_1)this.new_[1], (rU_2)this.new_[3]) && !var3 ? else_[23] : else_[22];
            if (var3) {
               Object var18 = var4 ? class_(new EZ((C_case)this.new_[0]), (rU_2)this.new_[3]) : ((rU_2)this.new_[3]).class_(var2.byte_(kc_3.volatile_).case_());
               if (var18 == null) {
                  this.case_("Unable to climb vines. Consider disabling allowVines.");
                  return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
               } else if (!((Ps_1)this.new_[1]).volatile_().equals(((rfH_2)var18).final_()) && !((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4])) {
                  if (EF.break_(bw_3.class_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).case_()))) {
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
                  }

                  EF.class_((Ps_1)this.new_[1], var1, (rfH_2)var18);
                  return var1;
               } else {
                  return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
               }
            } else if (!((C_class)((C_case)this.new_[0]))
               .static_()
               .class_(true, (Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[3]).break_[2])) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
            } else {
               var1.class_(
                  (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7],
                  !(((Ps_1)this.new_[1]).catch_().Ps().byte_ > (double)((rU_2)this.new_[4]).c_())
                        && !(((Ps_1)this.new_[1]).catch_().Ps().byte_ < (double)((rU_2)this.new_[3]).c_() + 0.2)
                     ? else_[27]
                     : else_[26]
               );
               double var7 = ((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[4]).b_() + 0.5);
               double var9 = ((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[4]).d_() + 0.5);
               double var11 = Math.sqrt(var7 * var7 + var9 * var9);
               double var13 = Math.sqrt(
                  ((Ps_1)this.new_[1]).catch_().rv().break_ * ((Ps_1)this.new_[1]).catch_().rv().break_
                     + ((Ps_1)this.new_[1]).catch_().rv().protected_ * ((Ps_1)this.new_[1]).catch_().rv().protected_
               );
               if (var11 > 0.17) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
                  var1.class_(new En_1(var5, true));
               } else if (var13 < 0.05) {
                  var1.class_(
                     (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6],
                     ((Ps_1)this.new_[1]).catch_().Ps().byte_ < (double)((rU_2)this.new_[4]).c_() ? true : else_[31]
                  );
               }

               if (!var6) {
                  xc_3 var15 = bw_3.class_((Ps_1)this.new_[1], (rU_2)this.new_[3]);
                  xd_3 var16 = var15.break_();
                  if (!(var16 instanceof Ja_1) && !var15.byte_().throws_()) {
                     PJ.class_(((Ps_1)this.new_[1]).catch_(), (rU_2)this.new_[3], ((Ps_1)this.new_[1]).native_().case_())
                        .map(var0 -> new En_1(var0.class_(), true))
                        .ifPresent(var1::class_);
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], false);
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4], true);
                     var6 = false;
                  } else if (((Ps_1)this.new_[1]).catch_().x()
                     && (((Ps_1)this.new_[1]).class_(((rU_2)this.new_[3]).case_()) || ((Ps_1)this.new_[1]).class_((rU_2)this.new_[3]))
                     && ((Ps_1)this.new_[1]).catch_().Ps().byte_ > (double)((rU_2)this.new_[4]).c_() + 0.1) {
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }
               }

               return ((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4]) && var6
                  ? var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3])
                  : var1;
            }
         }
      }
   }

   private static void int_() {
      continue_ = new String[]{new String("Unable to climb vines. Consider disabling allowVines.")};
   }

   public GG(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var2.final_(2)}, var2);
   }

   static {
      ntfClinit();
   }

   @Override
   public double class_(EZ var1) {
      return protected_(var1, (Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[3]).break_[2]);
   }

   public static rfH_2 class_(EZ var0, rU_2 var1) {
      if (EF.catch_(var0.class_(var1.finally_()))) {
         return var1.finally_();
      } else if (EF.catch_(var0.class_(var1.volatile_()))) {
         return var1.volatile_();
      } else if (EF.catch_(var0.class_(var1.throws_()))) {
         return var1.throws_();
      } else {
         return EF.catch_(var0.class_(var1.native_())) ? var1.native_() : null;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8812872870696033353L;
   }

   @Override
   public boolean break_(EA var1) {
      if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[3]) || ((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[3]).case_())) {
         xd_3 var2 = bw_3.break_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).case_());
         if (var2 == xu_3.PJ || var2 == xu_3.BD) {
            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
         }
      }

      return EF.throws_((Ps_1)this.new_[1], ((rU_2)this.new_[4]).class_()) ? true : super.break_(var1);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -100, 36, -104, -118, 62, 25, -29}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 141686236;
   }

   public static boolean throws_(EZ var0, int var1, int var2, int var3) {
      return !EF.catch_(var0.class_(var1 + 1, var2, var3))
            && !EF.catch_(var0.class_(var1 - 1, var2, var3))
            && !EF.catch_(var0.class_(var1, var2, var3 + 1))
            && !EF.catch_(var0.class_(var1, var2, var3 - 1))
         ? else_[14]
         : else_[13];
   }

   private static void continue_() {
      synchronized_ = new byte[]{2, 2, 2, 3};
   }

   private static void new_() {
      else_ = new boolean[]{
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         true,
         true,
         true
      };
   }

   private static void package_() {
      this_ = new short[]{
         3,
         0,
         3,
         1,
         3,
         2,
         3,
         4,
         4,
         16,
         26,
         2,
         1,
         1,
         3,
         1,
         4,
         1,
         3,
         1,
         4,
         1,
         4,
         1,
         4,
         1,
         1,
         0,
         1,
         4,
         3,
         1,
         6,
         1,
         15,
         1,
         16,
         1,
         15,
         1,
         3,
         0,
         3,
         3,
         4,
         1,
         1,
         4,
         3,
         1,
         3,
         6,
         1,
         0,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         7,
         1,
         4,
         1,
         3,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         1,
         0,
         6,
         1,
         4,
         1,
         3,
         1,
         3,
         1,
         6,
         4,
         1,
         1,
         3,
         1,
         3,
         1,
         4,
         5,
         1,
         4,
         3,
         1,
         3,
         1,
         3,
         1,
         3,
         7,
         1,
         4
      };
   }

   private static void super_() {
      super_ = new double[]{
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         8.51063829787234,
         0.0,
         1000000.0,
         1000000.0,
         0.1,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         0.0,
         0.0,
         1000000.0,
         8.51063829787234,
         5.0,
         0.2,
         0.2,
         0.2,
         0.5,
         0.5,
         0.17,
         0.05,
         0.1
      };
   }

   public static double protected_(EZ var0, int var1, int var2, int var3) {
      xc_3 var4 = var0.class_(var1, var2, var3);
      xd_3 var5 = var4.break_();
      boolean var6 = var5 != xu_3.PJ && var5 != xu_3.BD ? else_[3] : else_[2];
      xc_3 var7 = var0.class_(var1, var2 - 1, var3);
      if (!var6) {
         if (var7.break_() == xu_3.PJ || var7.break_() == xu_3.BD) {
            return super_[0];
         }

         if (var7.break_() instanceof Wg_1 && var7.byte_(Wg_1.volatile_) == rCo_1.BOTTOM) {
            return 1000000.0;
         }
      }

      if (var5 == xu_3.BD && !throws_(var0, var1, var2, var3)) {
         return 1000000.0;
      } else {
         xc_3 var8 = var0.class_(var1, var2 + 2, var3);
         xd_3 var9 = var8.break_();
         if (var9 instanceof dq_3) {
            return 1000000.0;
         } else {
            xc_3 var10 = null;
            if (EF.byte_(var8) && EF.byte_(var4)) {
               var10 = var0.class_(var1, var2 + 1, var3);
               if (EF.byte_(var10)) {
                  return 8.51063829787234;
               }
            }

            double var11 = super_[5];
            if (!var6) {
               var11 = var0.class_(var1, var2, var3, var4);
               if (var11 >= 1000000.0) {
                  return 1000000.0;
               }

               if (var7.break_() instanceof Ja_1) {
                  var11 += 0.1;
               }
            }

            if (EF.finally_(var4) && !EF.case_((bw_3)var0.break_[4], var1, var2 - 1, var3, var7) || EF.finally_(var7) && (Boolean)var0.break_[16]) {
               return super_[9];
            } else if ((var5 == xu_3.Sr || var5 instanceof xC_2) && !var7.volatile_().byte_()) {
               return 1000000.0;
            } else {
               double var13 = EF.class_(var0, var1, var2 + 2, var3, var8, true);
               if (var13 >= 1000000.0) {
                  return 1000000.0;
               } else {
                  if (var13 != 0.0) {
                     if (var9 != xu_3.PJ && var9 != xu_3.BD) {
                        xc_3 var15 = var0.class_(var1, var2 + 3, var3);
                        if (var15.break_() instanceof dH_2) {
                           if (var10 == null) {
                              var10 = var0.class_(var1, var2 + 1, var3);
                           }

                           if (!(var9 instanceof dH_2) || !(var10.break_() instanceof dH_2)) {
                              return super_[15];
                           }
                        }
                     } else {
                        var13 = super_[14];
                     }
                  }

                  return var6 ? 8.51063829787234 + var13 * 5.0 : break_ + var11 + (Double)var0.break_[26] + var13;
               }
            }
         }
      }
   }

   @Override
   public Set<rU_2> native_() {
      return ImmutableSet.of((rU_2)this.new_[3], (rU_2)this.new_[4]);
   }
}
