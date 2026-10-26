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
      Float var6 = (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)var1.id_class[1];
      this.id_class[1] = var7;
      Float var8 = (Float)var1.id_class[2];
      this.id_class[2] = var8;
   }

   public rrub_1 id_byte() {
      return new rrub_1((Float)this.id_class[0], (Float)this.id_class[1], (Float)this.id_class[2]);
   }

   public rrub_1 id_byte(float var1) {
      Float var6 = (Float)this.id_class[0] / var1;
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] / var1;
      this.id_class[1] = var7;
      Float var8 = (Float)this.id_class[2] / var1;
      this.id_class[2] = var8;
      return this;
   }

   public rrub_1(float var1, float var2, float var3) {
      this.id_case();
      Float var8 = var1;
      this.id_class[0] = var8;
      Float var9 = var2;
      this.id_class[1] = var9;
      Float var10 = var3;
      this.id_class[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Vector2 [x=" + (Float)this.id_class[0] + ", y=" + (Float)this.id_class[1] + "]";
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
      return (Float)this.id_class[0] * (Float)this.id_class[0]
         + (Float)this.id_class[1] * (Float)this.id_class[1]
         + (Float)this.id_class[2] * (Float)this.id_class[2];
   }

   public rrub_1 id_class(float var1) {
      float var2 = (Float)this.id_class[0];
      float var3 = (Float)this.id_class[1];
      var1 = (float)Math.toRadians((double)var1);
      Float var8 = rfU_2.id_break(var1) * var2 - rfU_2.id_class(var1) * var3;
      this.id_class[0] = var8;
      Float var9 = rfU_2.id_class(var1) * var2 + rfU_2.id_break(var1) * var3;
      this.id_class[1] = var9;
      return this;
   }

   public rrub_1 id_class(rrub_1 var1) {
      Float var6 = (Float)this.id_class[0] + (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] + (Float)var1.id_class[1];
      this.id_class[1] = var7;
      Float var8 = (Float)this.id_class[2] + (Float)var1.id_class[2];
      this.id_class[2] = var8;
      return this;
   }

   public rrub_1 id_break(rrub_1 var1) {
      Float var6 = (Float)this.id_class[0] - (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] - (Float)var1.id_class[1];
      this.id_class[1] = var7;
      Float var8 = (Float)this.id_class[2] - (Float)var1.id_class[2];
      this.id_class[2] = var8;
      return this;
   }

   public rrub_1 id_break() {
      float var1 = rfU_2.id_byte(
         (Float)this.id_class[0] * (Float)this.id_class[0]
            + (Float)this.id_class[1] * (Float)this.id_class[1]
            + (Float)this.id_class[2] * (Float)this.id_class[2]
      );
      if (var1 < 1.0E-4F) {
         Float var6 = 0.0F;
         this.id_class[0] = var6;
         Float var7 = 0.0F;
         this.id_class[1] = var7;
         Float var8 = 0.0F;
         this.id_class[2] = var8;
      } else {
         Float var9 = (Float)this.id_class[0] / var1;
         this.id_class[0] = var9;
         Float var10 = (Float)this.id_class[1] / var1;
         this.id_class[1] = var10;
         Float var11 = (Float)this.id_class[2] / var1;
         this.id_class[2] = var11;
      }

      return this;
   }

   public rrub_1 id_break(float var1) {
      Float var6 = (Float)this.id_class[0] * var1;
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] * var1;
      this.id_class[1] = var7;
      Float var8 = (Float)this.id_class[2] * var1;
      this.id_class[2] = var8;
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
         this.id_class = new Object[3];
         Object[] var1 = this.id_class;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
      }
   }

   private static void id_protected() {
      id_break = new byte[]{3, 2};
   }

   private static void id_private() {
      id_protected = new boolean[]{false, true};
   }
}
