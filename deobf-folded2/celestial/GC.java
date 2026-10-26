package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class GC {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{false, false, true, true, false, false, true};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-121, 95, -8, -21, 2, -62, 78, 34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -62557972;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{0, 1, 2, 3}};
      id_class = var0;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 632242240576311135L;
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2, 3, 3};
   }
}
