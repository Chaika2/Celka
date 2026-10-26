package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryZ extends rryv_1 {
   private static short[] id_class;

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3989768461437279331L;
   }

   @Override
   public rryF id_class() {
      return (rryF)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1187148576;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, -13, 68, -37, -95, 103, 81, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_class = new short[]{1};
   }
}
