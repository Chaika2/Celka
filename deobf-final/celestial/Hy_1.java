package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Hy_1 extends Hn_1 {
   private final String S;
   private final int s;

   public Hy_1(String var1, int var2) {
      super("depth_test", () -> {
         if (var2 != 519) {
            RenderSystem.enableDepthTest();
            RenderSystem.depthFunc(var2);
         }
      }, () -> {
         if (var2 != 519) {
            RenderSystem.disableDepthTest();
            RenderSystem.depthFunc(515);
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
         Hy_1 var2 = (Hy_1)var1;
         return this.s == var2.s;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[" + this.S + "]";
   }

   @Override
   public int hashCode() {
      return Integer.hashCode(this.s);
   }
}
