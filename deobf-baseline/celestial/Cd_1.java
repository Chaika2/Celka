package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

class Cd_1 implements CJ {
   @Override
   public String toString() {
      return "PARTICLE_SHEET_OPAQUE";
   }

   @Override
   public void id_class(lD_2 var1, fY_2 var2) {
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      var2.id_class(fJ_2.id_break);
      var1.id_class(7, ju_3.id_continue);
   }

   @Override
   public void id_class(yb_3 var1) {
      var1.id_break();
   }
}
