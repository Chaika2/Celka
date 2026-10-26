package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrQe_1 {
   private static double[] doubles1770e99df65a3a9eae04d8fca8f4496a;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4401000334951097119L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -753523555;
   }

   private static void class_() {
      doubles1770e99df65a3a9eae04d8fca8f4496a = new double[]{1.70158, 1.0, 1.0, 1.0, 3.0, 1.0, 2.0};
   }

   @Override
   public double class_(double var1) {
      double var3 = 1.70158;
      double var5 = var3 + 1.0;
      return 1.0 + var5 * Math.pow(var1 - 1.0, 3.0) + var3 * Math.pow(var1 - 1.0, 2.0);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -81, -25, 48, -119, 124, -38, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
