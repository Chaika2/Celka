package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mr_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static double[] id_throws;

   private static void id_byte() {
      id_byte = new boolean[]{false, false, false, false, false, true, false, false};
   }

   public Mr_1() {
      this.id_break();
      this.id_class();
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-99, -65, -121, -51, 60, -29, -12, -90}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class() {
      Integer var5 = Integer.valueOf(id_byte[0]);
      this.id_class[id_break[0]] = var5;
      Integer var6 = Integer.valueOf(id_byte[1]);
      this.id_class[1] = var6;
      Integer var7 = Integer.valueOf(id_byte[2]);
      this.id_class[2] = var7;
      Double var8 = 1000000.0;
      this.id_class[3] = var8;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5837124145670315591L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1004990378;
   }

   private void id_break() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[id_byte[3]] = Integer.valueOf(id_byte[4]);
         var1[1] = Integer.valueOf(id_byte[6]);
         var1[2] = Integer.valueOf(id_byte[7]);
         var1[3] = id_throws[1];
      }
   }

   private static void id_throws() {
      id_break = new short[]{0, 1, 2, 3};
   }

   private static void id_case() {
      id_throws = new double[]{1000000.0, 0.0};
   }

   private static void id_protected() {
      id_protected = new byte[]{4, 2, 3};
   }
}
