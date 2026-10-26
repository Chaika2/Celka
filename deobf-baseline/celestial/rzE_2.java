package celestial;

import java.util.function.Predicate;

public abstract class rzE_2 implements rWV {
   protected final rQz_1[] id_byte;
   private final Predicate<rzr_3> id_protected;

   protected rzE_2(rQz_1[] var1) {
      this.id_byte = var1;
      this.id_protected = rQF.id_class(var1);
   }

   public abstract rzm_3 id_class();

   protected final boolean id_class(rzr_3 var1) {
      return this.id_protected.test(var1);
   }

   public void id_class(rQs_1 var1) {
      for (int var2 = 0; var2 < this.id_byte.length; var2++) {
         this.id_byte[var2].id_class(var1.id_break(".condition[" + var2 + "]"));
      }
   }
}
