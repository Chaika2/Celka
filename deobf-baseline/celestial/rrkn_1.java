package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkn_1 extends rrky_1 {
   private int[][] id_class;
   private static final int id_break = Integer.MIN_VALUE;

   public rrkn_1(String var1) {
      super(var1);
      this.id_break();
   }

   @Override
   protected void id_class(int var1) {
      if (var1 >= this.id_class.length) {
         int[][] var2 = this.id_class;
         int[][] var3 = new int[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.id_class = var3;
      }

      if (this.id_class[var1] == null) {
         this.id_class[var1] = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
      }
   }

   public int[] id_class() {
      int var1 = this.id_protected();
      return this.id_class[var1];
   }

   public void id_class(int var1, int var2) {
      int var3 = this.id_protected();
      int[] var4 = this.id_class[var3];
      if (var4[0] != var1 || var4[1] != var2) {
         var4[0] = var1;
         var4[1] = var2;
         int var5 = this.id_throws();
         if (var5 >= 0) {
            id_finally();
            ARBShaderObjects.glUniform2iARB(var5, var1, var2);
            this.id_implements();
         }
      }
   }

   @Override
   protected void id_break() {
      this.id_class = new int[][]{{Integer.MIN_VALUE, Integer.MIN_VALUE}};
   }
}
