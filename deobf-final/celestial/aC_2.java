package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class aC_2 {
   public static Object[] class_;
   private static boolean[] break_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new boolean[]{true, true, true, true, false, false, true, false, false};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1691285658;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, 28, -25, 16, -76, -113, -9, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{0, 3, 1, 2}, new int[]{0, 1, 2}};
      class_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -9093594012728571444L;
   }

   private static void break_() {
      byte_ = new byte[]{2, 2, 3, 2};
   }
}
