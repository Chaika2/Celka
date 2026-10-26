package celestial;

import java.util.Random;

public class rsN_2 extends rsJ_2 {
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rsN_2.class, ruw_3.implements_);
   private int catch_;
   public double class_;
   public double break_;
   private static final rkg_3 private_ = rkg_3.class_(rdy_3.Oh, rdy_3.OX);

   @Override
   protected void byte_(rfH_2 var1, xc_3 var2) {
      double var3 = 1.0E-4;
      double var5 = 0.001;
      super.byte_(var1, var2);
      rjU_2 var7 = this.rv();
      double var8 = case_(var7);
      double var10 = this.class_ * this.class_ + this.break_ * this.break_;
      if (var10 > 1.0E-4 && var8 > 0.001) {
         double var12 = (double)rfU_2.class_(var8);
         double var14 = (double)rfU_2.class_(var10);
         this.class_ = var7.break_ / var12 * var14;
         this.break_ = var7.protected_ / var12 * var14;
      }
   }

   protected void byte_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   @Override
   public xc_3 int_() {
      return xu_3.Ps.continue_().class_(C_do.volatile_, rpr_3.NORTH).class_(C_do.final_, Boolean.valueOf(this.else_()));
   }

   public rsN_2(aI_2<? extends rsN_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsN_2(rYB var1, double var2, double var4, double var6) {
      super(aI_2.B, var1, var2, var4, var6);
   }

   @Override
   public void this_() {
      super.this_();
      if (!((rYB)this.throws_[7]).import_()) {
         if (this.catch_ > 0) {
            this.catch_--;
         }

         if (this.catch_ <= 0) {
            this.class_ = 0.0;
            this.break_ = 0.0;
         }

         this.byte_(this.catch_ > 0);
      }

      if (this.else_() && ((Random)this.throws_[40]).nextInt(4) == 0) {
         ((rYB)this.throws_[7]).class_(rLQ.short_, this.rx(), this.re() + 0.8, this.BO(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (private_.class_(var3) && this.catch_ + 3600 <= 32000) {
         if (!((rhx_3)var1.implements_[18]).protected_) {
            var3.catch_(1);
         }

         this.catch_ += 3600;
      }

      if (this.catch_ > 0) {
         this.class_ = this.rx() - var1.rx();
         this.break_ = this.BO() - var1.BO();
      }

      return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
   }

   @Override
   protected void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("PushX", this.class_);
      var1.class_("PushZ", this.break_);
      var1.class_("Fuel", (short)this.catch_);
   }

   @Override
   protected void break_(rcd_3 var1) {
      super.break_(var1);
      this.class_ = var1.extends_("PushX");
      this.break_ = var1.extends_("PushZ");
      this.catch_ = var1.catch_("Fuel");
   }

   @Override
   public void break_(rye_3 var1) {
      super.break_(var1);
      if (!var1.protected_() && ((rYB)this.throws_[7]).B().break_(rRu_1.catch_)) {
         this.class_(xu_3.Ps);
      }
   }

   @Override
   protected void case_() {
      double var1 = this.class_ * this.class_ + this.break_ * this.break_;
      if (var1 > 1.0E-7) {
         var1 = (double)rfU_2.class_(var1);
         this.class_ /= var1;
         this.break_ /= var1;
         this.byte_(this.rv().throws_(0.8, 0.0, 0.8).break_(this.class_, 0.0, this.break_));
      } else {
         this.byte_(this.rv().throws_(0.98, 0.0, 0.98));
      }

      super.case_();
   }

   protected boolean else_() {
      return ((rmE_2)this.throws_[49]).class_(protected_);
   }

   @Override
   protected double protected_() {
      return 0.2;
   }

   @Override
   public rsd_3 final_() {
      return rsd_3.FURNACE;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(protected_, false);
   }
}
