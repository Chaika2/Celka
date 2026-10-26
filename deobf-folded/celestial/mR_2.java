package celestial;

import java.util.List;

class mR_2 extends LV<mY_2> {
   public mR_2(mg_3 var1) {
      super(var1.id_volatile, var1.id_package, var1.id_int, 43, var1.id_int - 60, 24);
      this.id_class = var1;

      for (int var2 = 0; var2 < var1.id_case.id_case().size(); var2++) {
         this.id_break(new mY_2(this));
      }
   }

   public void id_class(mY_2 var1) {
      super.id_class(var1);
      this.id_class.id_native();
   }

   @Override
   protected boolean id_class() {
      return this.id_class.id_catch() == this;
   }

   public void id_throws() {
      int var1 = this.x_().indexOf(this.id_finally());
      this.id_native();

      for (int var2 = 0; var2 < this.id_class.id_case.id_case().size(); var2++) {
         this.id_break(new mY_2(this));
      }

      List var3 = this.x_();
      if (var1 >= 0 && var1 < var3.size()) {
         this.id_class((mY_2)var3.get(var1));
      }
   }

   @Override
   protected int id_protected() {
      return this.id_final - 70;
   }
}
