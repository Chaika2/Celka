package celestial;

class rhS_2 extends rBc_1 {
   public rhS_2(rhP_2 var1) {
      super(var1);
   }

   @Override
   public boolean break_() {
      if (this.throws_ instanceof rhP_2 var1 && var1.char_) {
         var1.try_(false);
         return false;
      }

      return super.break_();
   }
}
