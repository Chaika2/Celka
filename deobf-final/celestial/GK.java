package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GK extends rM_2 {
   private static boolean[] break_;
   private static double[] byte_;

   private static void byte_() {
      byte_ = new double[]{Double.NEGATIVE_INFINITY};
   }

   public GK(Go_1 var1, double var2, rfH_2... var4) {
      super(var2, var4);
   }

   static {
      ntfClinit();
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6813688594604191777L;
   }

   @Override
   public double class_() {
      return Double.NEGATIVE_INFINITY;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1989931794;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -87, -106, -44, -119, 31, -11, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return false;
   }

   private static void break_() {
      break_ = new boolean[1];
   }
}
