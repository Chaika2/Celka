package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjd_3 {
   private static String[] id_break;
   private static boolean[] id_byte;
   public static Object[] id_class;

   private static void id_byte() {
      Object[] var0 = new Object[]{"spooky-item"};
      id_class = var0;
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_byte = new boolean[]{true, false};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8407336944193360114L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1698478852;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-126, 10, 93, 50, 92, 22, 89, -11}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new String[]{new String("spooky-item")};
   }
}
