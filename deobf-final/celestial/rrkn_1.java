package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkn_1 extends rrky_1 {
   private int[][] class_;
   private static final int break_ = Integer.MIN_VALUE;

   public rrkn_1(String var1) {
      super(var1);
      this.break_();
   }

   @Override
   protected void class_(int var1) {
      if (var1 >= this.class_.length) {
         int[][] var2 = this.class_;
         int[][] var3 = new int[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.class_ = var3;
      }

      if (this.class_[var1] == null) {
         this.class_[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   public int[] class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void class_(int var1, int var2) {
      int var3 = this.protected_();
      int[] var4 = this.class_[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.throws_();
         if (var5 >= 0) {
            finally_();
            ARBShaderObjects.glUniform2iARB(var5, var1, var2);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
