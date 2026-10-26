package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum V {
   private static String[] strings30e1cd8580ce39faa61be3646b7cc079;
   private static byte[] bytes30e1cd8580ce39faa61be3646b7cc079;
   private static boolean[] booleans30e1cd8580ce39faa61be3646b7cc079;
   private static short[] shorts30e1cd8580ce39faa61be3646b7cc079;
   public static Object[] staticFields30e1cd8580ce39faa61be3646b7cc079;

   private static void id_byte() {
      shorts30e1cd8580ce39faa61be3646b7cc079 = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 77385633;
   }

   private static void id_class() {
      booleans30e1cd8580ce39faa61be3646b7cc079 = new boolean[]{false, true, false, false, true, true};
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-60, -123, -90, -82, 15, 18, 83, 103}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7570337554403581127L;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new V(), new V(), null};
      var0[2] = new V[]{(V)var0[0], (V)var0[1]};
      staticFields30e1cd8580ce39faa61be3646b7cc079 = var0;
   }

   private static void id_case() {
      strings30e1cd8580ce39faa61be3646b7cc079 = new String[]{new String("IN"), new String("OUT")};
   }

   private static void id_protected() {
      bytes30e1cd8580ce39faa61be3646b7cc079 = new byte[]{2, 2, 3};
   }
}
