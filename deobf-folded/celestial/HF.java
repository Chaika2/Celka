package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class HF {
   private static final rje_3 id_class = rqR_2.id_class(new rje_3(0.2F, 1.0F, -0.7F), rje_3::id_protected);
   private static final rje_3 id_break = rqR_2.id_class(new rje_3(-0.2F, 1.0F, 0.7F), rje_3::id_protected);
   private static final rje_3 id_byte = rqR_2.id_class(new rje_3(0.2F, 1.0F, -0.7F), rje_3::id_protected);
   private static final rje_3 id_protected = rqR_2.id_class(new rje_3(-0.2F, -1.0F, 0.7F), rje_3::id_protected);

   public static void id_byte() {
      RenderSystem.setupGuiFlatDiffuseLighting(id_class, id_break);
   }

   public static void id_class() {
      RenderSystem.enableLighting();
      RenderSystem.enableColorMaterial();
      RenderSystem.colorMaterial(1032, 5634);
   }

   public static void id_class(rjV_2 var0) {
      RenderSystem.setupLevelDiffuseLighting(id_byte, id_protected, var0);
   }

   public static void id_break(rjV_2 var0) {
      RenderSystem.setupLevelDiffuseLighting(id_class, id_break, var0);
   }

   public static void id_break() {
      RenderSystem.disableLighting();
      RenderSystem.disableColorMaterial();
   }

   public static void id_protected() {
      RenderSystem.setupGui3DDiffuseLighting(id_class, id_break);
   }
}
