package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruS {
   private static boolean[] id_break;
   public static Object[] id_class;

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, 86, -121, -33, 70, 63, 88, -8}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new boolean[]{false, true};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -80469538262646936L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1622487793;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rruE()};
      id_class = var0;
   }
}
