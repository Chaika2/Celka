package celestial;

class rGd_1 extends rBl_1 {
   public rGd_1(rGx_1 var1) {
      super(var1, 1.0, true);
      this.break_ = var1;
   }

   @Override
   protected double class_(iB_2 var1) {
      float var2 = this.break_.PN() - 0.1F;
      return (double)(var2 * 2.0F * var2 * 2.0F + var1.PN());
   }
}
