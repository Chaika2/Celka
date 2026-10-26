package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHt_1 {
   private static float[] break_;
   private static boolean[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   public Object[] class_;

   private static void byte_() {
      protected_ = new short[]{0, 1, 0, 1};
   }

   public rrHt_1(String var1, float var2) {
      this.catch_();
      this.class_[0] = var1;
      Float var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1152078501;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, -99, 100, -41, 33, 57, -49, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5724485317022293573L;
   }

   public float class_() {
      return (Float)this.class_[1];
   }

   public String break_() {
      return (String)this.class_[0];
   }

   private static void throws_() {
      byte_ = new boolean[]{true};
   }

   private void catch_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         this.class_[1] = 0.0F;
      }
   }

   private static void case_() {
      break_ = new float[1];
   }

   private static void protected_() {
      throws_ = new byte[]{2};
   }
}
