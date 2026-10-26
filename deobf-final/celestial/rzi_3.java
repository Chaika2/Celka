package celestial;

import java.util.function.Consumer;

public class rzi_3 extends rzY_2 {
   final rqO_2 catch_;

   rzi_3(rqO_2 var1, int var2, int var3, rQz_1[] var4, rNL[] var5) {
      super(var2, var3, var4, var5);
      this.catch_ = var1;
   }

   @Override
   public void class_(rQs_1 var1) {
      if (var1.class_(this.catch_)) {
         var1.class_("Table " + this.catch_ + " is recursively called");
      } else {
         super.class_(var1);
         rzL_2 var2 = var1.byte_(this.catch_);
         if (var2 == null) {
            var1.class_("Unknown loot table called " + this.catch_);
         } else {
            var2.class_(var1.class_("->{" + this.catch_ + "}", this.catch_));
         }
      }
   }

   public static rzK_2<?> class_(rqO_2 var0) {
      return class_((var1, var2, var3, var4) -> new rzi_3(var0, var1, var2, var3, var4));
   }

   @Override
   public void class_(Consumer<rdn_3> var1, rzr_3 var2) {
      rzL_2 var3 = var2.class_(this.catch_);
      var3.class_(var2, var1);
   }

   @Override
   public rzm_3 class_() {
      return rzM_2.byte_;
   }
}
