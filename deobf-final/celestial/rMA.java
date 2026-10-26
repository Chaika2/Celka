package celestial;

import java.util.Random;

public class rMA extends rbZ_2 {
   private static final rkg_3 super_ = rkg_3.class_(rdy_3.Xz, rdy_3.XQ);
   private static final rut_3<Boolean> this_ = rmE_2.class_(rMA.class, ruw_3.implements_);
   private rMn_1<rhd_3> else_;
   private rMC synchronized_;

   @Override
   public int char_() {
      return 900;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Mw;
   }

   @Override
   public void double_() {
      if (this.super_().break_()) {
         double var1 = this.super_().byte_();
         if (var1 == 0.6) {
            this.class_(iM_2.CROUCHING);
            this.c_(false);
         } else if (var1 == 1.33) {
            this.class_(iM_2.STANDING);
            this.c_(true);
         } else {
            this.class_(iM_2.STANDING);
            this.c_(false);
         }
      } else {
         this.class_(iM_2.STANDING);
         this.c_(false);
      }
   }

   public rMA(aI_2<? extends rMA> var1, rYB var2) {
      super(var1, var2);
      this.n();
   }

   private void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
      this.n();
   }

   protected void n() {
      if (this.else_ == null) {
         this.else_ = new rMn_1<>(this, rhd_3.class, 16.0F, 0.8, 1.33);
      }

      this.package_.class_(this.else_);
      if (!this.sJ()) {
         this.package_.class_(4, this.else_);
      }
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 41) {
         this.else_(true);
      } else if (var1 == 40) {
         this.else_(false);
      } else {
         super.class_(var1);
      }
   }

   @Override
   public boolean class_(rRR var1) {
      if (var1.protected_(this) && !var1.protected_(this.rN())) {
         rfH_2 var2 = this.Bs();
         if (var2.c_() < var1.short_()) {
            return false;
         }

         xc_3 var3 = var1.byte_(var2.break_());
         if (var3.class_(xu_3.implements_) || var3.class_(rls_3.void_)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("Trusting", this.sJ());
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(1.0F);
      }

      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if ((this.synchronized_ == null || this.synchronized_.private_()) && !this.sJ() && this.extends_(var3) && var1.int_(this) < 9.0) {
         this.class_(var1, var3);
         if (!((rYB)this.throws_[7]).continue_) {
            if (((Random)this.throws_[40]).nextInt(3) == 0) {
               this.this_(true);
               this.else_(true);
               ((rYB)this.throws_[7]).class_(this, (byte)41);
            } else {
               this.else_(false);
               ((rYB)this.throws_[7]).class_(this, (byte)40);
            }
         }

         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else {
         return super.break_(var1, var2);
      }
   }

   public rMA break_(rrEm_1 var1, au_3 var2) {
      return aI_2.M.class_(var1);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("Trusting"));
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return this.class_(var1) ? false : super.break_(var1, var2);
   }

   public static boolean break_(aI_2<rMA> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var4.nextInt(3) != 0;
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.class_, 10.0).class_(iQ_2.protected_, 0.3F).class_(iQ_2.case_, 3.0);
   }

   private float sx() {
      return (float)this.class_(iQ_2.case_);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return super_.class_(var1);
   }

   private void else_(boolean var1) {
      rLO var2 = rLQ.long_;
      if (!var1) {
         var2 = rLQ.double_;
      }

      for (int var3 = 0; var3 < 7; var3++) {
         double var4 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var6 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         double var8 = ((Random)this.throws_[40]).nextGaussian() * 0.02;
         ((rYB)this.throws_[7]).class_(var2, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), var4, var6, var8);
      }
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.MI;
   }

   @Override
   public boolean public_(an_3 var1) {
      return var1.break_(rye_3.byte_(this), this.sx());
   }

   @Override
   public boolean private_(double var1) {
      return !this.sJ() && (Integer)this.throws_[41] > 2400;
   }

   @Override
   protected void final_() {
      this.synchronized_ = new rMC(this, 0.6, super_, true);
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(3, this.synchronized_);
      this.package_.class_(7, new rBv_1(this, 0.3F));
      this.package_.class_(8, new rBj_1(this));
      this.package_.class_(9, new rBP(this, 0.8));
      this.package_.class_(10, new rSk_1(this, 0.8, 1.0000001E-5F));
      this.package_.class_(11, new rBA(this, rhd_3.class, 10.0F));
      this.int_.class_(1, new rBI<>(this, rbR_2.class, false));
      this.int_.class_(1, new rBI<>(this, rON.class, 10, false, false, rON.super_));
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.5F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Mf;
   }

   boolean sJ() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(this_, false);
   }
}
