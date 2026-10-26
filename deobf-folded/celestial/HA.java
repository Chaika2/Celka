package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class HA {
   private final rqO_2[] id_class = new rqO_2[6];

   public HA(rqO_2 var1) {
      for (int var2 = 0; var2 < 6; var2++) {
         this.id_class[var2] = new rqO_2(var1.id_byte(), var1.id_break() + "_" + var2 + ".png");
      }
   }

   public void id_class(QY var1, float var2, float var3, float var4) {
      yb_3 var5 = yb_3.id_class();
      lD_2 var6 = var5.id_byte();
      RenderSystem.matrixMode(5889);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(rjV_2.id_class(85.0, (float)var1.id_else().id_extends() / (float)var1.id_else().id_native(), 0.05F, 10.0F));
      RenderSystem.matrixMode(5888);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.rotatef(180.0F, 1.0F, 0.0F, 0.0F);
      RenderSystem.enableBlend();
      RenderSystem.disableAlphaTest();
      RenderSystem.disableCull();
      RenderSystem.depthMask(false);
      RenderSystem.defaultBlendFunc();
      byte var7 = 2;

      for (int var8 = 0; var8 < 4; var8++) {
         RenderSystem.pushMatrix();
         float var9 = ((float)(var8 % 2) / 2.0F - 0.5F) / 256.0F;
         float var10 = ((float)(var8 / 2) / 2.0F - 0.5F) / 256.0F;
         RenderSystem.translatef(var9, var10, 0.0F);
         RenderSystem.rotatef(var2, 1.0F, 0.0F, 0.0F);
         RenderSystem.rotatef(var3, 0.0F, 1.0F, 0.0F);

         for (int var11 = 0; var11 < 6; var11++) {
            var1.A().id_class(this.id_class[var11]);
            var6.id_class(7, ju_3.id_public);
            int var12 = Math.round(255.0F * var4) / (var8 + 1);
            if (var11 == 0) {
               var6.id_class(-1.0, -1.0, 1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, 1.0, 1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, 1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, -1.0, 1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            if (var11 == 1) {
               var6.id_class(1.0, -1.0, 1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, 1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, -1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, -1.0, -1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            if (var11 == 2) {
               var6.id_class(1.0, -1.0, -1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, -1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, 1.0, -1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, -1.0, -1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            if (var11 == 3) {
               var6.id_class(-1.0, -1.0, -1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, 1.0, -1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, 1.0, 1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, -1.0, 1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            if (var11 == 4) {
               var6.id_class(-1.0, -1.0, -1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, -1.0, 1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, -1.0, 1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, -1.0, -1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            if (var11 == 5) {
               var6.id_class(-1.0, 1.0, 1.0).id_class(0.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(-1.0, 1.0, -1.0).id_class(0.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, -1.0).id_class(1.0F, 1.0F).id_break(255, 255, 255, var12).id_class();
               var6.id_class(1.0, 1.0, 1.0).id_class(1.0F, 0.0F).id_break(255, 255, 255, var12).id_class();
            }

            var5.id_break();
         }

         RenderSystem.popMatrix();
         RenderSystem.colorMask(true, true, true, false);
      }

      RenderSystem.colorMask(true, true, true, true);
      RenderSystem.matrixMode(5889);
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      RenderSystem.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.enableCull();
      RenderSystem.enableDepthTest();
   }

   public CompletableFuture<Void> id_class(fY_2 var1, Executor var2) {
      CompletableFuture[] var3 = new CompletableFuture[6];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var1.id_class(this.id_class[var4], var2);
      }

      return CompletableFuture.allOf(var3);
   }
}
