package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class f_1 extends R {
   private static short[] byte_;
   private static byte[] protected_;
   public Object[] class_;

   public f_1(String var1) {
      this.protected_();
      this.class_[0] = var1;
      Object var7 = null;
      this.class_[1] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4924605411104381072L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, 21, 39, 87, -16, 78, -38, -42}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new short[]{0, 1};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2035665303;
   }

   private static void throws_() {
      protected_ = new byte[]{2};
   }

   private void protected_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
      }
   }
}
