package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmV_2 implements rruq_1 {
   private static short[] class_;

   rrmV_2() {
   }

   static {
      ntfClinit();
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-55, 14, 102, -76, 30, -53, -101, 119}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void class_() {
      class_ = new short[1];
   }

   @Override
   public void class_(C_static var1) throws x_1 {
      ((rrje_3)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[0]).class_();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1613234782;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 849804834180217215L;
   }
}
