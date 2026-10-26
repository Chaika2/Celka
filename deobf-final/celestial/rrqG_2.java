package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrqG_2 {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;

   private static void byte_() {
      byte_ = new byte[]{3, 2, 2, 3, 4, 4, 5};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 9140424244698590433L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1631636397;
   }

   private static void class_() {
      break_ = new boolean[]{false, false, true, true, false, false, false, false, false, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{122, 115, -39, 110, 107, -37, -39, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{4, 1, 3, 2, 5, 0}};
      class_ = var0;
   }
}
