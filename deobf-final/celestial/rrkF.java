package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkF extends rrky_1 {
   private float[] class_;
   private static final float break_ = -Float.MAX_VALUE;

   public rrkF(String var1) {
      super(var1);
      this.break_();
   }

   @Override
   protected void class_(int var1) {
      if (var1 >= this.class_.length) {
         float[] var2 = this.class_;
         float[] var3 = new float[var1 + 10];
         System.arraycopy(var2, 0, var3, 0, var2.length);

         for (int var4 = var2.length; var4 < var3.length; var4++) {
            var3[var4] = -Float.MAX_VALUE;
         }

         this.class_ = var3;
      }
   }

   public float class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void class_(float var1) {
      int var2 = this.protected_();
      float var3 = this.class_[var2];
      if (var1 != var3) {
         this.class_[var2] = var1;
         int var4 = this.throws_();
         if (var4 >= 0) {
            finally_();
            ARBShaderObjects.glUniform1fARB(var4, var1);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new float[]{-Float.MAX_VALUE};
   }
}
