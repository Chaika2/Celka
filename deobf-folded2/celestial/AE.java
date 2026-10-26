package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.main.Main;

public class AE extends Thread {
   public AE(String var1, QY var2) {
      super(var1);
      this.id_class = var2;
   }

   @Override
   public void run() {
      try {
         RenderSystem.initGameThread(true);
         this.id_class.id_double();
      } catch (Throwable var2) {
         Main.id_class.error("Exception in client thread", var2);
      }
   }
}
