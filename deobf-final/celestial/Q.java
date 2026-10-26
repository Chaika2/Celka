package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Q extends J {
   private static boolean[] class_;
   private static String[] break_;

   public Q(int var1) {
      super(String.format("Недостаточно аргументов (минимум %d)", var1));
   }

   static {
      ntfClinit();
   }

   private static void class_() {
      class_ = new boolean[]{true, false};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7832099191527725100L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 227728920;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{29, 77, -102, 54, -92, -96, 3, 114}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new String[]{new String("Недостаточно аргументов (минимум %d)")};
   }
}
