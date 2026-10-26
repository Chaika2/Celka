package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class rrp_3<E extends is_3> extends rPm_1<E> {
   private final Predicate<E> class_;
   private final Function<E, Optional<? extends iB_2>> byte_;

   public rrp_3(Predicate<E> var1, Function<E, Optional<? extends iB_2>> var2) {
      super(ImmutableMap.of(il_3.package_, iC_2.VALUE_ABSENT, il_3.interface_, iC_2.REGISTERED));
      this.class_ = var1;
      this.byte_ = var2;
   }

   public rrp_3(Function<E, Optional<? extends iB_2>> var1) {
      this(var0 -> true, var1);
   }

   private void class_(E var1, iB_2 var2) {
      var1.SF().class_(il_3.package_, var2);
      var1.SF().break_(il_3.interface_);
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      if (!this.class_.test((E)var2)) {
         return false;
      } else {
         Optional var3 = this.byte_.apply((E)var2);
         return var3.isPresent() && ((iB_2)var3.get()).BM();
      }
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      this.byte_.apply((E)var2).ifPresent(var2x -> this.class_((E)var2, var2x));
   }
}
