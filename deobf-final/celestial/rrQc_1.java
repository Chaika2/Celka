package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQc_1 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static boolean[] protected_;

   private static void byte_() {
      byte_ = new short[]{0, 1, 2};
   }

   public rrQc_1() {
      this.protected_();
      Integer var5 = 6;
      this.class_[0] = var5;
      Integer var6 = 6;
      this.class_[1] = var6;
      Boolean var7 = true;
      this.class_[2] = var7;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-22, -104, 127, -65, 16, 89, -74, -120}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1193893831;
   }

   private static void class_() {
      break_ = new byte[]{6, 6, 3, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6845208617550612067L;
   }

   private static void break_() {
      protected_ = new boolean[]{true, false, false, true, false, false};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = false;
      }
   }
}
