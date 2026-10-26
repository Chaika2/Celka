package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrQD {
   private static double[] doubles926ed2443b7d3c18a628aaa6cd7f0440;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1617021854;
   }

   @Override
   public double class_(double var1) {
      return 1.0 - (1.0 - var1) * (1.0 - var1);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8247936835610453974L;
   }

   private static void class_() {
      doubles926ed2443b7d3c18a628aaa6cd7f0440 = new double[]{1.0, 1.0, 1.0};
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -15, 30, 56, -37, -76, 102, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
