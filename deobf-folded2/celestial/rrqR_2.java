package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqR_2 {
   public Object[] id_class;
   private static double[] id_break;
   private static byte[] id_byte;
   private static short[] id_protected;
   private static boolean[] id_throws;
   private static long[] id_case;
   private static float[] id_catch;

   private void id_byte() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[0] = 0.0;
         this.id_class[1] = 0.0;
         this.id_class[2] = 0.0;
         this.id_class[3] = 0.0F;
         this.id_class[4] = 0L;
      }
   }

   public rrqR_2(double var1, double var3, double var5) {
      this.id_byte();
      Double var11 = var1;
      this.id_class[0] = var11;
      Double var12 = var3;
      this.id_class[1] = var12;
      Double var13 = var5;
      this.id_class[2] = var13;
      Long var14 = rqR_2.id_break();
      this.id_class[4] = var14;
   }

   static {
      ntfClinit();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1418349879428632476L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 581142902;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-65, -35, 30, -69, -42, -122, -94, 41}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_break = new double[3];
   }

   private static void id_break() {
      id_byte = new byte[]{5, 2, 3, 4};
   }

   private static void id_throws() {
      id_protected = new short[]{0, 1, 2, 4};
   }

   private static void id_catch() {
      id_throws = new boolean[]{false, true};
   }

   private static void id_case() {
      id_catch = new float[1];
   }

   private static void id_protected() {
      id_case = new long[1];
   }
}
