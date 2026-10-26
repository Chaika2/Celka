package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rryj_1 {
   ;
   private static byte[] bytes0ba82fb5ac3130929eb6fe12cd822ba8;
   private static short[] shorts0ba82fb5ac3130929eb6fe12cd822ba8;
   public static Object[] staticFields0ba82fb5ac3130929eb6fe12cd822ba8;
   private static boolean[] booleans0ba82fb5ac3130929eb6fe12cd822ba8;
   private static String[] strings0ba82fb5ac3130929eb6fe12cd822ba8;

   static {
      ntfClinit();
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rryj_1(), new rryj_1(), new rryj_1(), new rryj_1(), null};
      var0[4] = new rryj_1[]{(rryj_1)var0[0], (rryj_1)var0[1], (rryj_1)var0[2], (rryj_1)var0[3]};
      staticFields0ba82fb5ac3130929eb6fe12cd822ba8 = var0;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5851153075048552521L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -7, 38, 12, -20, -22, -87, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 830370135;
   }

   private static void break_() {
      bytes0ba82fb5ac3130929eb6fe12cd822ba8 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
   }

   private static void throws_() {
      strings0ba82fb5ac3130929eb6fe12cd822ba8 = new String[]{
         new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")
      };
   }

   private static void case_() {
      shorts0ba82fb5ac3130929eb6fe12cd822ba8 = new short[]{4, 0, 1, 2, 3};
   }

   private static void protected_() {
      booleans0ba82fb5ac3130929eb6fe12cd822ba8 = new boolean[]{false, true, false, false, true, true};
   }
}
