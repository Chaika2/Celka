package celestial;

class rMP extends rBl_1 {
   @Override
   public void byte_() {
      this.break_.return_(false);
      super.byte_();
   }

   public rMP(rba_3 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.break_ = var1;
   }

   @Override
   protected void class_(iB_2 var1, double var2) {
      double var4 = this.class_(var1);
      if (var2 <= var4 && this.private_()) {
         this.catch_();
         this.class_.public_(var1);
         this.break_.class_(rqn_3.SZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean class_() {
      return !this.break_.sJ() && !this.break_.Sc() && !this.break_.x() && !this.break_.sx() && super.class_();
   }
}
