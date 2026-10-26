package celestial;

class rhS_2 extends rBc_1 {
   public rhS_2(rhP_2 var1) {
      super(var1);
   }

   @Override
   public boolean id_break() {
      if (this.id_throws instanceof rhP_2 var1 && var1.id_char) {
         var1.id_try(false);
         return false;
      }

      return super.id_break();
   }
}
