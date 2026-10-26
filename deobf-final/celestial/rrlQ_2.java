package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrlQ_2 {
   private static byte[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new byte[]{2, 4, 2, 6, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4783164976080382359L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -407851540;
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, true, false, false, false, false, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{110, -6, -116, 107, -16, -98, -116, 13}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{4, 0, 1, 0, 2, 0, 3, 0, 0, 0}};
      class_ = var0;
   }
}
