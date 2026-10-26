package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrpX_2 {
   private static byte[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      Object[] var0 = new Object[]{new int[]{0, 2, 1}};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_byte = new boolean[]{false, false, true, false, true, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -95, 107, -128, 98, -109, 88, -88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1802395835;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -443276468267419937L;
   }

   private static void id_break() {
      id_break = new byte[]{2, 2};
   }
}
