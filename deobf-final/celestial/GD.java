package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GD extends EZ {
   private static double[] byte_;

   private static void byte_() {
      byte_ = new double[]{1.0};
   }

   public GD(Go_1 var1, boolean var2) {
      super(Go_1.class_(var1), var2);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 793812354;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5986218359483006774L;
   }

   @Override
   public double break_(int var1, int var2, int var3, xc_3 var4) {
      return 1.0;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 69, -116, -79, 103, 110, -61, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
