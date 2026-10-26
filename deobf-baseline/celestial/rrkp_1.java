package celestial;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkp_1 extends rrky_1 {
   private boolean id_class;
   private FloatBuffer id_break;

   public rrkp_1(String var1) {
      super(var1);
   }

   @Override
   protected void id_class(int var1) {
   }

   public float id_class(int var1, int var2) {
      if (this.id_break == null) {
         return 0.0F;
      } else {
         int var3 = this.id_class ? var2 * 4 + var1 : var1 * 4 + var2;
         return this.id_break.get(var3);
      }
   }

   public void id_class(boolean var1, FloatBuffer var2) {
      this.id_class = var1;
      this.id_break = var2;
      int var3 = this.id_throws();
      if (var3 >= 0) {
         id_finally();
         ARBShaderObjects.glUniformMatrix4fvARB(var3, var1, var2);
         this.id_implements();
      }
   }

   @Override
   protected void id_break() {
      this.id_break = null;
   }
}
