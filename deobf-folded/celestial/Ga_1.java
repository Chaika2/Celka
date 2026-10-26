package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ga_1 extends rM_2 {
   private static double[] id_break;
   private static boolean[] id_byte;

   private static void id_byte() {
      id_byte = new boolean[1];
   }

   public Ga_1(Ge_1 var1, double var2, Integer var4, rfH_2... var5) {
      super(var2, var4, var5);
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1506397170;
   }

   @Override
   public double id_class() {
      return Double.NEGATIVE_INFINITY;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7014843331565173191L;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{67, -109, 91, -39, 78, 74, 48, -77}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return id_byte[0];
   }

   private static void id_break() {
      id_break = new double[]{Double.NEGATIVE_INFINITY};
   }
}
