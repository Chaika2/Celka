package celestial;

class Zy_1 extends LV<Zp_1> {
   public Zy_1(Zl_1 var1) {
      super(var1.volatile_, var1.package_, var1.int_, 80, var1.int_ - 37, 24);
      this.class_ = var1;

      for (int var2 = 0; var2 < Zl_1.throws_.size(); var2++) {
         this.break_(new Zp_1(this));
      }
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (super.class_(var1, var2, var3)) {
         return true;
      } else {
         if ((var1 == 257 || var1 == 335) && this.finally_() != null) {
            this.finally_().class_();
         }

         return false;
      }
   }

   @Override
   protected boolean class_() {
      return this.class_.catch_() == this;
   }

   public void class_(Zp_1 var1) {
      super.class_(var1);
      this.class_.byte_(var1 != null);
   }
}
