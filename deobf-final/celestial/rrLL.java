package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLL {
   private static short[] byte_;
   public static Object[] class_;
   private static byte[] protected_;
   private static boolean[] throws_;
   public Object[] break_;

   private static void byte_() {
      byte_ = new short[]{0, 0, 0, 1, 0, 0, 1};
   }

   public rrLL() {
      this.protected_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-56, -123, -90, -57, 2, -6, 22, 26}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -322513066263520100L;
   }

   public static rrLL class_(Aw_1 var0, rgP_2 var1) {
      ((rrLL)class_[0]).break_[0] = var0;
      ((rrLL)class_[0]).break_[1] = var1;
      return (rrLL)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1065026619;
   }

   public rgP_2 class_() {
      return (rgP_2)this.break_[1];
   }

   public Aw_1 break_() {
      return (Aw_1)this.break_[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLL()};
      class_ = var0;
   }

   private static void catch_() {
      protected_ = new byte[]{2};
   }

   private static void case_() {
      throws_ = new boolean[]{false, true};
   }

   private void protected_() {
      if (this.break_ == null) {
         this.break_ = new Object[2];
         Object[] var1 = this.break_;
      }
   }
}
