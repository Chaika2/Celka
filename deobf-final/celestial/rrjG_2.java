package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjG_2 {
   private static float[] break_;
   private static boolean[] byte_;
   public static Object[] class_;
   private static byte[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, 78, -37, 2, -127, 43, -76, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -475461164;
   }

   private static void class_() {
      break_ = new float[]{60.0F, 30.0F, 20.0F};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6107506688606637503L;
   }

   private static void break_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      protected_ = new byte[]{3, 2};
   }
}
