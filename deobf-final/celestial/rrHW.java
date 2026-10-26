package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrHW {
   public static Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new boolean[]{false, false, true, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2352652829199941905L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 876191524;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 49, -122, -117, 84, -99, -19, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{2, 1, 3}};
      class_ = var0;
   }

   private static void break_() {
      byte_ = new byte[]{2, 3};
   }
}
