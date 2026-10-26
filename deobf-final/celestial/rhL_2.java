package celestial;

public abstract class rhL_2 extends rhf_3 {
   public double class_;
   public double break_;
   public double protected_;

   public rhL_2(aI_2<? extends rhL_2> var1, iB_2 var2, double var3, double var5, double var7, rYB var9) {
      this(var1, var2.rx(), var2.re(), var2.BO(), var3, var5, var7, var9);
      this.break_(var2);
      this.case_((Float)var2.throws_[15], (Float)var2.throws_[16]);
   }

   public rhL_2(aI_2<? extends rhL_2> var1, double var2, double var4, double var6, double var8, double var10, double var12, rYB var14) {
      this(var1, var14);
      this.class_(var2, var4, var6, (Float)this.throws_[15], (Float)this.throws_[16]);
      this.PX();
      double var15 = (double)rfU_2.class_(var8 * var8 + var10 * var10 + var12 * var12);
      if (var15 != 0.0) {
         this.class_ = var8 / var15 * 0.1;
         this.break_ = var10 / var15 * 0.1;
         this.protected_ = var12 / var15 * 0.1;
      }
   }

   protected rhL_2(aI_2<? extends rhL_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      an_3 var1 = this.else_();
      if (((rYB)this.throws_[7]).continue_ || (var1 == null || !(Boolean)var1.throws_[27]) && ((rYB)this.throws_[7]).int_(this.Bs())) {
         super.this_();
         if (this.throws_()) {
            this.case_(1);
         }

         rjG_2 var2 = rhj_3.class_(this, this::class_);
         if (var2.byte_() != rjM_2.MISS) {
            this.class_(var2);
         }

         this.Px();
         rjU_2 var3 = this.rv();
         double var4 = this.rx() + var3.break_;
         double var6 = this.re() + var3.byte_;
         double var8 = this.BO() + var3.protected_;
         rhj_3.class_(this, 0.2F);
         float var10 = this.catch_();
         if (this.rT()) {
            for (int var11 = 0; var11 < 4; var11++) {
               float var12 = 0.25F;
               ((rYB)this.throws_[7])
                  .class_(
                     rLQ.throws_, var4 - var3.break_ * 0.25, var6 - var3.byte_ * 0.25, var8 - var3.protected_ * 0.25, var3.break_, var3.byte_, var3.protected_
                  );
            }

            var10 = 0.8F;
         }

         this.byte_(var3.break_(this.class_, this.break_, this.protected_).class_((double)var10));
         ((rYB)this.throws_[7]).class_(this.case_(), var4, var6 + 0.5, var8, 0.0, 0.0, 0.0);
         this.new_(var4, var6, var8);
      } else {
         this.PD();
      }
   }

   @Override
   public float f() {
      return 1.0F;
   }

   @Override
   protected boolean class_(an_3 var1) {
      return super.class_(var1) && !(Boolean)var1.throws_[38];
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.class_("power", this.class_(new double[]{this.class_, this.break_, this.protected_}));
   }

   @Override
   public boolean class_(double var1) {
      double var3 = this.rN().class_() * 4.0;
      if (Double.isNaN(var3)) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("power", 9)) {
         rcy_3 var2 = var1.protected_("power", 6);
         if (var2.size() == 3) {
            this.class_ = var2.catch_(0);
            this.break_ = var2.catch_(1);
            this.protected_ = var2.catch_(2);
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else {
         this.rf();
         an_3 var3 = var1.extends_();
         if (var3 != null) {
            rjU_2 var4 = var3.m();
            this.byte_(var4);
            this.class_ = var4.break_ * 0.1;
            this.break_ = var4.byte_ * 0.1;
            this.protected_ = var4.protected_ * 0.1;
            this.break_(var3);
            return true;
         } else {
            return false;
         }
      }
   }

   protected boolean throws_() {
      return true;
   }

   protected float catch_() {
      return 0.95F;
   }

   protected rLx_1 case_() {
      return rLQ.double_;
   }

   @Override
   public float rX() {
      return 1.0F;
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      an_3 var1 = this.else_();
      int var2 = var1 == null ? 0 : var1.V();
      return new rFJ(
         this.V(),
         this.ro(),
         this.rx(),
         this.re(),
         this.BO(),
         (Float)this.throws_[16],
         (Float)this.throws_[15],
         this.BC(),
         var2,
         new rjU_2(this.class_, this.break_, this.protected_)
      );
   }
}
