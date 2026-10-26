package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLM {
   private static boolean[] break_;
   public static Object[] class_;
   private static short[] byte_;

   private static void byte_() {
      byte_ = new short[1];
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2502056372693602039L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 888928185;
   }

   public static rrLM class_() {
      return (rrLM)class_[0];
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{111, -30, -35, -88, 49, 15, 4, 127}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      break_ = new boolean[]{false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrLM()};
      class_ = var0;
   }
}
