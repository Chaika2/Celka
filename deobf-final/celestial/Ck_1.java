package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class Ck_1 implements CJ {
   @Override
   public String toString() {
      return "PARTICLE_SHEET_TRANSLUCENT";
   }

   @Override
   public void class_(lD_2 var1, fY_2 var2) {
      RenderSystem.depthMask(true);
      var2.class_(fJ_2.break_);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ONE_MINUS_SRC_ALPHA);
      RenderSystem.alphaFunc(516, 0.003921569F);
      var1.class_(7, ju_3.continue_);
   }

   @Override
   public void class_(yb_3 var1) {
      var1.break_();
   }
}
