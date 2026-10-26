package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmN_2 implements rruq_1 {
   private static short[] id_class;

   rrmN_2() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -984864323043438469L;
   }

   @Override
   public void id_class(C_static var1) {
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).id_break();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2139185475;
   }

   private static void id_class() {
      id_class = new short[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-11, 14, -122, 89, 87, -118, -27, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
