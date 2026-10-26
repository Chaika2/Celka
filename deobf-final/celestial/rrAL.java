package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAL {
   private static short[] break_;
   public static Object[] class_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[1];
   }

   static {
      ntfClinit();
   }

   public static rrAL class_() {
      return (rrAL)class_[0];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1376189952;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1038448620056568892L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-37, 90, 121, -45, 2, 77, 40, 70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void break_() {
      byte_ = new boolean[]{false, true};
   }

   private static void protected_() {
      Object[] var0 = new Object[]{new rrAL()};
      class_ = var0;
   }
}
