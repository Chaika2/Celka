package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjM_2 {
   private static String[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -557315449;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5169275064499157285L;
   }

   private static void class_() {
      Object[] var0 = new Object[]{Pattern.compile("\\[✠] Вторжение в регион игрока (.+)", 0)};
      class_ = var0;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-101, 45, -26, 111, -82, -61, -58, -84}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{new String("\\[✠] Вторжение в регион игрока (.+)")};
   }
}
