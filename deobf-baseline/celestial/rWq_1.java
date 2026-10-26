package celestial;

import java.util.function.Consumer;

public class rWq_1 extends rzY_2 {
   final rqO_2 id_catch;

   rWq_1(rqO_2 var1, int var2, int var3, rQz_1[] var4, rNL[] var5) {
      super(var2, var3, var4, var5);
      this.id_catch = var1;
   }

   public static rzK_2<?> id_class(rqO_2 var0) {
      return id_class((var1, var2, var3, var4) -> new rWq_1(var0, var1, var2, var3, var4));
   }

   @Override
   public void id_class(Consumer<rdn_3> var1, rzr_3 var2) {
      var2.id_class(this.id_catch, var1);
   }

   @Override
   public rzm_3 id_class() {
      return rzM_2.id_protected;
   }
}
