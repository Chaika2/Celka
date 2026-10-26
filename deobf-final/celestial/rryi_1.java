package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryi_1 {
   ;
   private static byte[] bytescfae87556b8c3f6c9aa41bc5236996e9;
   private static String[] stringscfae87556b8c3f6c9aa41bc5236996e9;
   private static short[] shortscfae87556b8c3f6c9aa41bc5236996e9;
   public static Object[] staticFieldscfae87556b8c3f6c9aa41bc5236996e9;
   private static boolean[] booleanscfae87556b8c3f6c9aa41bc5236996e9;

   private static void byte_() {
      booleanscfae87556b8c3f6c9aa41bc5236996e9 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 462087565551387303L;
   }

   private static void class_() {
      shortscfae87556b8c3f6c9aa41bc5236996e9 = new short[]{3, 0, 1, 2};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{33, -7, 99, -119, 120, -42, 75, 17}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -323613607;
   }

   private static void break_() {
      stringscfae87556b8c3f6c9aa41bc5236996e9 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new rryi_1(), new rryi_1(), new rryi_1(), null};
      var0[3] = new rryi_1[]{(rryi_1)var0[0], (rryi_1)var0[1], (rryi_1)var0[2]};
      staticFieldscfae87556b8c3f6c9aa41bc5236996e9 = var0;
   }

   private static void protected_() {
      bytescfae87556b8c3f6c9aa41bc5236996e9 = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
