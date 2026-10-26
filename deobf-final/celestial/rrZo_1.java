package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZo_1 implements rrwr_3 {
   private static boolean[] class_;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -389847393;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8475878101779480026L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, -91, 20, -108, -65, 92, 7, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new boolean[]{true};
   }

   @Override
   public rrtU_2 break_(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 < class_[0]) {
            return rrtU_2.class_(rgF_2.RED + "Слишком маленькая цена");
         }
      } catch (Exception var3) {
         return rrtU_2.class_(rgF_2.RED + "Слишком большая цена");
      }

      return rrtU_2.class_();
   }
}
