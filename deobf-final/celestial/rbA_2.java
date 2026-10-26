package celestial;

class rbA_2 extends rBc_1 {
   rbA_2(rbF_2 var1, rbF_2 var2) {
      super(var2);
      this.class_ = var1;
   }

   @Override
   protected void class_(is_3 var1, iB_2 var2) {
      if (var1 instanceof rbF_2 && this.throws_.while_(var2)) {
         var1.byte_(var2);
      }
   }

   @Override
   public boolean break_() {
      return this.class_.T_() && super.break_();
   }
}
