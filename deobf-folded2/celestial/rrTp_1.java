package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrTp_1 {
   private static short[] shorts0bf0cd3d5fc6358ba8402b11be019aa4;
   private static byte[] bytes0bf0cd3d5fc6358ba8402b11be019aa4;
   public static Object[] staticFields0bf0cd3d5fc6358ba8402b11be019aa4;
   private static boolean[] booleans0bf0cd3d5fc6358ba8402b11be019aa4;
   private static String[] strings0bf0cd3d5fc6358ba8402b11be019aa4;

   private static void id_byte() {
      shorts0bf0cd3d5fc6358ba8402b11be019aa4 = new short[]{4, 0, 1, 2, 3};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7987497904756116954L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1196031454;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 61, 33, -30, 34, -1, -117, -83}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      bytes0bf0cd3d5fc6358ba8402b11be019aa4 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void id_break() {
      strings0bf0cd3d5fc6358ba8402b11be019aa4 = new String[]{new String("SILENT"), new String("STRICT"), new String("TARGET"), new String("NONE")};
   }

   private static void id_throws() {
      Object[] var0 = new Object[]{new rrTp_1(), new rrTp_1(), new rrTp_1(), new rrTp_1(), null};
      var0[4] = new rrTp_1[]{(rrTp_1)var0[0], (rrTp_1)var0[1], (rrTp_1)var0[2], (rrTp_1)var0[3]};
      staticFields0bf0cd3d5fc6358ba8402b11be019aa4 = var0;
   }

   private static void id_case() {
      booleans0bf0cd3d5fc6358ba8402b11be019aa4 = new boolean[]{false, true, false, false, true, true};
   }
}
