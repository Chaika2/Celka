package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class pO_2 implements yD_2 {
   private final QY id_class;

   public pO_2(QY var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, double var3, double var5, double var7) {
      rYB var9 = (rYB)((cb_3)this.id_class.id_class[57]).id_throws[7];
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.lineWidth(2.0F);
      RenderSystem.disableTexture();
      RenderSystem.depthMask(false);
      rfH_2 var10 = new rfH_2(var3, var5, var7);

      for (rfH_2 var12 : rfH_2.id_class(var10.id_break(-6, -6, -6), var10.id_break(6, 6, 6))) {
         xc_3 var13 = var9.id_byte(var12);
         if (!var13.id_class(xu_3.id_class)) {
            rjC_2 var14 = var13.id_finally(var9, var12);

            for (rfl_3 var16 : var14.id_protected()) {
               rfl_3 var17 = var16.id_class(var12).id_class(0.002).id_protected(-var3, -var5, -var7);
               double var18 = var17.id_class;
               double var20 = var17.id_break;
               double var22 = var17.id_byte;
               double var24 = var17.id_protected;
               double var26 = var17.id_throws;
               double var28 = var17.id_case;
               float var30 = 1.0F;
               float var31 = 0.0F;
               float var32 = 0.0F;
               float var33 = 0.5F;
               if (var13.id_protected(var9, var12, rpr_3.WEST)) {
                  yb_3 var34 = yb_3.id_class();
                  lD_2 var35 = var34.id_byte();
                  var35.id_class(5, ju_3.id_this);
                  var35.id_class(var18, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var35.id_class(var18, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var35.id_class(var18, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var35.id_class(var18, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var34.id_break();
               }

               if (var13.id_protected(var9, var12, rpr_3.SOUTH)) {
                  yb_3 var36 = yb_3.id_class();
                  lD_2 var41 = var36.id_byte();
                  var41.id_class(5, ju_3.id_this);
                  var41.id_class(var18, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var41.id_class(var18, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var41.id_class(var24, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var41.id_class(var24, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var36.id_break();
               }

               if (var13.id_protected(var9, var12, rpr_3.EAST)) {
                  yb_3 var37 = yb_3.id_class();
                  lD_2 var42 = var37.id_byte();
                  var42.id_class(5, ju_3.id_this);
                  var42.id_class(var24, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var42.id_class(var24, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var42.id_class(var24, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var42.id_class(var24, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var37.id_break();
               }

               if (var13.id_protected(var9, var12, rpr_3.NORTH)) {
                  yb_3 var38 = yb_3.id_class();
                  lD_2 var43 = var38.id_byte();
                  var43.id_class(5, ju_3.id_this);
                  var43.id_class(var24, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var43.id_class(var24, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var43.id_class(var18, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var43.id_class(var18, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var38.id_break();
               }

               if (var13.id_protected(var9, var12, rpr_3.DOWN)) {
                  yb_3 var39 = yb_3.id_class();
                  lD_2 var44 = var39.id_byte();
                  var44.id_class(5, ju_3.id_this);
                  var44.id_class(var18, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var44.id_class(var24, var20, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var44.id_class(var18, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var44.id_class(var24, var20, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var39.id_break();
               }

               if (var13.id_protected(var9, var12, rpr_3.UP)) {
                  yb_3 var40 = yb_3.id_class();
                  lD_2 var45 = var40.id_byte();
                  var45.id_class(5, ju_3.id_this);
                  var45.id_class(var18, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var45.id_class(var18, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var45.id_class(var24, var26, var22).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var45.id_class(var24, var26, var28).id_class(1.0F, 0.0F, 0.0F, 0.5F).id_class();
                  var40.id_break();
               }
            }
         }
      }

      RenderSystem.depthMask(true);
      RenderSystem.enableTexture();
      RenderSystem.disableBlend();
   }
}
