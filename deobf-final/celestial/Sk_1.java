package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sk_1 extends Bn_1 {
   private static short[] byte_;
   private static String[] protected_;

   public Sk_1() {
      super("Талисман", (Pattern[])BH.class_[6]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1761217104;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6503357853110467861L;
   }

   private static void catch_() {
      protected_ = new String[]{new String("Талисман")};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{108, 43, 76, -44, -122, 22, -118, -51}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      byte_ = new short[]{6};
   }
}
