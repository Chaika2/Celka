package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class px_3 implements yD_2 {
   private final List<rfH_2> class_ = Lists.newArrayList();
   private final List<Float> break_ = Lists.newArrayList();
   private final List<Float> byte_ = Lists.newArrayList();
   private final List<Float> protected_ = Lists.newArrayList();
   private final List<Float> throws_ = Lists.newArrayList();
   private final List<Float> case_ = Lists.newArrayList();

   public void class_(rfH_2 var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.add(var1);
      this.break_.add(var2);
      this.byte_.add(var6);
      this.protected_.add(var3);
      this.throws_.add(var4);
      this.case_.add(var5);
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      yb_3 var9 = yb_3.class_();
      lD_2 var10 = var9.byte_();
      var10.class_(5, ju_3.this_);

      for (int var11 = 0; var11 < this.class_.size(); var11++) {
         rfH_2 var12 = this.class_.get(var11);
         Float var13 = this.break_.get(var11);
         float var14 = var13 / 2.0F;
         yX_2.class_(
            var10,
            (double)((float)var12.b_() + 0.5F - var14) - var3,
            (double)((float)var12.c_() + 0.5F - var14) - var5,
            (double)((float)var12.d_() + 0.5F - var14) - var7,
            (double)((float)var12.b_() + 0.5F + var14) - var3,
            (double)((float)var12.c_() + 0.5F + var14) - var5,
            (double)((float)var12.d_() + 0.5F + var14) - var7,
            this.protected_.get(var11),
            this.throws_.get(var11),
            this.case_.get(var11),
            this.byte_.get(var11)
         );
      }

      var9.break_();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
