package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmD_2 implements rruq_1 {
   private static short[] class_;

   rrmD_2() {
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new short[1];
   }

   @Override
   public void class_(C_static var1) {
      ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[0]).byte_();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1440095553846746113L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{58, -60, -33, -68, 28, 104, -6, 64}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 201864958;
   }
}
