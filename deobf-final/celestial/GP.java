package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GP extends Ev_1 {
   private static byte[] super_;
   public Object[] continue_;
   private static double[] this_;
   private static boolean[] else_;
   private static short[] synchronized_;

   @Override
   public EA byte_(EA var1) {
      this.this_();
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else {
         rU_2 var2 = ((Ps_1)this.new_[1]).volatile_();
         rfH_2 var3 = new rfH_2(
            ((rU_2)this.new_[4]).b_() * 2 - ((rU_2)this.new_[3]).b_(), ((rU_2)this.new_[4]).c_(), ((rU_2)this.new_[4]).d_() * 2 - ((rU_2)this.new_[3]).d_()
         );
         if (!var2.equals((rU_2)this.new_[4]) && !var2.equals(var3)
            || !EF.protected_((Ps_1)this.new_[1], (rU_2)this.new_[4]) && !(((Ps_1)this.new_[1]).catch_().Ps().byte_ - (double)((rU_2)this.new_[4]).c_() < 0.5)) {
            if (this.new_()) {
               double var21 = ((double)((rU_2)this.new_[3]).b_() + 0.5) * 0.17 + ((double)((rU_2)this.new_[4]).b_() + 0.5) * 0.83;
               double var22 = ((double)((rU_2)this.new_[3]).d_() + 0.5) * 0.17 + ((double)((rU_2)this.new_[4]).d_() + 0.5) * 0.83;
               cb_3 var23 = ((Ps_1)this.new_[1]).catch_();
               var1.class_(
                     new En_1(
                        new PX(
                           PJ.class_(
                                 ((Ps_1)this.new_[1]).finally_(),
                                 new rjU_2(var21, (double)((rU_2)this.new_[4]).c_(), var22),
                                 new PX((Float)var23.throws_[15], (Float)var23.throws_[16])
                              )
                              .throws_(),
                           (Float)var23.throws_[16]
                        ),
                        false
                     )
                  )
                  .class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
               return var1;
            } else {
               double var4 = ((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[4]).b_() + 0.5);
               double var6 = ((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[4]).d_() + 0.5);
               double var8 = Math.sqrt(var4 * var4 + var6 * var6);
               double var10 = ((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[3]).b_() + 0.5);
               double var12 = ((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[3]).d_() + 0.5);
               double var14 = Math.sqrt(var10 * var10 + var12 * var12);
               if (!var2.equals((rU_2)this.new_[4]) || var8 > 0.25) {
                  int var10002 = (Integer)this.continue_[0];
                  Integer var20 = var10002 + 1;
                  this.continue_[0] = var20;
                  if (var10002 < 20 && var14 < 1.25) {
                     EF.class_((Ps_1)this.new_[1], var1, var3);
                  } else {
                     EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[4]);
                  }
               }

               return var1;
            }
         } else {
            return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
         }
      }
   }

   public void int_() {
      this.this_();
      Boolean var5 = true;
      this.continue_[1] = var5;
   }

   public GP(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var3.final_(2), var3.class_(), var3}, var3.case_());
      this.this_();
      Integer var8 = 0;
      this.continue_[0] = var8;
      Boolean var9 = false;
      this.continue_[1] = var9;
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.continue_ == null) {
         this.continue_ = new Object[2];
         Object[] var1 = this.continue_;
         var1[0] = 0;
         var1[1] = false;
      }
   }

   public static boolean class_(EZ var0, int var1, int var2, int var3, int var4, int var5, double var6, xc_3 var8, Mr_1 var9) {
      if (var6 != 0.0 && var0.class_(var4, var2 + 2, var5).break_() instanceof dH_2) {
         return false;
      } else if (!EF.break_(var0, var4, var2 - 2, var5, var8)) {
         return false;
      } else {
         double var10 = this_[9];
         int var12 = var2;
         int var13 = 3;

         while (true) {
            int var14 = var2 - var13;
            if (var14 < 0) {
               return false;
            }

            xc_3 var15 = var0.class_(var4, var14, var5);
            int var16 = var13 - (var2 - var12);
            double var17 = 3.7062775075283763 + package_[var16] + var6 + var10;
            if (EF.byte_(var15)) {
               if (!EF.break_(var0, var4, var14, var5, var15)) {
                  return false;
               }

               if ((Boolean)var0.break_[16]) {
                  return false;
               }

               if (EF.byte_(var4, var14, var5, var15, (bw_3)var0.break_[4])) {
                  return false;
               }

               if (!EF.class_(var0, var4, var14 - 1, var5)) {
                  return false;
               }

               Integer var23 = var4;
               var9.class_[0] = var23;
               Integer var24 = var14;
               var9.class_[1] = var24;
               Integer var25 = var5;
               var9.class_[2] = var25;
               Double var26 = var17;
               var9.class_[3] = var26;
               return false;
            }

            if (var16 > 11 || var15.break_() != xu_3.BD && var15.break_() != xu_3.PJ) {
               if (!EF.break_(var0, var4, var14, var5, var15)) {
                  if (!EF.class_(var0, var4, var14, var5, var15)) {
                     return false;
                  }

                  if (EF.break_(var15)) {
                     return false;
                  }

                  if (var16 <= (Integer)var0.break_[21] + 1) {
                     Integer var27 = var4;
                     var9.class_[0] = var27;
                     Integer var28 = var14 + 1;
                     var9.class_[1] = var28;
                     Integer var29 = var5;
                     var9.class_[2] = var29;
                     Double var30 = var17;
                     var9.class_[3] = var30;
                     return false;
                  }

                  if ((Boolean)var0.break_[6] && var16 <= (Integer)var0.break_[22] + 1) {
                     Integer var31 = var4;
                     var9.class_[0] = var31;
                     Integer var32 = var14 + 1;
                     var9.class_[1] = var32;
                     Integer var33 = var5;
                     var9.class_[2] = var33;
                     Double var34 = var17 + var0.class_();
                     var9.class_[3] = var34;
                     return true;
                  }

                  return else_[34];
               }
            } else {
               var10 += package_[var16 - 1];
               var10 += 6.666666666666667;
               var12 = var14;
            }

            var13++;
         }
      }
   }

   @Override
   public void class_() {
      this.this_();
      super.class_();
      Integer var5 = 0;
      this.continue_[0] = var5;
      Boolean var6 = false;
      this.continue_[1] = var6;
   }

   @Override
   public double class_(EZ var1) {
      Mr_1 var2 = new Mr_1();
      class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (Integer)((rU_2)this.new_[4]).break_[0],
         (Integer)((rU_2)this.new_[4]).break_[2],
         var2
      );
      return var2.class_[1] != ((rU_2)this.new_[4]).break_[1] ? 1000000.0 : (Double)var2.class_[3];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3026789802879318899L;
   }

   public static void class_(EZ var0, int var1, int var2, int var3, int var4, int var5, Mr_1 var6) {
      double var7 = 0.0;
      xc_3 var9 = var0.class_(var4, var2 - 1, var5);
      var7 += EF.class_(var0, var4, var2 - 1, var5, var9, false);
      if (!(var7 >= 1000000.0)) {
         var7 += EF.class_(var0, var4, var2, var5, false);
         if (!(var7 >= 1000000.0)) {
            var7 += EF.class_(var0, var4, var2 + 1, var5, true);
            if (!(var7 >= 1000000.0)) {
               xd_3 var10 = var0.class_(var1, var2 - 1, var3).break_();
               if (var10 != xu_3.PJ && var10 != xu_3.BD) {
                  xc_3 var11 = var0.class_(var4, var2 - 2, var5);
                  if (!EF.class_(var0, var4, var2 - 2, var5, var11)) {
                     class_(var0, var1, var2, var3, var4, var5, var7, var11, var6);
                  } else if (var9.break_() != xu_3.PJ && var9.break_() != xu_3.BD) {
                     if (!EF.class_(var0, var9)) {
                        double var12 = this_[5];
                        if (var10 == xu_3.PY) {
                           var12 *= 2.0;
                        }

                        var7 += var12 + Math.max(package_[1], 0.9265693768820937);
                        Integer var18 = var4;
                        var6.class_[0] = var18;
                        Integer var19 = var2 - 1;
                        var6.class_[1] = var19;
                        Integer var20 = var5;
                        var6.class_[2] = var20;
                        Double var21 = var7;
                        var6.class_[3] = var21;
                     }
                  }
               }
            }
         }
      }
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1298476758;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{60, 6, -61, -38, 99, 82, -90, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      this_ = new double[]{
         1000000.0,
         0.0,
         1000000.0,
         1000000.0,
         1000000.0,
         3.7062775075283763,
         2.0,
         0.9265693768820937,
         0.0,
         0.0,
         3.7062775075283763,
         6.666666666666667,
         0.5,
         0.5,
         0.17,
         0.5,
         0.83,
         0.5,
         0.17,
         0.5,
         0.83,
         0.5,
         0.5,
         0.5,
         0.5,
         0.25,
         1.25
      };
   }

   private static void else_() {
      synchronized_ = new short[]{
         0,
         1,
         0,
         1,
         1,
         3,
         0,
         3,
         1,
         3,
         2,
         4,
         0,
         4,
         2,
         1,
         4,
         1,
         3,
         3,
         4,
         4,
         0,
         1,
         2,
         3,
         16,
         4,
         0,
         1,
         2,
         3,
         21,
         0,
         1,
         2,
         3,
         6,
         22,
         0,
         1,
         2,
         3,
         2,
         1,
         4,
         3,
         4,
         4,
         3,
         4,
         1,
         4,
         1,
         4,
         3,
         3,
         4,
         3,
         4,
         1,
         1,
         4,
         15,
         16,
         16,
         0,
         1,
         4,
         1,
         4,
         1,
         3,
         1,
         3,
         4,
         0,
         0,
         1,
         1,
         4,
         1,
         4,
         3,
         4,
         1,
         4,
         3,
         4,
         1,
         1,
         1
      };
   }

   public boolean new_() {
      this.this_();
      if ((Boolean)this.continue_[1]) {
         return true;
      } else {
         rfH_2 var1 = ((rU_2)this.new_[4]).byte_(((rU_2)this.new_[3]).case_()).break_((rU_2)this.new_[4]);
         if (this.package_()) {
            return true;
         } else {
            for (int var2 = else_[40]; var2 <= 2; var2++) {
               if (EF.throws_(bw_3.class_((Ps_1)this.new_[1], var1.break_(var2)))) {
                  return true;
               }
            }

            return else_[42];
         }
      }
   }

   public boolean package_() {
      rfH_2 var1 = ((rU_2)this.new_[4]).byte_(((rU_2)this.new_[3]).case_()).break_((rU_2)this.new_[4]);
      return !EF.class_((Ps_1)this.new_[1], new rU_2(var1))
            && EF.class_((Ps_1)this.new_[1], new rU_2(var1).class_())
            && EF.class_((Ps_1)this.new_[1], new rU_2(var1).final_(2))
         ? true
         : else_[44];
   }

   private static void super_() {
      else_ = new boolean[]{
         false,
         true,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         false,
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false
      };
   }

   private static void synchronized_() {
      super_ = new byte[]{3, 2, 2, 2, 2, 2, 2, 3, 11, 2, 2, 20, 2, 2, 2};
   }

   @Override
   public Set<rU_2> native_() {
      return ImmutableSet.of((rU_2)this.new_[3], ((rU_2)this.new_[4]).class_(), (rU_2)this.new_[4]);
   }
}
