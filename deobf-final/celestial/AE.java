package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.main.Main;

public class AE extends Thread {
   public AE(String var1, QY var2) {
      super(var1);
      this.class_ = var2;
   }

   @Override
   public void run() {
      try {
         RenderSystem.initGameThread(true);
         this.class_.double_();
      } catch (Throwable var2) {
         Main.class_.error("Exception in client thread", var2);
      }
   }
}
