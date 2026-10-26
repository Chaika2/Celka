package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class c_1 extends J {
   private static String[] id_class;
   private static boolean[] id_break;

   public c_1(int var1) {
      String var10001 = id_class[0];
      Object[] var10002 = new Object[id_break[0]];
      var10002[id_break[1]] = var1;
      super(String.format(var10001, var10002));
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, -88, -37, 42, 13, -14, 60, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1778899091;
   }

   private static void id_class() {
      id_break = new boolean[]{true, false};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5831140920567688769L;
   }

   private static void id_break() {
      id_class = new String[]{new String("Слишком много аргументов (максимум %d)")};
   }
}
