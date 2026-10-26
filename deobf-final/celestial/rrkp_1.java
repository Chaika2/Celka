package celestial;

import java.nio.FloatBuffer;
import org.lwjgl.opengl.ARBShaderObjects;

public class rrkp_1 extends rrky_1 {
   private boolean class_;
   private FloatBuffer break_;

   public rrkp_1(String var1) {
      super(var1);
   }

   @Override
   protected void class_(int var1) {
   }

   public float class_(int var1, int var2) {
      if (this.break_ == null) {
         return 0.0F;
      } else {
         int var3 = this.class_ ? var2 * 4 + var1 : var1 * 4 + var2;
         return this.break_.get(var3);
      }
   }

   public void class_(boolean var1, FloatBuffer var2) {
      this.class_ = var1;
      this.break_ = var2;
      int var3 = this.throws_();
      if (var3 >= 0) {
         finally_();
         ARBShaderObjects.glUniformMatrix4fvARB(var3, var1, var2);
         this.implements_();
      }
   }

   @Override
   protected void break_() {
      this.break_ = null;
   }
}
