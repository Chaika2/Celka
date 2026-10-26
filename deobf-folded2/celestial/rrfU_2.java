package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrfU_2 {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_byte = new byte[]{2, 3, 4, 5, 6};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4574331824900675708L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-41, -50, -123, 46, 71, -39, 74, -116}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{1, 2, 3, 4, 5, 6}};
      id_class = var0;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 276650184;
   }

   private static void id_break() {
      id_break = new boolean[]{false, false, true, false, false, false, false, false, true};
   }
}
