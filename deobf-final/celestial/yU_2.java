package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;

public class yU_2 implements yD_2 {
   private final QY class_;
   private final Map<Integer, List<ye_3>> break_ = Maps.newHashMap();

   public yU_2(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      ly_3 var9 = ((Hh_1)this.class_.class_[16]).finally_();
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      rfH_2 var10 = new rfH_2(var9.break_().break_, 0.0, var9.break_().protected_);
      this.break_.forEach((var1x, var2x) -> {
         for (int var3x = 0; var3x < var2x.size(); var3x++) {
            ye_3 var4 = var2x.get(var3x);
            if (var10.class_(var4.class_, 160.0)) {
               double var5x = (double)var4.class_.b_() + 0.5;
               double var7x = (double)var4.class_.c_() + 2.0 + (double)var3x * 0.25;
               double var9x = (double)var4.class_.d_() + 0.5;
               int var11 = var4.protected_ ? -16711936 : -3355444;
               yK_2.class_(var4.byte_, var5x, var7x, var9x, var11);
            }
         }
      });
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }

   @Override
   public void class_() {
      this.break_.clear();
   }

   public void class_(int var1, List<ye_3> var2) {
      this.break_.put(var1, var2);
   }
}
