package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Random;

public class Zn_1 extends Fu_1<rJE> {
   private static final rqO_2 boolean_ = new rqO_2("textures/gui/container/enchanting_table.png");
   private static final rqO_2 transient_ = new rqO_2("textures/entity/enchanting_table_book.png");
   private static final tm_3 for_ = new tm_3();
   private final Random double_ = new Random();
   public int class_;
   public float throws_;
   public float case_;
   public float catch_;
   public float private_;
   public float implements_;
   public float finally_;
   private rdn_3 switch_ = rdn_3.break_;

   public Zn_1(rJE var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected void class_(Ml_1 var1, float var2, int var3, int var4) {
      HF.byte_();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.volatile_.A().class_(boolean_);
      int var5 = (this.package_ - this.synchronized_) / 2;
      int var6 = (this.int_ - this.return_) / 2;
      this.break_(var1, var5, var6, 0, 0, this.synchronized_, this.return_);
      RenderSystem.matrixMode(5889);
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      int var7 = (int)this.volatile_.else_().return_();
      RenderSystem.viewport((this.package_ - 320) / 2 * var7, (this.int_ - 240) / 2 * var7, 320 * var7, 240 * var7);
      RenderSystem.translatef(-0.34F, 0.23F, 0.0F);
      RenderSystem.multMatrix(rjV_2.class_(90.0, 1.3333334F, 9.0F, 80.0F));
      RenderSystem.matrixMode(5888);
      var1.class_();
      MH var8 = var1.byte_();
      var8.class_().class_();
      var8.break_().byte_();
      var1.class_(0.0, 3.3F, 1984.0);
      float var9 = 5.0F;
      var1.class_(5.0F, 5.0F, 5.0F);
      var1.class_(rje_3.case_.byte_(180.0F));
      var1.class_(rje_3.break_.byte_(20.0F));
      float var10 = rfU_2.catch_(var2, this.finally_, this.implements_);
      var1.class_((double)((1.0F - var10) * 0.2F), (double)((1.0F - var10) * 0.1F), (double)((1.0F - var10) * 0.25F));
      float var11 = -(1.0F - var10) * 90.0F - 90.0F;
      var1.class_(rje_3.protected_.byte_(var11));
      var1.class_(rje_3.break_.byte_(180.0F));
      float var12 = rfU_2.catch_(var2, this.case_, this.throws_) + 0.25F;
      float var13 = rfU_2.catch_(var2, this.case_, this.throws_) + 0.75F;
      var12 = (var12 - (float)rfU_2.break_((double)var12)) * 1.6F - 0.3F;
      var13 = (var13 - (float)rfU_2.break_((double)var13)) * 1.6F - 0.3F;
      if (var12 < 0.0F) {
         var12 = 0.0F;
      }

      if (var13 < 0.0F) {
         var13 = 0.0F;
      }

      if (var12 > 1.0F) {
         var12 = 1.0F;
      }

      if (var13 > 1.0F) {
         var13 = 1.0F;
      }

      RenderSystem.enableRescaleNormal();
      for_.class_(0.0F, var12, var13, var10);
      Hd_1 var14 = Hx_1.class_(yb_3.class_().byte_());
      Ok_1 var15 = var14.getBuffer(for_.class_(transient_));
      for_.class_(var1, var15, 15728880, fZ_2.class_, 1.0F, 1.0F, 1.0F, 1.0F);
      var14.break_();
      var1.break_();
      RenderSystem.matrixMode(5889);
      RenderSystem.viewport(0, 0, this.volatile_.else_().extends_(), this.volatile_.else_().native_());
      RenderSystem.popMatrix();
      RenderSystem.matrixMode(5888);
      HF.protected_();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      rph_3.class_().class_((long)this.instanceof_.break_());
      int var16 = this.instanceof_.class_();

      for (int var17 = 0; var17 < 3; var17++) {
         int var18 = var5 + 60;
         int var19 = var18 + 20;
         this.class_(0);
         this.volatile_.A().class_(boolean_);
         int var20 = this.instanceof_.class_[var17];
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         if (var20 == 0) {
            this.break_(var1, var18, var6 + 14 + 19 * var17, 0, 185, 108, 19);
         } else {
            String var21 = var20 + "";
            int var22 = 86 - this.super_.break_(var21);
            rgS_2 var23 = rph_3.class_().class_(this.super_, var22);
            int var24 = 6839882;
            if ((var16 < var17 + 1 || (Integer)((cb_3)this.volatile_.class_[57]).implements_[19] < var20)
               && !((rhx_3)((cb_3)this.volatile_.class_[57]).implements_[18]).protected_) {
               this.break_(var1, var18, var6 + 14 + 19 * var17, 0, 185, 108, 19);
               this.break_(var1, var18 + 1, var6 + 15 + 19 * var17, 16 * var17, 239, 16, 16);
               this.super_.class_(var23, var19, var6 + 16 + 19 * var17, var22, (var24 & 16711422) >> 1);
               var24 = 4226832;
            } else {
               int var25 = var3 - (var5 + 60);
               int var26 = var4 - (var6 + 14 + 19 * var17);
               if (var25 >= 0 && var26 >= 0 && var25 < 108 && var26 < 19) {
                  this.break_(var1, var18, var6 + 14 + 19 * var17, 0, 204, 108, 19);
                  var24 = 16777088;
               } else {
                  this.break_(var1, var18, var6 + 14 + 19 * var17, 0, 166, 108, 19);
               }

               this.break_(var1, var18 + 1, var6 + 15 + 19 * var17, 16 * var17, 223, 16, 16);
               this.super_.class_(var23, var19, var6 + 16 + 19 * var17, var22, var24);
               var24 = 8453920;
            }

            this.super_.class_(var1, var21, (float)(var19 + 86 - this.super_.break_(var21)), (float)(var6 + 16 + 19 * var17 + 7), var24);
         }
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      var4 = this.volatile_.X();
      this.class_(var1);
      super.class_(var1, var2, var3, var4);
      this.break_(var1, var2, var3);
      boolean var5 = ((rhx_3)((cb_3)this.volatile_.class_[57]).implements_[18]).protected_;
      int var6 = this.instanceof_.class_();

      for (int var7 = 0; var7 < 3; var7++) {
         int var8 = this.instanceof_.class_[var7];
         ev_3 var9 = ev_3.byte_(this.instanceof_.break_[var7]);
         int var10 = this.instanceof_.byte_[var7];
         int var11 = var7 + 1;
         if (this.class_(60, 14 + 19 * var7, 108, 17, (double)var2, (double)var3) && var8 > 0 && var10 >= 0 && var9 != null) {
            ArrayList var12 = Lists.newArrayList();
            var12.add(new rgn_3("container.enchant.clue", var9.protected_(var10)).class_(rgF_2.WHITE));
            if (!var5) {
               var12.add(rgN_2.byte_);
               if ((Integer)((cb_3)this.volatile_.class_[57]).implements_[19] < var8) {
                  var12.add(new rgn_3("container.enchant.level.requirement", this.instanceof_.class_[var7]).class_(rgF_2.RED));
               } else {
                  rgn_3 var13;
                  if (var11 == 1) {
                     var13 = new rgn_3("container.enchant.lapis.one");
                  } else {
                     var13 = new rgn_3("container.enchant.lapis.many", var11);
                  }

                  var12.add(var13.class_(var6 >= var11 ? rgF_2.GRAY : rgF_2.RED));
                  rgn_3 var14;
                  if (var11 == 1) {
                     var14 = new rgn_3("container.enchant.level.one");
                  } else {
                     var14 = new rgn_3("container.enchant.level.many", var11);
                  }

                  var12.add(var14.class_(rgF_2.GRAY));
               }
            }

            this.class_(var1, var12, var2, var3);
            break;
         }
      }
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      int var6 = (this.package_ - this.synchronized_) / 2;
      int var7 = (this.int_ - this.return_) / 2;

      for (int var8 = 0; var8 < 3; var8++) {
         double var9 = var1 - (double)(var6 + 60);
         double var11 = var3 - (double)(var7 + 14 + 19 * var8);
         if (var9 >= 0.0 && var11 >= 0.0 && var9 < 108.0 && var11 < 19.0 && this.instanceof_.break_((cb_3)this.volatile_.class_[57], var8)) {
            ((Ax_1)this.volatile_.class_[55]).class_(this.instanceof_.case_, var8);
            return true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   @Override
   public void finally_() {
      rdn_3 var1 = this.instanceof_.class_(0).class_();
      if (!rdn_3.break_(var1, this.switch_)) {
         this.switch_ = var1;

         do {
            this.catch_ = this.catch_ + (float)(this.double_.nextInt(4) - this.double_.nextInt(4));
         } while (this.throws_ <= this.catch_ + 1.0F && this.throws_ >= this.catch_ - 1.0F);
      }

      this.class_++;
      this.case_ = this.throws_;
      this.finally_ = this.implements_;
      boolean var2 = false;

      for (int var3 = 0; var3 < 3; var3++) {
         if (this.instanceof_.class_[var3] != 0) {
            var2 = true;
         }
      }

      if (var2) {
         this.implements_ += 0.2F;
      } else {
         this.implements_ -= 0.2F;
      }

      this.implements_ = rfU_2.class_(this.implements_, 0.0F, 1.0F);
      float var5 = (this.catch_ - this.throws_) * 0.4F;
      float var4 = 0.2F;
      var5 = rfU_2.class_(var5, -0.2F, 0.2F);
      this.private_ = this.private_ + (var5 - this.private_) * 0.9F;
      this.throws_ = this.throws_ + this.private_;
   }

   @Override
   public void private_() {
      super.private_();
      this.finally_();
   }
}
