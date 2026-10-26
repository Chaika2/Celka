package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAy_1 {
   public static Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;

   private static void id_byte() {
      id_break = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7218331034881281617L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1834038104;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 69, -38, -121, 32, 15, -127, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAy_1 id_class() {
      return (rrAy_1)id_class[0];
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrAy_1()};
      id_class = var0;
   }

   private static void id_protected() {
      id_byte = new short[1];
   }
}
