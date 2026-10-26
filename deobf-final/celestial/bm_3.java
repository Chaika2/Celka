package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum bm_3 {
   ;
   public static Object[] staticFields25d9569e4235359b81fd7f84865d53c7;
   private static String[] strings25d9569e4235359b81fd7f84865d53c7;
   private static byte[] bytes25d9569e4235359b81fd7f84865d53c7;
   private static boolean[] booleans25d9569e4235359b81fd7f84865d53c7;
   private static short[] shorts25d9569e4235359b81fd7f84865d53c7;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8623092471877123977L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-128, 65, -91, -117, -103, 34, -115, -89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1792724095;
   }

   private static void class_() {
      bytes25d9569e4235359b81fd7f84865d53c7 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new bm_3(), new bm_3(), new bm_3(), null};
      var0[3] = new bm_3[]{(bm_3)var0[0], (bm_3)var0[1], (bm_3)var0[2]};
      staticFields25d9569e4235359b81fd7f84865d53c7 = var0;
   }

   private static void throws_() {
      strings25d9569e4235359b81fd7f84865d53c7 = new String[]{new String("SELECTED_IN_HOTBAR"), new String("SELECTED_IN_INVENTORY"), new String("NOT_SELECTED")};
   }

   private static void case_() {
      shorts25d9569e4235359b81fd7f84865d53c7 = new short[]{3, 0, 1, 2};
   }

   private static void protected_() {
      booleans25d9569e4235359b81fd7f84865d53c7 = new boolean[]{false, true, false, false, true, true};
   }
}
