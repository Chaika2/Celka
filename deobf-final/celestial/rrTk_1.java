package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTk_1 extends rrTB {
   private static String[] break_;
   private static short[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{106, 119, -59, -107, -94, 8, -120, -12}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTk_1() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[0], "Тайный торговец", (rrTE[])rrTM.class_[2]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 274911802018754336L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2004730012;
   }

   private static void implements_() {
      byte_ = new short[]{0, 2};
   }

   private static void private_() {
      break_ = new String[]{new String("Тайный торговец")};
   }
}
