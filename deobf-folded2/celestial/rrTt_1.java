package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrTt_1 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      Object[] var0 = new Object[]{new int[]{1, 2}, new int[]{1, 0, 2, 0}};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_break = new byte[]{2, 2, 2, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6139702088001488974L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -307797499;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{78, -46, -41, -31, -92, 106, -11, 8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, false, true, true, false, false, false, true, false, true};
   }
}
