package celestial;

class rMP extends rBl_1 {
   @Override
   public void id_byte() {
      this.id_break.id_return(false);
      super.id_byte();
   }

   public rMP(rba_3 var1, double var2, boolean var4) {
      super(var1, var2, var4);
      this.id_break = var1;
   }

   @Override
   protected void id_class(iB_2 var1, double var2) {
      double var4 = this.id_class(var1);
      if (var2 <= var4 && this.id_private()) {
         this.id_catch();
         this.id_class.id_public(var1);
         this.id_break.id_class(rqn_3.SZ, 1.0F, 1.0F);
      }
   }

   @Override
   public boolean id_class() {
      return !this.id_break.sJ() && !this.id_break.Sc() && !this.id_break.x() && !this.id_break.sx() && super.id_class();
   }
}
