package celestial;

class rMI extends rBY {
   private final rMl_1 catch_;

   public rMI(rMl_1 var1, double var2) {
      super(var1, var2);
      this.catch_ = var1;
   }

   @Override
   public boolean class_() {
      if (!this.catch_.Pz()) {
         return false;
      } else {
         rfH_2 var1 = this.class_((rYB)this.class_.throws_[7], this.class_, 5, 4);
         if (var1 != null) {
            this.byte_ = (double)var1.b_();
            this.protected_ = (double)var1.c_();
            this.throws_ = (double)var1.d_();
            return true;
         } else {
            return this.catch_();
         }
      }
   }

   @Override
   public boolean break_() {
      if (this.catch_.sJ()) {
         this.catch_.public_().final_();
         return false;
      } else {
         return super.break_();
      }
   }
}
