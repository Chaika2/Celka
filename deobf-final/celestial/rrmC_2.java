package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmC_2 implements rruq_1 {
   private static short[] class_;

   rrmC_2() {
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2145080445;
   }

   @Override
   public void class_(C_static var1) {
      ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[0]).break_();
   }

   private static void class_() {
      class_ = new short[1];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5664534681022995444L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{96, 110, -55, 19, 21, 105, -12, -41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
