package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class z_1 extends u_1 {
   private static boolean[] id_class;
   private static String[] id_break;

   public z_1(Class<?> var1) {
      String var10001 = id_break[0];
      Object[] var10002 = new Object[id_class[0]];
      var10002[id_class[1]] = var1.getSimpleName();
      super(String.format(var10001, var10002));
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4595137259962530463L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -394156261;
   }

   private static void id_class() {
      id_class = new boolean[]{true, false};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-24, -79, -14, -1, 10, -127, 48, -67}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      id_break = new String[]{new String("Не удалось найти обработчик для типа %s")};
   }
}
