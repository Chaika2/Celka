package celestial;

import java.util.List;

class mR_2 extends LV<mY_2> {
   public mR_2(mg_3 var1) {
      super(var1.volatile_, var1.package_, var1.int_, 43, var1.int_ - 60, 24);
      this.class_ = var1;

      for (int var2 = 0; var2 < var1.case_.case_().size(); var2++) {
         this.break_(new mY_2(this));
      }
   }

   public void class_(mY_2 var1) {
      super.class_(var1);
      this.class_.native_();
   }

   @Override
   protected boolean class_() {
      return this.class_.catch_() == this;
   }

   public void throws_() {
      int var1 = this.x_().indexOf(this.finally_());
      this.native_();

      for (int var2 = 0; var2 < this.class_.case_.case_().size(); var2++) {
         this.break_(new mY_2(this));
      }

      List var3 = this.x_();
      if (var1 >= 0 && var1 < var3.size()) {
         this.class_((mY_2)var3.get(var1));
      }
   }

   @Override
   protected int protected_() {
      return this.final_ - 70;
   }
}
