package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HF {
   private static final rje_3 class_ = rqR_2.class_(new rje_3(0.2F, 1.0F, -0.7F), rje_3::protected_);
   private static final rje_3 break_ = rqR_2.class_(new rje_3(-0.2F, 1.0F, 0.7F), rje_3::protected_);
   private static final rje_3 byte_ = rqR_2.class_(new rje_3(0.2F, 1.0F, -0.7F), rje_3::protected_);
   private static final rje_3 protected_ = rqR_2.class_(new rje_3(-0.2F, -1.0F, 0.7F), rje_3::protected_);

   public static void byte_() {
      RenderSystem.setupGuiFlatDiffuseLighting(class_, break_);
   }

   public static void class_() {
      RenderSystem.enableLighting();
      RenderSystem.enableColorMaterial();
      RenderSystem.colorMaterial(1032, 5634);
   }

   public static void class_(rjV_2 var0) {
      RenderSystem.setupLevelDiffuseLighting(byte_, protected_, var0);
   }

   public static void break_(rjV_2 var0) {
      RenderSystem.setupLevelDiffuseLighting(class_, break_, var0);
   }

   public static void break_() {
      RenderSystem.disableLighting();
      RenderSystem.disableColorMaterial();
   }

   public static void protected_() {
      RenderSystem.setupGui3DDiffuseLighting(class_, break_);
   }
}
