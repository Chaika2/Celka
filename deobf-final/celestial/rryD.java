package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryD {
   ;
   private static boolean[] booleans24c72777b502351fbafe71530c75a9f7;
   public static Object[] staticFields24c72777b502351fbafe71530c75a9f7;
   private static byte[] bytes24c72777b502351fbafe71530c75a9f7;
   private static String[] strings24c72777b502351fbafe71530c75a9f7;
   private static short[] shorts24c72777b502351fbafe71530c75a9f7;

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2046814368;
   }

   private static void class_() {
      booleans24c72777b502351fbafe71530c75a9f7 = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{69, 42, -6, -47, -41, 66, 73, 111}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -3690570861544037839L;
   }

   private static void break_() {
      strings24c72777b502351fbafe71530c75a9f7 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rryD(), new rryD(), new rryD(), null};
      var0[3] = new rryD[]{(rryD)var0[0], (rryD)var0[1], (rryD)var0[2]};
      staticFields24c72777b502351fbafe71530c75a9f7 = var0;
   }

   private static void case_() {
      shorts24c72777b502351fbafe71530c75a9f7 = new short[]{3, 0, 1, 2};
   }

   private static void protected_() {
      bytes24c72777b502351fbafe71530c75a9f7 = new byte[]{3, 2, 2, 2, 3, 4};
   }
}
