package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HV extends Hn_1 {
   private final boolean S;

   public HV(boolean var1) {
      super("shade_model", () -> RenderSystem.shadeModel(var1 ? 7425 : 7424), () -> RenderSystem.shadeModel(7424));
      this.S = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HV var2 = (HV)var1;
         return this.S == var2.S;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[" + (this.S ? "smooth" : "flat") + "]";
   }

   @Override
   public int hashCode() {
      return Boolean.hashCode(this.S);
   }
}
