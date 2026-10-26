package celestial;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class rzO_2 implements rNL {
   protected final rQz_1[] class_;
   private final Predicate<rzr_3> break_;

   protected rzO_2(rQz_1[] var1) {
      this.class_ = var1;
      this.break_ = rQF.class_(var1);
   }

   @Override
   public void class_(rQs_1 var1) {
      rNL.super.class_(var1);

      for (int var2 = 0; var2 < this.class_.length; var2++) {
         this.class_[var2].class_(var1.break_(".conditions[" + var2 + "]"));
      }
   }

   public final rdn_3 class_(rdn_3 var1, rzr_3 var2) {
      return this.break_.test(var2) ? this.break_(var1, var2) : var1;
   }

   protected static rzh_3<?> class_(Function<rQz_1[], rNL> var0) {
      return new rzJ_2(var0);
   }

   protected abstract rdn_3 break_(rdn_3 var1, rzr_3 var2);
}
