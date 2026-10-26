package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class z_1 extends u_1 {
   private static boolean[] class_;
   private static String[] break_;

   public z_1(Class<?> var1) {
      super(String.format("Не удалось найти обработчик для типа %s", var1.getSimpleName()));
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4595137259962530463L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -394156261;
   }

   private static void class_() {
      class_ = new boolean[]{true, false};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -79, -14, -1, 10, -127, 48, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{new String("Не удалось найти обработчик для типа %s")};
   }
}
