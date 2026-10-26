package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class pB_2 implements yD_2 {
   private final QY class_;

   public pB_2(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      gm_3 var9 = (gm_3)this.class_.class_[56];
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      rfH_2 var10 = new rfH_2(var3, var5, var7);
      LongOpenHashSet var11 = new LongOpenHashSet();

      for (rfH_2 var13 : rfH_2.class_(var10.break_(-10, -10, -10), var10.break_(10, 10, 10))) {
         int var14 = var9.class_(rRo_1.SKY, var13);
         float var15 = (float)(15 - var14) / 15.0F * 0.5F + 0.16F;
         int var16 = rfU_2.case_(var15, 0.9F, 0.9F);
         long var17 = rjh_3.throws_(var13.package_());
         if (var11.add(var17)) {
            yK_2.class_(
               var9.goto_().class_().class_(rRo_1.SKY, rjh_3.class_(var17)),
               (double)(rjh_3.break_(var17) * 16 + 8),
               (double)(rjh_3.byte_(var17) * 16 + 8),
               (double)(rjh_3.protected_(var17) * 16 + 8),
               16711680,
               0.3F
            );
         }

         if (var14 != 15) {
            yK_2.class_(String.valueOf(var14), (double)var13.b_() + 0.5, (double)var13.c_() + 0.25, (double)var13.d_() + 0.5, var16);
         }
      }

      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
