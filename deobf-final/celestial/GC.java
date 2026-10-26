package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class GC {
   private static boolean[] break_;
   public static Object[] class_;
   private static byte[] byte_;

   private static void byte_() {
      break_ = new boolean[]{false, false, true, true, false, false, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 95, -8, -21, 2, -62, 78, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -62557972;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new int[]{0, 1, 2, 3}};
      class_ = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 632242240576311135L;
   }

   private static void break_() {
      byte_ = new byte[]{2, 2, 3, 3};
   }
}
