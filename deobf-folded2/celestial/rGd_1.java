package celestial;

class rGd_1 extends rBl_1 {
   public rGd_1(rGx_1 var1) {
      super(var1, 1.0, true);
      this.id_break = var1;
   }

   @Override
   protected double id_class(iB_2 var1) {
      float var2 = this.id_break.PN() - 0.1F;
      return (double)(var2 * 2.0F * var2 * 2.0F + var1.PN());
   }
}
