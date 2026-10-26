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

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1617021854;
   }

   @Override
   public double id_class(double var1) {
      return doubles926ed2443b7d3c18a628aaa6cd7f0440[0]
         - (doubles926ed2443b7d3c18a628aaa6cd7f0440[1] - var1) * (doubles926ed2443b7d3c18a628aaa6cd7f0440[2] - var1);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8247936835610453974L;
   }

   private static void id_class() {
      doubles926ed2443b7d3c18a628aaa6cd7f0440 = new double[]{1.0, 1.0, 1.0};
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -15, 30, 56, -37, -76, 102, 121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
