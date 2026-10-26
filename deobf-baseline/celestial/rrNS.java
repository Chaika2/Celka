package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrNS {
   private static double[] doublesc5ad3b1a90063f789e1c064d7c8ca40c;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7064740063409706545L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1776763626;
   }

   private static void id_class() {
      doublesc5ad3b1a90063f789e1c064d7c8ca40c = new double[]{Math.PI, 0.2F, 2.5, 1.0, 2.2F, 1.0, 1.2F, 1.0};
   }

   @Override
   public double id_class(double var1) {
      return (
            Math.sin(
                     var1
                        * doublesc5ad3b1a90063f789e1c064d7c8ca40c[0]
                        * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[1] + doublesc5ad3b1a90063f789e1c064d7c8ca40c[2] * var1 * var1 * var1)
                  )
                  * Math.pow(doublesc5ad3b1a90063f789e1c064d7c8ca40c[3] - var1, doublesc5ad3b1a90063f789e1c064d7c8ca40c[4])
               + var1
         )
         * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[5] + doublesc5ad3b1a90063f789e1c064d7c8ca40c[6] * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[7] - var1));
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{125, 94, 78, 111, 119, -80, -24, -98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
