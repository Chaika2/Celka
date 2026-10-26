package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class Lz_1 extends LZ {
   protected double throws_;

   @Override
   public void byte_(double var1, double var3) {
      this.class_(var1);
   }

   public Lz_1(int var1, int var2, int var3, int var4, rgP_2 var5, double var6) {
      super(var1, var2, var3, var4, var5);
      this.throws_ = var6;
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      boolean var4 = var1 == 263;
      if (var4 || var1 == 262) {
         float var5 = var4 ? -1.0F : 1.0F;
         this.break_(this.throws_ + (double)(var5 / (float)(this.extends_ - 8)));
      }

      return false;
   }

   private void class_(double var1) {
      this.break_((var1 - (double)(this.volatile_ + 4)) / (double)(this.extends_ - 8));
   }

   @Override
   protected void class_(double var1, double var3, double var5, double var7) {
      this.class_(var1);
      super.class_(var1, var3, var5, var7);
   }

   @Override
   public void class_(Nf_1 var1) {
   }

   @Override
   protected void class_(Ml_1 var1, QY var2, int var3, int var4) {
      var2.A().class_(finally_);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      int var5 = (this.B_() ? 2 : 1) * 20;
      this.break_(var1, this.volatile_ + (int)(this.throws_ * (double)(this.extends_ - 8)), this.final_, 0, 46 + var5, 4, 20);
      this.break_(var1, this.volatile_ + (int)(this.throws_ * (double)(this.extends_ - 8)) + 4, this.final_, 196, 46 + var5, 4, 20);
   }

   private void break_(double var1) {
      double var3 = this.throws_;
      this.throws_ = rfU_2.class_(var1, 0.0, 1.0);
      if (var3 != this.throws_) {
         this.private_();
      }

      this.catch_();
   }

   protected abstract void catch_();

   @Override
   public void protected_(double var1, double var3) {
      super.class_(QY.instanceof_().c());
   }

   protected abstract void private_();

   @Override
   protected int a_(boolean var1) {
      return 0;
   }

   @Override
   protected rVi_1 A_() {
      return new rgn_3("gui.narrate.slider", this.C_());
   }
}
