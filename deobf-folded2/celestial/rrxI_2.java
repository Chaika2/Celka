package celestial;

public class rrxI_2 extends yt_3 {
   private static rrxI_2 id_private = new rrxI_2();
   float[] id_break = new float[6];
   float[][] id_byte = new float[10][4];
   int id_protected;
   float[] id_throws = new float[16];
   float[] id_case = new float[4];
   float[][] id_catch;

   private void id_byte(float[] var1) {
      this.id_break(this.id_byte[this.id_protected++], var1);
   }

   public rrxI_2() {
      super((rjV_2)null, (rjV_2)null);
   }

   private double id_class(float[] var1, double var2, double var4, double var6) {
      return (double)var1[0] * var2 + (double)var1[1] * var4 + (double)var1[2] * var6 + (double)var1[3];
   }

   private void id_class(float[] var1, float[] var2, float[] var3) {
      var1[0] = var2[1] * var3[2] - var2[2] * var3[1];
      var1[1] = var2[2] * var3[0] - var2[0] * var3[2];
      var1[2] = var2[0] * var3[1] - var2[1] * var3[0];
   }

   private float id_class(float var1, float var2, float var3) {
      return (float)Math.sqrt((double)(var1 * var1 + var2 * var2 + var3 * var3));
   }

   private float id_class(float var1, float var2, float var3, float var4, float var5, float var6) {
      return this.id_class(var1 - var4, var2 - var5, var3 - var6);
   }

   private void id_class(float[] var1, float[] var2, float[] var3, float[] var4) {
      this.id_class(this.id_case, var2, var3);
      this.id_class(var1, this.id_case, var4);
      this.id_break(var1);
      float var5 = (float)this.id_class(var2, var3);
      float var6 = (float)this.id_class(var1, var3);
      float var7 = this.id_class(var1[0], var1[1], var1[2], var3[0] * var6, var3[1] * var6, var3[2] * var6);
      float var8 = this.id_class(var2[0], var2[1], var2[2], var3[0] * var5, var3[1] * var5, var3[2] * var5);
      float var9 = var7 / var8;
      float var10 = (float)this.id_class(var1, var2);
      float var11 = this.id_class(var1[0], var1[1], var1[2], var2[0] * var10, var2[1] * var10, var2[2] * var10);
      float var12 = this.id_class(var3[0], var3[1], var3[2], var2[0] * var5, var2[1] * var5, var2[2] * var5);
      float var13 = var11 / var12;
      var1[3] = var2[3] * var9 + var3[3] * var13;
   }

   private void id_class(float[] var1) {
      float var2 = rfU_2.id_byte(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
      var1[3] /= var2;
   }

   private double id_class(float[] var1, float[] var2) {
      return (double)var1[0] * (double)var2[0] + (double)var1[1] * (double)var2[1] + (double)var1[2] * (double)var2[2];
   }

   private void id_class(float[] var1, float var2, float var3, float var4, float var5) {
      float var6 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4));
      var1[0] = var2 / var6;
      var1[1] = var3 / var6;
      var1[2] = var4 / var6;
      var1[3] = var5 / var6;
   }

   private void id_break(float[] var1, float[] var2) {
      var1[0] = var2[0];
      var1[1] = var2[1];
      var1[2] = var2[2];
      var1[3] = var2[3];
   }

   @Override
   public boolean id_break(double var1, double var3, double var5, double var7, double var9, double var11) {
      for (int var13 = 0; var13 < this.id_protected; var13++) {
         float[] var14 = this.id_byte[var13];
         if (this.id_class(var14, var1, var3, var5) <= 0.0
            && this.id_class(var14, var7, var3, var5) <= 0.0
            && this.id_class(var14, var1, var9, var5) <= 0.0
            && this.id_class(var14, var7, var9, var5) <= 0.0
            && this.id_class(var14, var1, var3, var11) <= 0.0
            && this.id_class(var14, var7, var3, var11) <= 0.0
            && this.id_class(var14, var1, var9, var11) <= 0.0
            && this.id_class(var14, var7, var9, var11) <= 0.0) {
            return false;
         }
      }

      return true;
   }

   private void id_break(float[] var1) {
      float var2 = rfU_2.id_byte(var1[0] * var1[0] + var1[1] * var1[1] + var1[2] * var1[2]);
      if (var2 == 0.0F) {
         var2 = 1.0F;
      }

      var1[0] /= var2;
      var1[1] /= var2;
      var1[2] /= var2;
   }

   public static yt_3 id_throws() {
      id_private.id_case();
      return id_private;
   }

   public void id_case() {
   }
}
