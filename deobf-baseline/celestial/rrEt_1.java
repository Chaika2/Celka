package celestial;

class rrEt_1 {
   private final rfH_2 id_class;
   private final double id_break;

   public rrEt_1(rfH_2 var1, double var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public double id_class(rfH_2 var1) {
      double var2 = this.id_class.id_private(var1);
      return var2 == 0.0 ? Double.POSITIVE_INFINITY : this.id_break / Math.sqrt(var2);
   }
}
