package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpS_2 {
   ;
   private static String[] stringsedb426333b473145b1f6515db5c3fcb9;
   private static byte[] bytesedb426333b473145b1f6515db5c3fcb9;
   private static short[] shortsedb426333b473145b1f6515db5c3fcb9;
   public static Object[] staticFieldsedb426333b473145b1f6515db5c3fcb9;
   private static boolean[] booleansedb426333b473145b1f6515db5c3fcb9;

   static {
      ntfClinit();
   }

   private static void class_() {
      bytesedb426333b473145b1f6515db5c3fcb9 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1120890931;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1405593695909393650L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-104, -46, 23, -19, 74, -39, 102, -33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      shortsedb426333b473145b1f6515db5c3fcb9 = new short[]{3, 0, 1, 2};
   }

   private static void throws_() {
      stringsedb426333b473145b1f6515db5c3fcb9 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rrpS_2(), new rrpS_2(), new rrpS_2(), null};
      var0[3] = new rrpS_2[]{(rrpS_2)var0[0], (rrpS_2)var0[1], (rrpS_2)var0[2]};
      staticFieldsedb426333b473145b1f6515db5c3fcb9 = var0;
   }

   private static void protected_() {
      booleansedb426333b473145b1f6515db5c3fcb9 = new boolean[]{false, true, false, false, true, true};
   }
}
