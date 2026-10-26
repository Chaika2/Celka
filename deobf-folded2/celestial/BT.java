package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BT {
   private static byte[] bytes10e8ecd1ac80321e9230ae9a938c7436;
   public static Object[] staticFields10e8ecd1ac80321e9230ae9a938c7436;
   private static short[] shorts10e8ecd1ac80321e9230ae9a938c7436;
   private static String[] strings10e8ecd1ac80321e9230ae9a938c7436;
   private static boolean[] booleans10e8ecd1ac80321e9230ae9a938c7436;

   private static void id_byte() {
      booleans10e8ecd1ac80321e9230ae9a938c7436 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1282482599896609957L;
   }

   private static void id_class() {
      Object[] var0 = new Object[]{new BT(), new BT(), null};
      var0[2] = new BT[]{(BT)var0[0], (BT)var0[1]};
      staticFields10e8ecd1ac80321e9230ae9a938c7436 = var0;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -122, -103, 12, 53, -78, 24, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1226512219;
   }

   private static void id_break() {
      strings10e8ecd1ac80321e9230ae9a938c7436 = new String[]{new String("ADD"), new String("REMOVE")};
   }

   private static void id_throws() {
      bytes10e8ecd1ac80321e9230ae9a938c7436 = new byte[]{2, 2, 3};
   }

   private static void id_case() {
      shorts10e8ecd1ac80321e9230ae9a938c7436 = new short[]{2, 0, 1};
   }
}
