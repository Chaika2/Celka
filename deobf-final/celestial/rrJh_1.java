package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collections;
import java.util.List;

public abstract class rrJh_1 extends cu_3 implements cp_3 {
   protected static final int class_ = -1;
   protected static final int throws_ = -2;
   protected final QY case_;
   protected int catch_;
   protected int private_;
   protected int implements_;
   protected int finally_;
   protected int extends_;
   protected int native_;
   protected final int volatile_;
   protected boolean final_ = true;
   protected int package_ = -2;
   protected double int_;
   protected boolean new_ = true;
   protected boolean continue_ = true;
   protected boolean super_;
   protected int this_;
   private boolean else_;

   public void byte_(int var1) {
      this.int_ = (double)(var1 * this.volatile_ + this.volatile_ / 2 - (this.finally_ - this.implements_) / 2);
      this.implements_();
   }

   public void byte_(boolean var1) {
      this.continue_ = var1;
   }

   protected void byte_(int var1, int var2, int var3, int var4) {
      yb_3 var5 = yb_3.class_();
      lD_2 var6 = var5.byte_();
      this.case_.A().class_(ch_3.break_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      float var7 = 32.0F;
      var6.class_(7, ju_3.public_);
      var6.class_((double)this.native_, (double)var2, 0.0).class_(0.0F, (float)var2 / 32.0F).break_(64, 64, 64, var4).class_();
      var6.class_((double)(this.native_ + this.catch_), (double)var2, 0.0)
         .class_((float)this.catch_ / 32.0F, (float)var2 / 32.0F)
         .break_(64, 64, 64, var4)
         .class_();
      var6.class_((double)(this.native_ + this.catch_), (double)var1, 0.0)
         .class_((float)this.catch_ / 32.0F, (float)var1 / 32.0F)
         .break_(64, 64, 64, var3)
         .class_();
      var6.class_((double)this.native_, (double)var1, 0.0).class_(0.0F, (float)var1 / 32.0F).break_(64, 64, 64, var3).class_();
      var5.break_();
   }

   protected void byte_(double var1, double var3, int var5) {
      this.else_ = var5 == 0 && var1 >= (double)this.package_() && var1 < (double)(this.package_() + 6);
   }

   public int int_() {
      return this.volatile_;
   }

   public rrJh_1(QY var1, int var2, int var3, int var4, int var5, int var6) {
      this.case_ = var1;
      this.catch_ = var2;
      this.private_ = var3;
      this.implements_ = var4;
      this.finally_ = var5;
      this.volatile_ = var6;
      this.native_ = 0;
      this.extends_ = var2;
   }

   protected void class_(boolean var1, int var2) {
      this.super_ = var1;
      this.this_ = var2;
      if (!var1) {
         this.this_ = 0;
      }
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      if (this.new_) {
         this.private_();
         int var5 = this.package_();
         int var6 = var5 + 6;
         this.implements_();
         yb_3 var7 = yb_3.class_();
         lD_2 var8 = var7.byte_();
         this.case_.A().class_(ch_3.break_);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         float var9 = 32.0F;
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.native_, (double)this.finally_, 0.0)
            .class_((float)this.native_ / 32.0F, (float)(this.finally_ + (int)this.int_) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.extends_, (double)this.finally_, 0.0)
            .class_((float)this.extends_ / 32.0F, (float)(this.finally_ + (int)this.int_) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.extends_, (double)this.implements_, 0.0)
            .class_((float)this.extends_ / 32.0F, (float)(this.implements_ + (int)this.int_) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var8.class_((double)this.native_, (double)this.implements_, 0.0)
            .class_((float)this.native_ / 32.0F, (float)(this.implements_ + (int)this.int_) / 32.0F)
            .break_(32, 32, 32, 255)
            .class_();
         var7.break_();
         int var10 = this.native_ + this.catch_ / 2 - this.volatile_() / 2 + 2;
         int var11 = this.implements_ + 4 - (int)this.int_;
         if (this.super_) {
            this.class_(var10, var11, var7);
         }

         this.class_(var1, var10, var11, var2, var3, var4);
         RenderSystem.disableDepthTest();
         this.byte_(0, this.implements_, 255, 255);
         this.byte_(this.finally_, this.private_, 255, 255);
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA, OP.ZERO, MK.ONE);
         RenderSystem.disableAlphaTest();
         RenderSystem.shadeModel(7425);
         RenderSystem.disableTexture();
         byte var12 = 4;
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.native_, (double)(this.implements_ + 4), 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.extends_, (double)(this.implements_ + 4), 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.extends_, (double)this.implements_, 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.native_, (double)this.implements_, 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 255).class_();
         var7.break_();
         var8.class_(7, ju_3.public_);
         var8.class_((double)this.native_, (double)this.finally_, 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.extends_, (double)this.finally_, 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 255).class_();
         var8.class_((double)this.extends_, (double)(this.finally_ - 4), 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 0).class_();
         var8.class_((double)this.native_, (double)(this.finally_ - 4), 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 0).class_();
         var7.break_();
         int var13 = this.finally_();
         if (var13 > 0) {
            int var14 = (int)((float)((this.finally_ - this.implements_) * (this.finally_ - this.implements_)) / (float)this.throws_());
            var14 = rfU_2.class_(var14, 32, this.finally_ - this.implements_ - 8);
            int var15 = (int)this.int_ * (this.finally_ - this.implements_ - var14) / var13 + this.implements_;
            if (var15 < this.implements_) {
               var15 = this.implements_;
            }

            var8.class_(7, ju_3.public_);
            var8.class_((double)var5, (double)this.finally_, 0.0).class_(0.0F, 1.0F).break_(0, 0, 0, 255).class_();
            var8.class_((double)var6, (double)this.finally_, 0.0).class_(1.0F, 1.0F).break_(0, 0, 0, 255).class_();
            var8.class_((double)var6, (double)this.implements_, 0.0).class_(1.0F, 0.0F).break_(0, 0, 0, 255).class_();
            var8.class_((double)var5, (double)this.implements_, 0.0).class_(0.0F, 0.0F).break_(0, 0, 0, 255).class_();
            var7.break_();
            var8.class_(7, ju_3.public_);
            var8.class_((double)var5, (double)(var15 + var14), 0.0).class_(0.0F, 1.0F).break_(128, 128, 128, 255).class_();
            var8.class_((double)var6, (double)(var15 + var14), 0.0).class_(1.0F, 1.0F).break_(128, 128, 128, 255).class_();
            var8.class_((double)var6, (double)var15, 0.0).class_(1.0F, 0.0F).break_(128, 128, 128, 255).class_();
            var8.class_((double)var5, (double)var15, 0.0).class_(0.0F, 0.0F).break_(128, 128, 128, 255).class_();
            var7.break_();
            var8.class_(7, ju_3.public_);
            var8.class_((double)var5, (double)(var15 + var14 - 1), 0.0).class_(0.0F, 1.0F).break_(192, 192, 192, 255).class_();
            var8.class_((double)(var6 - 1), (double)(var15 + var14 - 1), 0.0).class_(1.0F, 1.0F).break_(192, 192, 192, 255).class_();
            var8.class_((double)(var6 - 1), (double)var15, 0.0).class_(1.0F, 0.0F).break_(192, 192, 192, 255).class_();
            var8.class_((double)var5, (double)var15, 0.0).class_(0.0F, 0.0F).break_(192, 192, 192, 255).class_();
            var7.break_();
         }

         this.break_(var2, var3);
         RenderSystem.enableTexture();
         RenderSystem.shadeModel(7424);
         RenderSystem.enableAlphaTest();
         RenderSystem.disableBlend();
      }
   }

   protected void class_(Ml_1 var1, int var2, int var3, int var4, int var5, float var6) {
      int var7 = this.protected_();
      yb_3 var8 = yb_3.class_();
      lD_2 var9 = var8.byte_();

      for (int var10 = 0; var10 < var7; var10++) {
         int var11 = var3 + var10 * this.volatile_ + this.this_;
         int var12 = this.volatile_ - 4;
         if (var11 > this.finally_ || var11 + var12 < this.implements_) {
            this.class_(var10, var2, var11, var6);
         }

         if (this.continue_ && this.break_(var10)) {
            int var13 = this.native_ + this.catch_ / 2 - this.volatile_() / 2;
            int var14 = this.native_ + this.catch_ / 2 + this.volatile_() / 2;
            RenderSystem.disableTexture();
            float var15 = this.final_() ? 1.0F : 0.5F;
            RenderSystem.color4f(var15, var15, var15, 1.0F);
            var9.class_(7, ju_3.super_);
            var9.class_((double)var13, (double)(var11 + var12 + 2), 0.0).class_();
            var9.class_((double)var14, (double)(var11 + var12 + 2), 0.0).class_();
            var9.class_((double)var14, (double)(var11 - 2), 0.0).class_();
            var9.class_((double)var13, (double)(var11 - 2), 0.0).class_();
            var8.break_();
            RenderSystem.color4f(0.0F, 0.0F, 0.0F, 1.0F);
            var9.class_(7, ju_3.super_);
            var9.class_((double)(var13 + 1), (double)(var11 + var12 + 1), 0.0).class_();
            var9.class_((double)(var14 - 1), (double)(var11 + var12 + 1), 0.0).class_();
            var9.class_((double)(var14 - 1), (double)(var11 - 1), 0.0).class_();
            var9.class_((double)(var13 + 1), (double)(var11 - 1), 0.0).class_();
            var8.break_();
            RenderSystem.enableTexture();
         }

         if (var11 + this.volatile_ >= this.implements_ && var11 <= this.finally_) {
            this.class_(var1, var10, var2, var11, var12, var4, var5, var6);
         }
      }
   }

   @Override
   public boolean class_(char var1, int var2) {
      return !this.class_() ? false : super.class_(var1, var2);
   }

   protected void class_(int var1, int var2) {
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (!this.class_()) {
         return false;
      } else if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 == 264) {
         this.throws_(1);
         return true;
      } else if (var1 == 265) {
         this.throws_(-1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      if (!this.class_()) {
         return false;
      } else {
         this.int_ = this.int_ - var5 * (double)this.volatile_ / 2.0;
         return true;
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (super.class_(var1, var3, var5, var6, var8)) {
         return true;
      } else if (this.class_() && var5 == 0 && this.else_) {
         if (var3 < (double)this.implements_) {
            this.int_ = 0.0;
         } else if (var3 > (double)this.finally_) {
            this.int_ = (double)this.finally_();
         } else {
            double var10 = (double)this.finally_();
            if (var10 < 1.0) {
               var10 = 1.0;
            }

            int var12 = (int)((float)((this.finally_ - this.implements_) * (this.finally_ - this.implements_)) / (float)this.throws_());
            var12 = rfU_2.class_(var12, 32, this.finally_ - this.implements_ - 8);
            double var13 = var10 / (double)(this.finally_ - this.implements_ - var12);
            if (var13 < 1.0) {
               var13 = 1.0;
            }

            this.int_ += var8 * var13;
            this.implements_();
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean class_(double var1, double var3, int var5) {
      if (this.catch_() != null) {
         this.catch_().class_(var1, var3, var5);
      }

      return false;
   }

   protected abstract void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

   protected void class_(int var1, int var2, int var3, float var4) {
   }

   protected boolean class_(int var1, int var2, double var3, double var5) {
      return true;
   }

   protected void class_(int var1, int var2, yb_3 var3) {
   }

   public boolean class_() {
      return this.new_;
   }

   @Override
   public boolean break_(double var1, double var3) {
      return this.throws_(var1, var3);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.byte_(var1, var3, var5);
      if (this.class_() && this.throws_(var1, var3)) {
         int var6 = this.protected_(var1, var3);
         if (var6 == -1 && var5 == 0) {
            this.class_(
               (int)(var1 - (double)(this.native_ + this.catch_ / 2 - this.volatile_() / 2)), (int)(var3 - (double)this.implements_) + (int)this.int_ - 4
            );
            return true;
         } else if (var6 != -1 && this.class_(var6, var5, var1, var3)) {
            if (this.x_().size() > var6) {
               this.class_(this.x_().get(var6));
            }

            this.class_(true);
            return true;
         } else {
            return this.else_;
         }
      } else {
         return false;
      }
   }

   protected abstract boolean break_(int var1);

   protected void break_(int var1, int var2) {
   }

   public void break_(int var1, int var2, int var3, int var4) {
      this.catch_ = var1;
      this.private_ = var2;
      this.implements_ = var3;
      this.finally_ = var4;
      this.native_ = 0;
      this.extends_ = var1;
   }

   public boolean throws_(double var1, double var3) {
      return var3 >= (double)this.implements_ && var3 <= (double)this.finally_ && var1 >= (double)this.native_ && var1 <= (double)this.extends_;
   }

   protected int throws_() {
      return this.protected_() * this.volatile_ + this.this_;
   }

   protected void throws_(int var1) {
   }

   public int finally_() {
      return Math.max(0, this.throws_() - (this.finally_ - this.implements_ - 4));
   }

   public int extends_() {
      return (int)this.int_;
   }

   public void case_(int var1) {
      this.native_ = var1;
      this.extends_ = var1 + this.catch_;
   }

   protected void implements_() {
      this.int_ = rfU_2.class_(this.int_, 0.0, (double)this.finally_());
   }

   protected int package_() {
      return this.catch_ / 2 + 124;
   }

   protected abstract int protected_();

   public int protected_(double var1, double var3) {
      int var5 = this.native_ + this.catch_ / 2 - this.volatile_() / 2;
      int var6 = this.native_ + this.catch_ / 2 + this.volatile_() / 2;
      int var7 = rfU_2.byte_(var3 - (double)this.implements_) - this.this_ + (int)this.int_ - 4;
      int var8 = var7 / this.volatile_;
      return var1 < (double)this.package_() && var1 >= (double)var5 && var1 <= (double)var6 && var8 >= 0 && var7 >= 0 && var8 < this.protected_() ? var8 : -1;
   }

   public void protected_(boolean var1) {
      this.new_ = var1;
   }

   public void protected_(int var1) {
      this.int_ += (double)var1;
      this.implements_();
      this.package_ = -2;
   }

   protected abstract void private_();

   protected boolean final_() {
      return false;
   }

   public int volatile_() {
      return 220;
   }

   public int native_() {
      return (int)this.int_ - this.private_ - this.this_;
   }

   @Override
   public List<? extends cC_2> x_() {
      return Collections.emptyList();
   }
}
