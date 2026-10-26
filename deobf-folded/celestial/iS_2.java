package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class iS_2 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      Object[] var0 = new Object[]{new int[]{1, 2}, new int[]{1, 2, 5, 6, 4, 3}};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 90577106;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{54, 85, 120, -12, -47, -18, -8, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -813893099319026592L;
   }

   private static void id_class() {
      id_break = new byte[]{2, 3, 4, 5, 6, 2, 2};
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, true, true, true, true, true, true, false, false, true, false};
   }
}
