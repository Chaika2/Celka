package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLM {
   private static boolean[] id_break;
   public static Object[] id_class;
   private static short[] id_byte;

   private static void id_byte() {
      id_byte = new short[1];
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2502056372693602039L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 888928185;
   }

   public static rrLM id_class() {
      return (rrLM)id_class[0];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, -30, -35, -88, 49, 15, 4, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new boolean[]{false, true};
   }

   private static void id_protected() {
      Object[] var0 = new Object[]{new rrLM()};
      id_class = var0;
   }
}
