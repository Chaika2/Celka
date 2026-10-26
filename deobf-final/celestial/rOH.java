package celestial;

import java.util.Random;
import java.util.UUID;
import java.util.function.Predicate;

public class rOH extends rOQ implements ag_3 {
   private static final rut_3<Boolean> this_ = rmE_2.class_(rOH.class, ruw_3.implements_);
   private static final rut_3<Integer> else_ = rmE_2.class_(rOH.class, ruw_3.break_);
   private static final rut_3<Integer> synchronized_ = rmE_2.class_(rOH.class, ruw_3.break_);
   public static final Predicate<iB_2> super_ = var0 -> {
      aI_2 var1 = var0.BC();
      return var1 == aI_2.Z || var1 == aI_2.c || var1 == aI_2.throw_;
   };
   private float goto_;
   private float while_;
   private boolean try_;
   private boolean instanceof_;
   private float throw_;
   private float interface_;
   private static final rqb_3 char_ = rqt_3.class_(20, 39);
   private UUID abstract_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Wh;
   }

   @Override
   public UUID byte_() {
      return this.abstract_;
   }

   public rOH(aI_2<? extends rOH> var1, rYB var2) {
      super(var1, var2);
      this.return_(false);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.BM()) {
         this.while_ = this.goto_;
         if (this.sd()) {
            this.goto_ = this.goto_ + (1.0F - this.goto_) * 0.4F;
         } else {
            this.goto_ = this.goto_ + (0.0F - this.goto_) * 0.4F;
         }

         if (this.Pk()) {
            this.try_ = true;
            if (this.instanceof_ && !((rYB)this.throws_[7]).continue_) {
               ((rYB)this.throws_[7]).class_(this, (byte)56);
               this.sc();
            }
         } else if ((this.try_ || this.instanceof_) && this.instanceof_) {
            if (this.throw_ == 0.0F) {
               this.class_(rqn_3.WJ, this.Si(), (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
            }

            this.interface_ = this.throw_;
            this.throw_ += 0.05F;
            if (this.interface_ >= 2.0F) {
               this.try_ = false;
               this.instanceof_ = false;
               this.interface_ = 0.0F;
               this.throw_ = 0.0F;
            }

            if (this.throw_ > 0.4F) {
               float var1 = (float)this.re();
               int var2 = (int)(rfU_2.class_((this.throw_ - 0.4F) * (float) Math.PI) * 7.0F);
               rjU_2 var3 = this.rv();

               for (int var4 = 0; var4 < var2; var4++) {
                  float var5 = (((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * this.PN() * 0.5F;
                  float var6 = (((Random)this.throws_[40]).nextFloat() * 2.0F - 1.0F) * this.PN() * 0.5F;
                  ((rYB)this.throws_[7])
                     .class_(rLQ.E, this.rx() + (double)var5, (double)(var1 + 0.8F), this.BO() + (double)var6, var3.break_, var3.byte_, var3.protected_);
               }
            }
         }
      }
   }

   public void this_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
   }

   @Override
   public boolean n() {
      return this.try_;
   }

   public float interface_(float var1) {
      return rfU_2.catch_(var1, this.while_, this.goto_) * 0.15F * (float) Math.PI;
   }

   @Override
   public int class_() {
      return ((rmE_2)this.throws_[49]).class_(synchronized_);
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 8) {
         this.instanceof_ = true;
         this.throw_ = 0.0F;
         this.interface_ = 0.0F;
      } else if (var1 == 56) {
         this.sc();
      } else {
         super.class_(var1);
      }
   }

   public void class_(rxL_2 var1) {
      ((rmE_2)this.throws_[49]).break_(else_, var1.break_());
   }

   @Override
   public void class_(UUID var1) {
      this.abstract_ = var1;
   }

   @Override
   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(synchronized_, var1);
   }

   @Override
   public boolean class_(iB_2 var1, iB_2 var2) {
      if (var1 instanceof rEJ || var1 instanceof rEy_1) {
         return false;
      } else if (var1 instanceof rOH var3) {
         return !var3.sZ() || var3.sF() != var2;
      } else if (var1 instanceof rhd_3 && var2 instanceof rhd_3 && !((rhd_3)var2).throws_((rhd_3)var1)) {
         return false;
      } else {
         return var1 instanceof rOD && ((rOD)var1).sm() ? false : !(var1 instanceof rOQ) || !((rOQ)var1).sZ();
      }
   }

   @Override
   public boolean class_(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else if (!this.sZ()) {
         return false;
      } else if (!(var1 instanceof rOH var2)) {
         return false;
      } else if (!var2.sZ()) {
         return false;
      } else {
         return var2.Sc() ? false : this.sQ() && var2.sQ();
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("CollarColor", (byte)this.sx().break_());
      this.a_(var1);
   }

   private void sc() {
      this.instanceof_ = false;
      this.throw_ = 0.0F;
      this.interface_ = 0.0F;
   }

   @Override
   public void default_() {
      super.default_();
      if (!((rYB)this.throws_[7]).continue_ && this.try_ && !this.instanceof_ && !this.catch_() && (Boolean)this.throws_[20]) {
         this.instanceof_ = true;
         this.throw_ = 0.0F;
         this.interface_ = 0.0F;
         ((rYB)this.throws_[7]).class_(this, (byte)8);
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.class_((rrEm_1)((rYB)this.throws_[7]), true);
      }
   }

   public boolean sd() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   @Override
   public int r() {
      return this.Sc() ? 20 : super.r();
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      rdb_3 var4 = var3.break_();
      if (((rYB)this.throws_[7]).continue_) {
         boolean var12 = this.private_(var1) || this.sZ() || var4 == rdy_3.XR && !this.sZ() && !this.T_();
         return var12 ? ryZ_2.CONSUME : ryZ_2.PASS;
      } else {
         if (this.sZ()) {
            if (this.extends_(var3) && this.Ss() < this.SK()) {
               if (!((rhx_3)var1.implements_[18]).protected_) {
                  var3.catch_(1);
               }

               this.protected_((float)var4.this_().class_());
               return ryZ_2.SUCCESS;
            }

            if (!(var4 instanceof rxA_2)) {
               ryZ_2 var11 = super.break_(var1, var2);
               if ((!var11.class_() || this.n_()) && this.private_(var1)) {
                  this.goto_(!this.sL());
                  Boolean var10 = false;
                  this.private_[41] = var10;
                  this.final_.final_();
                  this.byte_((iB_2)null);
                  return ryZ_2.SUCCESS;
               }

               return var11;
            }

            rxL_2 var5 = ((rxA_2)var4).byte_();
            if (var5 != this.sx()) {
               this.class_(var5);
               if (!((rhx_3)var1.implements_[18]).protected_) {
                  var3.catch_(1);
               }

               return ryZ_2.SUCCESS;
            }
         } else if (var4 == rdy_3.XR && !this.T_()) {
            if (!((rhx_3)var1.implements_[18]).protected_) {
               var3.catch_(1);
            }

            if (((Random)this.throws_[40]).nextInt(3) == 0) {
               this.case_(var1);
               this.final_.final_();
               this.byte_((iB_2)null);
               this.goto_(true);
               ((rYB)this.throws_[7]).class_(this, (byte)7);
            } else {
               ((rYB)this.throws_[7]).class_(this, (byte)6);
            }

            return ryZ_2.SUCCESS;
         }

         return super.break_(var1, var2);
      }
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
      this.class_(rqn_3.Wx, 0.15F, 1.0F);
   }

   public rOH break_(rrEm_1 var1, au_3 var2) {
      rOH var3 = aI_2.rB.class_(var1);
      UUID var4 = this.sv();
      if (var4 != null) {
         var3.break_(var4);
         var3.return_(true);
      }

      return var3;
   }

   @Override
   public void break_(rye_3 var1) {
      this.try_ = false;
      this.instanceof_ = false;
      this.interface_ = 0.0F;
      this.throw_ = 0.0F;
      super.break_(var1);
   }

   public float break_(float var1, float var2) {
      float var3 = (rfU_2.catch_(var1, this.interface_, this.throw_) + var2) / 1.8F;
      if (var3 < 0.0F) {
         var3 = 0.0F;
      } else if (var3 > 1.0F) {
         var3 = 1.0F;
      }

      return rfU_2.class_(var3 * (float) Math.PI) * rfU_2.class_(var3 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * 0.8F;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("CollarColor", 99)) {
         this.class_(rxL_2.class_(var1.private_("CollarColor")));
      }

      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         an_3 var3 = var1.extends_();
         this.goto_(false);
         if (var3 != null && !(var3 instanceof rhd_3) && !(var3 instanceof rhm_3)) {
            var2 = (var2 + 1.0F) / 2.0F;
         }

         return super.break_(var1, var2);
      }
   }

   public static iz_3 L() {
      return is_3.package_().class_(iQ_2.protected_, 0.3F).class_(iQ_2.class_, 8.0).class_(iQ_2.case_, 2.0);
   }

   public rxL_2 sx() {
      return rxL_2.class_(((rmE_2)this.throws_[49]).class_(else_));
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      rdb_3 var2 = var1.break_();
      return var2.super_() && var2.this_().byte_();
   }

   @Override
   public void return_(boolean var1) {
      super.return_(var1);
      if (var1) {
         this.byte_(iQ_2.class_).class_(20.0);
         this.public_(20.0F);
      } else {
         this.byte_(iQ_2.class_).class_(8.0);
      }

      this.byte_(iQ_2.case_).class_(4.0);
   }

   public float throw_(float var1) {
      return Math.min(0.5F + rfU_2.catch_(var1, this.interface_, this.throw_) / 2.0F * 0.5F, 1.0F);
   }

   @Override
   protected rqA_2 static_() {
      if (this.T_()) {
         return rqn_3.WM;
      } else if (((Random)this.throws_[40]).nextInt(3) != 0) {
         return rqn_3.WG;
      } else {
         return this.sZ() && this.Ss() < 10.0F ? rqn_3.Wd : rqn_3.WX;
      }
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = var1.break_(rye_3.byte_(this), (float)((int)this.class_(iQ_2.case_)));
      if (var2) {
         this.class_(this, var1);
      }

      return var2;
   }

   @Override
   public boolean protected_(rhd_3 var1) {
      return !this.T_() && super.protected_(var1);
   }

   @Override
   public void protected_() {
      this.class_(char_.class_((Random)this.throws_[40]));
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(2, new rSG(this));
      this.package_.class_(3, new rOy_1(this, this, (float)rhP_2.class, (double)24.0F, 1.5, 1.5));
      this.package_.class_(4, new rBv_1(this, 0.4F));
      this.package_.class_(5, new rBl_1(this, 1.0, true));
      this.package_.class_(6, new rBJ(this, 1.0, 10.0F, 2.0F, false));
      this.package_.class_(7, new rBP(this, 1.0));
      this.package_.class_(8, new rSk_1(this, 1.0));
      this.package_.class_(9, new rPU(this, 8.0F));
      this.package_.class_(10, new rBA(this, rhd_3.class, 8.0F));
      this.package_.class_(10, new rBC(this));
      this.int_.class_(1, new rBg_1(this));
      this.int_.class_(2, new rBR(this));
      this.int_.class_(3, new rBc_1(this).class_());
      this.int_.class_(4, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.int_.class_(5, new rBf_1<>(this, rbZ_2.class, false, super_));
      this.int_.class_(6, new rBf_1<>(this, rON.class, false, rON.super_));
      this.int_.class_(7, new rBI<>(this, rEb_1.class, false));
      this.int_.class_(8, new rSP<>(this, true));
   }

   @Override
   public int E() {
      return 8;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.Wb;
   }

   public float sJ() {
      if (this.T_()) {
         return 1.5393804F;
      } else {
         return this.sZ() ? (0.55F - (this.SK() - this.Ss()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   protected float Si() {
      return 0.4F;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(this_, false);
      ((rmE_2)this.throws_[49]).class_(else_, rxL_2.RED.break_());
      ((rmE_2)this.throws_[49]).class_(synchronized_, 0);
   }
}
