package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrts_3 {
   private static byte[] bytes7f20647f48ec3d8aae2ee5813ea8ad96;
   private static boolean[] booleans7f20647f48ec3d8aae2ee5813ea8ad96;
   private static short[] shorts7f20647f48ec3d8aae2ee5813ea8ad96;
   private static String[] strings7f20647f48ec3d8aae2ee5813ea8ad96;
   public static Object[] staticFields7f20647f48ec3d8aae2ee5813ea8ad96;

   private static void id_byte() {
      bytes7f20647f48ec3d8aae2ee5813ea8ad96 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 2100326748675466525L;
   }

   private static void id_class() {
      shorts7f20647f48ec3d8aae2ee5813ea8ad96 = new short[]{3, 0, 1, 2};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1926607148;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{18, -55, 14, 104, 70, 33, 97, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrts_3(), new rrts_3(), new rrts_3(), null};
      var0[3] = new rrts_3[]{(rrts_3)var0[0], (rrts_3)var0[1], (rrts_3)var0[2]};
      staticFields7f20647f48ec3d8aae2ee5813ea8ad96 = var0;
   }

   private static void id_throws() {
      booleans7f20647f48ec3d8aae2ee5813ea8ad96 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_case() {
      strings7f20647f48ec3d8aae2ee5813ea8ad96 = new String[]{new String("HAS"), new String("DOES_NOT_HAVE"), new String("FAILED_TO_CHECK")};
   }
}
