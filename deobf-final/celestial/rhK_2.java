package celestial;

public abstract class rhK_2 extends rhf_3 {
   protected rhK_2(aI_2<? extends rhK_2> var1, iB_2 var2, rYB var3) {
      this(var1, var2.rx(), var2.rH() - 0.1F, var2.BO(), var3);
      this.break_(var2);
   }

   protected rhK_2(aI_2<? extends rhK_2> var1, double var2, double var4, double var6, rYB var8) {
      this(var1, var8);
      this.new_(var2, var4, var6);
   }

   protected rhK_2(aI_2<? extends rhK_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void this_() {
      super.this_();
      rjG_2 var1 = rhj_3.class_(this, this::class_);
      boolean var2 = false;
      if (var1.byte_() == rjM_2.BLOCK) {
         rfH_2 var3 = ((rff_3)var1).class_();
         xc_3 var4 = ((rYB)this.throws_[7]).byte_(var3);
         if (var4.class_(xu_3.Pi)) {
            this.protected_(var3);
            var2 = true;
         } else if (var4.class_(xu_3.bw)) {
            ryO_2 var5 = ((rYB)this.throws_[7]).class_(var3);
            if (var5 instanceof rHy_1 && rHy_1.class_(this)) {
               ((rHy_1)var5).break_(this);
            }

            var2 = true;
         }
      }

      if (var1.byte_() != rjM_2.MISS && !var2) {
         this.class_(var1);
      }

      this.Px();
      rjU_2 var12 = this.rv();
      double var13 = this.rx() + var12.break_;
      double var6 = this.re() + var12.byte_;
      double var8 = this.BO() + var12.protected_;
      this.return_();
      float var10;
      if (this.rT()) {
         for (int var11 = 0; var11 < 4; var11++) {
            ((rYB)this.throws_[7])
               .class_(
                  rLQ.throws_,
                  var13 - var12.break_ * 0.25,
                  var6 - var12.byte_ * 0.25,
                  var8 - var12.protected_ * 0.25,
                  var12.break_,
                  var12.byte_,
                  var12.protected_
               );
         }

         var10 = 0.8F;
      } else {
         var10 = 0.99F;
      }

      this.byte_(var12.class_((double)var10));
      if (!this.rw()) {
         rjU_2 var14 = this.rv();
         this.catch_(var14.break_, var14.byte_ - (double)this.throws_(), var14.protected_);
      }

      this.new_(var13, var6, var8);
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

   public rjU_2 class_(iB_2 var1) {
      return new rjU_2(var1.rx(), var1.rH() - 0.1F, var1.BO());
   }

   public float throws_() {
      return 0.03F;
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
