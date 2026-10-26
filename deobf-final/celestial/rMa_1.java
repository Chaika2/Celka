package celestial;

class rMa_1 extends rBY {
   public rMa_1(rMK var1) {
      super(var1, 2.0);
      this.catch_ = var1;
   }

   @Override
   public boolean class_() {
      return !this.catch_.n_() && !this.catch_.Pz() ? false : super.class_();
   }
}
