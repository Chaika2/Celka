package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class yk_3 {
   private static void class_(ByteBuffer var0, int var1, jZ_2 var2, int var3, rrxm_3 var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      ((Buffer)var0).clear();
      if (var3 > 0) {
         var2.class_(MemoryUtil.memAddress(var0));
         boolean var5 = rrbb_3.rs() && rrdk_1.class_(var2, var0);
         if (var4 != null) {
            rrxZ_2.class_(var1, var4);
         } else {
            MT.case_(var1, 0, var3);
         }

         if (var5) {
            rrdk_1.break_();
         }

         var2.protected_();
      }
   }

   private static void class_(ByteBuffer var0, int var1, jZ_2 var2, int var3) {
      class_(var0, var1, var2, var3, (rrxm_3)null);
   }

   public static void class_(lD_2 var0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            Pair var1x = var0.extends_();
            lU_2 var2x = (lU_2)var1x.getFirst();
            class_((ByteBuffer)var1x.getSecond(), var2x.protected_(), var2x.break_(), var2x.byte_(), var2x.class_());
         });
      } else {
         Pair var1 = var0.extends_();
         lU_2 var2 = (lU_2)var1.getFirst();
         class_((ByteBuffer)var1.getSecond(), var2.protected_(), var2.break_(), var2.byte_(), var2.class_());
      }
   }
}
