package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPs_1<E extends is_3, T> extends rPm_1<E> {
   private final Predicate<E> class_;
   private final il_3<? extends T> byte_;
   private final il_3<T> protected_;
   private final rqb_3 throws_;

   public rPs_1(Predicate<E> var1, il_3<? extends T> var2, il_3<T> var3, rqb_3 var4) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT, var3, iC_2.VALUE_ABSENT));
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   protected void class_(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.class_(this.protected_, (T)var5.byte_(this.byte_).get(), (long)this.throws_.class_(var1.int_));
   }

   protected boolean class_(rrEm_1 var1, E var2) {
      return this.class_.test((E)var2);
   }
}
