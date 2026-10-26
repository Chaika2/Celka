package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZo_1 implements rrwr_3 {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -389847393;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8475878101779480026L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{27, -91, 20, -108, -65, 92, 7, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new boolean[]{true};
   }

   @Override
   public rrtU_2 id_break(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         if (var2 < 1) {
            return rrtU_2.id_class(rgF_2.RED + "Слишком маленькая цена");
         }
      } catch (Exception var3) {
         return rrtU_2.id_class(rgF_2.RED + "Слишком большая цена");
      }

      return rrtU_2.id_class();
   }
}
