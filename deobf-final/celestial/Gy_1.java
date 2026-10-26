package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gy_1 extends rX_2 {
   private static short[] byte_;

   public Gy_1(int var1, int var2) {
      super(var1, var2);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1347483465476853308L;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1126616058;
   }

   @Override
   public double class_(int var1, int var2, int var3) {
      return super.class_(var1, var2, var3) + rJ_2.class_((Integer)C_class.instanceof_().rP.class_[0], var2);
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -69, 67, 66, 100, -121, -85, -40}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void protected_() {
      byte_ = new short[1];
   }
}
