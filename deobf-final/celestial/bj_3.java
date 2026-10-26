package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public interface bj_3 {
   pg_3 byte_ = PP.b_.case_();
   C_private protected_ = C_throws.break_();
   yb_3 throws_ = yb_3.class_();
   lD_2 case_ = throws_.byte_();

   static void class_(Color var0, float var1) {
      float[] var2 = var0.getColorComponents(null);
      RenderSystem.color4f(var2[0], var2[1], var2[2], var1);
   }

   static void class_(boolean var0) {
      if (var0) {
         RenderSystem.enableDepthTest();
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      GL11.glDisable(2848);
   }

   static void class_(Color var0, float var1, boolean var2) {
      class_(var0, 0.4F, var1, var2);
   }

   static void class_(Ml_1 var0, rfl_3 var1, double var2) {
      class_(var0, var1.byte_(var2, var2, var2));
   }

   static void class_(Ml_1 var0, rfl_3 var1) {
      rfl_3 var2 = var1.protected_(-byte_.case_(), -byte_.catch_(), -byte_.private_());
      rjV_2 var3 = var0.byte_().class_();
      case_.class_(1, ju_3.super_);
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.byte_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.protected_, (float)var2.throws_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.break_, (float)var2.case_).class_();
      case_.class_(var3, (float)var2.class_, (float)var2.throws_, (float)var2.case_).class_();
      throws_.break_();
   }

   static void class_(Color var0, float var1, float var2, boolean var3) {
      GL11.glEnable(2848);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(770, 771, 1, 0);
      class_(var0, var1);
      RenderSystem.lineWidth(var2);
      RenderSystem.disableTexture();
      RenderSystem.depthMask(false);
      if (var3) {
         RenderSystem.disableDepthTest();
      }
   }
}
