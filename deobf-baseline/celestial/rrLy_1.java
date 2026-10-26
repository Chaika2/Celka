package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrLy_1 {
   private static boolean[] booleans4117bd257b2839b395dedb8ac6b8a087;
   private static String[] strings4117bd257b2839b395dedb8ac6b8a087;
   private static byte[] bytes4117bd257b2839b395dedb8ac6b8a087;
   public static Object[] staticFields4117bd257b2839b395dedb8ac6b8a087;
   private static short[] shorts4117bd257b2839b395dedb8ac6b8a087;

   private static void id_byte() {
      strings4117bd257b2839b395dedb8ac6b8a087 = new String[]{new String("PRE"), new String("POST")};
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2044264958;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1714641076253121276L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-5, -23, 49, 5, -3, -8, 98, -24}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrLy_1(), new rrLy_1(), null};
      var0[2] = new rrLy_1[]{(rrLy_1)var0[0], (rrLy_1)var0[1]};
      staticFields4117bd257b2839b395dedb8ac6b8a087 = var0;
   }

   private static void id_throws() {
      shorts4117bd257b2839b395dedb8ac6b8a087 = new short[]{2, 0, 1};
   }

   private static void id_case() {
      booleans4117bd257b2839b395dedb8ac6b8a087 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      bytes4117bd257b2839b395dedb8ac6b8a087 = new byte[]{2, 2, 3};
   }
}
