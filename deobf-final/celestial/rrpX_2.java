package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrpX_2 {
   private static byte[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{0, 2, 1}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, true, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -95, 107, -128, 98, -109, 88, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1802395835;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -443276468267419937L;
   }

   private static void break_() {
      break_ = new byte[]{2, 2};
   }
}
