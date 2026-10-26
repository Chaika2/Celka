package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfN_2 {
   private static short[] class_;
   private static double[] break_;
   private static float[] byte_;

   private static void byte_() {
      class_ = new short[]{20};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 794441534;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7216642726280512827L;
   }

   private static void class_() {
      break_ = new double[]{0.15, 0.6, 0.2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-3, -50, 114, 55, 10, -92, 30, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static float class_(float var0) {
      return break_(var0) * break_();
   }

   private static float break_(float var0) {
      return (float)Math.round(var0 / break_());
   }

   private static float break_() {
      return (float)((double)throws_() * 0.15);
   }

   private static float throws_() {
      float var0;
      return (var0 = (float)(((Qw_1)MinecraftAccessor.import_.class_[20]).class_ * 0.6 + 0.2)) * var0 * var0 * 8.0F;
   }

   private static void protected_() {
      byte_ = new float[]{8.0F};
   }
}
