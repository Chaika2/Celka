package celestial;

public class rhG_2 extends rOD {
   private final rSJ try_ = new rSJ(this);
   private boolean instanceof_;
   private int throw_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      super.byte_(var1);
      return rqn_3.Jn;
   }

   public rhG_2(aI_2<? extends rhG_2> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      if (var1 != this.instanceof_) {
         this.instanceof_ = var1;
         if (var1) {
            this.package_.class_(1, this.try_);
         } else {
            this.package_.class_(this.try_);
         }
      }
   }

   public static iz_3 n() {
      return sq().class_(iQ_2.class_, 15.0).class_(iQ_2.protected_, 0.2F);
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("SkeletonTrap", this.sJ());
      var1.break_("SkeletonTrapTime", this.throw_);
   }

   @Override
   public au_3 class_(rrEm_1 var1, au_3 var2) {
      return aI_2.n.class_(var1);
   }

   @Override
   public void default_() {
      super.default_();
      if (this.sJ() && this.throw_++ >= 18000) {
         this.PD();
      }
   }

   @Override
   protected void sf() {
      if (this.rT()) {
         this.class_(rqn_3.Jy, 0.4F, 1.0F);
      } else {
         super.sf();
      }
   }

   @Override
   public ryZ_2 break_(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.protected_(var2);
      if (!this.sm()) {
         return ryZ_2.PASS;
      } else if (this.n_()) {
         return super.break_(var1, var2);
      } else if (var1.sN()) {
         this.case_(var1);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      } else if (this.BP()) {
         return super.break_(var1, var2);
      } else {
         if (!var3.class_()) {
            if (var3.break_() == rdy_3.hK && !this.byte_()) {
               this.case_(var1);
               return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
            }

            ryZ_2 var4 = var3.class_(var1, this, var2);
            if (var4.class_()) {
               return var4;
            }
         }

         this.catch_(var1);
         return ryZ_2.class_(((rYB)this.throws_[7]).continue_);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.this_(var1.new_("SkeletonTrap"));
      this.throw_ = var1.private_("SkeletonTrapTime");
   }

   @Override
   protected void L() {
      this.byte_(iQ_2.volatile_).class_(this.sg());
   }

   @Override
   protected rqA_2 static_() {
      super.static_();
      return this.class_(rlG_2.break_) ? rqn_3.Jl : rqn_3.JL;
   }

   @Override
   protected void private_(float var1) {
      if ((Boolean)this.throws_[20]) {
         super.private_(0.3F);
      } else {
         super.private_(Math.min(0.1F, var1 * 25.0F));
      }
   }

   @Override
   public boolean PH() {
      return true;
   }

   @Override
   public double PS() {
      return super.PS() - 0.1875;
   }

   @Override
   protected rqA_2 BB() {
      if ((Boolean)this.throws_[20]) {
         if (!this.BP()) {
            return rqn_3.Jp;
         }

         this.while_++;
         if (this.while_ > 5 && this.while_ % 3 == 0) {
            return rqn_3.JH;
         }

         if (this.while_ <= 5) {
            return rqn_3.Jp;
         }
      }

      return rqn_3.JC;
   }

   @Override
   protected rqA_2 Bt() {
      super.Bt();
      return rqn_3.JA;
   }

   @Override
   protected float Bf() {
      return 0.96F;
   }

   public boolean sJ() {
      return this.instanceof_;
   }

   @Override
   public aL_2 sG() {
      return aL_2.break_;
   }

   @Override
   protected void su() {
   }
}
