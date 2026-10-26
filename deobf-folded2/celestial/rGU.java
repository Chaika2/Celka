package celestial;

class rGU extends rBl_1 {
   public rGU(rGD var1, rGD var2) {
      super(var2, 1.0, false);
   }

   @Override
   protected double id_class(iB_2 var1) {
      if (this.id_class.ra() instanceof rGx_1) {
         float var2 = this.id_class.ra().PN() - 0.1F;
         return (double)(var2 * 2.0F * var2 * 2.0F + var1.PN());
      } else {
         return super.id_class(var1);
      }
   }
}
