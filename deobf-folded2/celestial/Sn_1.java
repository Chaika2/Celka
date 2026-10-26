package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class Sn_1 {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      Object[] var0 = new Object[]{new int[]{1, 0, 2, 0, 3, 0, 4, 0, 0, 0}};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-46, 28, -64, -23, 41, -81, -85, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7581968040344976970L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1937808925;
   }

   private static void id_class() {
      id_break = new boolean[]{false, false, false, true, false, false, false, true};
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2, 4, 3, 6, 4};
   }
}
