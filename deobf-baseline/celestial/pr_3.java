package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map.Entry;

public class pr_3 implements yD_2 {
   private final QY id_class;

   public pr_3(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      gm_3 var9 = (gm_3)this.id_class.id_class[56];
      RenderSystem.pushMatrix();
      RenderSystem.disableBlend();
      RenderSystem.disableTexture();
      RenderSystem.enableDepthTest();
      rfH_2 var10 = new rfH_2(var3, 0.0, var7);
      yb_3 var11 = yb_3.id_class();
      lD_2 var12 = var11.id_byte();
      var12.id_class(5, ju_3.id_this);

      for (byte var13 = -32; var13 <= 32; var13 += 16) {
         for (byte var14 = -32; var14 <= 32; var14 += 16) {
            roC_2 var15 = var9.id_volatile(var10.id_break(var13, 0, var14));

            for (Entry var17 : var15.id_native()) {
               rKv_1 var18 = (rKv_1)var17.getKey();
               rfj_3 var19 = var15.id_private();
               rje_3 var20 = this.id_class(var18);

               for (int var21 = 0; var21 < 16; var21++) {
                  for (int var22 = 0; var22 < 16; var22++) {
                     int var23 = var19.id_break * 16 + var21;
                     int var24 = var19.id_byte * 16 + var22;
                     float var25 = (float)((double)((float)var9.id_class(var18, var23, var24) + (float)var18.ordinal() * 0.09375F) - var5);
                     yX_2.id_class(
                        var12,
                        (double)((float)var23 + 0.25F) - var3,
                        (double)var25,
                        (double)((float)var24 + 0.25F) - var7,
                        (double)((float)var23 + 0.75F) - var3,
                        (double)(var25 + 0.09375F),
                        (double)((float)var24 + 0.75F) - var7,
                        var20.id_class(),
                        var20.id_break(),
                        var20.id_byte(),
                        1.0F
                     );
                  }
               }
            }
         }
      }

      var11.id_break();
      RenderSystem.enableTexture();
      RenderSystem.popMatrix();
   }

   private rje_3 id_class(rKv_1 var1) {
      switch (var1) {
         case WORLD_SURFACE_WG:
            return new rje_3(1.0F, 1.0F, 0.0F);
         case OCEAN_FLOOR_WG:
            return new rje_3(1.0F, 0.0F, 1.0F);
         case WORLD_SURFACE:
            return new rje_3(0.0F, 0.7F, 0.0F);
         case OCEAN_FLOOR:
            return new rje_3(0.0F, 0.0F, 0.5F);
         case MOTION_BLOCKING:
            return new rje_3(0.0F, 0.3F, 0.3F);
         case MOTION_BLOCKING_NO_LEAVES:
            return new rje_3(0.0F, 0.5F, 0.5F);
         default:
            return new rje_3(0.0F, 0.0F, 0.0F);
      }
   }
}
