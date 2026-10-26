package celestial;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;

public class ya_3 implements yD_2 {
   private final Map<rfH_2, yi_3> id_class = Maps.newHashMap();

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      long var9 = rqR_2.id_break();
      this.id_class.entrySet().removeIf(var2x -> var9 > var2x.getValue().id_byte);
      this.id_class.forEach(this::id_class);
   }

   private void id_class(rfH_2 var1, yi_3 var2) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ONE, MK.ZERO);
      RenderSystem.color4f(0.0F, 1.0F, 0.0F, 0.75F);
      RenderSystem.disableTexture();
      yK_2.id_class(var1, 0.02F, var2.id_class(), var2.id_break(), var2.id_byte(), var2.id_protected());
      if (!var2.id_break.isEmpty()) {
         double var3 = (double)var1.b_() + 0.5;
         double var5 = (double)var1.c_() + 1.2;
         double var7 = (double)var1.d_() + 0.5;
         yK_2.id_class(var2.id_break, var3, var5, var7, -1, 0.01F, true, 0.0F, true);
      }

      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
   }

   @Override
   public void id_class() {
      this.id_class.clear();
   }

   public void id_class(rfH_2 var1, int var2, String var3, int var4) {
      this.id_class.put(var1, new yi_3(var2, var3, rqR_2.id_break() + (long)var4));
   }
}
