package celestial;

import java.util.function.Consumer;

public class rQP extends rzY_2 {
   final rlb_3<rdb_3> id_catch;
   final boolean id_private;

   rQP(rlb_3<rdb_3> var1, boolean var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      super(var3, var4, var5, var6);
      this.id_catch = var1;
      this.id_private = var2;
   }

   @Override
   public boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      return this.id_private ? this.id_class(var1, var2) : super.expand(var1, var2);
   }

   public static rzK_2<?> id_class(rlb_3<rdb_3> var0) {
      return id_class((var1, var2, var3, var4) -> new rQP(var0, true, var1, var2, var3, var4));
   }

   @Override
   public rzm_3 id_class() {
      return rzM_2.id_throws;
   }

   private boolean id_class(rzr_3 var1, Consumer<rWR> var2) {
      if (!this.id_class(var1)) {
         return false;
      } else {
         for (rdb_3 var4 : this.id_catch.id_class()) {
            var2.accept(new rQB(this, var4));
         }

         return true;
      }
   }

   @Override
   public void id_class(Consumer<rdn_3> var1, rzr_3 var2) {
      this.id_catch.id_class().forEach(var1x -> var1.accept(new rdn_3(var1x)));
   }
}
