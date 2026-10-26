package celestial;

class rOL extends rBY {
   rOL(rON var1, double var2) {
      super(var1, var2);
   }

   @Override
   public boolean class_() {
      if (this.class_.Sr() == null && !this.class_.Pz()) {
         return false;
      } else {
         rfH_2 var1 = this.class_((rYB)this.class_.throws_[7], this.class_, 7, 4);
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
}
