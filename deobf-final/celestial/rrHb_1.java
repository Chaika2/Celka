package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrHb_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{3, 0, 0}, new int[]{3, 0, 0}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8096583210003179728L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1017422598;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{20, 105, -59, -24, -103, 0, -30, 18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      byte_ = new boolean[]{true, true, false, true, true, true, true, false, false, false, true, false, true, false};
   }

   private static void break_() {
      break_ = new byte[]{2, 2, 3, 2, 2, 3, 2};
   }
}
