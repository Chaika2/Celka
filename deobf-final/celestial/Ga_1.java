package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ga_1 extends rM_2 {
   private static double[] break_;
   private static boolean[] byte_;

   private static void byte_() {
      byte_ = new boolean[1];
   }

   public Ga_1(Ge_1 var1, double var2, Integer var4, rfH_2... var5) {
      super(var2, var4, var5);
   }

   static {
      ntfClinit();
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506397170;
   }

   @Override
   public double class_() {
      return Double.NEGATIVE_INFINITY;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7014843331565173191L;
   }

   public static String break_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -109, 91, -39, 78, 74, 48, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return false;
   }

   private static void break_() {
      break_ = new double[]{Double.NEGATIVE_INFINITY};
   }
}
