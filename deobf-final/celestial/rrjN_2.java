package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjN_2 {
   private static byte[] break_;
   public static Object[] class_;
   private static boolean[] byte_;
   private static float[] protected_;

   private static void byte_() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F};
      class_ = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 2, -96, -79, -73, 104, -8, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2021658922;
   }

   private static void class_() {
      break_ = new byte[]{3, 2};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8003124734061408807L;
   }

   private static void break_() {
      protected_ = new float[]{14.0F, 5.0F, 5.0F};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true};
   }
}
