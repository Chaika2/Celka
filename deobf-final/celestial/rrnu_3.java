package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnu_3 {
   public Object[] class_;
   public static Object[] break_;
   private static boolean[] byte_;
   private static short[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrnu_3()};
      break_ = var0;
   }

   public rrnu_3() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -625220029;
   }

   public rYB class_() {
      return (rYB)this.class_[0];
   }

   public static rrnu_3 class_(rYB var0) {
      ((rrnu_3)break_[0]).class_[0] = var0;
      return (rrnu_3)break_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5205023889255428956L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-73, -43, 121, -33, -59, -71, -121, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, true};
   }

   private static void protected_() {
      protected_ = new short[4];
   }
}
