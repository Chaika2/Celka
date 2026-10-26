package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwZ_2 {
   private static short[] break_;
   public static Object[] class_;
   private static String[] byte_;
   private static byte[] protected_;
   private static boolean[] throws_;

   private static void byte_() {
      byte_ = new String[]{new String("none")};
   }

   static {
      ntfClinit();
   }

   public static String class_() {
      return ((rrwu_3)class_[2]).break_.isEmpty() ? "none" : ((rrwu_3)class_[2]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1987366267;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5782089762875566907L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-71, -6, 81, -43, 10, 2, -15, 94}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      Object[] var0 = new Object[]{false, new rrwu_3(), new rrwu_3(), null};
      class_ = var0;
   }

   private static void throws_() {
      throws_ = new boolean[]{false, false, true, false, false};
   }

   private static void case_() {
      protected_ = new byte[]{2, 4};
   }

   private static void protected_() {
      break_ = new short[]{2, 2};
   }
}
