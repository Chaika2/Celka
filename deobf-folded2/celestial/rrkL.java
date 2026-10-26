package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkL extends rrky_1 {
   private int[] id_class;
   private static final int id_break = Integer.MIN_VALUE;

   public rrkL(String var1) {
      super(var1);
      this.id_break();
   }

   @Override
   protected void id_class(int var1) {
      if (var1 >= this.id_class.length) {
         int[] var2 = this.id_class;
         int[] var3 = new int[var1 + 10];
         System.arraycopy(var2, 0, var3, 0, var2.length);

         for (int var4 = var2.length; var4 < var3.length; var4++) {
            var3[var4] = Integer.MIN_VALUE;
         }

         this.id_class = var3;
      }
   }

   public int id_class() {
      int var1 = this.id_protected();
      return this.id_class[var1];
   }

   public void id_break(int var1) {
      int var2 = this.id_protected();
      int var3 = this.id_class[var2];
      if (var1 != var3) {
         this.id_class[var2] = var1;
         int var4 = this.id_throws();
         if (var4 >= 0) {
            id_finally();
            ARBShaderObjects.glUniform1iARB(var4, var1);
            this.id_implements();
         }
      }
   }

   @Override
   protected void id_break() {
      this.id_class = new int[]{Integer.MIN_VALUE};
   }
}
