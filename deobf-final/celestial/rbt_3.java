package celestial;

class rbt_3 extends rBl_1 {
   rbt_3(rbF_2 var1, aA_2 var2, double var3, boolean var5) {
      super(var2, var3, var5);
      this.break_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && this.break_.T_() && !this.break_.su();
   }

   @Override
   public boolean break_() {
      return super.break_() && this.break_.T_() && !this.break_.su();
   }
}
