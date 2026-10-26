package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bQ_2 extends rS_2 {
   private static short[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      break_ = new short[]{0, 2};
   }

   public bQ_2(bW_2 var1, rfH_2 var2) {
      super(var2);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -2126161726;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -909482707544349809L;
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return this.class_[0] == var1 && this.class_[2] == var3 ? true : byte_[1];
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-36, -63, -58, 88, 34, -100, 68, 33}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void protected_() {
      byte_ = new boolean[]{true, false};
   }
}
