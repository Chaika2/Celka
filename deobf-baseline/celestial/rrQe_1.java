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

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4401000334951097119L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -753523555;
   }

   private static void id_class() {
      doubles1770e99df65a3a9eae04d8fca8f4496a = new double[]{1.70158, 1.0, 1.0, 1.0, 3.0, 1.0, 2.0};
   }

   @Override
   public double id_class(double var1) {
      double var3 = doubles1770e99df65a3a9eae04d8fca8f4496a[0];
      double var5 = var3 + doubles1770e99df65a3a9eae04d8fca8f4496a[1];
      return doubles1770e99df65a3a9eae04d8fca8f4496a[2]
         + var5 * Math.pow(var1 - doubles1770e99df65a3a9eae04d8fca8f4496a[3], doubles1770e99df65a3a9eae04d8fca8f4496a[4])
         + var3 * Math.pow(var1 - doubles1770e99df65a3a9eae04d8fca8f4496a[5], doubles1770e99df65a3a9eae04d8fca8f4496a[6]);
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, -81, -25, 48, -119, 124, -38, -99}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
