package celestial;

import java.util.Random;
import java.util.UUID;

public class rbF_2 extends rbZ_2 implements ag_3, rMm_1 {
   private static final rut_3<Byte> super_ = rmE_2.class_(rbF_2.class, ruw_3.class_);
   private static final rut_3<Integer> this_ = rmE_2.class_(rbF_2.class, ruw_3.break_);
   private static final rqb_3 else_ = rqt_3.class_(20, 39);
   private UUID synchronized_;
   private float return_;
   private float public_;
   private int goto_;
   int while_;
   private int try_;
   private int instanceof_;
   int throw_ = 0;
   int interface_ = 0;
   rfH_2 char_ = null;
   rfH_2 abstract_ = null;
   rbT_2 long_;
   rbH_2 float_;
   private rby_3 void_;
   private int static_;

   @Override
   public UUID byte_() {
      return this.synchronized_;
   }

   @Override
   protected void byte_(rlb_3<rXs_1> var1) {
      this.byte_(this.rv().break_(0.0, 0.01, 0.0));
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.H;
   }

   @Override
   protected void double_() {
      boolean var1 = this.su();
      if (this.Pa()) {
         this.static_++;
      } else {
         this.static_ = 0;
      }

      if (this.static_ > 20) {
         this.break_(rye_3.private_, 1.0F);
      }

      if (var1) {
         this.goto_++;
         if (this.goto_ % 5 == 0 && ((Random)this.throws_[40]).nextInt(rfU_2.class_(1200 - this.goto_, 1, 1200)) == 0) {
            this.break_(rye_3.final_, this.Ss());
         }
      }

      if (!this.sc()) {
         this.while_++;
      }

      if (!((rYB)this.throws_[7]).continue_) {
         this.class_((rrEm_1)((rYB)this.throws_[7]), false);
      }
   }

   public rbF_2(aI_2<? extends rbF_2> var1, rYB var2) {
      super(var1, var2);
      this.native_ = new rPV(this, 20, true);
      this.extends_ = new rbC_2(this, this);
      this.class_(rLp_1.DANGER_FIRE, -1.0F);
      this.class_(rLp_1.WATER, -1.0F);
      this.class_(rLp_1.WATER_BORDER, 16.0F);
      this.class_(rLp_1.COCOA, -1.0F);
      this.class_(rLp_1.FENCE, -1.0F);
   }

   @Override
   public void this_() {
      super.this_();
      if (this.sc() && this.sn() < 10 && ((Random)this.throws_[40]).nextFloat() < 0.05F) {
         for (int var1 = 0; var1 < ((Random)this.throws_[40]).nextInt(2) + 1; var1++) {
            this.class_((rYB)this.throws_[7], this.rx() - 0.3F, this.rx() + 0.3F, this.BO() - 0.3F, this.BO() + 0.3F, this.byte_(0.5), rLQ.z);
         }
      }

      this.sL();
   }

   void this_(boolean var1) {
      if (var1) {
         this.sJ();
      }

      this.protected_(8, var1);
   }

   void sl() {
      this.instanceof_++;
   }

   @Override
   public boolean n() {
      return this.char_ != null;
   }

   @Override
   public void class_(int var1) {
      ((rmE_2)this.throws_[49]).break_(this_, var1);
   }

   @Override
   public int class_() {
      return ((rmE_2)this.throws_[49]).class_(this_);
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   public void class_(UUID var1) {
      this.synchronized_ = var1;
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      if (this.sx()) {
         var1.class_("HivePos", rco_3.class_(this.sd()));
      }

      if (this.n()) {
         var1.class_("FlowerPos", rco_3.class_(this.L()));
      }

      var1.class_("HasNectar", this.sc());
      var1.class_("HasStung", this.su());
      var1.break_("TicksSincePollination", this.while_);
      var1.break_("CannotEnterHiveTicks", this.try_);
      var1.break_("CropsGrownSincePollination", this.instanceof_);
      this.a_(var1);
   }

   private void class_(rYB var1, double var2, double var4, double var6, double var8, double var10, rLx_1 var12) {
      var1.class_(var12, rfU_2.protected_(var1.int_.nextDouble(), var2, var4), var10, rfU_2.protected_(var1.int_.nextDouble(), var6, var8), 0.0, 0.0, 0.0);
   }

   @Override
   public float class_(rfH_2 var1, rRR var2) {
      return var2.byte_(var1).catch_() ? 10.0F : 0.0F;
   }

   public static iz_3 sm() {
      return is_3.package_()
         .class_(iQ_2.class_, 10.0)
         .class_(iQ_2.throws_, 0.6F)
         .class_(iQ_2.protected_, 0.3F)
         .class_(iQ_2.case_, 2.0)
         .class_(iQ_2.break_, 48.0);
   }

   public boolean sc() {
      return this.synchronized_(8);
   }

   @Override
   public void default_() {
      super.default_();
      if (!((rYB)this.throws_[7]).continue_) {
         if (this.try_ > 0) {
            this.try_--;
         }

         if (this.throw_ > 0) {
            this.throw_--;
         }

         if (this.interface_ > 0) {
            this.interface_--;
         }

         boolean var1 = this.T_() && !this.su() && this.I_() != null && this.I_().int_(this) < 4.0;
         this.synchronized_(var1);
         if ((Integer)this.throws_[41] % 20 == 0 && !this.sH()) {
            this.abstract_ = null;
         }
      }
   }

   public rfH_2 sd() {
      return this.abstract_;
   }

   @Override
   public void break_(rcd_3 var1) {
      this.abstract_ = null;
      if (var1.throws_("HivePos")) {
         this.abstract_ = rco_3.break_(var1.int_("HivePos"));
      }

      this.char_ = null;
      if (var1.throws_("FlowerPos")) {
         this.char_ = rco_3.break_(var1.int_("FlowerPos"));
      }

      super.break_(var1);
      this.this_(var1.new_("HasNectar"));
      this.else_(var1.new_("HasStung"));
      this.while_ = var1.private_("TicksSincePollination");
      this.try_ = var1.private_("CannotEnterHiveTicks");
      this.instanceof_ = var1.private_("CropsGrownSincePollination");
      this.class_((rrEm_1)((rYB)this.throws_[7]), var1);
   }

   @Override
   protected void break_(rfH_2 var1, xc_3 var2) {
   }

   boolean break_(rfH_2 var1, int var2) {
      return var1.class_(this.Bs(), (double)var2);
   }

   @Override
   protected rLy_1 break_(rYB var1) {
      rbL_2 var2 = new rbL_2(this, this, var1);
      var2.class_(false);
      var2.byte_(false);
      var2.break_(true);
      return var2;
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return this.n_() ? var2.break_ * 0.5F : var2.break_ * 0.5F;
   }

   public rbF_2 break_(rrEm_1 var1, au_3 var2) {
      return aI_2.throws_.class_(var1);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         an_3 var3 = var1.extends_();
         if (!((rYB)this.throws_[7]).continue_) {
            this.long_.native_();
         }

         return super.break_(var1, var2);
      }
   }

   public rfH_2 L() {
      return this.char_;
   }

   public boolean sx() {
      return this.abstract_ != null;
   }

   private boolean sv() {
      return this.while_ > 3600;
   }

   void finally_(rfH_2 var1) {
      rjU_2 var2 = rjU_2.protected_(var1);
      byte var3 = 0;
      rfH_2 var4 = this.Bs();
      int var5 = (int)var2.byte_ - var4.c_();
      if (var5 > 2) {
         var3 = 4;
      } else if (var5 < -2) {
         var3 = -4;
      }

      int var6 = 6;
      int var7 = 8;
      int var8 = var4.implements_(var1);
      if (var8 < 15) {
         var6 = var8 / 2;
         var7 = var8 / 2;
      }

      rjU_2 var9 = iX_2.break_(this, var6, var7, var3, var2, (float) (Math.PI / 10));
      if (var9 != null) {
         this.final_.class_(0.5F);
         this.final_.class_(var9.break_, var9.byte_, var9.protected_, 1.0);
      }
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return var1.break_().class_(rlc_3.default_);
   }

   boolean extends_(rfH_2 var1) {
      ryO_2 var2 = ((rYB)this.throws_[7]).class_(var1);
      return var2 instanceof rHx_1 ? !((rHx_1)var2).private_() : false;
   }

   public void else_(int var1) {
      this.try_ = var1;
   }

   private void else_(boolean var1) {
      this.protected_(4, var1);
   }

   @Override
   protected void for_() {
      super.for_();
      ruP_2.class_(this);
   }

   public void implements_(rfH_2 var1) {
      this.char_ = var1;
   }

   public float throw_(float var1) {
      return rfU_2.catch_(var1, this.public_, this.return_);
   }

   @Override
   protected rqA_2 static_() {
      return null;
   }

   @Override
   public boolean public_(an_3 var1) {
      boolean var2 = var1.break_(rye_3.break_(this), (float)((int)this.class_(iQ_2.case_)));
      if (var2) {
         this.class_(this, var1);
         if (var1 instanceof iB_2) {
            ((iB_2)var1).package_(((iB_2)var1).SM() + 1);
            byte var3 = 0;
            if (((rYB)this.throws_[7]).abstract_() == rRO.NORMAL) {
               var3 = 10;
            } else if (((rYB)this.throws_[7]).abstract_() == rRO.HARD) {
               var3 = 18;
            }

            if (var3 > 0) {
               ((iB_2)var1).break_(new rLY(rLD.super_, var3 * 20, 0));
            }
         }

         this.else_(true);
         this.S_();
         this.class_(rqn_3.q, 1.0F, 1.0F);
      }

      return var2;
   }

   @Override
   public void protected_() {
      this.class_(else_.class_((Random)this.throws_[40]));
   }

   private void protected_(int var1, boolean var2) {
      if (var2) {
         ((rmE_2)this.throws_[49]).break_(super_, (byte)(((rmE_2)this.throws_[49]).class_(super_) | var1));
      } else {
         ((rmE_2)this.throws_[49]).break_(super_, (byte)(((rmE_2)this.throws_[49]).class_(super_) & ~var1));
      }
   }

   @Override
   protected void final_() {
      this.package_.class_(0, new rbt_3(this, this, 1.4F, true));
      this.package_.class_(1, new rbl_3(this));
      this.package_.class_(2, new rBP(this, 1.0));
      this.package_.class_(3, new rSO(this, 1.25, rkg_3.class_(rlc_3.default_), false));
      this.long_ = new rbT_2(this);
      this.package_.class_(4, this.long_);
      this.package_.class_(5, new rBx_1(this, 1.25));
      this.package_.class_(5, new rbw_3(this));
      this.float_ = new rbH_2(this);
      this.package_.class_(5, this.float_);
      this.void_ = new rby_3(this);
      this.package_.class_(6, this.void_);
      this.package_.class_(7, new rbp_3(this));
      this.package_.class_(8, new rbI_2(this));
      this.package_.class_(9, new rSb_1(this));
      this.int_.class_(1, new rbA_2(this, this).class_(new Class[0]));
      this.int_.class_(2, new rbn_3(this));
      this.int_.class_(3, new rSP<>(this, true));
   }

   boolean volatile_(rfH_2 var1) {
      return ((rYB)this.throws_[7]).synchronized_(var1) && ((rYB)this.throws_[7]).byte_(var1).break_().class_(rls_3.strictfp_);
   }

   private void synchronized_(boolean var1) {
      this.protected_(2, var1);
   }

   private boolean synchronized_(int var1) {
      return (((rmE_2)this.throws_[49]).class_(super_) & var1) != 0;
   }

   boolean native_(rfH_2 var1) {
      return !this.break_(var1, 32);
   }

   int sn() {
      return this.instanceof_;
   }

   @Override
   protected boolean PJ() {
      return true;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.5F * this.Bx()), (double)(this.PN() * 0.2F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.l;
   }

   @Override
   public void sJ() {
      this.while_ = 0;
   }

   private boolean sy() {
      return this.synchronized_(2);
   }

   private void sL() {
      this.public_ = this.return_;
      if (this.sy()) {
         this.return_ = Math.min(1.0F, this.return_ + 0.2F);
      } else {
         this.return_ = Math.max(0.0F, this.return_ - 0.24F);
      }
   }

   @Override
   public aL_2 sG() {
      return aL_2.byte_;
   }

   boolean sH() {
      if (!this.sx()) {
         return false;
      } else {
         ryO_2 var1 = ((rYB)this.throws_[7]).class_(this.abstract_);
         return var1 != null && var1.void_() == ryW_2.long_;
      }
   }

   public boolean su() {
      return this.synchronized_(4);
   }

   @Override
   protected float Si() {
      return 0.4F;
   }

   public void sZ() {
      this.this_(false);
      this.sC();
   }

   boolean sF() {
      if (this.try_ <= 0 && !this.long_.extends_() && !this.su() && this.I_() == null) {
         boolean var1 = this.sv() || ((rYB)this.throws_[7]).s() || ((rYB)this.throws_[7]).boolean_() || this.sc();
         return var1 && !this.sA();
      } else {
         return false;
      }
   }

   private boolean sA() {
      if (this.abstract_ == null) {
         return false;
      } else {
         ryO_2 var1 = ((rYB)this.throws_[7]).class_(this.abstract_);
         return var1 instanceof rHx_1 && ((rHx_1)var1).class_();
      }
   }

   private void sC() {
      this.instanceof_ = 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(this_, 0);
   }
}
