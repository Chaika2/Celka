package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmu_3 implements rruq_1 {
   private static short[] class_;

   rrmu_3() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3304869338717766898L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1764153746;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[0]).break_(var1.extends_());
   }

   private static void class_() {
      class_ = new short[1];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{107, -34, -3, -114, 53, -18, -39, 76}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
