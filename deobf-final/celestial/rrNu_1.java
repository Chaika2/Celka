package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrNu_1 {
   ;
   private static boolean[] booleansd295d8674c763b5f9f18e6479c787fcc;
   private static byte[] bytesd295d8674c763b5f9f18e6479c787fcc;
   public static Object[] staticFieldsd295d8674c763b5f9f18e6479c787fcc;
   private static short[] shortsd295d8674c763b5f9f18e6479c787fcc;
   private static String[] stringsd295d8674c763b5f9f18e6479c787fcc;

   private static void byte_() {
      Object[] var0 = new Object[]{new rrNu_1(), new rrNu_1(), null};
      var0[2] = new rrNu_1[]{(rrNu_1)var0[0], (rrNu_1)var0[1]};
      staticFieldsd295d8674c763b5f9f18e6479c787fcc = var0;
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 107, 22, 51, 17, -58, 96, -15}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      shortsd295d8674c763b5f9f18e6479c787fcc = new short[]{2, 0, 1};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6526623753031069976L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1084414418;
   }

   private static void break_() {
      bytesd295d8674c763b5f9f18e6479c787fcc = new byte[]{2, 2, 3};
   }

   private static void case_() {
      stringsd295d8674c763b5f9f18e6479c787fcc = new String[]{new String("RECONNECTING"), new String("OPEN_AUCTION")};
   }

   private static void protected_() {
      booleansd295d8674c763b5f9f18e6479c787fcc = new boolean[]{false, true, false, false, true, true};
   }
}
