package celestial;

import org.lwjgl.opengl.ARBShaderObjects;

public class rrkC extends rrky_1 {
   private float[][] id_class;
   private static final float id_break = -Float.MAX_VALUE;

   public rrkC(String var1) {
      super(var1);
      this.id_break();
   }

   @Override
   protected void id_class(int var1) {
      if (var1 >= this.id_class.length) {
         float[][] var2 = this.id_class;
         float[][] var3 = new float[var1 + 10][];
         System.arraycopy(var2, 0, var3, 0, var2.length);
         this.id_class = var3;
      }

      if (this.id_class[var1] == null) {
         this.id_class[var1] = new float[]{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE};
      }
   }

   public float[] id_class() {
      int var1 = this.id_protected();
      return this.id_class[var1];
   }

   public void id_class(float var1, float var2, float var3) {
      int var4 = this.id_protected();
      float[] var5 = this.id_class[var4];
      if (var5[0] != var1 || var5[1] != var2 || var5[2] != var3) {
         var5[0] = var1;
         var5[1] = var2;
         var5[2] = var3;
         int var6 = this.id_throws();
         if (var6 >= 0) {
            id_finally();
            ARBShaderObjects.glUniform3fARB(var6, var1, var2, var3);
            this.id_implements();
         }
      }
   }

   @Override
   protected void id_break() {
      this.id_class = new float[][]{{-Float.MAX_VALUE, -Float.MAX_VALUE, -Float.MAX_VALUE}};
   }
}
