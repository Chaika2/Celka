package celestial;

import java.util.Random;

public abstract class rOp_1 extends rOl_1 {
   private static final rut_3<Boolean> class_ = rmE_2.class_(rOp_1.class, ruw_3.implements_);

   public rOp_1(aI_2<? extends rOp_1> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rOq_1(this);
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   @Override
   protected boolean n() {
      return true;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("FromBucket", this.sx());
   }

   @Override
   public void default_() {
      if (!this.rT() && (Boolean)this.throws_[20] && (Boolean)this.throws_[24]) {
         this.byte_(
            this.rv()
               .break_(
                  (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.05F),
                  0.4F,
                  (double)((((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * 0.05F)
               )
         );
         Boolean var5 = false;
         this.throws_[20] = var5;
         Boolean var6 = true;
         this.throws_[57] = var6;
         this.class_(this.sJ(), this.Si(), this.SN());
      }

      super.default_();
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.65F;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("FromBucket"));
   }

   public static boolean break_(aI_2<? extends rOp_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.byte_(var3).class_(xu_3.try_) && var1.byte_(var3.final_()).class_(xu_3.try_);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      return new rLw_1(this, var1);
   }

   @Override
   protected ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() == rdy_3.hR && this.BM()) {
         this.class_(rqn_3.rN, 1.0F, 1.0F);
         var3.catch_(1);
         rdn_3 var4 = this.L();
         this.extends_(var4);
         if (!((rYB)this.throws_[7]).continue_) {
            Oo_1.finally_.class_((rhN_2)var1, var4);
         }

         if (var3.class_()) {
            var1.class_(var2, var4);
         } else if (!((rhz_3)var1.implements_[1]).throws_(var4)) {
            var1.class_(var4, false);
         }

         this.PD();
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   public static iz_3 throws_() {
      return is_3.package_().class_(iQ_2.class_, 3.0);
   }

   protected abstract rdn_3 L();

   private boolean sx() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   protected void extends_(rdn_3 var1) {
      if (this.Bk()) {
         var1.class_(this.rD());
      }
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.try_() && this.rT()) {
         this.class_(0.01F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.9));
         if (this.I_() == null) {
            this.byte_(this.rv().break_(0.0, -0.005, 0.0));
         }
      } else {
         super.private_(var1);
      }
   }

   @Override
   public boolean private_(double var1) {
      return !this.sx() && !this.Bk();
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(0, new rBY(this, 1.25));
      this.package_.class_(2, new rPD<>(this, rhd_3.class, 8.0F, 1.6, 1.4, rpJ_2.catch_::test));
      this.package_.class_(4, new rOT(this));
   }

   @Override
   public boolean strictfp_() {
      return super.strictfp_() || this.sx();
   }

   @Override
   public int E() {
      return 8;
   }

   @Override
   protected rqA_2 BB() {
      return rqn_3.SW;
   }

   protected abstract rqA_2 sJ();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
   }
}
