package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnh_3 {
   private static boolean[] byte_;
   public Object[] class_;
   public static Object[] break_;
   private static short[] protected_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
         Object[] var1 = this.class_;
      }
   }

   public rrnh_3() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-16, -33, -49, 89, 93, 69, -23, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrnh_3 class_(rrnX_2 var0) {
      ((rrnh_3)break_[0]).class_[0] = var0;
      return (rrnh_3)break_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1022665509;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1398239902212735539L;
   }

   public rrnX_2 class_() {
      return (rrnX_2)this.class_[0];
   }

   private static void break_() {
      protected_ = new short[4];
   }

   private static void throws_() {
      byte_ = new boolean[]{false, true, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrnh_3()};
      break_ = var0;
   }
}
