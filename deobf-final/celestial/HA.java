package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class HA {
   private final rqO_2[] class_ = new rqO_2[6];

   public HA(rqO_2 var1) {
      for (int var2 = 0; var2 < 6; var2++) {
         this.class_[var2] = new rqO_2(var1.byte_(), var1.break_() + "_" + var2 + ".png");
      }
   }

   public void class_(QY var1, float var2, float var3, float var4) {
      yb_3 var5 = yb_3.class_();
      lD_2 var6 = var5.byte_();
      RenderSystem.matrixMode(5889);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(rjV_2.class_(85.0, (float)var1.else_().extends_() / (float)var1.else_().native_(), 0.05F, 10.0F));
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
            var1.A().class_(this.class_[var11]);
            var6.class_(7, ju_3.public_);
            int var12 = Math.round(255.0F * var4) / (var8 + 1);
            if (var11 == 0) {
               var6.class_(-1.0, -1.0, 1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, 1.0, 1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, 1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, -1.0, 1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            if (var11 == 1) {
               var6.class_(1.0, -1.0, 1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, 1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, -1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, -1.0, -1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            if (var11 == 2) {
               var6.class_(1.0, -1.0, -1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, -1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, 1.0, -1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, -1.0, -1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            if (var11 == 3) {
               var6.class_(-1.0, -1.0, -1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, 1.0, -1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, 1.0, 1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, -1.0, 1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            if (var11 == 4) {
               var6.class_(-1.0, -1.0, -1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, -1.0, 1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, -1.0, 1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, -1.0, -1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            if (var11 == 5) {
               var6.class_(-1.0, 1.0, 1.0).class_(0.0F, 0.0F).break_(255, 255, 255, var12).class_();
               var6.class_(-1.0, 1.0, -1.0).class_(0.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, -1.0).class_(1.0F, 1.0F).break_(255, 255, 255, var12).class_();
               var6.class_(1.0, 1.0, 1.0).class_(1.0F, 0.0F).break_(255, 255, 255, var12).class_();
            }

            var5.break_();
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

   public CompletableFuture<Void> class_(fY_2 var1, Executor var2) {
      CompletableFuture[] var3 = new CompletableFuture[6];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = var1.class_(this.class_[var4], var2);
      }

      return CompletableFuture.allOf(var3);
   }
}
