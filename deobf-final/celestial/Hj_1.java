package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public final class Hj_1 extends HY {
   private final int S;

   public Hj_1(int var1) {
      super("portal_texturing", () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.pushMatrix();
         RenderSystem.loadIdentity();
         RenderSystem.translatef(0.5F, 0.5F, 0.0F);
         RenderSystem.scalef(0.5F, 0.5F, 1.0F);
         RenderSystem.translatef(17.0F / (float)var1, (2.0F + (float)var1 / 1.5F) * ((float)(rqR_2.break_() % 800000L) / 800000.0F), 0.0F);
         RenderSystem.rotatef(((float)(var1 * var1) * 4321.0F + (float)var1 * 9.0F) * 2.0F, 0.0F, 0.0F, 1.0F);
         RenderSystem.scalef(4.5F - (float)var1 / 4.0F, 4.5F - (float)var1 / 4.0F, 1.0F);
         RenderSystem.mulTextureByProjModelView();
         RenderSystem.matrixMode(5888);
         RenderSystem.setupEndPortalTexGen();
      }, () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.popMatrix();
         RenderSystem.matrixMode(5888);
         RenderSystem.clearTexGen();
      });
      this.S = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Hj_1 var2 = (Hj_1)var1;
         return this.S == var2.S;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.S);
   }
}
