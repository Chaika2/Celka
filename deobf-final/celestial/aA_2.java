package celestial;

public abstract class aA_2 extends is_3 {
   protected void byte_(float var1) {
   }

   protected aA_2(aI_2<? extends aA_2> var1, rYB var2) {
      super(var1, var2);
   }

   public float class_(rfH_2 var1) {
      return this.class_(var1, (rYB)this.throws_[7]);
   }

   @Override
   public boolean class_(rRg_1 var1, iO_2 var2) {
      return this.class_(this.Bs(), var1) >= 0.0F;
   }

   public float class_(rfH_2 var1, rRR var2) {
      return 0.0F;
   }

   public boolean catch_() {
      return !this.public_().native_();
   }

   protected double implements_() {
      return 1.0;
   }

   @Override
   protected void private_() {
      super.private_();
      an_3 var1 = this.N();
      if (var1 != null && (rYB)var1.throws_[7] == (rYB)this.throws_[7]) {
         this.class_(var1.Bs(), 5);
         float var2 = this.implements_(var1);
         if (this instanceof rOQ && ((rOQ)this).Sc()) {
            if (var2 > 10.0F) {
               this.class_(true, true);
            }

            return;
         }

         this.byte_(var2);
         if (var2 > 10.0F) {
            this.class_(true, true);
            this.package_.class_(rBW.MOVE);
         } else if (var2 > 6.0F) {
            double var3 = (var1.rx() - this.rx()) / (double)var2;
            double var5 = (var1.re() - this.re()) / (double)var2;
            double var7 = (var1.BO() - this.BO()) / (double)var2;
            this.byte_(this.rv().break_(Math.copySign(var3 * var3 * 0.4, var3), Math.copySign(var5 * var5 * 0.4, var5), Math.copySign(var7 * var7 * 0.4, var7)));
         } else {
            this.package_.break_(rBW.MOVE);
            float var9 = 2.0F;
            rjU_2 var4 = new rjU_2(var1.rx() - this.rx(), var1.re() - this.re(), var1.BO() - this.BO())
               .protected_()
               .class_((double)Math.max(var2 - 2.0F, 0.0F));
            this.public_().class_(this.rx() + var4.break_, this.re() + var4.byte_, this.BO() + var4.protected_, this.implements_());
         }
      }
   }
}
