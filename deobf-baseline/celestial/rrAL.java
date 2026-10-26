package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAL {
   private static short[] id_break;
   public static Object[] id_class;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_break = new short[1];
   }

   static {
      ntfClinit();
   }

   public static rrAL id_class() {
      return (rrAL)id_class[id_break[0]];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1376189952;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1038448620056568892L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, 90, 121, -45, 2, 77, 40, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_byte = new boolean[]{false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAL()};
      id_class = var0;
   }
}
