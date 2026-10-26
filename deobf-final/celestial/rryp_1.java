package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryp_1 {
   ;
   private static boolean[] booleans1677081b7d6b3f3aa7e7dec6b87c7532;
   private static short[] shorts1677081b7d6b3f3aa7e7dec6b87c7532;
   public static Object[] staticFields1677081b7d6b3f3aa7e7dec6b87c7532;
   private static byte[] bytes1677081b7d6b3f3aa7e7dec6b87c7532;
   private static String[] strings1677081b7d6b3f3aa7e7dec6b87c7532;

   private static void byte_() {
      booleans1677081b7d6b3f3aa7e7dec6b87c7532 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{5, 8, -9, 18, -55, 29, 37, 77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7156559208450279245L;
   }

   private static void class_() {
      shorts1677081b7d6b3f3aa7e7dec6b87c7532 = new short[]{3, 0, 1, 2};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -113452704;
   }

   private static void break_() {
      bytes1677081b7d6b3f3aa7e7dec6b87c7532 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void case_() {
      strings1677081b7d6b3f3aa7e7dec6b87c7532 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rryp_1(), new rryp_1(), new rryp_1(), null};
      var0[3] = new rryp_1[]{(rryp_1)var0[0], (rryp_1)var0[1], (rryp_1)var0[2]};
      staticFields1677081b7d6b3f3aa7e7dec6b87c7532 = var0;
   }
}
