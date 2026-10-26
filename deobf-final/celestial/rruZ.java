package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruZ implements rrum_1 {
   private static boolean[] break_;
   private static short[] byte_;
   public Object[] class_;
   private static float[] protected_;
   private static byte[] throws_;

   private void byte_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
      }
   }

   public rruZ(String var1, float var2) {
      this.byte_();
      this.class_[0] = var1;
      Float var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1288107831;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, 2, 24, 55, -15, -1, -30, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public float class_() {
      return (Float)this.class_[1] * 1000.0F;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4487449110266991177L;
   }

   @Override
   public String break_() {
      return (String)this.class_[0];
   }

   private static void throws_() {
      protected_ = new float[]{1000.0F, 0.0F};
   }

   private static void catch_() {
      byte_ = new short[]{0, 1, 0, 1};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private static void protected_() {
      break_ = new boolean[]{true};
   }
}
