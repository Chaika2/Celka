package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FN extends Fu_1<rXR> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/cartography_table.png");

   public FN(rXR var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.goto_ -= 2;
   }

   private void class_(Ml_1 var1, rrGb_1 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var7 = this.char_;
      int var8 = this.abstract_;
      if (var4 && !var6) {
         this.break_(var1, var7 + 67, var8 + 13, this.synchronized_, 66, 66, 66);
         this.class_(var2, var7 + 85, var8 + 31, 0.226F);
      } else if (var3) {
         this.break_(var1, var7 + 67 + 16, var8 + 13, this.synchronized_, 132, 50, 66);
         this.class_(var2, var7 + 86, var8 + 16, 0.34F);
         this.volatile_.A().class_(class_);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 1.0F);
         this.break_(var1, var7 + 67, var8 + 13 + 16, this.synchronized_, 132, 50, 66);
         this.class_(var2, var7 + 70, var8 + 32, 0.34F);
         RenderSystem.popMatrix();
      } else if (var5) {
         this.break_(var1, var7 + 67, var8 + 13, this.synchronized_, 0, 66, 66);
         this.class_(var2, var7 + 71, var8 + 17, 0.45F);
         this.volatile_.A().class_(class_);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 1.0F);
         this.break_(var1, var7 + 66, var8 + 12, 0, this.return_, 66, 66);
         RenderSystem.popMatrix();
      } else {
         this.break_(var1, var7 + 67, var8 + 13, this.synchronized_, 0, 66, 66);
         this.class_(var2, var7 + 71, var8 + 17, 0.45F);
      }
   }

   private void class_(rrGb_1 var1, int var2, int var3, float var4) {
      if (var1 != null) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var2, (float)var3, 1.0F);
         RenderSystem.scalef(var4, var4, 1.0F);
         Hd_1 var5 = Hx_1.class_(yb_3.class_().byte_());
         ((Hh_1)this.volatile_.class_[16]).catch_().class_(new Ml_1(), var5, var1, true, 15728880);
         var5.break_();
         RenderSystem.popMatrix();
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      this.class_(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = this.char_;
      int var6 = this.abstract_;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      rdb_3 var7 = this.instanceof_.class_(1).class_().break_();
      boolean var8 = var7 == rdy_3.dM;
      boolean var9 = var7 == rdy_3.Xb;
      boolean var10 = var7 == rdy_3.BD;
      rdn_3 var11 = this.instanceof_.class_(0).class_();
      boolean var12 = false;
      rrGb_1 var13;
      if (var11.break_() == rdy_3.JX) {
         var13 = rxI_2.class_(var11, (gm_3)this.volatile_.class_[56]);
         if (var13 != null) {
            if (var13.private_) {
               var12 = true;
               if (var9 || var10) {
                  this.break_(var1, var5 + 35, var6 + 31, this.synchronized_ + 50, 132, 28, 21);
               }
            }

            if (var9 && var13.case_ >= 4) {
               var12 = true;
               this.break_(var1, var5 + 35, var6 + 31, this.synchronized_ + 50, 132, 28, 21);
            }
         }
      } else {
         var13 = null;
      }

      this.class_(var1, var13, var8, var9, var10, var12);
   }
}
