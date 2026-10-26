package celestial;

import java.util.Random;

public class rsU_2 extends rsy_3 {
   private rfH_2 this_;
   private int else_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.kC;
   }

   @Override
   protected rqA_2 byte_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return var2 == rdy_3.hi ? rqn_3.kA : rqn_3.kn;
   }

   public rsU_2(aI_2<? extends rsU_2> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[6] = var7;
   }

   @Override
   protected rqA_2 this_(boolean var1) {
      return var1 ? rqn_3.kp : rqn_3.kl;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("DespawnDelay", this.else_);
      if (this.this_ != null) {
         var1.class_("WanderTarget", rco_3.class_(this.this_));
      }
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return null;
   }

   @Override
   public void default_() {
      super.default_();
      if (!((rYB)this.throws_[7]).continue_) {
         this.sz();
      }
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (var3.break_() != rdy_3.xI && this.BM() && !this.n() && !this.n_()) {
         if (var2 == rpm_3.MAIN_HAND) {
            var1.break_(rlB_2.for_);
         }

         if (this.break_().isEmpty()) {
            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         } else {
            if (!((rYB)this.throws_[7]).continue_) {
               this.class_(var1);
               this.class_(var1, this.L_(), 1);
            }

            return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
         }
      } else {
         return super.break_(var1, var2);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("DespawnDelay", 99)) {
         this.else_ = var1.private_("DespawnDelay");
      }

      if (var1.throws_("WanderTarget")) {
         this.this_ = rco_3.break_(var1.int_("WanderTarget"));
      }

      this.e_(Math.max(0, this.O_()));
   }

   @Override
   protected void break_(rdI_2 var1) {
      if (var1.super_()) {
         int var2 = 3 + ((Random)this.throws_[40]).nextInt(4);
         ((rYB)this.throws_[7]).a_(new rsP_2((rYB)this.throws_[7], this.rx(), this.re() + 0.5, this.BO(), var2));
      }
   }

   @Override
   public boolean throws_() {
      return false;
   }

   @Override
   protected void sk() {
      rsR_2[] var1 = (rsR_2[])rst_3.break_.get(1);
      rsR_2[] var2 = (rsR_2[])rst_3.break_.get(2);
      if (var1 != null && var2 != null) {
         rdf_3 var3 = this.break_();
         this.class_(var3, var1, 5);
         int var4 = ((Random)this.throws_[40]).nextInt(var2.length);
         rsR_2 var5 = var2[var4];
         rdI_2 var6 = var5.class_(this, (Random)this.throws_[40]);
         if (var6 != null) {
            var3.add(var6);
         }
      }
   }

   @Override
   public rqA_2 case_() {
      return rqn_3.kp;
   }

   public void else_(int var1) {
      this.else_ = var1;
   }

   public void implements_(rfH_2 var1) {
      this.this_ = var1;
   }

   @Override
   protected rqA_2 static_() {
      return this.n() ? rqn_3.ky : rqn_3.kv;
   }

   @Override
   public boolean private_(double var1) {
      return false;
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSb_1(this));
      this.package_
         .class_(0, new rSx_1<>(this, rAB.class_(new rdn_3(rdy_3.JA), rAS.private_), rqn_3.kL, var1 -> ((rYB)this.throws_[7]).boolean_() && !var1.Pp()));
      this.package_.class_(0, new rSx_1<>(this, new rdn_3(rdy_3.hi), rqn_3.kH, var1 -> ((rYB)this.throws_[7]).strictfp_() && var1.Pp()));
      this.package_.class_(1, new rSX(this));
      this.package_.class_(1, new rPD<>(this, rbB_2.class, 8.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rEA.class, 12.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rGD.class, 8.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rGg_1.class, 8.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rGJ.class, 15.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rED.class, 12.0F, 0.5, 0.5));
      this.package_.class_(1, new rPD<>(this, rbP_2.class, 10.0F, 0.5, 0.5));
      this.package_.class_(1, new rBY(this, 0.5));
      this.package_.class_(1, new rBL(this));
      this.package_.class_(2, new rse_3(this, this, 2.0, 0.35));
      this.package_.class_(4, new rBT(this, 0.35));
      this.package_.class_(8, new rSk_1(this, 0.35));
      this.package_.class_(9, new rBn_1(this, rhd_3.class, 3.0F, 1.0F));
      this.package_.class_(10, new rBA(this, is_3.class, 8.0F));
   }

   private void sz() {
      if (this.else_ > 0 && !this.n() && --this.else_ == 0) {
         this.PD();
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kF;
   }

   public int sW() {
      return this.else_;
   }

   rfH_2 sQ() {
      return this.this_;
   }
}
