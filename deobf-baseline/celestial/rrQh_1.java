package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrQh_1 {
   public static Object[] id_class;
   private static byte[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, true, false, false, false, false, false, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1575474308;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5637888190163418064L;
   }

   private static void id_class() {
      id_break = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -76, -113, 95, 34, -26, 77, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}};
      id_class = var0;
   }
}
