package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkH extends rrky_1 {
   private int[][] class_;
   private static final int break_ = Integer.MIN_VALUE;

   public rrkH(String var1) {
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
         this.class_[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   public int[] class_() {
      int var1 = this.protected_();
      return this.class_[var1];
   }

   public void class_(int var1, int var2, int var3, int var4) {
      int var5 = this.protected_();
      int[] var6 = this.class_[var5];
      if (var6[0] != var1 || var6[1] != var2 || var6[2] != var3 || var6[3] != var4) {
         var6[0] = var1;
         var6[1] = var2;
         var6[2] = var3;
         var6[3] = var4;
         int var7 = this.throws_();
         if (var7 >= 0) {
            finally_();
            ARBShaderObjects.glUniform4iARB(var7, var1, var2, var3, var4);
            this.implements_();
         }
      }
   }

   @Override
   protected void break_() {
      this.class_ = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
