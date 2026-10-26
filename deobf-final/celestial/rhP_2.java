package celestial;

import java.util.Random;

public class rhP_2 extends rOK implements aa_3 {
   private static final rkg_3 try_ = rkg_3.class_(rdy_3.hB, xu_3.Ey.case_());
   private static final rut_3<Integer> instanceof_ = rmE_2.class_(rhP_2.class, ruw_3.break_);
   private static final rut_3<Integer> throw_ = rmE_2.class_(rhP_2.class, ruw_3.break_);
   private static final rut_3<Integer> interface_ = rmE_2.class_(rhP_2.class, ruw_3.break_);
   boolean char_;
   private rhP_2 abstract_;
   private rhP_2 long_;

   @Override
   protected boolean byte_(rhd_3 var1, rdn_3 var2) {
      byte var3 = 0;
      byte var4 = 0;
      float var5 = 0.0F;
      boolean var6 = false;
      rdb_3 var7 = var2.break_();
      if (var7 == rdy_3.hB) {
         var3 = 10;
         var4 = 3;
         var5 = 2.0F;
      } else if (var7 == xu_3.Ey.case_()) {
         var3 = 90;
         var4 = 6;
         var5 = 10.0F;
         if (this.sm() && this.O_() == 0 && this.sk()) {
            var6 = true;
            this.throws_(var1);
         }
      }

      if (this.Ss() < this.SK() && var5 > 0.0F) {
         this.protected_(var5);
         var6 = true;
      }

      if (this.n_() && var3 > 0) {
         ((rYB)this.throws_[7]).class_(rLQ.char_, this.break_(1.0), this.Ph() + 0.5, this.protected_(1.0), 0.0, 0.0, 0.0);
         if (!((rYB)this.throws_[7]).continue_) {
            this.d_(var3);
         }

         var6 = true;
      }

      if (var4 > 0 && (var6 || !this.sm()) && this.sn() < this.sT()) {
         var6 = true;
         if (!((rYB)this.throws_[7]).continue_) {
            this.return_(var4);
         }
      }

      if (var6 && !this.BF()) {
         rqA_2 var8 = this.sy();
         if (var8 != null) {
            ((rYB)this.throws_[7])
               .class_(
                  (rhd_3)null,
                  this.rx(),
                  this.re(),
                  this.BO(),
                  this.sy(),
                  this.Pr(),
                  1.0F,
                  1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F
               );
         }
      }

      return var6;
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.GW;
   }

   public rhP_2(aI_2<? extends rhP_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected rqA_2 sp() {
      return rqn_3.GJ;
   }

   @Override
   protected void sl() {
      if (!((rYB)this.throws_[7]).continue_) {
         super.sl();
         this.class_(volatile_(this.synchronized_.extends_(1)));
      }
   }

   public rxL_2 sa() {
      int var1 = ((rmE_2)this.throws_[49]).class_(throw_);
      return var1 == -1 ? null : rxL_2.class_(var1);
   }

   private void class_(rxL_2 var1) {
      ((rmE_2)this.throws_[49]).break_(throw_, var1 == null ? -1 : var1.break_());
   }

   @Override
   public boolean class_(float var1, float var2) {
      int var3 = this.implements_(var1, var2);
      if (var3 <= 0) {
         return false;
      } else {
         if (var1 >= 6.0F) {
            this.break_(rye_3.extends_, (float)var3);
            if (this.BP()) {
               for (an_3 var5 : this.PP()) {
                  var5.break_(rye_3.extends_, (float)var3);
               }
            }
         }

         this.sM();
         return true;
      }
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.Es();
      int var6;
      if (var4 instanceof rhs_3) {
         var6 = ((rhs_3)var4).class_;
      } else {
         var6 = ((Random)this.throws_[40]).nextInt(4);
         var4 = new rhs_3(var6);
      }

      this.public_(var6);
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      return var1 != this && var1 instanceof rhP_2 && this.sj() && ((rhP_2)var1).sj();
   }

   public void class_(rhP_2 var1) {
      this.abstract_ = var1;
      this.abstract_.long_ = this;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Variant", this.se());
      var1.break_("Strength", this.sD());
      if (!this.synchronized_.extends_(1).class_()) {
         var1.class_("DecorItem", this.synchronized_.extends_(1).break_(new rcd_3()));
      }
   }

   @Override
   public void class_(rXu_1 var1) {
      rxL_2 var2 = this.sa();
      super.class_(var1);
      rxL_2 var3 = this.sa();
      if ((Integer)this.throws_[41] > 20 && var3 != null && var3 != var2) {
         this.class_(rqn_3.GN, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean class_() {
      return false;
   }

   protected rhP_2 si() {
      return aI_2.transient_.class_((rYB)this.throws_[7]);
   }

   @Override
   public int sc() {
      return this.sD();
   }

   public int se() {
      return rfU_2.class_(((rmE_2)this.throws_[49]).class_(interface_), 0, 3);
   }

   @Override
   protected void sd() {
      this.class_(rqn_3.Gx, 1.0F, (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public boolean sw() {
      return false;
   }

   public rhP_2 break_(rrEm_1 var1, au_3 var2) {
      rhP_2 var3 = this.si();
      this.class_(var2, var3);
      rhP_2 var4 = (rhP_2)var2;
      int var5 = ((Random)this.throws_[40]).nextInt(Math.max(this.sD(), var4.sD())) + 1;
      if (((Random)this.throws_[40]).nextFloat() < 0.03F) {
         var5++;
      }

      var3.goto_(var5);
      var3.public_(((Random)this.throws_[40]).nextBoolean() ? this.se() : var4.se());
      return var3;
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.GQ, 0.15F, 1.0F);
   }

   @Override
   public void break_(rcd_3 var1) {
      this.goto_(var1.private_("Strength"));
      super.break_(var1);
      this.public_(var1.private_("Variant"));
      if (var1.byte_("DecorItem", 10)) {
         this.synchronized_.break_(1, rdn_3.class_(var1.int_("DecorItem")));
      }

      this.sl();
   }

   @Override
   public void break_(iB_2 var1, float var2) {
      this.private_(var1);
   }

   @Override
   protected int sx() {
      return this.sJ() ? 2 + 3 * this.sc() : super.sx();
   }

   @Override
   public boolean so() {
      return !this.synchronized_.extends_(1).class_();
   }

   @Override
   public void catch_(an_3 var1) {
      if (this.synchronized_(var1)) {
         float var2 = rfU_2.break_((Float)this.private_[23] * (float) (Math.PI / 180.0));
         float var3 = rfU_2.class_((Float)this.private_[23] * (float) (Math.PI / 180.0));
         var1.new_(this.rx() + (double)(0.3F * var3), this.re() + this.PS() + var1.Pv(), this.BO() - (double)(0.3F * var2));
      }
   }

   @Override
   public boolean G() {
      return false;
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return try_.class_(var1);
   }

   private void goto_(int var1) {
      ((rmE_2)this.throws_[49]).break_(instanceof_, Math.max(1, Math.min(5, var1)));
   }

   @Override
   protected double implements_() {
      return 2.0;
   }

   void try_(boolean var1) {
      this.char_ = var1;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.GX;
   }

   public void public_(int var1) {
      ((rmE_2)this.throws_[49]).break_(interface_, var1);
   }

   private void private_(iB_2 var1) {
      rhw_3 var2 = new rhw_3((rYB)this.throws_[7], this);
      double var3 = var1.rx() - this.rx();
      double var5 = var1.byte_(0.3333333333333333) - var2.re();
      double var7 = var1.BO() - this.BO();
      float var9 = rfU_2.class_(var3 * var3 + var7 * var7) * 0.2F;
      var2.byte_(var3, var5 + (double)var9, var7, 1.5F, 10.0F);
      if (!this.BF()) {
         ((rYB)this.throws_[7])
            .class_(
               (rhd_3)null,
               this.rx(),
               this.re(),
               this.BO(),
               rqn_3.Gz,
               this.Pr(),
               1.0F,
               1.0F + (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F
            );
      }

      ((rYB)this.throws_[7]).a_(var2);
      this.char_ = true;
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rSb_1(this));
      this.package_.class_(1, new rSs_1(this, 1.2));
      this.package_.class_(2, new rBF(this, 2.1F));
      this.package_.class_(3, new rBe_1(this, 1.25, 40, 20.0F));
      this.package_.class_(3, new rBY(this, 1.2));
      this.package_.class_(4, new rBP(this, 1.0));
      this.package_.class_(5, new rBx_1(this, 1.0));
      this.package_.class_(6, new rSk_1(this, 0.7));
      this.package_.class_(7, new rBA(this, rhd_3.class, 6.0F));
      this.package_.class_(8, new rBC(this));
      this.int_.class_(1, new rhS_2(this));
      this.int_.class_(2, new rhB_2(this));
   }

   private static rxL_2 volatile_(rdn_3 var0) {
      xd_3 var1 = xd_3.class_(var0.break_());
      return var1 instanceof xC_2 ? ((xC_2)var1).break_() : null;
   }

   @Override
   public boolean native_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return rlc_3.catch_.class_(var2);
   }

   @Override
   protected void st() {
      if (!this.EB() && this.n_()) {
         super.st();
      }
   }

   @Override
   public double PS() {
      return (double)this.Bm() * 0.67;
   }

   @Override
   protected boolean BK() {
      return this.Sl() || this.sF();
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, 0.75 * (double)this.Bx(), (double)this.PN() * 0.5);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Gd;
   }

   @Override
   protected rqA_2 sy() {
      return rqn_3.Gk;
   }

   @Override
   public int sT() {
      return 30;
   }

   @Override
   public void sI() {
      rqA_2 var1 = this.sp();
      if (var1 != null) {
         this.class_(var1, this.Si(), this.SN());
      }
   }

   public int sD() {
      return ((rmE_2)this.throws_[49]).class_(instanceof_);
   }

   public boolean EB() {
      return this.abstract_ != null;
   }

   private void Es() {
      int var1 = ((Random)this.throws_[40]).nextFloat() < 0.04F ? 5 : 3;
      this.goto_(1 + ((Random)this.throws_[40]).nextInt(var1));
   }

   @Override
   public boolean sY() {
      return true;
   }

   public boolean EP() {
      return this.long_ != null;
   }

   public rhP_2 ES() {
      return this.abstract_;
   }

   public boolean sK() {
      return false;
   }

   public void Er() {
      if (this.abstract_ != null) {
         this.abstract_.long_ = null;
      }

      this.abstract_ = null;
   }

   public static iz_3 sU() {
      return n().class_(iQ_2.break_, 40.0);
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(instanceof_, 0);
      ((rmE_2)this.throws_[49]).class_(throw_, -1);
      ((rmE_2)this.throws_[49]).class_(interface_, 0);
   }
}
