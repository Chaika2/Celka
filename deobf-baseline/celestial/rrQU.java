package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrQU {
   private static double[] doublese59d3ce919893f2d9b520c562d76fecb;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3278919142390232763L;
   }

   private static void id_class() {
      doublese59d3ce919893f2d9b520c562d76fecb = new double[]{1.0, 1.0, 2.0};
   }

   @Override
   public double id_class(double var1) {
      return Math.sqrt(
         doublese59d3ce919893f2d9b520c562d76fecb[0] - Math.pow(var1 - doublese59d3ce919893f2d9b520c562d76fecb[1], doublese59d3ce919893f2d9b520c562d76fecb[2])
      );
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 237672089;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, 30, -4, 110, 81, 18, -58, 4}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
