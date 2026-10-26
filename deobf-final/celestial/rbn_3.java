package celestial;

class rbn_3 extends rBI<rhd_3> {
   rbn_3(rbF_2 var1) {
      super(var1, rhd_3.class, 10, true, false, var1::b_);
   }

   @Override
   public boolean class_() {
      return this.catch_() && super.class_();
   }

   @Override
   public boolean break_() {
      boolean var1 = this.catch_();
      if (var1 && this.throws_.I_() != null) {
         return super.break_();
      } else {
         this.catch_ = null;
         return false;
      }
   }

   private boolean catch_() {
      rbF_2 var1 = (rbF_2)this.throws_;
      return var1.T_() && !var1.su();
   }
}
