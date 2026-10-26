package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfS_2 {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   public ix_3 byte_() {
      return (ix_3)this.class_[1];
   }

   public rrfS_2(iJ_2 var1, ix_3 var2, rXQ var3) {
      this.throws_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      this.class_[2] = var3;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -404939415;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1271405695164780069L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-9, -100, 29, 47, -25, 74, 87, 11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public iJ_2 class_() {
      return (iJ_2)this.class_[0];
   }

   public rXQ break_() {
      return (rXQ)this.class_[2];
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
      }
   }

   private static void case_() {
      byte_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void protected_() {
      break_ = new byte[]{3};
   }
}
