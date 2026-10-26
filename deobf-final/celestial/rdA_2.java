package celestial;

class rdA_2 {
   double class_;
   private double break_;
   private long byte_;

   boolean class_(long var1) {
      return this.byte_ != var1;
   }

   void class_(long var1, double var3) {
      this.byte_ = var1;
      double var5 = var3 - this.class_;
      var5 = rfU_2.byte_(var5 + 0.5, 1.0) - 0.5;
      this.break_ += var5 * 0.1;
      this.break_ *= 0.8;
      this.class_ = rfU_2.byte_(this.class_ + this.break_, 1.0);
   }
}
