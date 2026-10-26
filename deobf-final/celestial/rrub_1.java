package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrub_1 {
   private static byte[] break_;
   public Object[] class_;
   private static short[] byte_;
   private static boolean[] protected_;
   private static float[] throws_;

   public void byte_(rrub_1 var1) {
      Float var6 = (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)var1.class_[1];
      this.class_[1] = var7;
      Float var8 = (Float)var1.class_[2];
      this.class_[2] = var8;
   }

   public rrub_1 byte_() {
      return new rrub_1((Float)this.class_[0], (Float)this.class_[1], (Float)this.class_[2]);
   }

   public rrub_1 byte_(float var1) {
      Float var6 = (Float)this.class_[0] / var1;
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] / var1;
      this.class_[1] = var7;
      Float var8 = (Float)this.class_[2] / var1;
      this.class_[2] = var8;
      return this;
   }

   public rrub_1(float var1, float var2, float var3) {
      this.case_();
      Float var8 = var1;
      this.class_[0] = var8;
      Float var9 = var2;
      this.class_[1] = var9;
      Float var10 = var3;
      this.class_[2] = var10;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Vector2 [x=" + (Float)this.class_[0] + ", y=" + (Float)this.class_[1] + "]";
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{37, 46, -94, 127, -23, 43, 50, -70}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -1700558039;
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6085155448754543998L;
   }

   public float class_() {
      return (Float)this.class_[0] * (Float)this.class_[0] + (Float)this.class_[1] * (Float)this.class_[1] + (Float)this.class_[2] * (Float)this.class_[2];
   }

   public rrub_1 class_(float var1) {
      float var2 = (Float)this.class_[0];
      float var3 = (Float)this.class_[1];
      var1 = (float)Math.toRadians((double)var1);
      Float var8 = rfU_2.break_(var1) * var2 - rfU_2.class_(var1) * var3;
      this.class_[0] = var8;
      Float var9 = rfU_2.class_(var1) * var2 + rfU_2.break_(var1) * var3;
      this.class_[1] = var9;
      return this;
   }

   public rrub_1 class_(rrub_1 var1) {
      Float var6 = (Float)this.class_[0] + (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] + (Float)var1.class_[1];
      this.class_[1] = var7;
      Float var8 = (Float)this.class_[2] + (Float)var1.class_[2];
      this.class_[2] = var8;
      return this;
   }

   public rrub_1 break_(rrub_1 var1) {
      Float var6 = (Float)this.class_[0] - (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] - (Float)var1.class_[1];
      this.class_[1] = var7;
      Float var8 = (Float)this.class_[2] - (Float)var1.class_[2];
      this.class_[2] = var8;
      return this;
   }

   public rrub_1 break_() {
      float var1 = rfU_2.byte_(
         (Float)this.class_[0] * (Float)this.class_[0] + (Float)this.class_[1] * (Float)this.class_[1] + (Float)this.class_[2] * (Float)this.class_[2]
      );
      if (var1 < 1.0E-4F) {
         Float var6 = 0.0F;
         this.class_[0] = var6;
         Float var7 = 0.0F;
         this.class_[1] = var7;
         Float var8 = 0.0F;
         this.class_[2] = var8;
      } else {
         Float var9 = (Float)this.class_[0] / var1;
         this.class_[0] = var9;
         Float var10 = (Float)this.class_[1] / var1;
         this.class_[1] = var10;
         Float var11 = (Float)this.class_[2] / var1;
         this.class_[2] = var11;
      }

      return this;
   }

   public rrub_1 break_(float var1) {
      Float var6 = (Float)this.class_[0] * var1;
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] * var1;
      this.class_[1] = var7;
      Float var8 = (Float)this.class_[2] * var1;
      this.class_[2] = var8;
      return this;
   }

   private static void throws_() {
      throws_ = new float[]{1.0E-4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void catch_() {
      byte_ = new short[]{
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

   private void case_() {
      if (this.class_ == null) {
         this.class_ = new Object[3];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
      }
   }

   private static void protected_() {
      break_ = new byte[]{3, 2};
   }

   private static void private_() {
      protected_ = new boolean[]{false, true};
   }
}
