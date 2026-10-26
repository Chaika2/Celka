package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class T {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static float[] throws_;

   public Ml_1 byte_() {
      return (Ml_1)this.class_[2];
   }

   public T(float var1, Ml_1 var2, rjV_2 var3) {
      this.case_();
      Float var8 = var1;
      this.class_[0] = var8;
      this.class_[2] = var2;
      this.class_[1] = var3;
   }

   static {
      ntfClinit();
   }

   public rjV_2 class_() {
      return (rjV_2)this.class_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1350712839;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1104475345115424592L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-40, 104, -124, 18, 108, -75, 38, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public float break_() {
      return (Float)this.class_[0];
   }

   private static void throws_() {
      break_ = new byte[]{3};
   }

   private static void catch_() {
      protected_ = new boolean[1];
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
      }
   }

   private static void protected_() {
      throws_ = new float[1];
   }

   private static void private_() {
      byte_ = new short[]{0, 2, 1, 0, 2, 1};
   }
}
