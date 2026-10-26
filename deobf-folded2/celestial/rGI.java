package celestial;

class rGI extends rBl_1 {
   public rGI(rGw_1 var1) {
      super(var1, 1.0, true);
   }

   @Override
   protected double id_class(iB_2 var1) {
      return (double)(4.0F + var1.PN());
   }

   @Override
   public boolean id_class() {
      return super.id_class() && !this.id_class.BP();
   }

   @Override
   public boolean id_break() {
      float var1 = this.id_class.rX();
      if (var1 >= 0.5F && this.id_class.Sa().nextInt(100) == 0) {
         this.id_class.id_byte((iB_2)null);
         return false;
      } else {
         return super.id_break();
      }
   }
}
