package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrHW {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{false, false, true, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2352652829199941905L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 876191524;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{36, 49, -122, -117, 84, -99, -19, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{2, 1, 3}};
      id_class = var0;
   }

   private static void id_break() {
      id_byte = new byte[]{2, 3};
   }
}
