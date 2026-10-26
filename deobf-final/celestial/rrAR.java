package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAR extends Om_1 {
   private static short[] byte_;
   public static Object[] class_;
   private static boolean[] protected_;
   private static byte[] throws_;
   public Object[] break_;

   public rrAR() {
      this.case_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1179794961;
   }

   public static rrAR class_(rdn_3 var0, rff_3 var1, xd_3 var2, rpm_3 var3) {
      ((rrAR)class_[0]).break_[2] = var0;
      ((rrAR)class_[0]).break_[0] = var1;
      ((rrAR)class_[0]).break_[1] = var2;
      ((rrAR)class_[0]).break_[3] = var3;
      ((rrAR)class_[0]).class_(false);
      return (rrAR)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9044253113654332721L;
   }

   public rdn_3 class_() {
      this.case_();
      return (rdn_3)this.break_[2];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 60, -17, -121, -29, -26, -45, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rff_3 break_() {
      this.case_();
      return (rff_3)this.break_[0];
   }

   public rpm_3 throws_() {
      this.case_();
      return (rpm_3)this.break_[3];
   }

   private static void finally_() {
      byte_ = new short[]{0, 2, 0, 0, 0, 1, 0, 3, 0, 0, 0, 1, 2, 3};
   }

   private static void catch_() {
      Object[] var0 = new Object[]{new rrAR()};
      class_ = var0;
   }

   private void case_() {
      if (this.break_ == null) {
         this.break_ = new Object[4];
         Object[] var1 = this.break_;
      }
   }

   private static void implements_() {
      throws_ = new byte[]{4};
   }

   public xd_3 protected_() {
      this.case_();
      return (xd_3)this.break_[1];
   }

   private static void private_() {
      protected_ = new boolean[]{false, false, true};
   }
}
