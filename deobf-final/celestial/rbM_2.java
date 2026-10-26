package celestial;

public abstract class rbM_2 extends rEi_1 {
   protected static final rut_3<Boolean> class_ = rmE_2.class_(rbM_2.class, ruw_3.implements_);
   protected int break_ = 0;

   protected void byte_(rrEm_1 var1) {
      rbG_2 var2 = this.class_(aI_2.rb, true);
      if (var2 != null) {
         var2.break_(new rLY(rLD.implements_, 200, 0));
      }
   }

   @Override
   public void long_() {
      if (rbW_2.protected_(this)) {
         super.long_();
      }
   }

   @Override
   protected void double_() {
      super.double_();
      if (this.sJ()) {
         this.break_++;
      } else {
         this.break_ = 0;
      }

      if (this.break_ > 300) {
         this.sW();
         this.byte_((rrEm_1)((rYB)this.throws_[7]));
      }
   }

   public rbM_2(aI_2<? extends rbM_2> var1, rYB var2) {
      super(var1, var2);
      this.byte_(true);
      this.sz();
      this.class_(rLp_1.DANGER_FIRE, 16.0F);
      this.class_(rLp_1.DAMAGE_FIRE, -1.0F);
   }

   public void this_(boolean var1) {
      this.BQ().break_(class_, var1);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.L()) {
         var1.class_("IsImmuneToZombification", true);
      }

      var1.break_("TimeInOverworld", this.break_);
   }

   public abstract rbJ_2 sd();

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("IsImmuneToZombification"));
      this.break_ = var1.private_("TimeInOverworld");
   }

   protected abstract boolean throws_();

   protected boolean L() {
      return this.BQ().class_(class_);
   }

   public boolean sx() {
      return !this.n_();
   }

   protected boolean sk() {
      return this.ss().break_() instanceof rkW_2;
   }

   @Override
   protected void for_() {
      super.for_();
      ruP_2.class_(this);
   }

   private void sz() {
      if (rpc_3.class_(this)) {
         ((rLA)this.public_()).class_(true);
      }
   }

   @Override
   public iB_2 I_() {
      return ((iZ_2)this.private_[72]).byte_(il_3.package_).orElse((iB_2)null);
   }

   @Override
   public double Pv() {
      return this.n_() ? -0.05 : -0.45;
   }

   public boolean sJ() {
      return !((rYB)this.throws_[7]).default_().catch_() && !this.L() && !this.c();
   }

   protected abstract void sW();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
   }
}
