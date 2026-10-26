package celestial;

class rGI extends rBl_1 {
   public rGI(rGw_1 var1) {
      super(var1, 1.0, true);
   }

   @Override
   protected double class_(iB_2 var1) {
      return (double)(4.0F + var1.PN());
   }

   @Override
   public boolean class_() {
      return super.class_() && !this.class_.BP();
   }

   @Override
   public boolean break_() {
      float var1 = this.class_.rX();
      if (var1 >= 0.5F && this.class_.Sa().nextInt(100) == 0) {
         this.class_.byte_((iB_2)null);
         return false;
      } else {
         return super.break_();
      }
   }
}
