package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public interface bj_3 {
   pg_3 id_byte = PP.b_.id_case();
   C_private id_protected = C_throws.id_break();
   yb_3 id_throws = yb_3.id_class();
   lD_2 id_case = id_throws.id_byte();

   static void id_class(Color var0, float var1) {
      float[] var2 = var0.getColorComponents(null);
      RenderSystem.color4f(var2[0], var2[1], var2[2], var1);
   }

   static void id_class(boolean var0) {
      if (var0) {
         RenderSystem.enableDepthTest();
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      GL11.glDisable(2848);
   }

   static void id_class(Color var0, float var1, boolean var2) {
      id_class(var0, 0.4F, var1, var2);
   }

   static void id_class(Ml_1 var0, rfl_3 var1, double var2) {
      id_class(var0, var1.id_byte(var2, var2, var2));
   }

   static void id_class(Ml_1 var0, rfl_3 var1) {
      rfl_3 var2 = var1.id_protected(-id_byte.id_case(), -id_byte.id_catch(), -id_byte.id_private());
      rjV_2 var3 = var0.id_byte().id_class();
      id_case.id_class(1, ju_3.id_super);
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_byte).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_protected, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_break, (float)var2.id_case).id_class();
      id_case.id_class(var3, (float)var2.id_class, (float)var2.id_throws, (float)var2.id_case).id_class();
      id_throws.id_break();
   }

   static void id_class(Color var0, float var1, float var2, boolean var3) {
      GL11.glEnable(2848);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(770, 771, 1, 0);
      id_class(var0, var1);
      RenderSystem.lineWidth(var2);
      RenderSystem.disableTexture();
      RenderSystem.depthMask(false);
      if (var3) {
         RenderSystem.disableDepthTest();
      }
   }
}
