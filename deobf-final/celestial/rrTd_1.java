package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTd_1 extends rrTB {
   private static short[] break_;
   private static String[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-15, 21, 117, -66, -77, -39, 18, -21}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTd_1() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[0], "Талисман", (rrTE[])rrTM.class_[6]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 4191955496199459941L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2077988449;
   }

   private static void implements_() {
      break_ = new short[]{0, 6};
   }

   private static void private_() {
      byte_ = new String[]{new String("Талисман")};
   }
}
