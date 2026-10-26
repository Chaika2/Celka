package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruJ {
   private static float[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static byte[] protected_;

   private static void byte_() {
      break_ = new float[1];
   }

   public rruJ(rruX var1, rruX var2, float var3) {
      this.break_();
      this.class_[0] = var1;
      this.class_[1] = var2;
      Float var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-27, -109, 1, 82, -54, -43, -109, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1374025013;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7014790125095031690L;
   }

   private static void class_() {
      protected_ = new byte[]{3, 2};
   }

   private void break_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[2] = 0.0F;
      }
   }

   private static void protected_() {
      byte_ = new short[]{0, 1, 2};
   }
}
