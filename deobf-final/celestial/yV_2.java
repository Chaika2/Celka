package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class yV_2 implements yD_2 {
   private final Map<rfH_2, rfH_2> class_ = Maps.newHashMap();
   private final Map<rfH_2, Float> break_ = Maps.newHashMap();
   private final List<rfH_2> byte_ = Lists.newArrayList();

   public void class_(rfH_2 var1, List<rfH_2> var2, List<Float> var3) {
      for (int var4 = 0; var4 < var2.size(); var4++) {
         this.class_.put((rfH_2)var2.get(var4), var1);
         this.break_.put((rfH_2)var2.get(var4), (Float)var3.get(var4));
      }

      this.byte_.add(var1);
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      rfH_2 var9 = new rfH_2(var3, 0.0, var7);
      yb_3 var10 = yb_3.class_();
      lD_2 var11 = var10.byte_();
      var11.class_(5, ju_3.this_);

      for (Entry var13 : this.class_.entrySet()) {
         rfH_2 var14 = (rfH_2)var13.getKey();
         rfH_2 var15 = (rfH_2)var13.getValue();
         float var16 = (float)(var15.b_() * 128 % 256) / 256.0F;
         float var17 = (float)(var15.c_() * 128 % 256) / 256.0F;
         float var18 = (float)(var15.d_() * 128 % 256) / 256.0F;
         float var19 = this.break_.get(var14);
         if (var9.class_(var14, 160.0)) {
            yX_2.class_(
               var11,
               (double)((float)var14.b_() + 0.5F) - var3 - (double)var19,
               (double)((float)var14.c_() + 0.5F) - var5 - (double)var19,
               (double)((float)var14.d_() + 0.5F) - var7 - (double)var19,
               (double)((float)var14.b_() + 0.5F) - var3 + (double)var19,
               (double)((float)var14.c_() + 0.5F) - var5 + (double)var19,
               (double)((float)var14.d_() + 0.5F) - var7 + (double)var19,
               var16,
               var17,
               var18,
               0.5F
            );
         }
      }

      for (rfH_2 var21 : this.byte_) {
         if (var9.class_(var21, 160.0)) {
            yX_2.class_(
               var11,
               (double)var21.b_() - var3,
               (double)var21.c_() - var5,
               (double)var21.d_() - var7,
               (double)((float)var21.b_() + 1.0F) - var3,
               (double)((float)var21.c_() + 1.0F) - var5,
               (double)((float)var21.d_() + 1.0F) - var7,
               1.0F,
               1.0F,
               1.0F,
               1.0F
            );
         }
      }

      var10.break_();
      RenderSystem.enableDepthTest();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
