package celestial;

import java.util.function.Predicate;

class rzv_3 implements rQz_1 {
   private final rQz_1[] id_class;
   private final Predicate<rzr_3> id_break;

   rzv_3(rQz_1[] var1) {
      this.id_class = var1;
      this.id_break = rQF.id_class(var1);
   }

   public final boolean id_class(rzr_3 var1) {
      return this.id_break.test(var1);
   }

   @Override
   public void id_class(rQs_1 var1) {
      rQz_1.super.id_class(var1);

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         this.id_class[var2].id_class(var1.id_break(".term[" + var2 + "]"));
      }
   }

   @Override
   public rWi_1 id_break() {
      throw new UnsupportedOperationException();
   }
}
