package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;

public class yU_2 implements yD_2 {
   private final QY id_class;
   private final Map<Integer, List<ye_3>> id_break = Maps.newHashMap();

   public yU_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      ly_3 var9 = ((Hh_1)this.id_class.id_class[16]).id_finally();
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      rfH_2 var10 = new rfH_2(var9.id_break().id_break, 0.0, var9.id_break().id_protected);
      this.id_break.forEach((var1x, var2x) -> {
         for (int var3x = 0; var3x < var2x.size(); var3x++) {
            ye_3 var4 = var2x.get(var3x);
            if (var10.id_class(var4.id_class, 160.0)) {
               double var5x = (double)var4.id_class.b_() + 0.5;
               double var7x = (double)var4.id_class.c_() + 2.0 + (double)var3x * 0.25;
               double var9x = (double)var4.id_class.d_() + 0.5;
               int var11 = var4.id_protected ? -16711936 : -3355444;
               yK_2.id_class(var4.id_byte, var5x, var7x, var9x, var11);
            }
         }
      });
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }

   @Override
   public void id_class() {
      this.id_break.clear();
   }

   public void id_class(int var1, List<ye_3> var2) {
      this.id_break.put(var1, var2);
   }
}
