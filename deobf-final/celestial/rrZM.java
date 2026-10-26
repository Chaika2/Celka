package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZM {
   private static byte[] break_;
   private static boolean[] byte_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, true, false, false, false};
   }

   public rrZM() {
      this.break_();
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 426697973;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3981297882929426267L;
   }

   private static void class_() {
      break_ = new byte[]{4, 2, 3};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-107, -74, -10, -124, 68, -101, -25, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[4];
         Object[] var1 = this.class_;
         var1[0] = 0;
         var1[1] = 0;
         var1[2] = 0;
         var1[3] = 0;
      }
   }
}
