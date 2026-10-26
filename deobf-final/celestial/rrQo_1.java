package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQo_1 {
   private static float[] break_;
   private static double[] byte_;
   private static boolean[] protected_;
   private static short[] throws_;
   public static Object[] class_;

   private static void byte_() {
      throws_ = new short[1];
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{75, 102, 110, -85, -56, -110, 16, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1676807106;
   }

   public static float class_(rrQK var0, double var1, double var3, double var5) {
      return (float)(var1 + (var3 - var1) * var0.class_(var5 * (Double)class_[0] * 0.01));
   }

   private static void class_() {
      break_ = new float[]{1.0F, 2.0F, 2.0F};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6986138011711787566L;
   }

   public static void class_(Ml_1 var0, float var1, float var2, float var3, float var4, float var5) {
      float var6 = 1.0F - var5;
      var0.class_((double)(var6 * (var1 + var3 / 2.0F)), (double)(var6 * (var2 + var4 / 2.0F)), 0.0);
      var0.class_(var5, var5, var5);
   }

   private static void break_() {
      byte_ = new double[]{0.0, 0.01, 0.0};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{0.0};
      class_ = var0;
   }

   private static void protected_() {
      protected_ = new boolean[]{true, false};
   }
}
