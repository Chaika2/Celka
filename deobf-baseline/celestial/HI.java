package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public final class HI extends HY {
   private final float S;
   private final float s;

   public HI(float var1, float var2) {
      super("offset_texturing", () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.pushMatrix();
         RenderSystem.loadIdentity();
         RenderSystem.translatef(var1, var2, 0.0F);
         RenderSystem.matrixMode(5888);
      }, () -> {
         RenderSystem.matrixMode(5890);
         RenderSystem.popMatrix();
         RenderSystem.matrixMode(5888);
      });
      this.S = var1;
      this.s = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HI var2 = (HI)var1;
         return Float.compare(var2.S, this.S) == 0 && Float.compare(var2.s, this.s) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return rrWX.id_class(this.S, this.s);
   }
}
