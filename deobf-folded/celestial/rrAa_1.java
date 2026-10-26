package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAa_1 extends Om_1 {
   public static Object[] id_class;
   private static short[] id_break;
   private static boolean[] id_byte;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{97, -60, 111, 13, 68, 116, 85, 52}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1707913142;
   }

   public static rrAa_1 id_class() {
      ((rrAa_1)id_class[id_break[0]]).id_class(id_byte[0]);
      return (rrAa_1)id_class[id_break[1]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 672976576429820623L;
   }

   private static void id_break() {
      id_break = new short[2];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrAa_1()};
      id_class = var0;
   }
}
