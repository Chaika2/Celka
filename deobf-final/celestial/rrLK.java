package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLK {
   private static short[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] protected_;
   private static byte[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public rrLK() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1443817322369526160L;
   }

   public static rrLK class_(rdn_3 var0, rpm_3 var1) {
      ((rrLK)break_[0]).class_[0] = var0;
      ((rrLK)break_[0]).class_[1] = var1;
      return (rrLK)break_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-64, -128, -36, -54, 9, 115, -76, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2062921975;
   }

   public rdn_3 class_() {
      return (rdn_3)this.class_[0];
   }

   public rpm_3 break_() {
      return (rpm_3)this.class_[1];
   }

   private static void throws_() {
      throws_ = new byte[]{2};
   }

   private static void catch_() {
      protected_ = new boolean[]{false, true};
   }

   private static void case_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLK()};
      break_ = var0;
   }
}
