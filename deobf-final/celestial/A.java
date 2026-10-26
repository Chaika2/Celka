package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class A {
   private static byte[] break_;
   private static short[] byte_;
   public Object[] class_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }

   public A(rfH_2 var1, n_1 var2) {
      this.byte_();
      this.class_[0] = var1;
      this.class_[1] = var2;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6628453180106662785L;
   }

   public n_1 class_() {
      return (n_1)this.class_[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{117, -119, 45, 30, -92, -88, -36, 0}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2127703565;
   }

   public rfH_2 break_() {
      return (rfH_2)this.class_[0];
   }

   private static void throws_() {
      break_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 0, 1};
   }
}
