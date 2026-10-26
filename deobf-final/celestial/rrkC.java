package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkC extends rrky_1 {
   private float[][] class_;
   private static final float break_ = -Float.MAX_VALUE;

   public rrkC(String var1) {
      super(var1);
      this.break_();
   }

   @Override
   protected void class_(int var1) {
      if (var1 >= this.class_.length) {
         float[][] var2 = this.class_;
         float[][] var3 = new float[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.class_ = var3;
      }

      if (this.class_[var1] == null) {
         this.class_[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   public float[] class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void class_(float var1, float var2, float var3) {
      int var4 = this.protected_();
      float[] var5 = this.class_[var4];
      if (var5[0] != var1 || var5[1] != var2 || var5[2] != var3) {
         var5[0] = var1;
         var5[1] = var2;
         var5[2] = var3;
         int var6 = this.throws_();
         if (var6 >= 0) {
            finally_();
            ARBShaderObjects.glUniform3fARB(var6, var1, var2, var3);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
