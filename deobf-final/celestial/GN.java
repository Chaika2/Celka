package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GN extends rE_2 {
   private static boolean[] break_;
   private static short[] byte_;

   private static void byte_() {
      break_ = new boolean[1];
   }

   public GN(GW var1, rfH_2 var2) {
      super(var2);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1540928292;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6965971323449496645L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{8, 62, -127, -65, 76, -86, 96, 2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return var2 <= this.class_[1] && (var1 != this.class_[0] || var2 != this.class_[1] || var3 != this.class_[2])
         ? super.break_(var1, var2, var3)
         : break_[0];
   }

   private static void protected_() {
      byte_ = new short[]{1, 0, 1, 2};
   }
}
