package celestial;

public class rhw_3 extends rhf_3 {
   public rhw_3(rYB var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this(aI_2.for_, var1);
      this.new_(var2, var4, var6);

      for (int var14 = 0; var14 < 7; var14++) {
         double var15 = 0.4 + 0.1 * (double)var14;
         var1.class_(rLQ.r, var2, var4, var6, var8 * var15, var10, var12 * var15);
      }

      this.catch_(var8, var10, var12);
   }

   public rhw_3(rYB var1, rhP_2 var2) {
      this(aI_2.for_, var1);
      super.break_(var2);
      this.new_(
         var2.rx() - (double)(var2.PN() + 1.0F) * 0.5 * (double)rfU_2.class_((Float)var2.private_[23] * (float) (Math.PI / 180.0)),
         var2.rH() - 0.1F,
         var2.BO() + (double)(var2.PN() + 1.0F) * 0.5 * (double)rfU_2.break_((Float)var2.private_[23] * (float) (Math.PI / 180.0))
      );
   }

   public rhw_3(aI_2<? extends rhw_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      rjU_2 var1 = this.rv();
      rjG_2 var2 = rhj_3.class_(this, this::class_);
      if (var2 != null) {
         this.class_(var2);
      }

      double var3 = this.rx() + var1.break_;
      double var5 = this.re() + var1.byte_;
      double var7 = this.BO() + var1.protected_;
      this.return_();
      float var9 = 0.99F;
      float var10 = 0.06F;
      if (((rYB)this.throws_[7]).class_(this.rN()).noneMatch(JC::catch_)) {
         this.PD();
      } else if (this.Pa()) {
         this.PD();
      } else {
         this.byte_(var1.class_(0.99F));
         if (!this.rw()) {
            this.byte_(this.rv().break_(0.0, -0.06F, 0.0));
         }

         this.new_(var3, var5, var7);
      }
   }

   @Override
   protected void class_(rff_3 var1) {
      super.class_(var1);
      if (!((rYB)this.throws_[7]).continue_) {
         this.PD();
      }
   }

   @Override
   protected void class_(rfo_3 var1) {
      super.class_(var1);
      an_3 var2 = this.else_();
      if (var2 instanceof iB_2) {
         var1.class_().break_(rye_3.class_(this, (iB_2)var2).byte_(), 1.0F);
      }
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
