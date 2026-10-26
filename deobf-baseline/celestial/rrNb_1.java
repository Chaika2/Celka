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
      return (Double)this.id_class[id_byte[16]];
   }

   public rrNb_1(rrQK var1, double var2) {
      this.id_private();
      rrQK var8 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_byte[0]];
      this.id_class[id_byte[1]] = var8;
      this.id_class[id_byte[2]] = var1;
      Double var10 = var2;
      this.id_class[id_byte[3]] = var10;
   }

   public rrNb_1(double var1) {
      this.id_private();
      rrQK var7 = (rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_byte[4]];
      this.id_class[id_byte[5]] = var7;
      Double var8 = var1;
      this.id_class[id_byte[6]] = var8;
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
      if ((Double)this.id_class[id_byte[17]] != var1) {
         Double var7 = var1;
         this.id_class[id_byte[18]] = var7;
         Double var8 = (Double)this.id_class[id_byte[19]];
         this.id_class[id_byte[20]] = var8;
         Double var9 = id_protected[3];
         this.id_class[id_byte[21]] = var9;
         Double var10 = (Double)this.id_class[id_byte[22]] - (Double)this.id_class[id_byte[23]];
         this.id_class[id_byte[24]] = var10;
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
      this.id_class[id_byte[34]] = var6;
      Double var7 = (double)var1;
      this.id_class[id_byte[35]] = var7;
      Double var8 = (double)var1;
      this.id_class[id_byte[36]] = var8;
      Double var9 = id_protected[11];
      this.id_class[id_byte[37]] = var9;
      Double var10 = id_protected[12];
      this.id_class[id_byte[38]] = var10;
   }

   public void id_class(rrQK var1) {
      this.id_class[id_byte[40]] = var1;
   }

   public double id_class() {
      return (Double)this.id_class[id_byte[31]];
   }

   public void id_break(double var1) {
      Double var7 = var1;
      this.id_class[id_byte[39]] = var7;
   }

   public void id_break() {
      Double var5 = id_protected[10];
      this.id_class[id_byte[33]] = var5;
   }

   public void id_break(float var1) {
      Double var6 = (double)var1;
      this.id_class[id_byte[25]] = var6;
   }

   public boolean id_throws() {
      return this.id_class[id_byte[32]] > id_protected[9] ? id_break[0] : id_break[1];
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
      Double var5 = id_protected[4];
      this.id_class[id_byte[26]] = var5;
      Double var6 = id_protected[5];
      this.id_class[id_byte[27]] = var6;
      Double var7 = id_protected[6];
      this.id_class[id_byte[28]] = var7;
      Double var8 = id_protected[7];
      this.id_class[id_byte[29]] = var8;
      Double var9 = id_protected[8];
      this.id_class[id_byte[30]] = var9;
   }

   private static void id_implements() {
      id_protected = new double[]{0.01, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
   }

   public void id_protected() {
      double var1 = (Double)rrQo_1.id_class[id_byte[7]] * id_protected[0];
      Double var7 = rfU_2.id_class((Double)this.id_class[id_byte[8]] + (Double)this.id_class[id_byte[9]] * var1, id_protected[1], id_protected[2]);
      this.id_class[id_byte[10]] = var7;
      Double var8 = (Double)this.id_class[id_byte[11]]
         + (Double)this.id_class[id_byte[12]] * ((rrQK)this.id_class[id_byte[13]]).id_class((Double)this.id_class[id_byte[14]]);
      this.id_class[id_byte[15]] = var8;
   }

   private void id_private() {
      if (this.id_class == null) {
         this.id_class = new Object[id_throws[0]];
         Object[] var1 = this.id_class;
         var1[id_break[2]] = id_protected[13];
         var1[id_break[3]] = id_protected[14];
         var1[id_throws[1]] = id_protected[15];
         var1[id_throws[2]] = id_protected[16];
         var1[id_throws[3]] = id_protected[17];
         var1[id_throws[4]] = id_protected[18];
      }
   }
}
