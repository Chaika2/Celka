package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HC extends Hn_1 {
   private final float S;

   public HC(float var1) {
      super("alpha", () -> {
         if (var1 > 0.0F) {
            RenderSystem.enableAlphaTest();
            RenderSystem.alphaFunc(516, var1);
         } else {
            RenderSystem.disableAlphaTest();
         }
      }, () -> {
         RenderSystem.disableAlphaTest();
         RenderSystem.defaultAlphaFunc();
      });
      this.S = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null || this.getClass() != var1.getClass()) {
         return false;
      } else {
         return !super.equals(var1) ? false : this.S == ((HC)var1).S;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[" + this.S + "]";
   }

   @Override
   public int hashCode() {
      return rrWX.class_(super.hashCode(), this.S);
   }
}
