package celestial;

class rMJ extends rBY {
   public rMJ(rba_3 var1, double var2) {
      super(var1, var2);
      this.catch_ = var1;
   }

   @Override
   public boolean class_() {
      return !this.catch_.sv() && super.class_();
   }
}
