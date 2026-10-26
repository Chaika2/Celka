package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPE<E extends iB_2> extends rPm_1<E> {
   private final Predicate<E> class_;
   private final il_3<?> byte_;

   public rPE(Predicate<E> var1, il_3<?> var2) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2;
   }

   @Override
   protected boolean class_(rrEm_1 var1, E var2) {
      return this.class_.test((E)var2);
   }

   @Override
   protected void protected_(rrEm_1 var1, E var2, long var3) {
      var2.SF().break_(this.byte_);
   }
}
