package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QK implements AutoCloseable {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   public rrGP byte_() {
      return (rrGP)this.class_[2];
   }

   QK(rAt_1 var1, rAh_1 var2, rrGP var3) {
      this.protected_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 15, -17, 47, -98, 44, 27, 110}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 475137055196057126L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1195950522;
   }

   public rAt_1 class_() {
      return (rAt_1)this.class_[0];
   }

   @Override
   public void close() {
      ((rAt_1)this.class_[0]).close();
      ((rAh_1)this.class_[1]).close();
   }

   public rAh_1 break_() {
      return (rAh_1)this.class_[1];
   }

   private static void throws_() {
      break_ = new short[]{0, 1, 2, 0, 1, 2, 0, 1};
   }

   private static void case_() {
      byte_ = new byte[]{3};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }
}
