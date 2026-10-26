package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sG_2 {
   private static short[] break_;
   private static boolean[] byte_;
   public static Object[] class_;
   private static byte[] protected_;
   private static String[] throws_;

   private static void byte_() {
      byte_ = new boolean[]{false, false, true};
   }

   private sG_2() {
   }

   static {
      ntfClinit();
   }

   public static List<C_import> class_(String var0, boolean var1) {
      ArrayList var2 = new ArrayList();
      Matcher var3 = ((Pattern)class_[0]).matcher(var0);

      int var4;
      for (var4 = -1; var3.find(); var4 = var3.end()) {
         var2.add(new sE_2(var2.size(), var3.group(), var0.substring(var3.start())));
      }

      if (var1 && var4 < var0.length()) {
         var2.add(new sE_2(var2.size(), "", ""));
      }

      return var2;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6890028788193466492L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 433607525;
   }

   public static List<C_import> class_(String var0) {
      return class_(var0, false);
   }

   public static sE_2 class_() {
      return new sE_2(-1, "<unknown>", "");
   }

   private static void break_() {
      Object[] var0 = new Object[]{Pattern.compile("\\S+")};
      class_ = var0;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-77, 99, 108, -8, -84, -86, 28, 108}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void throws_() {
      protected_ = new byte[]{-1, -1};
   }

   private static void case_() {
      throws_ = new String[]{new String(""), new String(""), new String("<unknown>"), new String(""), new String("\\S+")};
   }

   private static void protected_() {
      break_ = new short[1];
   }
}
