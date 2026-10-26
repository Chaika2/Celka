package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class yg_3 implements yD_2 {
   private final QY id_class;

   public yg_3(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      if (!rrdZ.id_new) {
         if (rrbb_3.rs()) {
            rrdZ.Z();
         }

         RenderSystem.enableDepthTest();
         RenderSystem.shadeModel(7425);
         RenderSystem.enableAlphaTest();
         RenderSystem.defaultAlphaFunc();
         an_3 var9 = ((Hh_1)this.id_class.id_class[16]).id_finally().id_catch();
         yb_3 var10 = yb_3.id_class();
         lD_2 var11 = var10.id_byte();
         double var12 = 0.0 - var5;
         double var14 = 256.0 - var5;
         RenderSystem.disableTexture();
         RenderSystem.disableBlend();
         double var16 = (double)((Integer)var9.id_throws[51] << 4) - var3;
         double var18 = (double)((Integer)var9.id_throws[53] << 4) - var7;
         RenderSystem.lineWidth(1.0F);
         var11.id_class(3, ju_3.id_this);

         for (byte var20 = -16; var20 <= 32; var20 += 16) {
            for (byte var21 = -16; var21 <= 32; var21 += 16) {
               var11.id_class(var16 + (double)var20, var12, var18 + (double)var21).id_class(1.0F, 0.0F, 0.0F, 0.0F).id_class();
               var11.id_class(var16 + (double)var20, var12, var18 + (double)var21).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
               var11.id_class(var16 + (double)var20, var14, var18 + (double)var21).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
               var11.id_class(var16 + (double)var20, var14, var18 + (double)var21).id_class(1.0F, 0.0F, 0.0F, 0.0F).id_class();
            }
         }

         for (byte var23 = 2; var23 < 16; var23 += 2) {
            var11.id_class(var16 + (double)var23, var12, var18).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16 + (double)var23, var12, var18).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + (double)var23, var14, var18).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + (double)var23, var14, var18).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16 + (double)var23, var12, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16 + (double)var23, var12, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + (double)var23, var14, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + (double)var23, var14, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
         }

         for (byte var24 = 2; var24 < 16; var24 += 2) {
            var11.id_class(var16, var12, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16, var12, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16, var14, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16, var14, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16 + 16.0, var12, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16 + 16.0, var12, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var14, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var14, var18 + (double)var24).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
         }

         for (byte var25 = 0; var25 <= 256; var25 += 2) {
            double var28 = (double)var25 - var5;
            var11.id_class(var16, var28, var18).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
            var11.id_class(var16, var28, var18).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16, var28, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var28, var18 + 16.0).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var28, var18).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16, var28, var18).id_class(1.0F, 1.0F, 0.0F, 1.0F).id_class();
            var11.id_class(var16, var28, var18).id_class(1.0F, 1.0F, 0.0F, 0.0F).id_class();
         }

         var10.id_break();
         RenderSystem.lineWidth(2.0F);
         var11.id_class(3, ju_3.id_this);

         for (byte var26 = 0; var26 <= 16; var26 += 16) {
            for (byte var29 = 0; var29 <= 16; var29 += 16) {
               var11.id_class(var16 + (double)var26, var12, var18 + (double)var29).id_class(0.25F, 0.25F, 1.0F, 0.0F).id_class();
               var11.id_class(var16 + (double)var26, var12, var18 + (double)var29).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
               var11.id_class(var16 + (double)var26, var14, var18 + (double)var29).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
               var11.id_class(var16 + (double)var26, var14, var18 + (double)var29).id_class(0.25F, 0.25F, 1.0F, 0.0F).id_class();
            }
         }

         for (byte var27 = 0; var27 <= 256; var27 += 16) {
            double var30 = (double)var27 - var5;
            var11.id_class(var16, var30, var18).id_class(0.25F, 0.25F, 1.0F, 0.0F).id_class();
            var11.id_class(var16, var30, var18).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
            var11.id_class(var16, var30, var18 + 16.0).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var30, var18 + 16.0).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
            var11.id_class(var16 + 16.0, var30, var18).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
            var11.id_class(var16, var30, var18).id_class(0.25F, 0.25F, 1.0F, 1.0F).id_class();
            var11.id_class(var16, var30, var18).id_class(0.25F, 0.25F, 1.0F, 0.0F).id_class();
         }

         var10.id_break();
         RenderSystem.lineWidth(1.0F);
         RenderSystem.enableBlend();
         RenderSystem.enableTexture();
         RenderSystem.shadeModel(7424);
         if (rrbb_3.rs()) {
            rrdZ.v();
         }
      }
   }
}
