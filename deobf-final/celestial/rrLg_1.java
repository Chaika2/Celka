package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrLg_1 {
   ;
   private static short[] shorts83bfa4843c3c3647913690fe22963b15;
   private static String[] strings83bfa4843c3c3647913690fe22963b15;
   public static Object[] staticFields83bfa4843c3c3647913690fe22963b15;
   private static byte[] bytes83bfa4843c3c3647913690fe22963b15;
   private static boolean[] booleans83bfa4843c3c3647913690fe22963b15;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrLg_1(), new rrLg_1(), null};
      var0[2] = new rrLg_1[]{(rrLg_1)var0[0], (rrLg_1)var0[1]};
      staticFields83bfa4843c3c3647913690fe22963b15 = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -589187072;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4654373560247262469L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-20, -97, -45, 43, 63, 1, 7, 74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      shorts83bfa4843c3c3647913690fe22963b15 = new short[]{2, 0, 1};
   }

   private static void throws_() {
      strings83bfa4843c3c3647913690fe22963b15 = new String[]{new String("INVENTORY"), new String("DIGGING")};
   }

   private static void case_() {
      bytes83bfa4843c3c3647913690fe22963b15 = new byte[]{2, 2, 3};
   }

   private static void protected_() {
      booleans83bfa4843c3c3647913690fe22963b15 = new boolean[]{false, true, false, false, true, true};
   }
}
