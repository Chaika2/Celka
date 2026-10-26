package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNb_1 {
   public Object[] id_class;
   private static boolean[] id_break;
   private static short[] id_byte;
   private static double[] id_protected;
   private static byte[] id_throws;

   public double id_byte() {
      return (Double)this.id_class[3];
   }

   public rrNb_1(rrQK var1, double var2) {
      this.id_private();
      rrQK var8 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0];
      this.id_class[6] = var8;
      this.id_class[6] = var1;
      Double var10 = var2;
      this.id_class[0] = var10;
   }

   public rrNb_1(double var1) {
      this.id_private();
      rrQK var7 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[0];
      this.id_class[6] = var7;
      Double var8 = var1;
      this.id_class[0] = var8;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 497997152;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 7919856973698920066L;
   }

   public void id_class(double var1) {
      if ((Double)this.id_class[2] != var1) {
         Double var7 = var1;
         this.id_class[2] = var7;
         Double var8 = (Double)this.id_class[3];
         this.id_class[1] = var8;
         Double var9 = 0.0;
         this.id_class[4] = var9;
         Double var10 = (Double)this.id_class[2] - (Double)this.id_class[1];
         this.id_class[5] = var10;
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{70, 104, 57, -61, 24, -81, 32, -100}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void id_class(float var1) {
      Double var6 = (double)var1;
      this.id_class[3] = var6;
      Double var7 = (double)var1;
      this.id_class[1] = var7;
      Double var8 = (double)var1;
      this.id_class[2] = var8;
      Double var9 = 1.0;
      this.id_class[4] = var9;
      Double var10 = 0.0;
      this.id_class[5] = var10;
   }

   public void id_class(rrQK var1) {
      this.id_class[6] = var1;
   }

   public double id_class() {
      return (Double)this.id_class[0];
   }

   public void id_break(double var1) {
      Double var7 = var1;
      this.id_class[3] = var7;
   }

   public void id_break() {
      Double var5 = 1.0;
      this.id_class[3] = var5;
   }

   public void id_break(float var1) {
      Double var6 = (double)var1;
      this.id_class[0] = var6;
   }

   public boolean id_throws() {
      return this.id_class[3] > 0.0 ? true : id_break[1];
   }

   private static void id_finally() {
      id_throws = new byte[]{7, 2, 3, 4, 5};
   }

   private static void id_catch() {
      id_byte = new short[]{0, 6, 6, 0, 0, 6, 0, 0, 4, 0, 4, 1, 5, 6, 4, 3, 3, 2, 2, 3, 1, 4, 2, 1, 5, 0, 1, 2, 3, 4, 5, 0, 3, 3, 3, 1, 2, 4, 5, 3, 6};
   }

   private static void id_extends() {
      id_break = new boolean[]{true, false, false, true};
   }

   public void id_case() {
      Double var5 = 0.0;
      this.id_class[1] = var5;
      Double var6 = 0.0;
      this.id_class[2] = var6;
      Double var7 = 0.0;
      this.id_class[3] = var7;
      Double var8 = 0.0;
      this.id_class[4] = var8;
      Double var9 = 0.0;
      this.id_class[5] = var9;
   }

   private static void id_implements() {
      id_protected = new double[]{0.01, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public void id_protected() {
      double var1 = (Double)rrQo_1.id_class[0] * 0.01;
      Double var7 = rfU_2.id_class((Double)this.id_class[4] + (Double)this.id_class[0] * var1, 0.0, 1.0);
      this.id_class[4] = var7;
      Double var8 = (Double)this.id_class[1] + (Double)this.id_class[5] * ((rrQK)this.id_class[6]).id_class((Double)this.id_class[4]);
      this.id_class[3] = var8;
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[7];
         Object[] var1 = this.id_class;
         var1[0] = 0.0;
         var1[1] = 0.0;
         var1[2] = 0.0;
         var1[3] = 0.0;
         var1[4] = 0.0;
         var1[5] = 0.0;
      }
   }
}
