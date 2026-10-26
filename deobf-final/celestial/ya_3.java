package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ya_3 implements yD_2 {
   private final Map<rfH_2, yi_3> class_ = Maps.newHashMap();

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      long var9 = rqR_2.break_();
      this.class_.entrySet().removeIf(var2x -> var9 > var2x.getValue().byte_);
      this.class_.forEach(this::class_);
   }

   private void class_(rfH_2 var1, yi_3 var2) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      yK_2.class_(var1, 0.02F, var2.class_(), var2.break_(), var2.byte_(), var2.protected_());
      if (!var2.break_.isEmpty()) {
         double var3 = (double)var1.b_() + 0.5;
         double var5 = (double)var1.c_() + 1.2;
         double var7 = (double)var1.d_() + 0.5;
         yK_2.class_(var2.break_, var3, var5, var7, -1, 0.01F, true, 0.0F, true);
      }

      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   @Override
   public void class_() {
      this.class_.clear();
   }

   public void class_(rfH_2 var1, int var2, String var3, int var4) {
      this.class_.put(var1, new yi_3(var2, var3, rqR_2.break_() + (long)var4));
   }
}
