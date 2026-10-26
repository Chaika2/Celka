package celestial;

public abstract class rGp_1 extends rsi_3 {
   private static final rut_3<Byte> super_ = rmE_2.class_(rGp_1.class, ruw_3.class_);
   protected int protected_;
   private rGT this_ = rGT.NONE;

   @Override
   protected void double_() {
      super.double_();
      if (this.protected_ > 0) {
         this.protected_--;
      }
   }

   protected rGp_1(aI_2<? extends rGp_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      if (((rYB)this.throws_[7]).continue_ && this.sn()) {
         rGT var1 = this.sC();
         double var2 = var1.particleSpeed[0];
         double var4 = var1.particleSpeed[1];
         double var6 = var1.particleSpeed[2];
         float var8 = (Float)this.private_[23] * (float) (Math.PI / 180.0) + rfU_2.break_((float)((Integer)this.throws_[41]).intValue() * 0.6662F) * 0.25F;
         float var9 = rfU_2.break_(var8);
         float var10 = rfU_2.class_(var8);
         ((rYB)this.throws_[7]).class_(rLQ.else_, this.rx() + (double)var9 * 0.6, this.re() + 1.8, this.BO() + (double)var10 * 0.6, var2, var4, var6);
         ((rYB)this.throws_[7]).class_(rLQ.else_, this.rx() - (double)var9 * 0.6, this.re() + 1.8, this.BO() - (double)var10 * 0.6, var2, var4, var6);
      }
   }

   protected int sl() {
      return this.protected_;
   }

   public void class_(rGT var1) {
      this.this_ = var1;
      ((rmE_2)this.throws_[49]).break_(super_, (byte)var1.id);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("SpellTicks", this.protected_);
   }

   protected abstract rqA_2 sc();

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.protected_ = var1.private_("SpellTicks");
   }

   @Override
   public rEr_1 throws_() {
      if (this.sn()) {
         return rEr_1.SPELLCASTING;
      } else {
         return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
      }
   }

   public boolean sn() {
      return ((rYB)this.throws_[7]).continue_ ? ((rmE_2)this.throws_[49]).class_(super_) > 0 : this.protected_ > 0;
   }

   protected rGT sC() {
      return !((rYB)this.throws_[7]).continue_ ? this.this_ : rGT.class_(((rmE_2)this.throws_[49]).class_(super_));
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, (byte)0);
   }
}
