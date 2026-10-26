package celestial;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface rRy_1 extends rKH, rRR, rRw_1 {
   @Override
   default rfH_2 id_class(rKv_1 var1, rfH_2 var2) {
      return rRR.super.id_class(var1, var2);
   }

   @Override
   default boolean id_class(an_3 var1, rjC_2 var2) {
      return rRw_1.super.id_class(var1, var2);
   }

   @Override
   default Stream<rjC_2> id_class(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return rRw_1.super.id_class(var1, var2, var3);
   }

   rVm_1 id_new();

   default Optional<rqM_2<rYG>> id_protected(rfH_2 var1) {
      return this.id_new().id_break(rVL.n).id_byte(this.id_implements(var1));
   }
}
