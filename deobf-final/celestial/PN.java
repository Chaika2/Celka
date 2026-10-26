package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PN {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;

   private static void byte_() {
      byte_ = new short[2];
   }

   PN(C_extends<?> var1) {
      this.protected_();
      this.class_[0] = var1;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -746572185199166662L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2049490379;
   }

   C_extends<?> class_() {
      return (C_extends<?>)this.class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -67, -59, -80, -54, 21, 12, 15}, "DES");
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
         Object[] var1 = this.class_;
      }
   }
}
