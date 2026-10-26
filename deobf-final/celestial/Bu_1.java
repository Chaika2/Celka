package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Bu_1 {
   private static byte[] break_;
   private static boolean[] byte_;
   public static Object[] class_;

   private static void byte_() {
      Object[] var0 = new Object[]{new int[]{2, 0, 1, 3, 0, 0, 0, 0, 0, 0}};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8956455369542015484L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 41, 57, -116, 57, -68, -69, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -238961064;
   }

   private static void class_() {
      byte_ = new boolean[]{false, false, true, false, false, false, true};
   }

   private static void break_() {
      break_ = new byte[]{2, 2, 3, 3};
   }
}
