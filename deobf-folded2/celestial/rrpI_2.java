package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpI_2 {
   private static short[] shorts9e44efdcc167316f82dd237e58019786;
   private static byte[] bytes9e44efdcc167316f82dd237e58019786;
   public static Object[] staticFields9e44efdcc167316f82dd237e58019786;
   private static String[] strings9e44efdcc167316f82dd237e58019786;
   private static boolean[] booleans9e44efdcc167316f82dd237e58019786;

   private static void id_byte() {
      strings9e44efdcc167316f82dd237e58019786 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -63837505574010380L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-26, -47, -12, 59, -115, 59, -12, 51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      bytes9e44efdcc167316f82dd237e58019786 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -6144132;
   }

   private static void id_break() {
      Object[] var0 = new Object[]{new rrpI_2(), new rrpI_2(), new rrpI_2(), null};
      var0[3] = new rrpI_2[]{(rrpI_2)var0[0], (rrpI_2)var0[1], (rrpI_2)var0[2]};
      staticFields9e44efdcc167316f82dd237e58019786 = var0;
   }

   private static void id_case() {
      booleans9e44efdcc167316f82dd237e58019786 = new boolean[]{false, true, false, false, true, true};
   }

   private static void id_protected() {
      shorts9e44efdcc167316f82dd237e58019786 = new short[]{3, 0, 1, 2};
   }
}
