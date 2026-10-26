package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class Fw_1 extends Fu_1<rJD> {
   private static final rqO_2 class_ = new rqO_2("textures/gui/container/stonecutter.png");
   private float throws_;
   private boolean case_;
   private int catch_;
   private boolean private_;

   private void byte_(int var1, int var2, int var3) {
      List var4 = this.instanceof_.break_();

      for (int var5 = this.catch_; var5 < var3 && var5 < this.instanceof_.byte_(); var5++) {
         int var6 = var5 - this.catch_;
         int var7 = var1 + var6 % 4 * 16;
         int var8 = var6 / 4;
         int var9 = var2 + var8 * 18 + 2;
         this.volatile_.float_().class_(((rWu_1)var4.get(var5)).byte_(), var7, var9);
      }
   }

   public Fw_1(rJD var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      var1.class_(this::final_);
      this.goto_--;
   }

   @Override
   public boolean class_(double var1, double var3, int var5, double var6, double var8) {
      if (this.case_ && this.native_()) {
         int var10 = this.abstract_ + 14;
         int var11 = var10 + 54;
         this.throws_ = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.throws_ = rfU_2.class_(this.throws_, 0.0F, 1.0F);
         this.catch_ = (int)((double)(this.throws_ * (float)this.finally_()) + 0.5) * 4;
         return true;
      } else {
         return super.class_(var1, var3, var5, var6, var8);
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
      int var7 = (int)(41.0F * this.throws_);
      this.break_(var1, var5 + 119, var6 + 15 + var7, 176 + (this.native_() ? 0 : 12), 0, 12, 15);
      int var8 = this.char_ + 52;
      int var9 = this.abstract_ + 14;
      int var10 = this.catch_ + 12;
      this.break_(var1, var3, var4, var8, var9, var10);
      this.byte_(var8, var9, var10);
   }

   @Override
   public boolean class_(double var1, double var3, double var5) {
      if (this.native_()) {
         int var7 = this.finally_();
         this.throws_ = (float)((double)this.throws_ - var5 / (double)var7);
         this.throws_ = rfU_2.class_(this.throws_, 0.0F, 1.0F);
         this.catch_ = (int)((double)(this.throws_ * (float)var7) + 0.5) * 4;
      }

      return true;
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      this.case_ = false;
      if (this.private_) {
         int var6 = this.char_ + 52;
         int var7 = this.abstract_ + 14;
         int var8 = this.catch_ + 12;

         for (int var9 = this.catch_; var9 < var8; var9++) {
            int var10 = var9 - this.catch_;
            double var11 = var1 - (double)(var6 + var10 % 4 * 16);
            double var13 = var3 - (double)(var7 + var10 / 4 * 18);
            if (var11 >= 0.0 && var13 >= 0.0 && var11 < 16.0 && var13 < 18.0 && this.instanceof_.break_((cb_3)this.volatile_.class_[57], var9)) {
               QY.instanceof_().c().class_(Np_1.class_(rqn_3.dg, 1.0F));
               ((Ax_1)this.volatile_.class_[55]).class_(this.instanceof_.case_, var9);
               return true;
            }
         }

         var6 = this.char_ + 119;
         var7 = this.abstract_ + 9;
         if (var1 >= (double)var6 && var1 < (double)(var6 + 12) && var3 >= (double)var7 && var3 < (double)(var7 + 54)) {
            this.case_ = true;
         }
      }

      return super.break_(var1, var3, var5);
   }

   @Override
   protected void break_(Ml_1 var1, int var2, int var3) {
      super.break_(var1, var2, var3);
      if (this.private_) {
         int var4 = this.char_ + 52;
         int var5 = this.abstract_ + 14;
         int var6 = this.catch_ + 12;
         List var7 = this.instanceof_.break_();

         for (int var8 = this.catch_; var8 < var6 && var8 < this.instanceof_.byte_(); var8++) {
            int var9 = var8 - this.catch_;
            int var10 = var4 + var9 % 4 * 16;
            int var11 = var5 + var9 / 4 * 18 + 2;
            if (var2 >= var10 && var2 < var10 + 16 && var3 >= var11 && var3 < var11 + 18) {
               this.class_(var1, ((rWu_1)var7.get(var8)).byte_(), var2, var3);
            }
         }
      }
   }

   private void break_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = this.catch_; var7 < var6 && var7 < this.instanceof_.byte_(); var7++) {
         int var8 = var7 - this.catch_;
         int var9 = var4 + var8 % 4 * 16;
         int var10 = var8 / 4;
         int var11 = var5 + var10 * 18 + 2;
         int var12 = this.return_;
         if (var7 == this.instanceof_.class_()) {
            var12 += 18;
         } else if (var2 >= var9 && var3 >= var11 && var2 < var9 + 16 && var3 < var11 + 18) {
            var12 += 36;
         }

         this.break_(var1, var9, var11 - 1, 0, var12, 16, 18);
      }
   }

   protected int finally_() {
      return (this.instanceof_.byte_() + 4 - 1) / 4 - 3;
   }

   private void final_() {
      this.private_ = this.instanceof_.protected_();
      if (!this.private_) {
         this.throws_ = 0.0F;
         this.catch_ = 0;
      }
   }

   private boolean native_() {
      return this.private_ && this.instanceof_.byte_() > 12;
   }
}
