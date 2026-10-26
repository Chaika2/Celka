package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class pB_2 implements yD_2 {
   private final QY id_class;

   public pB_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      gm_3 var9 = (gm_3)this.id_class.id_class[56];
      RenderSystem.pushMatrix();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableTexture();
      rfH_2 var10 = new rfH_2(var3, var5, var7);
      LongOpenHashSet var11 = new LongOpenHashSet();

      for (rfH_2 var13 : rfH_2.id_class(var10.id_break(-10, -10, -10), var10.id_break(10, 10, 10))) {
         int var14 = var9.id_class(rRo_1.SKY, var13);
         float var15 = (float)(15 - var14) / 15.0F * 0.5F + 0.16F;
         int var16 = rfU_2.id_case(var15, 0.9F, 0.9F);
         long var17 = rjh_3.id_throws(var13.id_package());
         if (var11.add(var17)) {
            yK_2.id_class(
               var9.id_goto().id_class().id_class(rRo_1.SKY, rjh_3.id_class(var17)),
               (double)(rjh_3.id_break(var17) * 16 + 8),
               (double)(rjh_3.id_byte(var17) * 16 + 8),
               (double)(rjh_3.id_protected(var17) * 16 + 8),
               16711680,
               0.3F
            );
         }

         if (var14 != 15) {
            yK_2.id_class(String.valueOf(var14), (double)var13.b_() + 0.5, (double)var13.c_() + 0.25, (double)var13.d_() + 0.5, var16);
         }
      }

      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }
}
