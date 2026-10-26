package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAy_1 {
   public static Object[] class_;
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7218331034881281617L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1834038104;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-62, 69, -38, -121, 32, 15, -127, -93}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public static rrAy_1 class_() {
      return (rrAy_1)class_[0];
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrAy_1()};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new short[1];
   }
}
