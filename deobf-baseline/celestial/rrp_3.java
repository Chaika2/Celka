package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class rrp_3<E extends is_3> extends rPm_1<E> {
   private final Predicate<E> id_class;
   private final Function<E, Optional<? extends iB_2>> id_byte;

   public rrp_3(Predicate<E> var1, Function<E, Optional<? extends iB_2>> var2) {
      super(ImmutableMap.of(il_3.id_package, iC_2.VALUE_ABSENT, il_3.id_interface, iC_2.REGISTERED));
      this.id_class = var1;
      this.id_byte = var2;
   }

   public rrp_3(Function<E, Optional<? extends iB_2>> var1) {
      this(var0 -> true, var1);
   }

   private void id_class(E var1, iB_2 var2) {
      var1.SF().id_class(il_3.id_package, var2);
      var1.SF().id_break(il_3.id_interface);
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      if (!this.id_class.test((E)var2)) {
         return false;
      } else {
         Optional var3 = this.id_byte.apply((E)var2);
         return var3.isPresent() && ((iB_2)var3.get()).BM();
      }
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      this.id_byte.apply((E)var2).ifPresent(var2x -> this.id_class((E)var2, var2x));
   }
}
