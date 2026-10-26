package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjs_3 extends rrjx_3 {
   private static String[] byte_;
   private static short[] protected_;
   private static byte[] throws_;
   private static boolean[] case_;
   public static Object[] class_;

   public rrjs_3(int var1) {
      super((String[])class_[0], var1);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5885501936202316508L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 638129450;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{98, -127, -49, 13, 37, 113, -87, -49}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new short[1];
   }

   private static void catch_() {
      throws_ = new byte[]{2};
   }

   private static void case_() {
      byte_ = new String[]{new String("an"), new String("anarchy")};
   }

   private static void protected_() {
      Object[] var0 = new Object[1];
      String[] var2 = new String[]{"an", "anarchy"};
      var0[0] = var2;
      class_ = var0;
   }

   private static void private_() {
      case_ = new boolean[]{false, true, false, true};
   }
}
