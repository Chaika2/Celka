package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PF extends Pv_1 {
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public boolean byte_() {
      this.case_();
      return this.break_[0] == 0 ? true : protected_[5];
   }

   public PF(C_class var1) {
      super(var1);
      this.case_();
   }

   static {
      ntfClinit();
   }

   public boolean class_(boolean var1) {
      this.case_();
      int var2 = 0;
      if (var1) {
         var2 = this.protected_() * 2;
      }

      return this.break_[0] > this.break_() - var2 ? true : protected_[3];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 627396126;
   }

   public int class_() {
      this.case_();
      return (Integer)this.break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6864570154679503570L;
   }

   @Override
   public void class_(q_1 var1) {
      this.case_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && (Integer)this.break_[0] > 0) {
         Integer var6 = (Integer)this.break_[0] - 1;
         this.break_[0] = var6;
      }
   }

   public int break_() {
      return 200;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, -21, -94, 92, -10, 82, -120, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void break_(y_1 var1) {
      this.case_();
      if (var1.byte_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0] && var1.protected_() instanceof rmT_2) {
         Integer var6 = (Integer)this.break_[0] + this.protected_();
         this.break_[0] = var6;
      }
   }

   private static void throws_() {
      protected_ = new boolean[]{true, false, true, false, true, false, true, false, false};
   }

   private static void catch_() {
      byte_ = new short[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 200, 0};
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
         var1[0] = 0;
      }
   }

   public int protected_() {
      return 20;
   }

   private static void private_() {
      throws_ = new byte[]{2, 20};
   }
}
