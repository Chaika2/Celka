package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjX_2 {
   private static boolean[] break_;
   public static Object[] class_;
   private static byte[] byte_;
   private static short[] protected_;

   private static void byte_() {
      break_ = new boolean[]{false, true};
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5607659285722605390L;
   }

   private static void class_() {
      protected_ = new short[]{3600};
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-58, -77, -44, 10, -14, -21, 13, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1775236433;
   }

   private static void break_() {
      Object[] var0 = new Object[]{List.of((rLY)(new rLY(rLD.throws_, 3600, 3)))};
      class_ = var0;
   }

   private static void protected_() {
      byte_ = new byte[]{3};
   }
}
