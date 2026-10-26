package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class LC extends Lv_1 {
   private static final rqO_2 class_ = new rqO_2("textures/gui/checkbox.png");
   private boolean throws_;
   private final boolean case_;

   public LC(int var1, int var2, int var3, int var4, rgP_2 var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, true);
   }

   public LC(int var1, int var2, int var3, int var4, rgP_2 var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5);
      this.throws_ = var6;
      this.case_ = var7;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.instanceof_();
      var5.A().class_(class_);
      RenderSystem.enableDepthTest();
      cm_3 var6 = (cm_3)var5.class_[15];
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.continue_);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.blendFunc(OP.SRC_ALPHA, MK.ONE_MINUS_SRC_ALPHA);
      class_(var1, this.volatile_, this.final_, this.aO_() ? 20.0F : 0.0F, this.throws_ ? 20.0F : 0.0F, 20, this.native_, 64, 64);
      this.class_(var1, var5, var2, var3);
      if (this.case_) {
         break_(var1, var6, this.C_(), this.volatile_ + 24, this.final_ + (this.native_ - 8) / 2, 14737632 | rfU_2.case_(this.continue_ * 255.0F) << 24);
      }
   }

   @Override
   public void catch_() {
      this.throws_ = !this.throws_;
   }

   public boolean private_() {
      return this.throws_;
   }
}
