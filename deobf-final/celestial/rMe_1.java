package celestial;

class rMe_1 extends rBl_1 {
   public rMe_1(rMK var1) {
      super(var1, 1.25, true);
      this.break_ = var1;
   }

   @Override
   protected double class_(iB_2 var1) {
      return (double)(4.0F + var1.PN());
   }

   @Override
   protected void class_(iB_2 var1, double var2) {
      double var4 = this.class_(var1);
      if (var2 <= var4 && this.private_()) {
         this.catch_();
         this.class_.public_(var1);
         this.break_.this_(false);
      } else if (var2 <= var4 * 2.0) {
         if (this.private_()) {
            this.break_.this_(false);
            this.catch_();
         }

         if (this.finally_() <= 10) {
            this.break_.this_(true);
            this.break_.n();
         }
      } else {
         this.catch_();
         this.break_.this_(false);
      }
   }

   @Override
   public void protected_() {
      this.break_.this_(false);
      super.protected_();
   }
}
