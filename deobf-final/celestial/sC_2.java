package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class sC_2 {
   public static Object[] class_;
   private static byte[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new byte[]{2, 2, 3};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 420151471;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{22, 27, -41, 105, 40, 58, -76, -43}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9149514032378253486L;
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, false, true, false, true, false, true};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3}};
      class_ = var0;
   }
}
