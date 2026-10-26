package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class px_3 implements yD_2 {
   private final List<rfH_2> id_class = Lists.newArrayList();
   private final List<Float> id_break = Lists.newArrayList();
   private final List<Float> id_byte = Lists.newArrayList();
   private final List<Float> id_protected = Lists.newArrayList();
   private final List<Float> id_throws = Lists.newArrayList();
   private final List<Float> id_case = Lists.newArrayList();

   public void id_class(rfH_2 var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.add(var1);
      this.id_break.add(var2);
      this.id_byte.add(var6);
      this.id_protected.add(var3);
      this.id_throws.add(var4);
      this.id_case.add(var5);
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      yb_3 var9 = yb_3.id_class();
      lD_2 var10 = var9.id_byte();
      var10.id_class(5, ju_3.id_this);

      for (int var11 = 0; var11 < this.id_class.size(); var11++) {
         rfH_2 var12 = this.id_class.get(var11);
         Float var13 = this.id_break.get(var11);
         float var14 = var13 / 2.0F;
         yX_2.id_class(
            var10,
            (double)((float)var12.b_() + 0.5F - var14) - var3,
            (double)((float)var12.c_() + 0.5F - var14) - var5,
            (double)((float)var12.d_() + 0.5F - var14) - var7,
            (double)((float)var12.b_() + 0.5F + var14) - var3,
            (double)((float)var12.c_() + 0.5F + var14) - var5,
            (double)((float)var12.d_() + 0.5F + var14) - var7,
            this.id_protected.get(var11),
            this.id_throws.get(var11),
            this.id_case.get(var11),
            this.id_byte.get(var11)
         );
      }

      var9.id_break();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
