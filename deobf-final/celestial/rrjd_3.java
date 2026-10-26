package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjd_3 {
   private static String[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      Object[] var0 = new Object[]{"spooky-item"};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      byte_ = new boolean[]{true, false};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8407336944193360114L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1698478852;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 10, 93, 50, 92, 22, 89, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{new String("spooky-item")};
   }
}
