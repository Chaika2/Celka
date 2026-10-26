package celestial;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sd_1 extends Bn_1 {
   private static String[] byte_;
   private static short[] protected_;

   public Sd_1() {
      super("Скурдж", (Pattern[])BH.class_[5]);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1093701766;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1273415593449165923L;
   }

   private static void catch_() {
      protected_ = new short[]{5};
   }

   public static String catch_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{73, 64, 41, -9, -5, 43, 127, -113}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void private_() {
      byte_ = new String[]{new String("Скурдж")};
   }
}
