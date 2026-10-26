package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import java.util.function.Predicate;

public class rrn_3<E extends is_3> extends rPm_1<E> {
   private final Predicate<iB_2> id_class;

   private boolean id_byte(E var1) {
      Optional var2 = var1.SF().id_byte(il_3.id_package);
      return var2.isPresent() && !((iB_2)var2.get()).BM();
   }

   public rrn_3(Predicate<iB_2> var1) {
      super(ImmutableMap.of(il_3.id_package, iC_2.VALUE_PRESENT, il_3.id_interface, iC_2.REGISTERED));
      this.id_class = var1;
   }

   public rrn_3() {
      this(var0 -> false);
   }

   private static <E extends iB_2> boolean id_class(E var0) {
      Optional var1 = var0.SF().id_byte(il_3.id_interface);
      return var1.isPresent() && ((rYB)var0.id_throws[7]).r() - (Long)var1.get() > 200L;
   }

   private boolean id_class(E var1) {
      return (rYB)this.id_break((E)var1).id_throws[7] != (rYB)var1.id_throws[7];
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      if (id_class(var2)) {
         this.id_protected((E)var2);
      } else if (this.id_byte((E)var2)) {
         this.id_protected((E)var2);
      } else if (this.id_class((E)var2)) {
         this.id_protected((E)var2);
      } else if (!rpJ_2.id_case.test(this.id_break((E)var2))) {
         this.id_protected((E)var2);
      } else if (this.id_class.test(this.id_break((E)var2))) {
         this.id_protected((E)var2);
      }
   }

   private iB_2 id_break(E var1) {
      return var1.SF().id_byte(il_3.id_package).get();
   }

   private void id_protected(E var1) {
      var1.SF().id_break(il_3.id_package);
   }
}
