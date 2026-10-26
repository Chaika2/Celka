package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rC_2 {
   ;
   private static short[] shorts8c829f9bf33c3c2bb018688b591a16ef;
   public static Object[] staticFields8c829f9bf33c3c2bb018688b591a16ef;
   private static String[] strings8c829f9bf33c3c2bb018688b591a16ef;
   private static boolean[] booleans8c829f9bf33c3c2bb018688b591a16ef;
   private static byte[] bytes8c829f9bf33c3c2bb018688b591a16ef;

   private static void byte_() {
      shorts8c829f9bf33c3c2bb018688b591a16ef = new short[]{6, 0, 1, 2, 3, 4, 5};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 411396551;
   }

   private static void class_() {
      booleans8c829f9bf33c3c2bb018688b591a16ef = new boolean[]{false, true, false, false, true, true};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{77, -65, 92, 50, -81, 105, -24, 98}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7755849155666581731L;
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rC_2(), new rC_2(), new rC_2(), new rC_2(), new rC_2(), new rC_2(), null};
      var0[6] = new rC_2[]{(rC_2)var0[0], (rC_2)var0[1], (rC_2)var0[2], (rC_2)var0[3], (rC_2)var0[4], (rC_2)var0[5]};
      staticFields8c829f9bf33c3c2bb018688b591a16ef = var0;
   }

   private static void throws_() {
      strings8c829f9bf33c3c2bb018688b591a16ef = new String[]{
         new String("SET_GOAL_AND_PATH"),
         new String("REQUEST_PAUSE"),
         new String("CANCEL_AND_SET_GOAL"),
         new String("REVALIDATE_GOAL_AND_PATH"),
         new String("FORCE_REVALIDATE_GOAL_AND_PATH"),
         new String("DEFER")
      };
   }

   private static void protected_() {
      bytes8c829f9bf33c3c2bb018688b591a16ef = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
   }
}
