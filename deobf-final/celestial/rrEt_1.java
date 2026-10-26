package celestial;

class rrEt_1 {
   private final rfH_2 class_;
   private final double break_;

   public rrEt_1(rfH_2 var1, double var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public double class_(rfH_2 var1) {
      double var2 = this.class_.private_(var1);
      return var2 == 0.0 ? Double.POSITIVE_INFINITY : this.break_ / Math.sqrt(var2);
   }
}
