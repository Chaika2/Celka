package celestial;

class rbn_3 extends rBI<rhd_3> {
   rbn_3(rbF_2 var1) {
      super(var1, rhd_3.class, 10, true, false, var1::b_);
   }

   @Override
   public boolean id_class() {
      return this.id_catch() && super.id_class();
   }

   @Override
   public boolean id_break() {
      boolean var1 = this.id_catch();
      if (var1 && this.id_throws.I_() != null) {
         return super.id_break();
      } else {
         this.id_catch = null;
         return false;
      }
   }

   private boolean id_catch() {
      rbF_2 var1 = (rbF_2)this.id_throws;
      return var1.T_() && !var1.su();
   }
}
