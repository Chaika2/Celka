package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class Cz_1 implements CJ {
   @Override
   public String toString() {
      return "CUSTOM";
   }

   @Override
   public void class_(lD_2 var1, fY_2 var2) {
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
   }

   @Override
   public void class_(yb_3 var1) {
   }
}
