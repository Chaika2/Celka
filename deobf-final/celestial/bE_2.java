package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum bE_2 {
   ;
   private static boolean[] booleans41d67a8911663c568d38045d1ac26747;
   private static String[] strings41d67a8911663c568d38045d1ac26747;
   private static short[] shorts41d67a8911663c568d38045d1ac26747;
   private static byte[] bytes41d67a8911663c568d38045d1ac26747;
   public static Object[] staticFields41d67a8911663c568d38045d1ac26747;

   private static void byte_() {
      strings41d67a8911663c568d38045d1ac26747 = new String[]{
         new String("CHEST"), new String("SHULKER_BOX"), new String("ANVIL"), new String("ENCHANTING_TABLE"), new String("BARREL"), new String("FURNACE")
      };
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-63, 111, 77, 118, -106, -35, -127, 59}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1532903324;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -255448319623492780L;
   }

   private static void break_() {
      shorts41d67a8911663c568d38045d1ac26747 = new short[]{6, 0, 1, 2, 3, 4, 5};
   }

   private static void throws_() {
      booleans41d67a8911663c568d38045d1ac26747 = new boolean[]{false, true, false, false, true, true};
   }

   private static void case_() {
      bytes41d67a8911663c568d38045d1ac26747 = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new bE_2(), new bE_2(), new bE_2(), new bE_2(), new bE_2(), new bE_2(), null};
      var0[6] = new bE_2[]{(bE_2)var0[0], (bE_2)var0[1], (bE_2)var0[2], (bE_2)var0[3], (bE_2)var0[4], (bE_2)var0[5]};
      staticFields41d67a8911663c568d38045d1ac26747 = var0;
   }
}
