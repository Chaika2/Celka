package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZH {
   public Object[] id_class;
   private static boolean[] id_break;
   private static float[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;

   public void id_byte(float var1) {
      Float var6 = var1;
      this.id_class[1] = var6;
   }

   public boolean id_byte() {
      return this.id_class[2] < 0.0F ? true : id_break[3];
   }

   public rrZH(float var1) {
      this.id_native();
      rrNb_1 var6 = new rrNb_1((double)var1);
      this.id_class[0] = var6;
   }

   static {
      ntfClinit();
   }

   public void id_class(float var1, float var2) {
      Float var7 = var1;
      this.id_class[3] = var7;
      Float var8 = var2;
      this.id_class[4] = var8;
      Float var9 = rfU_2.id_class((Float)this.id_class[1], Math.min(0.0F, -(Float)this.id_class[3] + (Float)this.id_class[4]), 0.0F);
      this.id_class[1] = var9;
      ((rrNb_1)this.id_class[0]).id_protected();
      ((rrNb_1)this.id_class[0]).id_class((double)((Float)this.id_class[1]).floatValue());
      Float var10 = (float)((rrNb_1)this.id_class[0]).id_byte();
      this.id_class[2] = var10;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 94, -8, -46, -91, -106, -21, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6343495421969258788L;
   }

   public boolean id_class() {
      return this.id_class[2] > -this.id_class[3] + this.id_class[4] + 1.0F ? true : id_break[1];
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 55643970;
   }

   public void id_class(float var1) {
      Float var6 = var1;
      this.id_class[1] = var6;
      Float var7 = var1;
      this.id_class[2] = var7;
      ((rrNb_1)this.id_class[0]).id_class(var1);
   }

   public boolean id_class(boolean var1, double var2, double var4) {
      if (var1) {
         Float var10 = (Float)this.id_class[1] + (float)(var2 * var4);
         this.id_class[1] = var10;
      }

      return var1;
   }

   public void id_break(float var1) {
      Float var6 = var1;
      this.id_class[2] = var6;
   }

   public float id_break() {
      return (Float)this.id_class[1];
   }

   public float id_throws() {
      return -(Float)this.id_class[3] + (Float)this.id_class[4];
   }

   private static void id_finally() {
      id_byte = new float[]{0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public rrNb_1 id_catch() {
      return (rrNb_1)this.id_class[0];
   }

   private static void id_extends() {
      id_protected = new byte[]{5, 2, 3, 4};
   }

   public float id_case() {
      return (Float)this.id_class[2];
   }

   private static void id_implements() {
      id_break = new boolean[]{true, false, true, false, true};
   }

   public void id_protected() {
      ((rrNb_1)this.id_class[0]).id_case();
      Float var5 = 0.0F;
      this.id_class[1] = var5;
   }

   private static void id_private() {
      id_throws = new short[]{0, 1, 1, 3, 4, 1, 3, 4, 1, 0, 0, 1, 0, 2, 0, 1, 1, 2, 0, 3, 4, 2, 3, 4, 2, 0, 1, 1, 2, 2};
   }

   private void id_native() {
      if (this.id_class == null) {
         this.id_class = new Object[5];
         Object[] var1 = this.id_class;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
      }
   }
}
