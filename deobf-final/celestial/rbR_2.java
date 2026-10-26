package celestial;

import java.util.Random;

public class rbR_2 extends rbZ_2 {
   private static final rkg_3 while_ = rkg_3.class_(rdy_3.hP, rdy_3.JW, rdy_3.Jk, rdy_3.kJ);
   public float super_;
   public float this_;
   public float else_;
   public float synchronized_;
   public float return_ = 1.0F;
   public int public_ = ((Random)this.throws_[40]).nextInt(6000) + 6000;
   public boolean goto_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.rg;
   }

   @Override
   protected int byte_(rhd_3 var1) {
      return this.n() ? 10 : super.byte_(var1);
   }

   public rbR_2(aI_2<? extends rbR_2> var1, rYB var2) {
      super(var1, var2);
      this.class_(rLp_1.WATER, 0.0F);
   }

   public void this_(boolean var1) {
      this.goto_ = var1;
   }

   @Override
   public boolean n() {
      return this.goto_;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("IsChickenJockey", this.goto_);
      var1.break_("EggLayTime", this.public_);
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   public void default_() {
      super.default_();
      this.synchronized_ = this.super_;
      this.else_ = this.this_;
      this.this_ = (float)((double)this.this_ + (double)(this.throws_[20] ? -1 : 4) * 0.3);
      this.this_ = rfU_2.class_(this.this_, 0.0F, 1.0F);
      if (!(Boolean)this.throws_[20] && this.return_ < 1.0F) {
         this.return_ = 1.0F;
      }

      this.return_ = (float)((double)this.return_ * 0.9);
      rjU_2 var1 = this.rv();
      if (!(Boolean)this.throws_[20] && var1.byte_ < 0.0) {
         this.byte_(var1.throws_(1.0, 0.6, 1.0));
      }

      this.super_ = this.super_ + this.return_ * 2.0F;
      if (!((rYB)this.throws_[7]).continue_ && this.BM() && !this.n_() && !this.n() && --this.public_ <= 0) {
         this.class_(rqn_3.rV, 1.0F, (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
         this.class_(rdy_3.XJ);
         this.public_ = ((Random)this.throws_[40]).nextInt(6000) + 6000;
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.goto_ = var1.new_("IsChickenJockey");
      if (var1.throws_("EggLayTime")) {
         this.public_ = var1.private_("EggLayTime");
      }
   }

   public rbR_2 break_(rrEm_1 var1, au_3 var2) {
      return aI_2.finally_.class_(var1);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.rR, 0.15F, 1.0F);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.break_ * 0.85F : var2.break_ * 0.92F;
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 4.0).class_(iQ_2.protected_, 0.25);
   }

   @Override
   public void catch_(an_3 var1) {
      super.catch_(var1);
      float var2 = rfU_2.class_((Float)this.private_[23] * (float) (Math.PI / 180.0));
      float var3 = rfU_2.break_((Float)this.private_[23] * (float) (Math.PI / 180.0));
      float var4 = 0.1F;
      float var5 = 0.0F;
      var1.new_(this.rx() + (double)(0.1F * var2), this.byte_(0.5) + var1.Pv() + 0.0, this.BO() - (double)(0.1F * var3));
      if (var1 instanceof iB_2 var10000) {
         Float var10 = (Float)this.private_[23];
         var10000.private_[23] = var10;
      }
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return while_.class_(var1);
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.rf;
   }

   @Override
   public boolean private_(double var1) {
      return this.n();
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rBY(this, 1.4));
      this.package_.class_(2, new rBP(this, 1.0));
      this.package_.class_(3, new rSO(this, 1.0, false, while_));
      this.package_.class_(4, new rBx_1(this, 1.1));
      this.package_.class_(5, new rSk_1(this, 1.0));
      this.package_.class_(6, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(7, new rBC(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.rj;
   }
}
