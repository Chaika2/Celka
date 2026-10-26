package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAY extends Om_1 {
   private static boolean[] byte_;
   public Object[] class_;
   private static short[] protected_;
   private static byte[] throws_;
   public static Object[] break_;

   public rrAY() {
      this.throws_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, -114, -115, 60, 76, -58, 31, 117}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rpm_3 class_() {
      this.throws_();
      return (rpm_3)this.class_[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5563997492241358330L;
   }

   public static rrAY class_(rdn_3 var0, rpm_3 var1) {
      ((rrAY)break_[0]).class_[0] = var0;
      ((rrAY)break_[0]).class_[1] = var1;
      ((rrAY)break_[0]).class_(false);
      return (rrAY)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1780085815;
   }

   public rdn_3 break_() {
      this.throws_();
      return (rdn_3)this.class_[0];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   private static void catch_() {
      throws_ = new byte[]{2};
   }

   private static void case_() {
      byte_ = new boolean[]{false, false, true};
   }

   private static void protected_() {
      protected_ = new short[]{0, 0, 0, 1, 0, 0, 0, 1};
   }

   private static void private_() {
      Object[] var0 = new Object[]{new rrAY()};
      break_ = var0;
   }
}
