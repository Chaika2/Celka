package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class Cx_1 implements CJ {
   @Override
   public String toString() {
      return "TERRAIN_SHEET";
   }

   @Override
   public void class_(lD_2 var1, fY_2 var2) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.depthMask(true);
      var2.class_(fJ_2.class_);
      var1.class_(7, ju_3.continue_);
   }

   @Override
   public void class_(yb_3 var1) {
      var1.break_();
   }
}
