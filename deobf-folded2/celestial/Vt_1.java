package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vt_1 {
   private static final Logger id_class = LogManager.getLogger();

   public static int id_class() throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      int var0 = MT.id_int();
      if (var0 <= 0) {
         throw new IOException("Could not create shader program (returned program ID " + var0 + ")");
      } else {
         return var0;
      }
   }

   public static void id_class(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      MT.id_catch(var0);
   }

   public static void id_class(VH var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.id_protected().id_class();
      var0.id_byte().id_class();
      MT.id_private(var0.id_class());
   }

   public static void id_break(VH var0) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.id_protected().id_class(var0);
      var0.id_byte().id_class(var0);
      MT.id_implements(var0.id_class());
      int var1 = MT.id_byte(var0.id_class(), 35714);
      if (var1 == 0) {
         id_class.warn(
            "Error encountered when linking program containing VS {} and FS {}. Log output:", var0.id_byte().id_break(), var0.id_protected().id_break()
         );
         id_class.warn(MT.id_finally(var0.id_class(), 32768));
      }
   }
}
