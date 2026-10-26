package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class rzO_2 implements rNL {
   protected final rQz_1[] id_class;
   private final Predicate<rzr_3> id_break;

   protected rzO_2(rQz_1[] var1) {
      this.id_class = var1;
      this.id_break = rQF.id_class(var1);
   }

   @Override
   public void id_class(rQs_1 var1) {
      rNL.super.id_class(var1);

      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         this.id_class[var2].id_class(var1.id_break(".conditions[" + var2 + "]"));
      }
   }

   public final rdn_3 id_class(rdn_3 var1, rzr_3 var2) {
      return this.id_break.test(var2) ? this.id_break(var1, var2) : var1;
   }

   protected static rzh_3<?> id_class(Function<rQz_1[], rNL> var0) {
      return new rzJ_2(var0);
   }

   protected abstract rdn_3 id_break(rdn_3 var1, rzr_3 var2);
}
