package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrpK_2 {
   public static Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new byte[]{2, 2};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{3, -106, 53, 36, 75, 51, 36, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_byte = new boolean[]{false, false, true, false, true, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2568291040832307412L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 532014288;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new int[]{0, 2, 1}};
      id_class = var0;
   }
}
