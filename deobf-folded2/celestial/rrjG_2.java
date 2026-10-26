package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjG_2 {
   private static float[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;
   private static byte[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, 78, -37, 2, -127, 43, -76, -79}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -475461164;
   }

   private static void id_class() {
      id_break = new float[]{60.0F, 30.0F, 20.0F};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6107506688606637503L;
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_protected() {
      id_protected = new byte[]{3, 2};
   }
}
