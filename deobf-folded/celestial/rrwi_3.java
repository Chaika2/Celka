package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrwi_3 {
   private static boolean[] id_break;
   private static byte[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      Object[] var0 = new Object[]{new int[]{1, 2, 4, 3}};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2414022200071028188L;
   }

   private static void id_class() {
      id_byte = new byte[]{2, 3, 3, 2, 4};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1514302975;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-69, 64, 68, -16, 11, 39, 68, -86}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, false, true, false, true, false, false, true};
   }
}
