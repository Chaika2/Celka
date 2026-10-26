package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmM_2 implements rruq_1 {
   private static short[] class_;

   rrmM_2() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -78, -27, -125, -115, -17, -42, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).byte_(var1.extends_());
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1990173974;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7885480543686535863L;
   }

   private static void class_() {
      class_ = new short[1];
   }
}
