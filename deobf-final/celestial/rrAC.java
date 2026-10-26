package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAC extends Om_1 {
   public Object[] class_;
   public static Object[] break_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static byte[] throws_;

   public rrAC() {
      this.implements_();
   }

   static {
      ntfClinit();
   }

   public rpm_3 class_() {
      this.implements_();
      return (rpm_3)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1034713731;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{12, 41, 84, 24, 18, -114, -115, -53}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAC class_(Y var0, rdn_3 var1, rpm_3 var2) {
      ((rrAC)break_[0]).class_[2] = var0;
      ((rrAC)break_[0]).class_[0] = var1;
      ((rrAC)break_[0]).class_[1] = var2;
      ((rrAC)break_[0]).class_(false);
      return (rrAC)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2699621281110626791L;
   }

   public Y break_() {
      this.implements_();
      return (Y)this.class_[2];
   }

   private static void throws_() {
      protected_ = new boolean[]{false, false, true};
   }

   private static void catch_() {
      byte_ = new short[]{0, 2, 0, 0, 0, 1, 0, 0, 0, 1, 2};
   }

   private static void case_() {
      throws_ = new byte[]{3};
   }

   private void implements_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   public rdn_3 protected_() {
      this.implements_();
      return (rdn_3)this.class_[0];
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAC()};
      break_ = var0;
   }
}
