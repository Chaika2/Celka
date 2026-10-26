package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrZB {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      id_byte = new byte[]{2, 4, 2, 6, 3, 4, 9, 5, 8, 6, 7, 7, 8};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 959029964;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-45, -60, 6, -32, -37, -27, -120, 96}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{4, 7, 1, 0, 2, 0, 3, 8, 6, 5}};
      id_class = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4742266112343638950L;
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, true, false, false, false, false, false, false, false, true, false, true};
   }
}
