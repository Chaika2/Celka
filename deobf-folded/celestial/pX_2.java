package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Set;

public class pX_2 implements yD_2 {
   private final Set<rjh_3> id_class = Sets.newHashSet();

   private static void id_byte(rjh_3 var0) {
      float var1 = 1.0F;
      rfH_2 var2 = var0.id_int();
      rfH_2 var3 = var2.id_byte(-1.0, -1.0, -1.0);
      rfH_2 var4 = var2.id_byte(1.0, 1.0, 1.0);
      yK_2.id_class(var3, var4, 0.2F, 1.0F, 0.2F, 0.15F);
   }

   pX_2() {
   }

   private void id_class(double var1, double var3, double var5) {
      rfH_2 var7 = new rfH_2(var1, var3, var5);
      this.id_class.forEach(var1x -> {
         if (var7.id_class(var1x.id_int(), 60.0)) {
            id_byte(var1x);
         }
      });
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.id_class(var3, var5, var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   public void id_class(rjh_3 var1) {
      this.id_class.add(var1);
   }

   @Override
   public void id_class() {
      this.id_class.clear();
   }

   public void id_break(rjh_3 var1) {
      this.id_class.remove(var1);
   }
}
