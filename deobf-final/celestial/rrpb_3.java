package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrpb_3 {
   ;
   private static byte[] bytes91a494c78a8435468eb612e156e4cedc;
   private static boolean[] booleans91a494c78a8435468eb612e156e4cedc;
   private static short[] shorts91a494c78a8435468eb612e156e4cedc;
   public static Object[] staticFields91a494c78a8435468eb612e156e4cedc;
   private static String[] strings91a494c78a8435468eb612e156e4cedc;

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6438400120490155575L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1491937333;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-92, 93, -125, 117, 13, -19, -41, -112}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      Object[] var0 = new Object[]{new rrpb_3(), new rrpb_3(), new rrpb_3(), null};
      var0[3] = new rrpb_3[]{(rrpb_3)var0[0], (rrpb_3)var0[1], (rrpb_3)var0[2]};
      staticFields91a494c78a8435468eb612e156e4cedc = var0;
   }

   private static void break_() {
      booleans91a494c78a8435468eb612e156e4cedc = new boolean[]{false, true, false, false, true, true};
   }

   private static void throws_() {
      shorts91a494c78a8435468eb612e156e4cedc = new short[]{3, 0, 1, 2};
   }

   private static void case_() {
      bytes91a494c78a8435468eb612e156e4cedc = new byte[]{3, 2, 2, 2, 3, 4};
   }

   private static void protected_() {
      strings91a494c78a8435468eb612e156e4cedc = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
   }
}
