package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fy_1 extends Fu_1<rJp_1> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/villager2.png");
   private static final rgP_2 throws_ = new rgn_3("merchant.trades");
   private static final rgP_2 case_ = new rgN_2(" - ");
   private static final rgP_2 catch_ = new rgn_3("merchant.deprecated");
   private int private_;
   private final Fp_1[] implements_ = new Fp_1[7];
   int finally_;
   private boolean boolean_;

   public Fy_1(rJp_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.synchronized_ = 276;
      this.while_ = 107;
   }

   private void class_(Ml_1 var1, rdI_2 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      this.volatile_.A().class_(class_);
      if (var2.int_()) {
         class_(var1, var3 + 5 + 35 + 20, var4 + 3, this.h_(), 25.0F, 171.0F, 10, 9, 256, 512);
      } else {
         class_(var1, var3 + 5 + 35 + 20, var4 + 3, this.h_(), 15.0F, 171.0F, 10, 9, 256, 512);
      }
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      int var7 = this.instanceof_.throws_().size();
      if (this.break_(var7)) {
         int var8 = var7 - 7;
         this.finally_ = (int)((double)this.finally_ - var5);
         this.finally_ = rfU_2.class_(this.finally_, 0, var8);
      }

      return true;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      int var10 = this.instanceof_.throws_().size();
      if (this.boolean_) {
         int var11 = this.abstract_ + 18;
         int var12 = var11 + 139;
         int var13 = var10 - 7;
         float var14 = ((float)var3 - (float)var11 - 13.5F) / ((float)(var12 - var11) - 27.0F);
         var14 = var14 * (float)var13 + 0.5F;
         this.finally_ = rfU_2.class_((int)var14, 0, var13);
         return true;
      } else {
         return super.class_(var1, var3, var5, var6, var8);
      }
   }

   private void class_(Ml_1 var1, rdn_3 var2, rdn_3 var3, int var4, int var5) {
      this.final_.break_(var2, var4, var5);
      if (var3.char_() == var2.char_()) {
         this.final_.class_(this.super_, var2, (float)var4, (float)var5);
      } else {
         this.final_.class_(this.super_, var3, (float)var4, (float)var5, var3.char_() == 1 ? "1" : null);
         this.final_.class_(this.super_, var2, (float)(var4 + 14), (float)var5, var2.char_() == 1 ? "1" : null);
         this.volatile_.A().class_(class_);
         this.class_(this.h_() + 300);
         class_(var1, var4 + 7, var5 + 12, this.h_(), 0.0F, 176.0F, 9, 2, 256, 512);
         this.class_(this.h_() - 300);
      }
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(class_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      class_(var1, var5, var6, this.h_(), 0.0F, 0.0F, this.synchronized_, this.return_, 256, 512);
      rdf_3 var7 = this.instanceof_.throws_();
      if (!var7.isEmpty()) {
         int var8 = this.private_;
         if (var8 < 0 || var8 >= var7.size()) {
            return;
         }

         rdI_2 var9 = var7.get(var8);
         if (var9.int_()) {
            this.volatile_.A().class_(class_);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            class_(var1, this.char_ + 83 + 99, this.abstract_ + 35, this.h_(), 311.0F, 0.0F, 28, 21, 256, 512);
         }
      }
   }

   @Override
   protected void class_(Ml_1 var1, int var2, int var3) {
      int var4 = this.instanceof_.byte_();
      if (var4 > 0 && var4 <= 5 && this.instanceof_.case_()) {
         rVi_1 var5 = this.extends_.case_().class_(case_).class_(new rgn_3("merchant.level." + var4));
         int var6 = this.super_.class_(var5);
         int var7 = 49 + this.synchronized_ / 2 - var6 / 2;
         this.super_.byte_(var1, var5, (float)var7, 6.0F, 4210752);
      } else {
         this.super_.byte_(var1, this.extends_, (float)(49 + this.synchronized_ / 2 - this.super_.class_(this.extends_) / 2), 6.0F, 4210752);
      }

      if (this.throw_ != null) {
         this.super_.byte_(var1, this.throw_.L_(), (float)this.while_, (float)this.try_, 4210752);
      }

      int var8 = this.super_.class_(throws_);
      this.super_.byte_(var1, throws_, (float)(5 - var8 / 2 + 48), 6.0F, 4210752);
   }

   private void class_(Ml_1 var1, int var2, int var3, rdf_3 var4) {
      int var5 = var4.size() + 1 - 7;
      if (var5 > 1) {
         int var6 = 139 - (27 + (var5 - 1) * 139 / var5);
         int var7 = 1 + var6 / var5 + 139 / var5;
         byte var8 = 113;
         int var9 = Math.min(113, this.finally_ * var7);
         if (this.finally_ == var5 - 1) {
            var9 = 113;
         }

         class_(var1, var2 + 94, var3 + 18 + var9, this.h_(), 0.0F, 199.0F, 6, 27, 256, 512);
      } else {
         class_(var1, var2 + 94, var3 + 18, this.h_(), 6.0F, 199.0F, 6, 27, 256, 512);
      }
   }

   private void class_(Ml_1 var1, int var2, int var3, rdI_2 var4) {
      this.volatile_.A().class_(class_);
      int var5 = this.instanceof_.byte_();
      int var6 = this.instanceof_.class_();
      if (var5 < 5) {
         class_(var1, var2 + 136, var3 + 16, this.h_(), 0.0F, 186.0F, 102, 5, 256, 512);
         int var7 = rsp_3.break_(var5);
         if (var6 >= var7 && rsp_3.protected_(var5)) {
            byte var8 = 100;
            float var9 = 100.0F / (float)(rsp_3.byte_(var5) - var7);
            int var10 = Math.min(rfU_2.protected_(var9 * (float)(var6 - var7)), 100);
            class_(var1, var2 + 136, var3 + 16, this.h_(), 0.0F, 191.0F, var10 + 1, 5, 256, 512);
            int var11 = this.instanceof_.break_();
            if (var11 > 0) {
               int var12 = Math.min(rfU_2.protected_((float)var11 * var9), 100 - var10);
               class_(var1, var2 + 136 + var10 + 1, var3 + 16 + 1, this.h_(), 2.0F, 182.0F, var12, 3, 256, 512);
            }
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      rdf_3 var5 = this.instanceof_.throws_();
      if (!var5.isEmpty()) {
         int var6 = (this.package_ - this.synchronized_) / 2;
         int var7 = (this.int_ - this.return_) / 2;
         int var8 = var7 + 16 + 1;
         int var9 = var6 + 5 + 5;
         RenderSystem.pushMatrix();
         RenderSystem.enableRescaleNormal();
         this.volatile_.A().class_(class_);
         this.class_(var1, var6, var7, var5);
         int var10 = 0;

         for (rdI_2 var12 : var5) {
            if (!this.break_(var5.size()) || var10 >= this.finally_ && var10 < 7 + this.finally_) {
               rdn_3 var13 = var12.class_();
               rdn_3 var14 = var12.break_();
               rdn_3 var15 = var12.byte_();
               rdn_3 var16 = var12.protected_();
               this.final_.break_ = 100.0F;
               int var17 = var8 + 2;
               this.class_(var1, var14, var13, var9, var17);
               if (!var15.class_()) {
                  this.final_.break_(var15, var6 + 5 + 35, var17);
                  this.final_.class_(this.super_, var15, (float)(var6 + 5 + 35), (float)var17);
               }

               this.class_(var1, var12, var6, var17);
               this.final_.break_(var16, var6 + 5 + 68, var17);
               this.final_.class_(this.super_, var16, (float)(var6 + 5 + 68), (float)var17);
               this.final_.break_ = 0.0F;
               var8 += 20;
               var10++;
            } else {
               var10++;
            }
         }

         int var18 = this.private_;
         rdI_2 var19 = var5.get(var18);
         if (this.instanceof_.case_()) {
            this.class_(var1, var6, var7, var19);
         }

         if (var19.int_() && this.class_(186, 35, 22, 21, (double)var2, (double)var3) && this.instanceof_.protected_()) {
            this.class_(var1, catch_, var2, var3);
         }

         for (Fp_1 var23 : this.implements_) {
            if (var23.B_()) {
               var23.class_(var1, var2, var3);
            }

            var23.new_ = var23.class_ < this.instanceof_.throws_().size();
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }

      this.break_(var1, var2, var3);
   }

   private boolean break_(int var1) {
      return var1 > 7;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.boolean_ = false;
      int var6 = (this.package_ - this.synchronized_) / 2;
      int var7 = (this.int_ - this.return_) / 2;
      if (this.break_(this.instanceof_.throws_().size())
         && var1 > (double)(var6 + 94)
         && var1 < (double)(var6 + 94 + 6)
         && var3 > (double)(var7 + 18)
         && var3 <= (double)(var7 + 18 + 139 + 1)) {
         this.boolean_ = true;
      }

      return super.break_(var1, var3, var5);
   }

   private void finally_() {
      this.instanceof_.protected_(this.private_);
      this.instanceof_.catch_(this.private_);
      this.volatile_.void_().class_(new rZm_1(this.private_));
   }

   @Override
   protected void v_() {
      super.v_();
      int var1 = (this.package_ - this.synchronized_) / 2;
      int var2 = (this.int_ - this.return_) / 2;
      int var3 = var2 + 16 + 2;

      for (int var4 = 0; var4 < 7; var4++) {
         this.implements_[var4] = this.class_(new Fp_1(this, var1 + 5, var3, var4, var1x -> {
            if (var1x instanceof Fp_1) {
               this.private_ = ((Fp_1)var1x).private_() + this.finally_;
               this.finally_();
            }
         }));
         var3 += 20;
      }
   }
}
