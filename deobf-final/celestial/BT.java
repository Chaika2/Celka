package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum BT {
   ;
   private static byte[] bytes10e8ecd1ac80321e9230ae9a938c7436;
   public static Object[] staticFields10e8ecd1ac80321e9230ae9a938c7436;
   private static short[] shorts10e8ecd1ac80321e9230ae9a938c7436;
   private static String[] strings10e8ecd1ac80321e9230ae9a938c7436;
   private static boolean[] booleans10e8ecd1ac80321e9230ae9a938c7436;

   private static void byte_() {
      booleans10e8ecd1ac80321e9230ae9a938c7436 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1282482599896609957L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{new BT(), new BT(), null};
      var0[2] = new BT[]{(BT)var0[0], (BT)var0[1]};
      staticFields10e8ecd1ac80321e9230ae9a938c7436 = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-67, -122, -103, 12, 53, -78, 24, -75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1226512219;
   }

   private static void break_() {
      strings10e8ecd1ac80321e9230ae9a938c7436 = new String[]{new String("ADD"), new String("REMOVE")};
   }

   private static void throws_() {
      bytes10e8ecd1ac80321e9230ae9a938c7436 = new byte[]{2, 2, 3};
   }

   private static void case_() {
      shorts10e8ecd1ac80321e9230ae9a938c7436 = new short[]{2, 0, 1};
   }
}
