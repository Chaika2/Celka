package celestial;

import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface rRy_1 extends rKH, rRR, rRw_1 {
   @Override
   default rfH_2 class_(rKv_1 var1, rfH_2 var2) {
      return rRR.super.class_(var1, var2);
   }

   @Override
   default boolean class_(an_3 var1, rjC_2 var2) {
      return rRw_1.super.class_(var1, var2);
   }

   @Override
   default Stream<rjC_2> class_(an_3 var1, rfl_3 var2, Predicate<an_3> var3) {
      return rRw_1.super.class_(var1, var2, var3);
   }

   rVm_1 new_();

   default Optional<rqM_2<rYG>> protected_(rfH_2 var1) {
      return this.new_().break_(rVL.n).byte_(this.implements_(var1));
   }
}
