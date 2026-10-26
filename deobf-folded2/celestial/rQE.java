package celestial;

import java.util.function.Predicate;

public class rQE implements rQz_1 {
   final rQz_1[] id_class;
   private final Predicate<rzr_3> id_break;

   rQE(rQz_1[] var1) {
      this.id_class = var1;
      this.id_break = rQF.id_break(var1);
   }

   @Override
   public void id_class(rQs_1 var1) {
      rQz_1.super.id_class(var1);

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         this.id_class[var2].id_class(var1.id_break(".term[" + var2 + "]"));
      }
   }

   public static rQG id_class(rQQ... var0) {
      return new rQG(var0);
   }

   public final boolean id_class(rzr_3 var1) {
      return this.id_break.test(var1);
   }

   @Override
   public rWi_1 id_break() {
      return rQF.id_break;
   }
}
