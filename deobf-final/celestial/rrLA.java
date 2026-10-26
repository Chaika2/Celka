package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLA {
   public static Object[] class_;
   private static short[] byte_;
   public Object[] break_;
   private static boolean[] protected_;

   private void byte_() {
      if (this.break_ == null) {
         this.break_ = new Object[1];
         Object[] var1 = this.break_;
      }
   }

   public rrLA() {
      this.byte_();
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3277370369415420883L;
   }

   public rvs_3 class_() {
      return (rvs_3)this.break_[0];
   }

   public static rrLA class_(rvs_3 var0) {
      ((rrLA)class_[0]).break_[0] = var0;
      return (rrLA)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{86, 59, 83, -37, 103, -80, -46, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -835979244;
   }

   private static void break_() {
      byte_ = new short[4];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrLA()};
      class_ = var0;
   }

   private static void protected_() {
      protected_ = new boolean[]{false, true, true};
   }
}
