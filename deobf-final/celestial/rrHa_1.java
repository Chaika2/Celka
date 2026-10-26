package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHa_1 {
   public Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[2];
   }

   public rrHa_1(String var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1586687846296171822L;
   }

   public String class_() {
      return (String)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2139129767;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-13, -97, 116, 65, 33, -118, 48, -27}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{true};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[1];
      }
   }
}
