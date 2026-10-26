package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gs_1 extends Ev_1 {
   private static float[] super_;
   private static short[] this_;
   private static boolean[] else_;
   private static byte[] synchronized_;
   private static double[] return_;
   public static Object[] continue_;

   @Override
   public EA byte_(EA var1) {
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else {
         rU_2 var2 = ((Ps_1)this.new_[1]).volatile_();
         PX var3 = PJ.class_(((Ps_1)this.new_[1]).finally_(), Pu_1.class_((rU_2)this.new_[4]), ((Ps_1)this.new_[1]).protected_());
         PX var4 = null;
         xc_3 var5 = ((Ps_1)this.new_[1]).case_().byte_((rU_2)this.new_[4]);
         xd_3 var6 = var5.break_();
         boolean var7 = var5.volatile_().class_() instanceof rXh_1;
         if (!var7 && this.int_() && !var2.equals((rU_2)this.new_[4])) {
            if (!rhz_3.break_(((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1]).break_((rdn_3)continue_[0]))
               || ((Ps_1)this.new_[1]).case_().E() == rYB.protected_) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
            }

            if (((Ps_1)this.new_[1]).catch_().Ps().byte_ - (double)((rU_2)this.new_[4]).c_() < ((Ps_1)this.new_[1]).native_().case_()
               && !((Ps_1)this.new_[1]).catch_().BL()) {
               ((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1]).protected_ = ((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1])
                  .break_((rdn_3)continue_[0]);
               var4 = new PX(var3.throws_(), 90.0F);
               if (((Ps_1)this.new_[1]).class_((rU_2)this.new_[4]) || ((Ps_1)this.new_[1]).class_(((rU_2)this.new_[4]).case_())) {
                  var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }
            }
         }

         if (var4 != null) {
            var1.class_(new En_1(var4, true));
         } else {
            var1.class_(new En_1(var3, false));
         }

         if (var2.equals((rU_2)this.new_[4]) && (((Ps_1)this.new_[1]).catch_().Ps().byte_ - (double)var2.c_() < 0.094 || var7)) {
            if (!var7) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }

            if (rhz_3.break_(((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1]).break_((rdn_3)continue_[1]))) {
               ((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1]).protected_ = ((rhz_3)((Ps_1)this.new_[1]).catch_().implements_[1])
                  .break_((rdn_3)continue_[1]);
               if (((Ps_1)this.new_[1]).catch_().rv().byte_ >= 0.0) {
                  return var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               }

               return var1;
            }

            if (((Ps_1)this.new_[1]).catch_().rv().byte_ >= 0.0) {
               return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
            }
         }

         rjU_2 var8 = Pu_1.class_((rU_2)this.new_[4]);
         if (Math.abs(((Ps_1)this.new_[1]).catch_().Ps().break_ + ((Ps_1)this.new_[1]).catch_().rv().break_ - var8.break_) > 0.1
            || Math.abs(((Ps_1)this.new_[1]).catch_().Ps().protected_ + ((Ps_1)this.new_[1]).catch_().rv().protected_ - var8.protected_) > 0.1) {
            if (!((Ps_1)this.new_[1]).catch_().BL() && Math.abs(((Ps_1)this.new_[1]).catch_().rv().byte_) > 0.4) {
               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], true);
            }

            var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
         }

         Object var9 = Optional.ofNullable(this.package_()).map(rpr_3::int_).orElse(null);
         if (var9 == null) {
            var9 = ((rU_2)this.new_[3]).byte_((rU_2)this.new_[4]);
         } else {
            double var10 = Math.abs((double)((rja_3)var9).b_() * (var8.break_ - (double)((rja_3)var9).b_() / 2.0 - ((Ps_1)this.new_[1]).catch_().Ps().break_))
               + Math.abs((double)((rja_3)var9).d_() * (var8.protected_ - (double)((rja_3)var9).d_() / 2.0 - ((Ps_1)this.new_[1]).catch_().Ps().protected_));
            if (var10 < 0.6) {
               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[0], true);
            } else if (!((Ps_1)this.new_[1]).catch_().BL()) {
               var1.class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7], false);
            }
         }

         if (var4 == null) {
            rjU_2 var12 = new rjU_2(var8.break_ + 0.125 * (double)((rja_3)var9).b_(), var8.byte_, var8.protected_ + 0.125 * (double)((rja_3)var9).d_());
            var1.class_(new En_1(PJ.class_(((Ps_1)this.new_[1]).finally_(), var12, ((Ps_1)this.new_[1]).protected_()), false));
         }

         return var1;
      }
   }

   private boolean int_() {
      EZ var1 = new EZ((C_case)this.new_[0]);
      Mr_1 var2 = new Mr_1();
      return GP.class_(
         var1,
         (Integer)((rU_2)this.new_[3]).break_[0],
         (Integer)((rU_2)this.new_[3]).break_[1],
         (Integer)((rU_2)this.new_[3]).break_[2],
         (Integer)((rU_2)this.new_[4]).break_[0],
         (Integer)((rU_2)this.new_[4]).break_[2],
         0.0,
         var1.class_((Integer)((rU_2)this.new_[4]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1] - 2, (Integer)((rU_2)this.new_[4]).break_[2]),
         var2
      );
   }

   public Gs_1(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, class_(var2, var3));
   }

   static {
      ntfClinit();
   }

   private static void this_() {
      else_ = new boolean[]{true, true, false, true, true, true, true, false, false, false, true, false, false, true, true, false, true, false, true};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2708287656851244607L;
   }

   private static rU_2[] class_(rU_2 var0, rU_2 var1) {
      int var3 = var0.b_() - var1.b_();
      int var4 = var0.d_() - var1.d_();
      int var5 = var0.c_() - var1.c_();
      rU_2[] var2 = new rU_2[var5 + 2];

      for (int var6 = 0; var6 < var2.length; var6++) {
         var2[var6] = new rU_2(var0.b_() - var3, var0.c_() + 1 - var6, var0.d_() - var4);
      }

      return var2;
   }

   @Override
   public double class_(EZ var1) {
      Mr_1 var2 = new Mr_1();
      GP.class_(
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

   @Override
   public boolean class_(EA var1) {
      return !((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[3]) && var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]
         ? else_[11]
         : else_[10];
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -975750885;
   }

   @Override
   public boolean break_(EA var1) {
      if (var1.byte_() == (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[1]) {
         return true;
      } else {
         for (int var2 = else_[15]; var2 < 4 && var2 < ((rU_2[])this.new_[5]).length; var2++) {
            if (!EF.class_((Ps_1)this.new_[1], ((rU_2[])this.new_[5])[var2])) {
               return super.break_(var1);
            }
         }

         return else_[16];
      }
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-30, -122, 60, 89, -101, -100, 25, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      Object[] var0 = new Object[]{new rdn_3(rdy_3.hR), new rdn_3(rdy_3.hg)};
      continue_ = var0;
   }

   private static void else_() {
      this_ = new short[]{
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
         3,
         1,
         4,
         1,
         4,
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
         4,
         0,
         3,
         1,
         4,
         2,
         2,
         1,
         1,
         4,
         1,
         1,
         4,
         4,
         1,
         1,
         0,
         1,
         4,
         1,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         0,
         1,
         4,
         1,
         4,
         5,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         1,
         5,
         1,
         3,
         3,
         4,
         1,
         1,
         1,
         1,
         1,
         1,
         7,
         0,
         3,
         4,
         1,
         1,
         0,
         1,
         7,
         1,
         1,
         1,
         1,
         1,
         3,
         2,
         1,
         5,
         1,
         5
      };
   }

   private static void new_() {
      super_ = new float[]{90.0F};
   }

   private rpr_3 package_() {
      for (int var1 = 0; var1 < 15; var1++) {
         xc_3 var2 = ((Ps_1)this.new_[1]).case_().byte_(((Ps_1)this.new_[1]).volatile_().protected_(var1));
         if (var2.break_() == xu_3.PJ) {
            return var2.byte_(kc_3.volatile_);
         }
      }

      return null;
   }

   private static void super_() {
      return_ = new double[]{1000000.0, 0.0, 0.094, 0.0, 0.0, 0.1, 0.1, 0.4, 2.0, 2.0, 0.6, 0.125, 0.125};
   }

   private static void synchronized_() {
      synchronized_ = new byte[]{2, 15, 2, 4, 2};
   }

   @Override
   public Set<rU_2> native_() {
      HashSet var1 = new HashSet();
      var1.add((rU_2)this.new_[3]);

      for (int var2 = (Integer)((rU_2)this.new_[3]).break_[1] - (Integer)((rU_2)this.new_[4]).break_[1]; var2 >= 0; var2--) {
         var1.add(((rU_2)this.new_[4]).final_(var2));
      }

      return var1;
   }
}
