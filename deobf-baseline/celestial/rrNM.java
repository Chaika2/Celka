package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNM implements rrNG, MinecraftAccessor {
   private static byte[] id_byte;
   public Object[] id_class;
   private static double[] id_protected;
   private static short[] id_throws;
   public static Object[] id_break;
   private static float[] id_case;
   private static boolean[] id_catch;

   @Override
   public float id_byte() {
      return (Float)this.id_class[id_throws[13]];
   }

   public rrNM(float var1) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[3]], var1);
   }

   public rrNM(rrQK var1, float var2) {
      this.id_volatile();
      Boolean var7 = id_catch[0];
      this.id_class[id_throws[0]] = var7;
      Float var8 = var2;
      this.id_class[id_throws[1]] = var8;
      this.id_class[id_throws[2]] = var1;
   }

   static {
      ntfClinit();
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-1, -62, 61, 40, -21, -15, 104, -123}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -4594099427491238032L;
   }

   public void id_class(boolean var1) {
      Float var8 = var1 ? id_case[0] : id_case[1];
      this.id_class[id_throws[4]] = var8;
      if (!this.id_protected()) {
         double var2 = (Double)rrQo_1.id_class[id_throws[5]] * id_protected[0];
         Float var9 = (float)rfU_2.id_class(
            (double)((Float)this.id_class[id_throws[6]]).floatValue()
               + (var1 ? (double)((Float)this.id_class[id_throws[7]]).floatValue() * var2 : (double)(-(Float)this.id_class[id_throws[8]]) * var2),
            id_protected[1],
            id_protected[2]
         );
         this.id_class[id_throws[9]] = var9;
         Float var10 = (float)((rrQK)this.id_class[id_throws[10]]).id_class((double)((Float)this.id_class[id_throws[11]]).floatValue());
         this.id_class[id_throws[12]] = var10;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1406270259;
   }

   public float id_class() {
      return this.id_class[id_throws[15]] > id_case[2] ? (Float)this.id_class[id_throws[16]] - this.id_byte() : id_case[3] - this.id_byte();
   }

   public void id_break() {
      Float var5 = id_case[4];
      this.id_class[id_throws[17]] = var5;
      Float var6 = id_case[5];
      this.id_class[id_throws[18]] = var6;
      Float var7 = id_case[6];
      this.id_class[id_throws[19]] = var7;
   }

   public void id_throws() {
      Float var5 = id_case[7];
      this.id_class[id_throws[20]] = var5;
      Float var6 = id_case[8];
      this.id_class[id_throws[21]] = var6;
   }

   private static void id_finally() {
      id_byte = new byte[]{6, 2, 3, 4, 5};
   }

   public float id_catch() {
      if ((Float)this.id_class[id_throws[22]] >= id_case[9]) {
         Boolean var5 = id_catch[5];
         this.id_class[id_throws[23]] = var5;
      } else if ((Float)this.id_class[id_throws[24]] <= id_case[10]) {
         Boolean var6 = id_catch[6];
         this.id_class[id_throws[25]] = var6;
      }

      this.id_class((Boolean)this.id_class[id_throws[26]]);
      return (Float)this.id_class[id_throws[27]];
   }

   private static void id_extends() {
      id_protected = new double[]{0.01, 0.0, 1.0, 1.0E-10, 1.0E-10, 1.0E-10};
   }

   @Override
   public boolean id_case() {
      return (double)this.id_byte() > id_protected[3] ? id_catch[1] : id_catch[2];
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{1.0E-10};
      id_break = var0;
   }

   @Override
   public boolean id_protected() {
      return (double)Math.abs(this.id_byte() - (Float)this.id_class[id_throws[14]]) < id_protected[4] ? id_catch[3] : id_catch[4];
   }

   private static void id_private() {
      id_case = new float[]{1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_final() {
      id_throws = new short[]{5, 1, 0, 0, 3, 0, 4, 1, 1, 4, 0, 4, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 4, 5, 4, 5, 5, 2};
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[id_byte[0]];
         Object[] var1 = this.id_class;
         var1[id_catch[7]] = id_case[11];
         var1[id_byte[1]] = id_case[12];
         var1[id_byte[2]] = id_case[13];
         var1[id_byte[3]] = id_case[14];
         var1[id_byte[4]] = id_catch[8];
      }
   }

   private static void id_native() {
      id_catch = new boolean[]{true, true, false, true, false, false, true, true, false, true, false};
   }
}
