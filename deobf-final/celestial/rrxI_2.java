package celestial;

public class rrxI_2 extends yt_3 {
   private static rrxI_2 private_ = new rrxI_2();
   float[] break_ = new float[6];
   float[][] byte_ = new float[10][4];
   int protected_;
   float[] throws_ = new float[16];
   float[] case_ = new float[4];
   float[][] catch_;

   private void byte_(float[] var1) {
      this.break_(this.byte_[this.protected_++], var1);
   }

   public rrxI_2() {
      super((rjV_2)null, (rjV_2)null);
   }

   private double class_(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private void class_(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private float class_(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private float class_(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.class_(var1 - var4, var2 - var5, var3 - var6);
   }

   private void class_(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.class_(this.case_, var2, var3);
      this.class_(var1, this.case_, var4);
      this.break_(var1);
      float var5 = (float)this.class_(var2, var3);
      float var6 = (float)this.class_(var1, var3);
      float var7 = this.class_(var1[0], var1[1], var1[2], var3[0] * var6, var3[1] * var6, var3[2] * var6);
      float var8 = this.class_(var2[0], var2[1], var2[2], var3[0] * var5, var3[1] * var5, var3[2] * var5);
      float var9 = var7 / var8;
      float var10 = (float)this.class_(var1, var2);
      float var11 = this.class_(var1[0], var1[1], var1[2], var2[0] * var10, var2[1] * var10, var2[2] * var10);
      float var12 = this.class_(var3[0], var3[1], var3[2], var2[0] * var5, var2[1] * var5, var2[2] * var5);
      float var13 = var11 / var12;
      var1[3] = var2[3] * var9 + var3[3] * var13;
   }

   private void class_(float[] var1) {
      float var2 = rfU_2.byte_(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   private double class_(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   private void class_(float[] var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var6;
      var1[1] = var3 / var6;
      var1[2] = var4 / var6;
      var1[3] = var5 / var6;
   }

   private void break_(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   @Override
   public boolean break_(double var1, double var3, double var5, double var7, double var9, double var11) {
      for (int var13 = 0; var13 < this.protected_; var13++) {
         float[] var14 = this.byte_[var13];
         if (this.class_(var14, var1, var3, var5) <= 0.0
            && this.class_(var14, var7, var3, var5) <= 0.0
            && this.class_(var14, var1, var9, var5) <= 0.0
            && this.class_(var14, var7, var9, var5) <= 0.0
            && this.class_(var14, var1, var3, var11) <= 0.0
            && this.class_(var14, var7, var3, var11) <= 0.0
            && this.class_(var14, var1, var9, var11) <= 0.0
            && this.class_(var14, var7, var9, var11) <= 0.0) {
            return false;
         }
      }

      return true;
   }

   private void break_(float[] var1) {
      float var2 = rfU_2.byte_(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if (var2 == 0.0F) {
         var2 = 1.0F;
      }

      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
   }

   public static yt_3 throws_() {
      private_.case_();
      return private_;
   }

   public void case_() {
   }
}
