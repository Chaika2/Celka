package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL11;

class Mf_1 {
   private final int class_;
   boolean break_;

   public Mf_1(int var1) {
      this.class_ = var1;
   }

   public void class_(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var1 != this.break_) {
         this.break_ = var1;
         if (var1) {
            GL11.glEnable(this.class_);
         } else {
            GL11.glDisable(this.class_);
         }
      }
   }

   public void class_() {
      this.class_(false);
   }

   public void break_() {
      this.class_(true);
   }
}
