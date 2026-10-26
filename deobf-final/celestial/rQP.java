package celestial;

import java.util.function.Consumer;

public class rQP extends rzY_2 {
   final rlb_3<rdb_3> catch_;
   final boolean private_;

   rQP(rlb_3<rdb_3> var1, boolean var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      super(var3, var4, var5, var6);
      this.catch_ = var1;
      this.private_ = var2;
   }

   @Override
   public boolean expand(rzr_3 var1, Consumer<rWR> var2) {
      return this.private_ ? this.class_(var1, var2) : super.expand(var1, var2);
   }

   public static rzK_2<?> class_(rlb_3<rdb_3> var0) {
      return class_((var1, var2, var3, var4) -> new rQP(var0, true, var1, var2, var3, var4));
   }

   @Override
   public rzm_3 class_() {
      return rzM_2.throws_;
   }

   private boolean class_(rzr_3 var1, Consumer<rWR> var2) {
      if (!this.class_(var1)) {
         return false;
      } else {
         for (rdb_3 var4 : this.catch_.class_()) {
            var2.accept(new rQB(this, var4));
         }

         return true;
      }
   }

   @Override
   public void class_(Consumer<rdn_3> var1, rzr_3 var2) {
      this.catch_.class_().forEach(var1x -> var1.accept(new rdn_3(var1x)));
   }
}
