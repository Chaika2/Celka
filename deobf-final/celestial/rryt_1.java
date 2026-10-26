package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryt_1 {
   public Object[] class_;
   private static short[] break_;
   private static byte[] byte_;

   private static void byte_() {
      byte_ = new byte[]{2};
   }

   public rryt_1(String var1, rryT var2) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-108, -34, -80, -124, 17, -95, 33, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public String class_() {
      return (String)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -807921594;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5015609373941110987L;
   }

   public rryT break_() {
      return (rryT)this.class_[1];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
      }
   }

   private static void protected_() {
      break_ = new short[]{0, 1, 0, 1};
   }
}
