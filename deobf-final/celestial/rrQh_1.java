package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrQh_1 {
   public static Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, true, false, false, false, false, false, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1575474308;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5637888190163418064L;
   }

   private static void class_() {
      break_ = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -76, -113, 95, 34, -26, 77, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}};
      class_ = var0;
   }
}
