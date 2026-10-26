package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed enum rrNr_1 {
   private static double[] doublesbffd289e7f4e3a1694c7105bb77b8007;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -26151620541436450L;
   }

   @Override
   public double id_class(double var1) {
      double var3 = doublesbffd289e7f4e3a1694c7105bb77b8007[0];
      return var1 == doublesbffd289e7f4e3a1694c7105bb77b8007[1]
         ? doublesbffd289e7f4e3a1694c7105bb77b8007[2]
         : (
            var1 == doublesbffd289e7f4e3a1694c7105bb77b8007[3]
               ? doublesbffd289e7f4e3a1694c7105bb77b8007[4]
               : Math.pow(doublesbffd289e7f4e3a1694c7105bb77b8007[5], doublesbffd289e7f4e3a1694c7105bb77b8007[6] * var1)
                     * Math.sin((var1 * doublesbffd289e7f4e3a1694c7105bb77b8007[7] - doublesbffd289e7f4e3a1694c7105bb77b8007[8]) * var3)
                  + doublesbffd289e7f4e3a1694c7105bb77b8007[9]
         );
   }

   private static void id_class() {
      doublesbffd289e7f4e3a1694c7105bb77b8007 = new double[]{Math.PI * 2.0 / 3.0, 0.0, 0.0, 1.0, 1.0, 2.0, -10.0, 10.0, 0.75, 1.0};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1404432068;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{55, 33, -99, -124, 54, 117, -107, -80}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
