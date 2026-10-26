package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class pO_2 implements yD_2 {
   private final QY class_;

   public pO_2(QY var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rYB var9 = (rYB)((cb_3)this.class_.class_[57]).throws_[7];
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.lineWidth(2.0F);
      RenderSystem.disableTexture();
      RenderSystem.depthMask(false);
      rfH_2 var10 = new rfH_2(var3, var5, var7);

      for (rfH_2 var12 : rfH_2.class_(var10.break_(-6, -6, -6), var10.break_(6, 6, 6))) {
         xc_3 var13 = var9.byte_(var12);
         if (!var13.class_(xu_3.class_)) {
            rjC_2 var14 = var13.finally_(var9, var12);

            for (rfl_3 var16 : var14.protected_()) {
               rfl_3 var17 = var16.class_(var12).class_(0.002).protected_(-var3, -var5, -var7);
               double var18 = var17.class_;
               double var20 = var17.break_;
               double var22 = var17.byte_;
               double var24 = var17.protected_;
               double var26 = var17.throws_;
               double var28 = var17.case_;
               float var30 = 1.0F;
               float var31 = 0.0F;
               float var32 = 0.0F;
               float var33 = 0.5F;
               if (var13.protected_(var9, var12, rpr_3.WEST)) {
                  yb_3 var34 = yb_3.class_();
                  lD_2 var35 = var34.byte_();
                  var35.class_(5, ju_3.this_);
                  var35.class_(var18, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var35.class_(var18, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var35.class_(var18, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var35.class_(var18, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var34.break_();
               }

               if (var13.protected_(var9, var12, rpr_3.SOUTH)) {
                  yb_3 var36 = yb_3.class_();
                  lD_2 var41 = var36.byte_();
                  var41.class_(5, ju_3.this_);
                  var41.class_(var18, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var41.class_(var18, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var41.class_(var24, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var41.class_(var24, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var36.break_();
               }

               if (var13.protected_(var9, var12, rpr_3.EAST)) {
                  yb_3 var37 = yb_3.class_();
                  lD_2 var42 = var37.byte_();
                  var42.class_(5, ju_3.this_);
                  var42.class_(var24, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var42.class_(var24, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var42.class_(var24, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var42.class_(var24, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var37.break_();
               }

               if (var13.protected_(var9, var12, rpr_3.NORTH)) {
                  yb_3 var38 = yb_3.class_();
                  lD_2 var43 = var38.byte_();
                  var43.class_(5, ju_3.this_);
                  var43.class_(var24, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var43.class_(var24, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var43.class_(var18, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var43.class_(var18, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var38.break_();
               }

               if (var13.protected_(var9, var12, rpr_3.DOWN)) {
                  yb_3 var39 = yb_3.class_();
                  lD_2 var44 = var39.byte_();
                  var44.class_(5, ju_3.this_);
                  var44.class_(var18, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var44.class_(var24, var20, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var44.class_(var18, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var44.class_(var24, var20, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var39.break_();
               }

               if (var13.protected_(var9, var12, rpr_3.UP)) {
                  yb_3 var40 = yb_3.class_();
                  lD_2 var45 = var40.byte_();
                  var45.class_(5, ju_3.this_);
                  var45.class_(var18, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var45.class_(var18, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var45.class_(var24, var26, var22).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var45.class_(var24, var26, var28).class_(1.0F, 0.0F, 0.0F, 0.5F).class_();
                  var40.break_();
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }
}
