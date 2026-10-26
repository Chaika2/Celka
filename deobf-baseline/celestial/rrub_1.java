package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrub_1 {
   private static byte[] id_break;
   public Object[] id_class;
   private static short[] id_byte;
   private static boolean[] id_protected;
   private static float[] id_throws;

   public void id_byte(rrub_1 var1) {
      Float var6 = (Float)var1.id_class[id_byte[6]];
      this.id_class[id_byte[7]] = var6;
      Float var7 = (Float)var1.id_class[id_byte[8]];
      this.id_class[id_byte[9]] = var7;
      Float var8 = (Float)var1.id_class[id_byte[10]];
      this.id_class[id_byte[11]] = var8;
   }

   public rrub_1 id_byte() {
      return new rrub_1((Float)this.id_class[id_byte[3]], (Float)this.id_class[id_byte[4]], (Float)this.id_class[id_byte[5]]);
   }

   public rrub_1 id_byte(float var1) {
      Float var6 = (Float)this.id_class[id_byte[30]] / var1;
      this.id_class[id_byte[31]] = var6;
      Float var7 = (Float)this.id_class[id_byte[32]] / var1;
      this.id_class[id_byte[33]] = var7;
      Float var8 = (Float)this.id_class[id_byte[34]] / var1;
      this.id_class[id_byte[35]] = var8;
      return this;
   }

   public rrub_1(float var1, float var2, float var3) {
      this.id_case();
      Float var8 = var1;
      this.id_class[id_byte[0]] = var8;
      Float var9 = var2;
      this.id_class[id_byte[1]] = var9;
      Float var10 = var3;
      this.id_class[id_byte[2]] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Vector2 [x=" + (Float)this.id_class[id_byte[61]] + ", y=" + (Float)this.id_class[id_byte[62]] + "]";
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 46, -94, 127, -23, 43, 50, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1700558039;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6085155448754543998L;
   }

   public float id_class() {
      return (Float)this.id_class[id_byte[63]] * (Float)this.id_class[id_byte[64]]
         + (Float)this.id_class[id_byte[65]] * (Float)this.id_class[id_byte[66]]
         + (Float)this.id_class[id_byte[67]] * (Float)this.id_class[id_byte[68]];
   }

   public rrub_1 id_class(float var1) {
      float var2 = (Float)this.id_class[id_byte[57]];
      float var3 = (Float)this.id_class[id_byte[58]];
      var1 = (float)Math.toRadians((double)var1);
      Float var8 = rfU_2.id_break(var1) * var2 - rfU_2.id_class(var1) * var3;
      this.id_class[id_byte[59]] = var8;
      Float var9 = rfU_2.id_class(var1) * var2 + rfU_2.id_break(var1) * var3;
      this.id_class[id_byte[60]] = var9;
      return this;
   }

   public rrub_1 id_class(rrub_1 var1) {
      Float var6 = (Float)this.id_class[id_byte[12]] + (Float)var1.id_class[id_byte[13]];
      this.id_class[id_byte[14]] = var6;
      Float var7 = (Float)this.id_class[id_byte[15]] + (Float)var1.id_class[id_byte[16]];
      this.id_class[id_byte[17]] = var7;
      Float var8 = (Float)this.id_class[id_byte[18]] + (Float)var1.id_class[id_byte[19]];
      this.id_class[id_byte[20]] = var8;
      return this;
   }

   public rrub_1 id_break(rrub_1 var1) {
      Float var6 = (Float)this.id_class[id_byte[21]] - (Float)var1.id_class[id_byte[22]];
      this.id_class[id_byte[23]] = var6;
      Float var7 = (Float)this.id_class[id_byte[24]] - (Float)var1.id_class[id_byte[25]];
      this.id_class[id_byte[26]] = var7;
      Float var8 = (Float)this.id_class[id_byte[27]] - (Float)var1.id_class[id_byte[28]];
      this.id_class[id_byte[29]] = var8;
      return this;
   }

   public rrub_1 id_break() {
      float var1 = rfU_2.id_byte(
         (Float)this.id_class[id_byte[42]] * (Float)this.id_class[id_byte[43]]
            + (Float)this.id_class[id_byte[44]] * (Float)this.id_class[id_byte[45]]
            + (Float)this.id_class[id_byte[46]] * (Float)this.id_class[id_byte[47]]
      );
      if (var1 < id_throws[0]) {
         Float var6 = id_throws[1];
         this.id_class[id_byte[48]] = var6;
         Float var7 = id_throws[2];
         this.id_class[id_byte[49]] = var7;
         Float var8 = id_throws[3];
         this.id_class[id_byte[50]] = var8;
      } else {
         Float var9 = (Float)this.id_class[id_byte[51]] / var1;
         this.id_class[id_byte[52]] = var9;
         Float var10 = (Float)this.id_class[id_byte[53]] / var1;
         this.id_class[id_byte[54]] = var10;
         Float var11 = (Float)this.id_class[id_byte[55]] / var1;
         this.id_class[id_byte[56]] = var11;
      }

      return this;
   }

   public rrub_1 id_break(float var1) {
      Float var6 = (Float)this.id_class[id_byte[36]] * var1;
      this.id_class[id_byte[37]] = var6;
      Float var7 = (Float)this.id_class[id_byte[38]] * var1;
      this.id_class[id_byte[39]] = var7;
      Float var8 = (Float)this.id_class[id_byte[40]] * var1;
      this.id_class[id_byte[41]] = var8;
      return this;
   }

   private static void id_throws() {
      id_throws = new float[]{1.0E-4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_catch() {
      id_byte = new short[]{
         0,
         1,
         2,
         0,
         1,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         0,
         0,
         1,
         1,
         1,
         2,
         2,
         2,
         0,
         0,
         0,
         1,
         1,
         1,
         2,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         1,
         2,
         0,
         0,
         1,
         1,
         2,
         2,
         0,
         1,
         0,
         1,
         0,
         1,
         0,
         0,
         1,
         1,
         2,
         2
      };
   }

   private void id_case() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[0]];
         Object[] var1 = this.id_class;
         var1[id_protected[0]] = id_throws[4];
         var1[id_protected[1]] = id_throws[5];
         var1[id_break[1]] = id_throws[6];
      }
   }

   private static void id_protected() {
      id_break = new byte[]{3, 2};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, true};
   }
}
