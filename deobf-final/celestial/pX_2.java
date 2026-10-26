package celestial;

import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Set;

public class pX_2 implements yD_2 {
   private final Set<rjh_3> class_ = Sets.newHashSet();

   private static void byte_(rjh_3 var0) {
      float var1 = 1.0F;
      rfH_2 var2 = var0.int_();
      rfH_2 var3 = var2.byte_(-1.0, -1.0, -1.0);
      rfH_2 var4 = var2.byte_(1.0, 1.0, 1.0);
      yK_2.class_(var3, var4, 0.2F, 1.0F, 0.2F, 0.15F);
   }

   pX_2() {
   }

   private void class_(double var1, double var3, double var5) {
      rfH_2 var7 = new rfH_2(var1, var3, var5);
      this.class_.forEach(var1x -> {
         if (var7.class_(var1x.int_(), 60.0)) {
            byte_(var1x);
         }
      });
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      this.class_(var3, var5, var7);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   public void class_(rjh_3 var1) {
      this.class_.add(var1);
   }

   @Override
   public void class_() {
      this.class_.clear();
   }

   public void break_(rjh_3 var1) {
      this.class_.remove(var1);
   }
}
