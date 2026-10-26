package celestial;

import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GS extends Ev_1 {
   private static double[] super_;
   private static short[] this_;
   private static byte[] else_;
   private static boolean[] synchronized_;
   public Object[] continue_;

   @Override
   public EA byte_(EA var1) {
      this.super_();
      super.byte_(var1);
      if (var1.byte_() != (rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[2]) {
         return var1;
      } else if (((Ps_1)this.new_[1]).volatile_().equals((rU_2)this.new_[4])) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[3]);
      } else if (!this.extends_()) {
         return var1.class_((rk_3)rk_3.staticFields5f483cd00ec6343b89d8ec7a44fc67de[4]);
      } else {
         double var2 = ((Ps_1)this.new_[1]).catch_().Ps().break_ - ((double)((rU_2)this.new_[4]).b_() + 0.5);
         double var4 = ((Ps_1)this.new_[1]).catch_().Ps().protected_ - ((double)((rU_2)this.new_[4]).d_() + 0.5);
         double var6 = Math.sqrt(var2 * var2 + var4 * var4);
         int var10002 = (Integer)this.continue_[0];
         Integer var12 = var10002 + 1;
         this.continue_[0] = var12;
         if (var10002 < 10 && var6 < 0.2) {
            return var1;
         } else {
            EF.class_((Ps_1)this.new_[1], var1, ((rU_2[])this.new_[5])[0]);
            return var1;
         }
      }
   }

   private static void int_() {
      synchronized_ = new boolean[]{true, false, false, false, true, true, true, false, true, false, true, false, false};
   }

   public GS(C_case var1, rU_2 var2, rU_2 var3) {
      super(var1, var2, var3, new rU_2[]{var3});
      this.super_();
      Integer var8 = 0;
      this.continue_[0] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void class_() {
      this.super_();
      super.class_();
      Integer var5 = 0;
      this.continue_[0] = var5;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6446363898700991857L;
   }

   @Override
   public double class_(EZ var1) {
      return protected_(var1, (Integer)((rU_2)this.new_[3]).break_[0], (Integer)((rU_2)this.new_[3]).break_[1], (Integer)((rU_2)this.new_[3]).break_[2]);
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1460893017;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-94, 3, 32, -117, 38, 101, 23, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void continue_() {
      super_ = new double[]{1000000.0, 1000000.0, 6.666666666666667, 0.5, 0.5, 0.2};
   }

   private static void new_() {
      else_ = new byte[]{2, 10};
   }

   private static void package_() {
      this_ = new short[]{0, 0, 3, 0, 3, 1, 3, 2, 3, 4, 20, 2, 1, 4, 3, 4, 1, 4, 1, 4, 0, 0, 1, 5};
   }

   private void super_() {
      if (this.continue_ == null) {
         this.continue_ = new Object[1];
         Object[] var1 = this.continue_;
         var1[0] = 0;
      }
   }

   public static double protected_(EZ var0, int var1, int var2, int var3) {
      if (!(Boolean)var0.break_[20]) {
         return 1000000.0;
      } else if (!EF.class_(var0, var1, var2 - 2, var3)) {
         return 1000000.0;
      } else {
         xc_3 var4 = var0.class_(var1, var2 - 1, var3);
         xd_3 var5 = var4.break_();
         return var5 != xu_3.PJ && var5 != xu_3.BD ? package_[1] + EF.class_(var0, var1, var2 - 1, var3, var4, false) : super_[2];
      }
   }

   @Override
   public Set<rU_2> native_() {
      return ImmutableSet.of((rU_2)this.new_[3], (rU_2)this.new_[4]);
   }
}
