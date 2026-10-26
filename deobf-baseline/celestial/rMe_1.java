package celestial;

class rMe_1 extends rBl_1 {
   public rMe_1(rMK var1) {
      super(var1, 1.25, true);
      this.id_break = var1;
   }

   @Override
   protected double id_class(iB_2 var1) {
      return (double)(4.0F + var1.PN());
   }

   @Override
   protected void id_class(iB_2 var1, double var2) {
      double var4 = this.id_class(var1);
      if (var2 <= var4 && this.id_private()) {
         this.id_catch();
         this.id_class.id_public(var1);
         this.id_break.id_this(false);
      } else if (var2 <= var4 * 2.0) {
         if (this.id_private()) {
            this.id_break.id_this(false);
            this.id_catch();
         }

         if (this.id_finally() <= 10) {
            this.id_break.id_this(true);
            this.id_break.n();
         }
      } else {
         this.id_catch();
         this.id_break.id_this(false);
      }
   }

   @Override
   public void id_protected() {
      this.id_break.id_this(false);
      super.id_protected();
   }
}
