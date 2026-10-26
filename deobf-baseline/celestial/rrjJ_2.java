package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjJ_2 {
   public static Object[] id_class;
   private static byte[] id_break;
   private static float[] id_byte;
   private static boolean[] id_protected;

   private static void id_byte() {
      id_protected = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-23, 30, 87, -93, -96, -107, -49, -38}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -438735683;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7461464755461966970L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{0.0F, 0.0F, 0.0F};
      id_class = var0;
   }

   private static void id_break() {
      id_byte = new float[]{10.0F, 10.0F, 10.0F};
   }

   private static void id_protected() {
      id_break = new byte[]{3, 2};
   }
}
