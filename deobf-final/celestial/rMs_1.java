package celestial;

class rMs_1 extends rBO {
   private int byte_;

   @Override
   public void byte_() {
      this.break_.sL();
      super.byte_();
   }

   public rMs_1(rba_3 var1, double var2) {
      super(var1, var2);
      this.break_ = var1;
      this.byte_ = 100;
   }

   @Override
   public boolean class_() {
      if (this.break_.Sc() || this.class_.I_() != null) {
         return false;
      } else if (((rYB)this.break_.throws_[7]).S()) {
         return true;
      } else if (this.byte_ > 0) {
         this.byte_--;
         return false;
      } else {
         this.byte_ = 100;
         rfH_2 var1 = this.class_.Bs();
         return ((rYB)this.break_.throws_[7]).strictfp_()
            && ((rYB)this.break_.throws_[7]).case_(var1)
            && !((rrEm_1)((rYB)this.break_.throws_[7])).throw_(var1)
            && this.catch_();
      }
   }
}
