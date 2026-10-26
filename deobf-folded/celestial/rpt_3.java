package celestial;

import java.util.Optional;
import java.util.function.BiFunction;

class rpt_3 implements rpq_3 {
   rpt_3(rYB var1, rfH_2 var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   @Override
   public <T> Optional<T> id_class(BiFunction<rYB, rfH_2, T> var1) {
      return Optional.of((T)var1.apply(this.id_break, this.id_byte));
   }
}
