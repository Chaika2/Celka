package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class rrHj_1 {
   private static byte[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new byte[]{2};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{62, -126, -101, -16, 77, 65, 21, 123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1449053739;
   }

   private static void id_class() {
      id_byte = new boolean[]{false, false, false, true, false, true, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8276602110120402060L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new int[]{1, 2}};
      id_class = var0;
   }
}
