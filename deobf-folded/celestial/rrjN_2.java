package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjN_2 {
   private static byte[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;
   private static float[] id_protected;

   private static void id_byte() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 2, -96, -79, -73, 104, -8, 57}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2021658922;
   }

   private static void id_class() {
      id_break = new byte[]{3, 2};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8003124734061408807L;
   }

   private static void id_break() {
      id_protected = new float[]{14.0F, 5.0F, 5.0F};
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true};
   }
}
