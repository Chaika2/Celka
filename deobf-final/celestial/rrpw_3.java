package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrpw_3 {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;

   private static void byte_() {
      byte_ = new byte[]{2, 2};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1529517497;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 521910071438523864L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, -81, 115, -46, -34, 38, 119, 1}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      break_ = new boolean[]{false, false, true, false, true, true};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{0, 2, 1}};
      class_ = var0;
   }
}
