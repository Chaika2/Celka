package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPE<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> id_class;
   private final il_3<?> id_byte;

   public rPE(Predicate<E> var1, il_3<?> var2) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT));
      this.id_class = var1;
      this.id_byte = var2;
   }

   @Override
   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_class.test((E)var2);
   }

   @Override
   protected void id_protected(rrEm_1 var1, E var2, long var3) {
      var2.SF().id_break(this.id_byte);
   }
}
