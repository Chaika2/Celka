package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFR extends Om_1 {
   private static boolean[] break_;
   public static Object[] class_;
   private static short[] byte_;

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{25, 58, 85, -79, 36, 121, -76, 22}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1625025688;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6678178352284776814L;
   }

   public static rrFR class_() {
      ((rrFR)class_[0]).class_(false);
      return (rrFR)class_[0];
   }

   private static void break_() {
      Object[] var0 = new Object[]{new rrFR()};
      class_ = var0;
   }

   private static void throws_() {
      break_ = new boolean[]{false, false, true};
   }

   private static void protected_() {
      byte_ = new short[2];
   }
}
