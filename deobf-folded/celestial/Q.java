package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Q extends J {
   private static boolean[] id_class;
   private static String[] id_break;

   public Q(int var1) {
      String var10001 = id_break[0];
      Object[] var10002 = new Object[1];
      var10002[id_class[1]] = var1;
      super(String.format(var10001, var10002));
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      id_class = new boolean[]{true, false};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7832099191527725100L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 227728920;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, 77, -102, 54, -92, -96, 3, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new String[]{new String("Недостаточно аргументов (минимум %d)")};
   }
}
