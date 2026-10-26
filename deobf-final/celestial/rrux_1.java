package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrux_1 {
   private static short[] break_;
   public Object[] class_;
   private static boolean[] byte_;
   private static float[] protected_;
   private static byte[] throws_;

   public void byte_(rrux_1 var1) {
      Float var6 = (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)var1.class_[1];
      this.class_[1] = var7;
   }

   public rrux_1 byte_(float var1) {
      float var2 = (Float)this.class_[0];
      float var3 = (Float)this.class_[1];
      var1 = (float)Math.toRadians((double)var1);
      Float var8 = rfU_2.break_(var1) * var2 - rfU_2.class_(var1) * var3;
      this.class_[0] = var8;
      Float var9 = rfU_2.class_(var1) * var2 + rfU_2.break_(var1) * var3;
      this.class_[1] = var9;
      return this;
   }

   private static void byte_() {
      break_ = new short[]{0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1};
   }

   public rrux_1(float var1, float var2) {
      this.throws_();
      Float var7 = var1;
      this.class_[0] = var7;
      Float var8 = var2;
      this.class_[1] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public String toString() {
      return "Vector2 [x=" + (Float)this.class_[0] + ", y=" + (Float)this.class_[1] + "]";
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ -7003159045980163769L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{92, -58, 116, 72, -35, 112, 20, 75}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public rrux_1 class_() {
      float var1 = rfU_2.byte_((Float)this.class_[0] * (Float)this.class_[0] + (Float)this.class_[1] * (Float)this.class_[1]);
      if (var1 < 1.0E-4F) {
         Float var6 = 0.0F;
         this.class_[0] = var6;
         Float var7 = 0.0F;
         this.class_[1] = var7;
      } else {
         Float var8 = (Float)this.class_[0] / var1;
         this.class_[0] = var8;
         Float var9 = (Float)this.class_[1] / var1;
         this.class_[1] = var9;
      }

      return this;
   }

   public rrux_1 class_(rrux_1 var1) {
      Float var6 = (Float)this.class_[0] + (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] + (Float)var1.class_[1];
      this.class_[1] = var7;
      return this;
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1119031868;
   }

   public rrux_1 class_(float var1) {
      Float var6 = (Float)this.class_[0] / var1;
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] / var1;
      this.class_[1] = var7;
      return this;
   }

   public rrux_1 break_(float var1) {
      Float var6 = (Float)this.class_[0] * var1;
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] * var1;
      this.class_[1] = var7;
      return this;
   }

   public rrux_1 break_() {
      return new rrux_1((Float)this.class_[0], (Float)this.class_[1]);
   }

   public rrux_1 break_(rrux_1 var1) {
      Float var6 = (Float)this.class_[0] - (Float)var1.class_[0];
      this.class_[0] = var6;
      Float var7 = (Float)this.class_[1] - (Float)var1.class_[1];
      this.class_[1] = var7;
      return this;
   }

   private void throws_() {
      if (this.class_ == null) {
         this.class_ = new Object[2];
         Object[] var1 = this.class_;
         var1[0] = 0.0F;
         var1[1] = 0.0F;
      }
   }

   private static void catch_() {
      protected_ = new float[]{1.0E-4F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   private static void case_() {
      throws_ = new byte[]{2};
   }

   private static void protected_() {
      byte_ = new boolean[]{false, true};
   }
}
