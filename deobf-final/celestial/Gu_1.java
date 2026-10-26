package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Gu_1 {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{2, 1, 3, 4, 6, 5}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-8, 110, -83, 61, -63, 15, -79, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2102111127;
   }

   private static void class_() {
      byte_ = new byte[]{2, 3, 4, 5, 6};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6720525672491228834L;
   }

   private static void break_() {
      break_ = new boolean[]{false, false, true, false, false, false, false, false, true};
   }
}
