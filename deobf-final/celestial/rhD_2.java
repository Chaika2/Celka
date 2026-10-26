package celestial;

public class rhD_2 extends rhm_3 {
   private static final rut_3<Byte> implements_ = rmE_2.class_(rhD_2.class, ruw_3.class_);
   private static final rut_3<Boolean> finally_ = rmE_2.class_(rhD_2.class, ruw_3.implements_);
   private rdn_3 extends_ = new rdn_3(rdy_3.kY);
   private boolean native_;
   public int private_;

   @Override
   public float int_() {
      return 0.99F;
   }

   public rhD_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.g, var2, var4, var6, var1);
   }

   public rhD_2(rYB var1, iB_2 var2, rdn_3 var3) {
      super(aI_2.g, var2, var1);
      this.extends_ = var3.implements_();
      ((rmE_2)this.throws_[49]).break_(implements_, (byte)eA_2.case_(var3));
      ((rmE_2)this.throws_[49]).break_(finally_, var3.else_());
   }

   public rhD_2(aI_2<? extends rhD_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      if (this.break_ > 4) {
         this.native_ = true;
      }

      an_3 var1 = this.else_();
      if ((this.native_ || this.new_()) && var1 != null) {
         byte var2 = ((rmE_2)this.throws_[49]).class_(implements_);
         if (var2 > 0 && !this.public_()) {
            if (!((rYB)this.throws_[7]).continue_ && this.protected_ == rhZ_2.ALLOWED) {
               this.class_(this.catch_(), 0.1F);
            }

            this.PD();
         } else if (var2 > 0) {
            this.byte_(true);
            rjU_2 var3 = new rjU_2(var1.rx() - this.rx(), var1.rH() - this.re(), var1.BO() - this.BO());
            this.volatile_(this.rx(), this.re() + var3.byte_ * 0.015 * (double)var2, this.BO());
            if (((rYB)this.throws_[7]).continue_) {
               Double var10 = this.re();
               this.throws_[35] = var10;
            }

            double var4 = 0.05 * (double)var2;
            this.byte_(this.rv().class_(0.95).throws_(var3.protected_().class_(var4)));
            if (this.private_ == 0) {
               this.class_(rqn_3.dX, 10.0F, 1.0F);
            }

            this.private_++;
         }
      }

      super.this_();
   }

   @Override
   protected rfo_3 class_(rjU_2 var1, rjU_2 var2) {
      return this.native_ ? null : super.class_(var1, var2);
   }

   @Override
   protected void class_(rfo_3 var1) {
      an_3 var2 = var1.class_();
      float var3 = 8.0F;
      if (var2 instanceof iB_2 var4) {
         var3 += eA_2.class_(this.extends_, var4.sG());
      }

      an_3 var10 = this.else_();
      rye_3 var5 = rye_3.class_(this, (an_3)(var10 == null ? this : var10));
      this.native_ = true;
      rqA_2 var6 = rqn_3.dO;
      if (var2.break_(var5, var3)) {
         if (var2.BC() == aI_2.else_) {
            return;
         }

         if (var2 instanceof iB_2 var7) {
            if (var10 instanceof iB_2) {
               eA_2.class_(var7, var10);
               eA_2.break_((iB_2)var10, var7);
            }

            this.class_(var7);
         }
      }

      this.byte_(this.rv().throws_(-0.01, -0.1, -0.01));
      float var11 = 1.0F;
      if ((rYB)this.throws_[7] instanceof rrEm_1 && ((rYB)this.throws_[7]).S() && eA_2.private_(this.extends_)) {
         rfH_2 var8 = var2.Bs();
         if (((rYB)this.throws_[7]).case_(var8)) {
            rSg_1 var9 = aI_2.boolean_.class_((rYB)this.throws_[7]);
            var9.a_(rjU_2.protected_(var8));
            var9.protected_(var10 instanceof rhN_2 ? (rhN_2)var10 : null);
            ((rYB)this.throws_[7]).a_(var9);
            var6 = rqn_3.dW;
            var11 = 5.0F;
         }
      }

      this.class_(var6, var11, 1.0F);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Trident", this.extends_.break_(new rcd_3()));
      var1.class_("DealtDamage", this.native_);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("Trident", 10)) {
         this.extends_ = rdn_3.class_(var1.int_("Trident"));
      }

      this.native_ = var1.new_("DealtDamage");
      ((rmE_2)this.throws_[49]).break_(implements_, (byte)eA_2.case_(this.extends_));
   }

   @Override
   protected rqA_2 throws_() {
      return rqn_3.dh;
   }

   @Override
   protected rdn_3 catch_() {
      return this.extends_.implements_();
   }

   @Override
   public boolean super_() {
      return ((rmE_2)this.throws_[49]).class_(finally_);
   }

   private boolean public_() {
      an_3 var1 = this.else_();
      return var1 != null && var1.BM() ? !(var1 instanceof rhN_2) || !var1.native_() : false;
   }

   @Override
   public void protected_() {
      byte var1 = ((rmE_2)this.throws_[49]).class_(implements_);
      if (this.protected_ != rhZ_2.ALLOWED || var1 <= 0) {
         super.protected_();
      }
   }

   @Override
   public boolean final_(double var1, double var3, double var5) {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(implements_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(finally_, false);
   }

   @Override
   public void c_(rhd_3 var1) {
      an_3 var2 = this.else_();
      if (var2 == null || var2.ro() == var1.ro()) {
         super.c_(var1);
      }
   }
}
