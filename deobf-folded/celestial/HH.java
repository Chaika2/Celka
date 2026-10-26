package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HH extends Hl_1 {
   public HH(boolean var1) {
      super("cull", () -> {
         if (!var1) {
            RenderSystem.disableCull();
         }
      }, () -> {
         if (!var1) {
            RenderSystem.enableCull();
         }
      }, var1);
   }
}
