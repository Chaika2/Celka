package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkA extends rrky_1 {
   private float[][] class_;
   private static final float break_ = -Float.MAX_VALUE;

   public rrkA(String var1) {
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
         this.class_[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   public float[] class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void class_(float var1, float var2) {
      int var3 = this.protected_();
      float[] var4 = this.class_[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.throws_();
         if (var5 >= 0) {
            finally_();
            ARBShaderObjects.glUniform2fARB(var5, var1, var2);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
