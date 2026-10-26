package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrQG {
   public static Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new byte[]{2, 3};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1719071169264739535L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3}};
      id_class = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-3, 20, -70, 35, 81, 85, 25, -39}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1762098471;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, false, true, false, false, true};
   }
}
