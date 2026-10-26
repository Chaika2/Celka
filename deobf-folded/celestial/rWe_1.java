package celestial;

import java.util.function.Consumer;

public class rWe_1 extends rzY_2 {
   final rdb_3 id_catch;

   rWe_1(rdb_3 var1, int var2, int var3, rQz_1[] var4, rNL[] var5) {
      super(var2, var3, var4, var5);
      this.id_catch = var1;
   }

   public static rzK_2<?> id_class(rpL_2 var0) {
      return id_class((var1, var2, var3, var4) -> new rWe_1(var0.id_case(), var1, var2, var3, var4));
   }

   @Override
   public void id_class(Consumer<rdn_3> var1, rzr_3 var2) {
      var1.accept(new rdn_3(this.id_catch));
   }

   @Override
   public rzm_3 id_class() {
      return rzM_2.id_break;
   }
}
