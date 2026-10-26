package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Sn_1 {
   private static boolean[] break_;
   public static Object[] class_;
   private static byte[] byte_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{1, 0, 2, 0, 3, 0, 4, 0, 0, 0}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 28, -64, -23, 41, -81, -85, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7581968040344976970L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1937808925;
   }

   private static void class_() {
      break_ = new boolean[]{false, false, false, true, false, false, false, true};
   }

   private static void break_() {
      byte_ = new byte[]{2, 2, 4, 3, 6, 4};
   }
}
