package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrNB {
   private static double[] doublesea3adade77813ee18c7a28313b70454f;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1501024020;
   }

   private static void id_class() {
      doublesea3adade77813ee18c7a28313b70454f = new double[]{Math.PI, 2.0};
   }

   @Override
   public double id_class(double var1) {
      return Math.sin(var1 * Math.PI / 2.0);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3927119342066165769L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-122, 75, 29, 5, 58, 9, 63, -104}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
