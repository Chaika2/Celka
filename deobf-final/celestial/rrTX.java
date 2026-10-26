package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTX extends rrTB {
   private static short[] break_;
   private static String[] byte_;

   public static String byte_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{0, -122, 6, 51, 106, -84, 1, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrTX() {
      super((rrTS)rrTS.staticFields35fc53f9a5633735b32b94862e310fdb[0], "Состязание", (rrTE[])rrTM.class_[1]);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 235286251559626763L;
   }

   private static int break_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1558759150;
   }

   private static void implements_() {
      byte_ = new String[]{new String("Состязание")};
   }

   private static void private_() {
      break_ = new short[]{0, 1};
   }
}
