package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTx_1 extends rrTB {
   private static short[] break_;
   private static String[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, -128, -112, 117, 23, 80, -39, 89}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTx_1() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[0], "Осада корабля", (rrTE[])rrTM.class_[4]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 845092882197371948L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1666806166;
   }

   private static void implements_() {
      byte_ = new String[]{new String("Осада корабля")};
   }

   private static void private_() {
      break_ = new short[]{0, 4};
   }
}
