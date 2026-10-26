package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rT_2 {
   private static boolean[] break_;
   private static byte[] byte_;
   public static Object[] class_;

   private static void byte_() {
      break_ = new boolean[]{false, false, true, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 942053695;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{120, 91, -127, -57, 125, 88, -40, -55}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8923878701585906223L;
   }

   private static void class_() {
      byte_ = new byte[]{2, 3};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3}};
      class_ = var0;
   }
}
