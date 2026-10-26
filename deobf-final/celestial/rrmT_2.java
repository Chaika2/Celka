package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmT_2 implements rruq_1 {
   private static short[] class_;

   rrmT_2() {
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 3247327979811826759L;
   }

   private static void class_() {
      class_ = new short[1];
   }

   @Override
   public void class_(C_static var1) {
      ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[0]).protected_();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-50, 113, 48, -100, -113, 56, 75, -82}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -725678311;
   }
}
