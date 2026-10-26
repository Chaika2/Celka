package celestial;

public class tC_2<T extends rbB_2> extends wg_3<T> {
   public tC_2(float var1, float var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.protected_ = new Iq_1(this, 32, 48);
      this.protected_.class_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.protected_.class_(-5.0F, 2.0F + var2, 0.0F);
      this.case_ = new Iq_1(this, 16, 48);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.case_.class_(-1.9F, 12.0F + var2, 0.0F);
   }

   public tC_2(float var1, boolean var2) {
      super(var1, 0.0F, 64, var2 ? 32 : 64);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      if (this.private_ == tQ_2.THROW_SPEAR) {
         this.throws_.case_ = this.throws_.case_ * 0.5F - (float) Math.PI;
         this.throws_.catch_ = 0.0F;
      }

      if (this.implements_ == tQ_2.THROW_SPEAR) {
         this.protected_.case_ = this.protected_.case_ * 0.5F - (float) Math.PI;
         this.protected_.catch_ = 0.0F;
      }

      if (this.extends_ > 0.0F) {
         this.protected_.case_ = this.class_(this.extends_, this.protected_.case_, (float) (-Math.PI * 4.0 / 5.0))
            + this.extends_ * 0.35F * rfU_2.class_(0.1F * var4);
         this.throws_.case_ = this.class_(this.extends_, this.throws_.case_, (float) (-Math.PI * 4.0 / 5.0))
            - this.extends_ * 0.35F * rfU_2.class_(0.1F * var4);
         this.protected_.private_ = this.class_(this.extends_, this.protected_.private_, -0.15F);
         this.throws_.private_ = this.class_(this.extends_, this.throws_.private_, 0.15F);
         this.catch_.case_ = this.catch_.case_ - this.extends_ * 0.55F * rfU_2.class_(0.1F * var4);
         this.case_.case_ = this.case_.case_ + this.extends_ * 0.55F * rfU_2.class_(0.1F * var4);
         this.class_.case_ = 0.0F;
      }
   }

   public void class_(T var1, float var2, float var3, float var4) {
      this.implements_ = tQ_2.EMPTY;
      this.private_ = tQ_2.EMPTY;
      rdn_3 var5 = var1.protected_(rpm_3.MAIN_HAND);
      if (var5.break_() == rdy_3.kY && var1.v()) {
         if (var1.Su() == rpZ_2.RIGHT) {
            this.implements_ = tQ_2.THROW_SPEAR;
         } else {
            this.private_ = tQ_2.THROW_SPEAR;
         }
      }

      super.class_((T)var1, var2, var3, var4);
   }
}
