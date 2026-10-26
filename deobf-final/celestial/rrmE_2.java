package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmE_2 implements rruq_1 {
   private static short[] class_;
   private static boolean[] break_;

   rrmE_2() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6349609010989811167L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1355688301;
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[0]).class_(new rrZk_1(var1.extends_()), true);
   }

   private static void class_() {
      break_ = new boolean[]{true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{30, -69, -92, -66, 47, 93, -62, -109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      class_ = new short[1];
   }
}
