package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrnX_2 {
   private static boolean[] booleans1e73a3d9163a3242ac9ccbcc36d981ca;
   public static Object[] staticFields1e73a3d9163a3242ac9ccbcc36d981ca;
   private static String[] strings1e73a3d9163a3242ac9ccbcc36d981ca;
   private static short[] shorts1e73a3d9163a3242ac9ccbcc36d981ca;
   private static byte[] bytes1e73a3d9163a3242ac9ccbcc36d981ca;

   private static void id_byte() {
      shorts1e73a3d9163a3242ac9ccbcc36d981ca = new short[]{3, 0, 1, 2};
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, 23, 45, 41, 4, 123, 25, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -521924488071415680L;
   }

   private static void id_class() {
      bytes1e73a3d9163a3242ac9ccbcc36d981ca = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1454782876;
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrnX_2(), new rrnX_2(), new rrnX_2(), null};
      var0[3] = new rrnX_2[]{(rrnX_2)var0[0], (rrnX_2)var0[1], (rrnX_2)var0[2]};
      staticFields1e73a3d9163a3242ac9ccbcc36d981ca = var0;
   }

   private static void id_case() {
      strings1e73a3d9163a3242ac9ccbcc36d981ca = new String[]{new String("FALL"), new String("ARROW"), new String("ENDER_PEARL")};
   }

   private static void id_protected() {
      booleans1e73a3d9163a3242ac9ccbcc36d981ca = new boolean[]{false, true, false, false, true, true};
   }
}
