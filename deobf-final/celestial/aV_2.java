package celestial;

public abstract class aV_2 extends is_3 {
   protected aV_2(aI_2<? extends aV_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected void class_(double var1, boolean var3, xc_3 var4, rfH_2 var5) {
   }

   @Override
   public boolean class_(float var1, float var2) {
      return false;
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.rT()) {
         this.class_(0.02F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.8F));
      } else if (this.ry()) {
         this.class_(0.02F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_(0.5));
      } else {
         float var2 = 0.91F;
         if ((Boolean)this.throws_[20]) {
            var2 = ((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).break_().final_() * 0.91F;
         }

         float var3 = 0.16277137F / (var2 * var2 * var2);
         var2 = 0.91F;
         if ((Boolean)this.throws_[20]) {
            var2 = ((rYB)this.throws_[7]).byte_(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).break_().final_() * 0.91F;
         }

         this.class_(this.throws_[20] ? 0.1F * var3 : 0.02F, var1);
         this.class_(iG_2.SELF, this.rv());
         this.byte_(this.rv().class_((double)var2));
      }

      this.class_(this, false);
   }

   @Override
   public boolean o_() {
      return false;
   }
}
