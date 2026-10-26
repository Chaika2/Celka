package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrqj_3 {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;

   private static void byte_() {
      byte_ = new byte[]{2, 2, 2};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-109, 39, 64, -119, -117, -76, -77, 62}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{2, 1}, new int[]{1, 2}};
      class_ = var0;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 620592528;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1187803043444551201L;
   }

   private static void break_() {
      break_ = new boolean[]{true, true, false, true, true, true, false, false, true, false};
   }
}
