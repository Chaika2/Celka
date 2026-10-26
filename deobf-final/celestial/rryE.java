package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryE {
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] throws_;
   public Object[] class_;

   public float byte_() {
      return (Float)this.class_[2];
   }

   public rryE(float var1, float var2, float var3) {
      this.case_();
      Float var8 = var1;
      this.class_[0] = var8;
      Float var9 = var2;
      this.class_[1] = var9;
      Float var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-111, 43, -83, -93, -58, -30, -85, -63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8317807258410505341L;
   }

   public float class_() {
      return (Float)this.class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -329512251;
   }

   public float break_() {
      return (Float)this.class_[1];
   }

   private static void throws_() {
      protected_ = new byte[]{3, 2};
   }

   private static void catch_() {
      break_ = new boolean[]{false, true};
   }

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         this.class_[0] = 0.0F;
         this.class_[1] = 0.0F;
         this.class_[2] = 0.0F;
      }
   }

   private static void protected_() {
      throws_ = new short[]{0, 1, 2, 0, 1, 2};
   }

   private static void private_() {
      byte_ = new float[3];
   }
}
