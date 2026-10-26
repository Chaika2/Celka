package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// $VF: synthetic class
public class bK_2 {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static byte[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{false, false, true, true, false, false, false, false, false, true};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 606768286;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5455090979143911153L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 13, -10, 97, -98, -53, -124, -22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new int[]{5, 1, 2, 4, 3, 0}};
      id_class = var0;
   }

   private static void id_break() {
      id_byte = new byte[]{2, 2, 4, 3, 3, 4, 5};
   }
}
