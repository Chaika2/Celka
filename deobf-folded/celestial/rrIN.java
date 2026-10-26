package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIN {
   private static byte[] bytes6143465a63de38df9c2f3f3e8f0ab649;
   private static String[] strings6143465a63de38df9c2f3f3e8f0ab649;
   private static short[] shorts6143465a63de38df9c2f3f3e8f0ab649;
   private static boolean[] booleans6143465a63de38df9c2f3f3e8f0ab649;
   public static Object[] staticFields6143465a63de38df9c2f3f3e8f0ab649;

   private static void id_byte() {
      shorts6143465a63de38df9c2f3f3e8f0ab649 = new short[]{2, 0, 1};
   }

   static {
      ntfClinit();
   }

   private static void id_class() {
      strings6143465a63de38df9c2f3f3e8f0ab649 = new String[]{new String("LIST"), new String("BOX")};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7554358469231309770L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1465519985;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -60, -48, -13, -61, 53, -96, 3}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrIN(), new rrIN(), null};
      var0[2] = new rrIN[]{(rrIN)var0[0], (rrIN)var0[1]};
      staticFields6143465a63de38df9c2f3f3e8f0ab649 = var0;
   }

   private static void id_case() {
      bytes6143465a63de38df9c2f3f3e8f0ab649 = new byte[]{2, 2, 3};
   }

   private static void id_protected() {
      booleans6143465a63de38df9c2f3f3e8f0ab649 = new boolean[]{false, true, false, false, true, true};
   }
}
