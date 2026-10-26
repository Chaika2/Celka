package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gr_1 extends Ev_1 {
   private static double[] super_;
   public Object[] continue_;
   private static boolean[] this_;
   private static short[] else_;
   private static byte[] synchronized_;

   @Override
   public EA byte_(EA var1) {
      this.int_();
      if ((Integer)((Ps_1)this.new_[1]).volatile_().break_[1] < (Integer)((rU_2)this.new_[3]).break_[1]) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         super.byte_(var1);
         if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
            return var1;
         } else if (!((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4])
            && !((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[4]).break_(this.byte_().break_()))) {
            xc_3 var2 = bw_3.class_((Ps_1)this.new_[1], (rU_2)this.new_[6]);
            if (!EF.class_((Ps_1)this.new_[1], (rU_2)this.new_[6], var2)) {
               Integer var15 = (Integer)this.continue_[0] + 1;
               this.continue_[0] = var15;
               if (EF.class_(var1, (C_case)this.new_[0], ((rU_2)this.new_[4]).case_(), false, true) == (EL)EL.staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[0]) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
                  if (((Ps_1)this.new_[1]).catch_().x()) {
                     var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
                  }
               }

               if ((Integer)this.continue_[0] > 10) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1], true);
               }

               return var1;
            } else {
               EF.class_((Ps_1)this.new_[1], var1, (rU_2)this.new_[4]);
               if (EF.break_(var2) && !EF.break_(bw_3.class_((Ps_1)this.new_[1], ((rU_2)this.new_[3]).case_()))) {
                  return var1;
               } else if (!(Boolean)C_class.instanceof_().rN.class_[0] && !((Ps_1)this.new_[1]).volatile_().equals(((rU_2)this.new_[3]).class_())) {
                  int var3 = Math.abs(((rU_2)this.new_[3]).b_() - ((rU_2)this.new_[4]).b_());
                  int var4 = Math.abs(((rU_2)this.new_[3]).d_() - ((rU_2)this.new_[4]).d_());
                  double var5 = (double)var3 * Math.abs((double)((rU_2)this.new_[4]).b_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().break_)
                     + (double)var4 * Math.abs((double)((rU_2)this.new_[4]).d_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().protected_);
                  double var7 = (double)var4 * Math.abs((double)((rU_2)this.new_[4]).b_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().break_)
                     + (double)var3 * Math.abs((double)((rU_2)this.new_[4]).d_() + 0.5 - ((Ps_1)this.new_[1]).catch_().Ps().protected_);
                  double var9 = (double)var3 * ((Ps_1)this.new_[1]).catch_().rv().protected_ + (double)var4 * ((Ps_1)this.new_[1]).catch_().rv().break_;
                  if (Math.abs(var9) > 0.1) {
                     return var1;
                  } else if (this.package_()) {
                     return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
                  } else {
                     return !(var5 > 1.2) && !(var7 > 0.2) ? var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true) : var1;
                  }
               } else {
                  return var1;
               }
            }
         } else {
            return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
         }
      }
   }

   private void int_() {
      if (this.continue_ == null) {
         this.continue_ = new Object[1];
         Object[] var1 = this.continue_;
         var1[0] = 0;
      }
   }

   public Gr_1(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var3, var2.final_(2), var3.class_()}, var3.case_());
      this.int_();
      Integer var8 = 0;
      this.continue_[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      this_ = new boolean[]{
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
         true,
         false,
         true,
         true,
         false,
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
         false
      };
   }

   public static double class_(EZ var0, int var1, int var2, int var3, int var4, int var5) {
      xc_3 var6 = var0.class_(var4, var2, var5);
      double var7 = 0.0;
      if (!EF.class_(var0, var4, var2, var5, var6)) {
         var7 = var0.class_(var4, var2, var5, var6);
         if (var7 >= 1000000.0) {
            return 1000000.0;
         }

         if (!EF.break_(var4, var2, var5, var6, (bw_3)var0.break_[4])) {
            return 1000000.0;
         }

         boolean var9 = this_[4];

         for (int var10 = 0; var10 < 5; var10++) {
            int var11 = var4 + ((rpr_3[])class_[0])[var10].implements_();
            int var12 = var2 + ((rpr_3[])class_[0])[var10].finally_();
            int var13 = var5 + ((rpr_3[])class_[0])[var10].extends_();
            if ((var11 != var1 || var13 != var3) && EF.class_((bw_3)var0.break_[4], var11, var12, var13)) {
               var9 = true;
               break;
            }
         }

         if (!var9) {
            return 1000000.0;
         }
      }

      xc_3 var17 = var0.class_(var1, var2 + 2, var3);
      if (!(var0.class_(var1, var2 + 3, var3).break_() instanceof dH_2) || !EF.byte_(var0, var1, var2 + 1, var3) && var17.break_() instanceof dH_2) {
         xc_3 var18 = var0.class_(var1, var2 - 1, var3);
         if (var18.break_() != xu_3.PJ && var18.break_() != xu_3.BD) {
            boolean var19 = EF.break_(var18);
            boolean var20 = EF.break_(var6);
            if (var19 && !var20) {
               return 1000000.0;
            } else {
               double var22;
               if (var20) {
                  if (var19) {
                     var22 = Math.max(break_, 4.63284688441047);
                     var22 += var0.break_[26];
                  } else {
                     var22 = super_[9];
                  }
               } else {
                  if (var6.break_() == xu_3.PY) {
                     var22 = 9.26569376882094;
                  } else {
                     var22 = Math.max(break_, 4.63284688441047);
                  }

                  var22 += var0.break_[26];
               }

               double var15 = var22 + var7;
               var15 += EF.class_(var0, var1, var2 + 2, var3, var17, false);
               if (var15 >= 1000000.0) {
                  return 1000000.0;
               } else {
                  var15 += EF.class_(var0, var4, var2 + 1, var5, false);
                  return var15 >= 1000000.0 ? 1000000.0 : var15 + EF.class_(var0, var4, var2 + 2, var5, true);
               }
            }
         } else {
            return super_[6];
         }
      } else {
         return super_[5];
      }
   }

   @Override
   public double class_(EZ var1) {
      return class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (Integer)((rU_2)this.new_[4]).break_[0],
         (Integer)((rU_2)this.new_[4]).break_[2]
      );
   }

   @Override
   public boolean class_(EA var1) {
      this.int_();
      return var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2] && this.continue_[0] != 0 ? this_[25] : this_[24];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6994590195772881644L;
   }

   @Override
   public void class_() {
      this.int_();
      super.class_();
      Integer var5 = 0;
      this.continue_[0] = var5;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -753247137;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, 40, 10, 99, 89, 103, -79, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      synchronized_ = new byte[]{3, 2, 2, 5, 2, 3, 2, 2, 10, 2, 4};
   }

   private static void new_() {
      else_ = new short[]{
         0,
         0,
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
         3,
         3,
         3,
         4,
         4,
         0,
         0,
         0,
         4,
         26,
         26,
         1,
         1,
         3,
         1,
         4,
         2,
         1,
         4,
         1,
         4,
         3,
         1,
         6,
         1,
         6,
         0,
         0,
         0,
         4,
         0,
         7,
         1,
         5,
         0,
         1,
         1,
         4,
         1,
         3,
         0,
         1,
         3,
         3,
         4,
         3,
         4,
         4,
         1,
         4,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         6,
         6,
         3,
         1,
         2,
         0
      };
   }

   public boolean package_() {
      rU_2 var1 = ((rU_2)this.new_[3]).final_(2);

      for (int var2 = 0; var2 < 4; var2++) {
         rU_2 var3 = var1.class_(rpr_3.break_(var2));
         if (!EF.class_((Ps_1)this.new_[1], var3)) {
            return false;
         }
      }

      return this_[23];
   }

   private static void super_() {
      super_ = new double[]{
         0.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         4.63284688441047,
         4.63284688441047,
         9.26569376882094,
         4.63284688441047,
         1000000.0,
         1000000.0,
         1000000.0,
         1000000.0,
         0.5,
         0.5,
         0.5,
         0.5,
         0.1,
         1.2,
         0.2
      };
   }

   @Override
   public Set<rU_2> native_() {
      rU_2 var1 = new rU_2(((rU_2)this.new_[3]).byte_(this.byte_()).final_());
      return ImmutableSet.of((rU_2)this.new_[3], ((rU_2)this.new_[3]).class_(), (rU_2)this.new_[4], var1, var1.class_());
   }
}
