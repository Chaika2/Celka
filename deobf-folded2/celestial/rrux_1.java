package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrux_1 {
   private static short[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static float[] id_protected;
   private static byte[] id_throws;

   public void id_byte(rrux_1 var1) {
      Float var6 = (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)var1.id_class[1];
      this.id_class[1] = var7;
   }

   public rrux_1 id_byte(float var1) {
      float var2 = (Float)this.id_class[0];
      float var3 = (Float)this.id_class[1];
      var1 = (float)Math.toRadians((double)var1);
      Float var8 = rfU_2.id_break(var1) * var2 - rfU_2.id_class(var1) * var3;
      this.id_class[0] = var8;
      Float var9 = rfU_2.id_class(var1) * var2 + rfU_2.id_break(var1) * var3;
      this.id_class[1] = var9;
      return this;
   }

   private static void id_byte() {
      id_break = new short[]{
         0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1
      };
   }

   public rrux_1(float var1, float var2) {
      this.id_throws();
      Float var7 = var1;
      this.id_class[0] = var7;
      Float var8 = var2;
      this.id_class[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Vector2 [x=" + (Float)this.id_class[0] + ", y=" + (Float)this.id_class[1] + "]";
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7003159045980163769L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -58, 116, 72, -35, 112, 20, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrux_1 id_class() {
      float var1 = rfU_2.id_byte((Float)this.id_class[0] * (Float)this.id_class[0] + (Float)this.id_class[1] * (Float)this.id_class[1]);
      if (var1 < 1.0E-4F) {
         Float var6 = 0.0F;
         this.id_class[0] = var6;
         Float var7 = 0.0F;
         this.id_class[1] = var7;
      } else {
         Float var8 = (Float)this.id_class[0] / var1;
         this.id_class[0] = var8;
         Float var9 = (Float)this.id_class[1] / var1;
         this.id_class[1] = var9;
      }

      return this;
   }

   public rrux_1 id_class(rrux_1 var1) {
      Float var6 = (Float)this.id_class[0] + (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] + (Float)var1.id_class[1];
      this.id_class[1] = var7;
      return this;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1119031868;
   }

   public rrux_1 id_class(float var1) {
      Float var6 = (Float)this.id_class[0] / var1;
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] / var1;
      this.id_class[1] = var7;
      return this;
   }

   public rrux_1 id_break(float var1) {
      Float var6 = (Float)this.id_class[0] * var1;
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] * var1;
      this.id_class[1] = var7;
      return this;
   }

   public rrux_1 id_break() {
      return new rrux_1((Float)this.id_class[0], (Float)this.id_class[1]);
   }

   public rrux_1 id_break(rrux_1 var1) {
      Float var6 = (Float)this.id_class[0] - (Float)var1.id_class[0];
      this.id_class[0] = var6;
      Float var7 = (Float)this.id_class[1] - (Float)var1.id_class[1];
      this.id_class[1] = var7;
      return this;
   }

   private void id_throws() {
      if (this.id_class == null) {
         this.id_class = new Object[2];
         Object[] var1 = this.id_class;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
      }
   }

   private static void id_catch() {
      id_protected = new float[]{1.0E-4F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void id_case() {
      id_throws = new byte[]{2};
   }

   private static void id_protected() {
      id_byte = new boolean[]{false, true};
   }
}
