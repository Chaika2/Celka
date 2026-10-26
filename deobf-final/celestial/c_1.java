package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class c_1 extends J {
   private static String[] class_;
   private static boolean[] break_;

   public c_1(int var1) {
      super(String.format("Слишком много аргументов (максимум %d)", var1));
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, -88, -37, 42, 13, -14, 60, 126}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1778899091;
   }

   private static void class_() {
      break_ = new boolean[]{true, false};
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 5831140920567688769L;
   }

   private static void break_() {
      class_ = new String[]{new String("Слишком много аргументов (максимум %d)")};
   }
}
