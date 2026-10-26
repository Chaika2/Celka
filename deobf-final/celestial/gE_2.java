package celestial;

public class gE_2 {
   private double class_;
   private double break_;
   private double byte_;

   public double class_(double var1, double var3) {
      this.class_ += var1;
      double var5 = this.class_ - this.break_;
      double var7 = rfU_2.protected_(0.5, this.byte_, var5);
      double var9 = Math.signum(var5);
      if (var9 * var5 > var9 * this.byte_) {
         var5 = var7;
      }

      this.byte_ = var7;
      this.break_ += var5 * var3;
      return var5 * var3;
   }

   public void class_() {
      this.class_ = 0.0;
      this.break_ = 0.0;
      this.byte_ = 0.0;
   }
}
