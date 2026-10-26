package celestial;

import java.util.function.Consumer;

public class rWq_1 extends rzY_2 {
   final rqO_2 catch_;

   rWq_1(rqO_2 var1, int var2, int var3, rQz_1[] var4, rNL[] var5) {
      super(var2, var3, var4, var5);
      this.catch_ = var1;
   }

   public static rzK_2<?> class_(rqO_2 var0) {
      return class_((var1, var2, var3, var4) -> new rWq_1(var0, var1, var2, var3, var4));
   }

   @Override
   public void class_(Consumer<rdn_3> var1, rzr_3 var2) {
      var2.class_(this.catch_, var1);
   }

   @Override
   public rzm_3 class_() {
      return rzM_2.protected_;
   }
}
