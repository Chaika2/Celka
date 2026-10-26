package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HK extends Hn_1 {
   private final boolean S;
   private final boolean s;

   public HK(boolean var1, boolean var2) {
      super("write_mask_state", () -> {
         if (!var2) {
            RenderSystem.depthMask(var2);
         }

         if (!var1) {
            RenderSystem.colorMask(var1, var1, var1, var1);
         }
      }, () -> {
         if (!var2) {
            RenderSystem.depthMask(true);
         }

         if (!var1) {
            RenderSystem.colorMask(true, true, true, true);
         }
      });
      this.S = var1;
      this.s = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HK var2 = (HK)var1;
         return this.S == var2.S && this.s == var2.s;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[writeColor=" + this.S + ", writeDepth=" + this.s + "]";
   }

   @Override
   public int hashCode() {
      return rrWX.class_(this.S, this.s);
   }
}
