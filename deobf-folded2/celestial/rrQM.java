package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrQM {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{12, 13, 2, 14, 3};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -292998623;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2280729279396737142L;
   }

   private static void id_class() {
      id_break = new boolean[]{false, false, true, false, false, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-6, -110, 53, -114, -99, -51, -100, -16}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3}};
      id_class = var0;
   }
}
