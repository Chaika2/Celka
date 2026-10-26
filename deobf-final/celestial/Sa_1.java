package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sa_1 implements C_float<Boolean> {
   private static short[] break_;
   private static byte[] byte_;
   private static boolean[] protected_;
   private static String[] throws_;
   public static Object[] class_;

   private static void byte_() {
      protected_ = new boolean[]{true, false, false, false, true, true, false, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -618386505;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5368221297782928548L;
   }

   @Override
   public Class<Boolean> class_() {
      return Boolean.class;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-72, -98, 118, 9, 60, 42, -46, 37}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      throws_ = new String[]{
         new String("invalid boolean"),
         new String("1"),
         new String("true"),
         new String("yes"),
         new String("t"),
         new String("y"),
         new String("on"),
         new String("enable"),
         new String("0"),
         new String("false"),
         new String("no"),
         new String("f"),
         new String("n"),
         new String("off"),
         new String("disable")
      };
   }

   public Boolean break_(C_import var1) throws RuntimeException {
      String var2 = var1.break_();
      if (((List)class_[1]).contains(var2.toLowerCase(Locale.US))) {
         return true;
      } else if (((List)class_[2]).contains(var2.toLowerCase(Locale.US))) {
         return false;
      } else {
         throw new IllegalArgumentException("invalid boolean");
      }
   }

   private static void throws_() {
      break_ = new short[]{1, 2};
   }

   private static void case_() {
      Object[] var0 = new Object[]{new Sa_1(), null, null};
      String[] var2 = new String[]{"1", "true", "yes", "t", "y", "on", "enable"};
      var0[1] = Arrays.asList(var2);
      String[] var3 = new String[]{"0", "false", "no", "f", "n", "off", "disable"};
      var0[2] = Arrays.asList(var3);
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new byte[]{7, 2, 3, 4, 5, 6, 7, 2, 3, 4, 5, 6, 2, 3};
   }
}
