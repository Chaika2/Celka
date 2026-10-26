package celestial;

class rMz_1 extends rBH {
   @Override
   public void byte_() {
      this.class_.sL();
      super.byte_();
   }

   public rMz_1(rba_3 var1, int var2, int var3) {
      super(var1, var3);
      this.class_ = var1;
   }

   @Override
   public boolean class_() {
      return super.class_() && this.catch_();
   }

   @Override
   public boolean break_() {
      return super.break_() && this.catch_();
   }

   private boolean catch_() {
      return !this.class_.Sc() && !this.class_.sJ() && !this.class_.sv() && this.class_.I_() == null;
   }
}
