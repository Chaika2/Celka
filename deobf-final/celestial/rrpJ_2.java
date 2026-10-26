package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpJ_2 {
   ;
   private static String[] strings5c082363986d3091901b81d145e82889;
   private static short[] shorts5c082363986d3091901b81d145e82889;
   public static Object[] staticFields5c082363986d3091901b81d145e82889;
   private static byte[] bytes5c082363986d3091901b81d145e82889;
   private static boolean[] booleans5c082363986d3091901b81d145e82889;

   private static void byte_() {
      strings5c082363986d3091901b81d145e82889 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{66, 66, -65, -43, -15, -65, -35, 40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5249553308589169130L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -882452589;
   }

   private static void class_() {
      booleans5c082363986d3091901b81d145e82889 = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      shorts5c082363986d3091901b81d145e82889 = new short[]{3, 0, 1, 2};
   }

   private static void case_() {
      bytes5c082363986d3091901b81d145e82889 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrpJ_2(), new rrpJ_2(), new rrpJ_2(), null};
      var0[3] = new rrpJ_2[]{(rrpJ_2)var0[0], (rrpJ_2)var0[1], (rrpJ_2)var0[2]};
      staticFields5c082363986d3091901b81d145e82889 = var0;
   }
}
