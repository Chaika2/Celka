package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.util.Pair;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;

public class yk_3 {
   private static void id_class(ByteBuffer var0, int var1, jZ_2 var2, int var3, rrxm_3 var4) {
      RenderSystem.assertThread(RenderSystem::isOnRenderThread);
      ((Buffer)var0).clear();
      if (var3 > 0) {
         var2.id_class(MemoryUtil.memAddress(var0));
         boolean var5 = rrbb_3.rs() && rrdk_1.id_class(var2, var0);
         if (var4 != null) {
            rrxZ_2.id_class(var1, var4);
         } else {
            MT.id_case(var1, 0, var3);
         }

         if (var5) {
            rrdk_1.id_break();
         }

         var2.id_protected();
      }
   }

   private static void id_class(ByteBuffer var0, int var1, jZ_2 var2, int var3) {
      id_class(var0, var1, var2, var3, (rrxm_3)null);
   }

   public static void id_class(lD_2 var0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> {
            Pair var1x = var0.id_extends();
            lU_2 var2x = (lU_2)var1x.getFirst();
            id_class((ByteBuffer)var1x.getSecond(), var2x.id_protected(), var2x.id_break(), var2x.id_byte(), var2x.id_class());
         });
      } else {
         Pair var1 = var0.id_extends();
         lU_2 var2 = (lU_2)var1.getFirst();
         id_class((ByteBuffer)var1.getSecond(), var2.id_protected(), var2.id_break(), var2.id_byte(), var2.id_class());
      }
   }
}
