package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQu_1 {
   private static short[] break_;
   public Object[] class_;
   private static byte[] byte_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
      }
   }

   public rrQu_1() {
      this.byte_();
      rrQm_1 var5 = new rrQm_1();
      this.class_[0] = var5;
      rrQZ var6 = new rrQZ();
      this.class_[1] = var6;
      rrQv_1 var7 = new rrQv_1();
      this.class_[2] = var7;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1633588335460725724L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1204977666;
   }

   private static void class_() {
      break_ = new short[]{0, 1, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-88, 80, -38, 24, -31, -14, -100, -56}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new byte[]{3};
   }
}
