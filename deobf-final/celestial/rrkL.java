package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkL extends rrky_1 {
   private int[] class_;
   private static final int break_ = Integer.MIN_VALUE;

   public rrkL(String var1) {
      super(var1);
      this.break_();
   }

   @Override
   protected void class_(int var1) {
      if (var1 >= this.class_.length) {
         int[] var2 = this.class_;
         int[] var3 = new int[var1 + 10];
         System.arraycopy(var2, 0, var3, 0, var2.length);

         for (int var4 = var2.length; var4 < var3.length; var4++) {
            var3[var4] = Integer.MIN_VALUE;
         }

         this.class_ = var3;
      }
   }

   public int class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void break_(int var1) {
      int var2 = this.protected_();
      int var3 = this.class_[var2];
      if (var1 != var3) {
         this.class_[var2] = var1;
         int var4 = this.throws_();
         if (var4 >= 0) {
            finally_();
            ARBShaderObjects.glUniform1iARB(var4, var1);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new int[]{Integer.MIN_VALUE};
   }
}
