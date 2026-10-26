package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GD extends EZ {
   private static double[] id_byte;

   private static void id_byte() {
      id_byte = new double[]{1.0};
   }

   public GD(Go_1 var1, boolean var2) {
      super(Go_1.id_class(var1), var2);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 793812354;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5986218359483006774L;
   }

   @Override
   public double id_break(int var1, int var2, int var3, xc_3 var4) {
      return id_byte[0];
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-2, 69, -116, -79, 103, 110, -61, 67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
