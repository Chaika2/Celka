package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import org.lwjgl.opengl.GL11;

class Mf_1 {
   private final int id_class;
   boolean id_break;

   public Mf_1(int var1) {
      this.id_class = var1;
   }

   public void id_class(boolean var1) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThreadOrInit);
      if (var1 != this.id_break) {
         this.id_break = var1;
         if (var1) {
            GL11.glEnable(this.id_class);
         } else {
            GL11.glDisable(this.id_class);
         }
      }
   }

   public void id_class() {
      this.id_class(false);
   }

   public void id_break() {
      this.id_class(true);
   }
}
