package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum Pm_1 {
   ;
   private static short[] shortsd2ae74894aa334618e73ed450cdbde1f;
   private static byte[] bytesd2ae74894aa334618e73ed450cdbde1f;
   private static String[] stringsd2ae74894aa334618e73ed450cdbde1f;
   public static Object[] staticFieldsd2ae74894aa334618e73ed450cdbde1f;
   private static boolean[] booleansd2ae74894aa334618e73ed450cdbde1f;

   private static void byte_() {
      Object[] var0 = new Object[]{new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), null};
      var0[9] = new Pm_1[]{
         (Pm_1)var0[0], (Pm_1)var0[1], (Pm_1)var0[2], (Pm_1)var0[3], (Pm_1)var0[4], (Pm_1)var0[5], (Pm_1)var0[6], (Pm_1)var0[7], (Pm_1)var0[8]
      };
      staticFieldsd2ae74894aa334618e73ed450cdbde1f = var0;
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -157992351;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5311070900119793708L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-12, -8, 56, -52, -18, -118, 119, 122}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      booleansd2ae74894aa334618e73ed450cdbde1f = new boolean[]{false, true, false, false, true, true};
   }

   private static void break_() {
      bytesd2ae74894aa334618e73ed450cdbde1f = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
   }

   private static void throws_() {
      shortsd2ae74894aa334618e73ed450cdbde1f = new short[]{9, 0, 1, 2, 3, 4, 5, 6, 7, 8};
   }

   private static void protected_() {
      stringsd2ae74894aa334618e73ed450cdbde1f = new String[]{
         new String("MOVE_FORWARD"),
         new String("MOVE_BACK"),
         new String("MOVE_LEFT"),
         new String("MOVE_RIGHT"),
         new String("CLICK_LEFT"),
         new String("CLICK_RIGHT"),
         new String("JUMP"),
         new String("SNEAK"),
         new String("SPRINT")
      };
   }
}
