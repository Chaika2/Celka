package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Eh_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      break_ = new byte[]{2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1216401921722348702L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{0, 0, 3, 4, 2, 1}};
      class_ = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-115, 69, 104, 126, 98, 48, 116, 101}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 645255049;
   }

   private static void break_() {
      byte_ = new boolean[]{false, false, true, false, false, false, true};
   }
}
