package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrAP extends rrLi_1 {
   private static boolean[] id_break;
   public static Object[] id_class;

   private static void id_byte() {
      id_break = new boolean[]{false, true};
   }

   private rrAP() {
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8114015763349972422L;
   }

   private static int id_break(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 342189048;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrAP()};
      id_class = var0;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -76, -97, 119, 61, -91, 96, -115}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }
}
