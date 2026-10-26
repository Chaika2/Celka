package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Qo_1 {
   private static boolean[] break_;
   public static Object[] class_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, true, true, true, true, true, true, false, false, true, false, false};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1741785073276321026L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -742922729;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-28, -68, -26, -123, -23, -64, -91, 90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{0, 3, 2, 1}, new int[]{0, 2, 1, 3, 0, 4, 5}};
      class_ = var0;
   }

   private static void break_() {
      byte_ = new byte[]{2, 3, 4, 5, 2, 3, 2};
   }
}
