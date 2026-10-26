package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLY {
   private static short[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[1];
   }

   static {
      ntfClinit();
   }

   public static rrLY class_() {
      return (rrLY)class_[0];
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1483708638843295188L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{72, 57, 57, -39, 21, -111, 27, -44}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1719929989;
   }

   private static void break_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLY()};
      class_ = var0;
   }
}
