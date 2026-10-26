package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrQi_1 {
   private static double[] doubles0f54b2fc731339b384bb832ab8328044;

   static {
      ntfClinit();
   }

   @Override
   public double class_(double var1) {
      if (var1 < 0.36363636363636365) {
         return 7.5625 * var1 * var1;
      } else if (var1 < 0.7272727272727273) {
         double var5;
         return 7.5625 * (var5 = var1 - 0.5454545454545454) * var5 + 0.75;
      } else {
         double var3;
         double var4;
         return var1 < 0.9090909090909091
            ? 7.5625 * (var3 = var1 - 0.8181818181818182) * var3 + 0.9375
            : doubles0f54b2fc731339b384bb832ab8328044[10] * (var4 = var1 - 0.9545454545454546) * var4 + 0.984375;
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 229172821897970265L;
   }

   private static void class_() {
      doubles0f54b2fc731339b384bb832ab8328044 = new double[]{
         0.36363636363636365,
         7.5625,
         0.7272727272727273,
         7.5625,
         0.5454545454545454,
         0.75,
         0.9090909090909091,
         7.5625,
         0.8181818181818182,
         0.9375,
         7.5625,
         0.9545454545454546,
         0.984375
      };
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2105431181;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 127, -17, 113, -38, 80, 92, -35}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
