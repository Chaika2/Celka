package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrTt_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{1, 2}, new int[]{1, 0, 2, 0}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      break_ = new byte[]{2, 2, 2, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6139702088001488974L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -307797499;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -46, -41, -31, -92, 106, -11, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{true, true, false, true, true, false, false, false, true, false, true};
   }
}
