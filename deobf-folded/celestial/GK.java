package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GK extends rM_2 {
   private static boolean[] id_break;
   private static double[] id_byte;

   private static void id_byte() {
      id_byte = new double[]{Double.NEGATIVE_INFINITY};
   }

   public GK(Go_1 var1, double var2, rfH_2... var4) {
      super(var2, var4);
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -6813688594604191777L;
   }

   @Override
   public double id_class() {
      return Double.NEGATIVE_INFINITY;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1989931794;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-79, -87, -106, -44, -119, 31, -11, -34}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public boolean id_break(int var1, int var2, int var3) {
      return id_break[0];
   }

   private static void id_break() {
      id_break = new boolean[1];
   }
}
