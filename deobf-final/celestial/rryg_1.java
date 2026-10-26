package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryg_1 {
   ;
   public static Object[] staticFields024e8373b551338f96ec40891e552616;
   private static byte[] bytes024e8373b551338f96ec40891e552616;
   private static short[] shorts024e8373b551338f96ec40891e552616;
   private static boolean[] booleans024e8373b551338f96ec40891e552616;
   private static String[] strings024e8373b551338f96ec40891e552616;

   private static void byte_() {
      booleans024e8373b551338f96ec40891e552616 = new boolean[]{false, true, false, false, true, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1575406666;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{40, -114, -68, -38, -56, 15, -109, 109}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8320319830252251715L;
   }

   private static void class_() {
      strings024e8373b551338f96ec40891e552616 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rryg_1(), new rryg_1(), new rryg_1(), null};
      var0[3] = new rryg_1[]{(rryg_1)var0[0], (rryg_1)var0[1], (rryg_1)var0[2]};
      staticFields024e8373b551338f96ec40891e552616 = var0;
   }

   private static void throws_() {
      bytes024e8373b551338f96ec40891e552616 = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      shorts024e8373b551338f96ec40891e552616 = new short[]{3, 0, 1, 2};
   }
}
