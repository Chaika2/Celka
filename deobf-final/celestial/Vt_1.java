package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Vt_1 {
   private static final Logger class_ = LogManager.getLogger();

   public static int class_() throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      int var0 = MT.int_();
      if (var0 <= 0) {
         throw new IOException("Could not create shader program (returned program ID " + var0 + ")");
      } else {
         return var0;
      }
   }

   public static void class_(int var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      MT.catch_(var0);
   }

   public static void class_(VH var0) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.protected_().class_();
      var0.byte_().class_();
      MT.private_(var0.class_());
   }

   public static void break_(VH var0) throws IOException {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      var0.protected_().class_(var0);
      var0.byte_().class_(var0);
      MT.implements_(var0.class_());
      int var1 = MT.byte_(var0.class_(), 35714);
      if (var1 == 0) {
         class_.warn("Error encountered when linking program containing VS {} and FS {}. Log output:", var0.byte_().break_(), var0.protected_().break_());
         class_.warn(MT.finally_(var0.class_(), 32768));
      }
   }
}
