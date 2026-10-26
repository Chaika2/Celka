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
      return (Float)this.id_class[2];
   }

   public rrNM(float var1) {
      this((rrQK)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[3]], var1);
   }

   public rrNM(rrQK var1, float var2) {
      this.id_volatile();
      Boolean var7 = true;
      this.id_class[5] = var7;
      Float var8 = var2;
      this.id_class[1] = var8;
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
      Float var8 = var1 ? 1.0F : id_case[1];
      this.id_class[3] = var8;
      if (!this.id_protected()) {
         double var2 = (Double)rrQo_1.id_class[id_throws[5]] * 0.01;
         Float var9 = (float)rfU_2.id_class(
            (double)((Float)this.id_class[4]).floatValue()
               + (var1 ? (double)((Float)this.id_class[1]).floatValue() * var2 : (double)(-(Float)this.id_class[1]) * var2),
            id_protected[1],
            1.0
         );
         this.id_class[4] = var9;
         Float var10 = (float)((rrQK)this.id_class[id_throws[10]]).id_class((double)((Float)this.id_class[4]).floatValue());
         this.id_class[2] = var10;
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1406270259;
   }

   public float id_class() {
      return this.id_class[3] > 1.0F ? (Float)this.id_class[3] - this.id_byte() : 1.0F - this.id_byte();
   }

   public void id_break() {
      Float var5 = id_case[4];
      this.id_class[2] = var5;
      Float var6 = id_case[5];
      this.id_class[4] = var6;
      Float var7 = id_case[6];
      this.id_class[3] = var7;
   }

   public void id_throws() {
      Float var5 = 1.0F;
      this.id_class[2] = var5;
      Float var6 = 1.0F;
      this.id_class[3] = var6;
   }

   private static void id_finally() {
      id_byte = new byte[]{6, 2, 3, 4, 5};
   }

   public float id_catch() {
      if ((Float)this.id_class[4] >= 1.0F) {
         Boolean var5 = id_catch[5];
         this.id_class[5] = var5;
      } else if ((Float)this.id_class[4] <= id_case[10]) {
         Boolean var6 = true;
         this.id_class[5] = var6;
      }

      this.id_class((Boolean)this.id_class[5]);
      return (Float)this.id_class[2];
   }

   private static void id_extends() {
      id_protected = new double[]{0.01, 0.0, 1.0, 1.0E-10, 1.0E-10, 1.0E-10};
   }

   @Override
   public boolean id_case() {
      return (double)this.id_byte() > 1.0E-10 ? true : id_catch[2];
   }

   private static void id_implements() {
      Object[] var0 = new Object[]{1.0E-10};
      id_break = var0;
   }

   @Override
   public boolean id_protected() {
      return (double)Math.abs(this.id_byte() - (Float)this.id_class[3]) < 1.0E-10 ? true : id_catch[4];
   }

   private static void id_private() {
      id_case = new float[]{1.0F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_final() {
      id_throws = new short[]{5, 1, 0, 0, 3, 0, 4, 1, 1, 4, 0, 4, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 4, 5, 4, 5, 5, 2};
   }

   private void id_volatile() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         Object[] var1 = this.id_class;
         var1[1] = id_case[11];
         var1[2] = id_case[12];
         var1[3] = id_case[13];
         var1[4] = id_case[14];
         var1[5] = id_catch[8];
      }
   }

   private static void id_native() {
      id_catch = new boolean[]{true, true, false, true, false, false, true, true, false, true, false};
   }
}
