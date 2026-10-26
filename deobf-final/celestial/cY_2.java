package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class cY_2 extends ch_3 implements Ls_1 {
   private static final rqO_2 throws_ = new rqO_2("textures/gui/widgets.png");
   public static final rqO_2 class_ = new rqO_2("textures/gui/spectator_widgets.png");
   private final QY case_;
   private long catch_;
   private Lb_1 private_;

   public cY_2(QY var1) {
      this.case_ = var1;
   }

   private void class_(Ml_1 var1, int var2, int var3, float var4, float var5, LS var6) {
      this.case_.A().class_(class_);
      if (var6 != Lb_1.class_) {
         int var7 = (int)(var5 * 255.0F);
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var3, var4, 0.0F);
         float var8 = var6.protected_() ? 1.0F : 0.25F;
         RenderSystem.color4f(var8, var8, var8, var5);
         var6.class_(var1, var8, var7);
         RenderSystem.popMatrix();
         if (var7 > 3 && var6.protected_()) {
            rgP_2 var9 = ((Qw_1)this.case_.class_[20]).t[var2].native_();
            ((cm_3)this.case_.class_[15])
               .break_(var1, var9, (float)(var3 + 19 - 2 - ((cm_3)this.case_.class_[15]).class_(var9)), var4 + 6.0F + 3.0F, 16777215 + (var7 << 24));
         }
      }
   }

   public void class_(Ml_1 var1) {
      int var2 = (int)(this.throws_() * 255.0F);
      if (var2 > 3 && this.private_ != null) {
         LS var3 = this.private_.break_();
         rgP_2 var4 = var3 == Lb_1.class_ ? this.private_.byte_().break_() : var3.byte_();
         if (var4 != null) {
            int var5 = (this.case_.else_().super_() - ((cm_3)this.case_.class_[15]).class_(var4)) / 2;
            int var6 = this.case_.else_().this_() - 35;
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            ((cm_3)this.case_.class_[15]).break_(var1, var4, (float)var5, (float)var6, 16777215 + (var2 << 24));
            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
         }
      }
   }

   public boolean class_() {
      return this.private_ != null;
   }

   public void class_(double var1) {
      int var3 = this.private_.throws_() + (int)var1;

      while (var3 >= 0 && var3 <= 8 && (this.private_.class_(var3) == Lb_1.class_ || !this.private_.class_(var3).protected_())) {
         var3 = (int)((double)var3 + var1);
      }

      if (var3 >= 0 && var3 <= 8) {
         this.private_.break_(var3);
         this.catch_ = rqR_2.break_();
      }
   }

   public void class_(Ml_1 var1, float var2) {
      if (this.private_ != null) {
         float var3 = this.throws_();
         if (var3 <= 0.0F) {
            this.private_.protected_();
         } else {
            int var4 = this.case_.else_().super_() / 2;
            int var5 = this.h_();
            this.class_(-90);
            int var6 = rfU_2.protected_((float)this.case_.else_().this_() - 22.0F * var3);
            LX var7 = this.private_.case_();
            this.class_(var1, var3, var4, var6, var7);
            this.class_(var5);
         }
      }
   }

   protected void class_(Ml_1 var1, float var2, int var3, int var4, LX var5) {
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var2);
      this.case_.A().class_(throws_);
      this.break_(var1, var3 - 91, var4, 0, 0, 182, 22);
      if (var5.class_() >= 0) {
         this.break_(var1, var3 - 91 - 1 + var5.class_() * 20, var4 - 1, 0, 22, 24, 22);
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.class_(var1, var6, this.case_.else_().super_() / 2 - 90 + var6 * 20 + 2, (float)(var4 + 3), var2, var5.class_(var6));
      }

      RenderSystem.disableRescaleNormal();
      RenderSystem.disableBlend();
   }

   @Override
   public void class_(Lb_1 var1) {
      this.private_ = null;
      this.catch_ = 0L;
   }

   public void break_(int var1) {
      this.catch_ = rqR_2.break_();
      if (this.private_ != null) {
         this.private_.break_(var1);
      } else {
         this.private_ = new Lb_1(this);
      }
   }

   private float throws_() {
      long var1 = this.catch_ - rqR_2.break_() + 5000L;
      return rfU_2.class_((float)var1 / 2000.0F, 0.0F, 1.0F);
   }

   public void protected_() {
      this.catch_ = rqR_2.break_();
      if (this.class_()) {
         int var1 = this.private_.throws_();
         if (var1 != -1) {
            this.private_.break_(var1);
         }
      } else {
         this.private_ = new Lb_1(this);
      }
   }
}
