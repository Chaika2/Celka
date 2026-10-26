package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmM_2 implements rruq_1 {
   private static short[] id_class;

   rrmM_2() {
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{49, -78, -27, -125, -115, -17, -42, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(C_static var1) throws x_1 {
      ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_class[0]]).id_byte(var1.id_extends());
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1990173974;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7885480543686535863L;
   }

   private static void id_class() {
      id_class = new short[1];
   }
}
