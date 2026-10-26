package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class CW implements CJ {
   @Override
   public String toString() {
      return "PARTICLE_SHEET_LIT";
   }

   @Override
   public void class_(lD_2 var1, fY_2 var2) {
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      var2.class_(fJ_2.break_);
      var1.class_(7, ju_3.continue_);
   }

   @Override
   public void class_(yb_3 var1) {
      var1.break_();
   }
}
