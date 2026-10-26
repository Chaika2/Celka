package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZH {
   public Object[] class_;
   private static boolean[] break_;
   private static float[] byte_;
   private static byte[] protected_;
   private static short[] throws_;

   public void byte_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
   }

   public boolean byte_() {
      return this.class_[2] < 0.0F ? true : break_[3];
   }

   public rrZH(float var1) {
      this.native_();
      rrNb_1 var6 = new rrNb_1((double)var1);
      this.class_[0] = var6;
   }

   static {
      ntfClinit();
   }

   public void class_(float var1, float var2) {
      Float var7 = var1;
      this.class_[3] = var7;
      Float var8 = var2;
      this.class_[4] = var8;
      Float var9 = rfU_2.class_((Float)this.class_[1], Math.min(0.0F, -(Float)this.class_[3] + (Float)this.class_[4]), 0.0F);
      this.class_[1] = var9;
      ((rrNb_1)this.class_[0]).protected_();
      ((rrNb_1)this.class_[0]).class_((double)((Float)this.class_[1]).floatValue());
      Float var10 = (float)((rrNb_1)this.class_[0]).byte_();
      this.class_[2] = var10;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-105, 94, -8, -46, -91, -106, -21, 63}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6343495421969258788L;
   }

   public boolean class_() {
      return this.class_[2] > -this.class_[3] + this.class_[4] + 1.0F ? true : break_[1];
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 55643970;
   }

   public void class_(float var1) {
      Float var6 = var1;
      this.class_[1] = var6;
      Float var7 = var1;
      this.class_[2] = var7;
      ((rrNb_1)this.class_[0]).class_(var1);
   }

   public boolean class_(boolean var1, double var2, double var4) {
      if (var1) {
         Float var10 = (Float)this.class_[1] + (float)(var2 * var4);
         this.class_[1] = var10;
      }

      return var1;
   }

   public void break_(float var1) {
      Float var6 = var1;
      this.class_[2] = var6;
   }

   public float break_() {
      return (Float)this.class_[1];
   }

   public float throws_() {
      return -(Float)this.class_[3] + (Float)this.class_[4];
   }

   private static void finally_() {
      byte_ = new float[]{0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F};
   }

   public rrNb_1 catch_() {
      return (rrNb_1)this.class_[0];
   }

   private static void extends_() {
      protected_ = new byte[]{5, 2, 3, 4};
   }

   public float case_() {
      return (Float)this.class_[2];
   }

   private static void implements_() {
      break_ = new boolean[]{true, false, true, false, true};
   }

   public void protected_() {
      ((rrNb_1)this.class_[0]).case_();
      Float var5 = 0.0F;
      this.class_[1] = var5;
   }

   private static void private_() {
      throws_ = new short[]{0, 1, 1, 3, 4, 1, 3, 4, 1, 0, 0, 1, 0, 2, 0, 1, 1, 2, 0, 3, 4, 2, 3, 4, 2, 0, 1, 1, 2, 2};
   }

   private void native_() {
      if (this.class_ == null) {
         this.class_ = new Object[5];
         Object[] var1 = this.class_;
         var1[1] = 0.0F;
         var1[2] = 0.0F;
         var1[3] = 0.0F;
         var1[4] = 0.0F;
      }
   }
}
