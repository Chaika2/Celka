package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrNc_1 {
   public static Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{1, 2}, new int[]{1, 0, 0}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      byte_ = new byte[]{2, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-81, 57, 2, 67, 56, 0, -100, 20}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -48939556;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4471321301872902084L;
   }

   private static void break_() {
      break_ = new boolean[]{true, true, true, true, false, false, false, true, false, true};
   }
}
