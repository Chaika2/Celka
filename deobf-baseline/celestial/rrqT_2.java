package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqT_2 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static float[] id_protected;
   private static double[] id_throws;
   private static byte[] id_case;

   private static void id_byte() {
      id_throws = new double[]{0.05, 0.0, 0.0, 0.0};
   }

   public rrqT_2(JumpCircles var1, double var2, double var4, double var6) {
      this.id_protected();
      this.id_class[id_byte[0]] = var1;
      Float var13 = id_protected[0];
      this.id_class[id_byte[1]] = var13;
      Double var14 = var2;
      this.id_class[id_byte[2]] = var14;
      Double var15 = var4;
      this.id_class[id_byte[3]] = var15;
      Double var16 = var6;
      this.id_class[id_byte[4]] = var16;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1523596185;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{47, -29, -70, 83, 122, 103, 86, -18}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public boolean id_class() {
      return (double)((Float)this.id_class[id_byte[5]]).floatValue()
            > (double)((rrIm_1)((JumpCircles)this.id_class[id_byte[6]]).id_break[id_byte[7]]).id_byte().floatValue() - id_throws[0]
         ? id_break[0]
         : id_break[1];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7748431669332272066L;
   }

   private static void id_break() {
      id_protected = new float[2];
   }

   private static void id_throws() {
      id_case = new byte[]{5, 2, 3};
   }

   private static void id_catch() {
      id_byte = new short[]{4, 3, 0, 1, 2, 3, 4, 0};
   }

   private static void id_case() {
      id_break = new boolean[]{true, false, false, true};
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         this.id_class[0] = 0.0;
         this.id_class[1] = 0.0;
         this.id_class[2] = 0.0;
         this.id_class[3] = 0.0F;
      }
   }
}
