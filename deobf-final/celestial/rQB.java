package celestial;

import java.util.function.Consumer;

class rQB extends rzU_2 {
   rQB(rQP var1, rdb_3 var2) {
      super(var1);
      this.class_ = var2;
   }

   @Override
   public void class_(Consumer<rdn_3> var1, rzr_3 var2) {
      var1.accept(new rdn_3(this.class_));
   }
}
