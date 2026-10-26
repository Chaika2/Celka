package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.function.Predicate;

public class rPs_1<E extends is_3, T> extends rPm_1<E> {
   private final Predicate<E> id_class;
   private final il_3<? extends T> id_byte;
   private final il_3<T> id_protected;
   private final rqb_3 id_throws;

   public rPs_1(Predicate<E> var1, il_3<? extends T> var2, il_3<T> var3, rqb_3 var4) {
      super(ImmutableMap.of(var2, iC_2.VALUE_PRESENT, var3, iC_2.VALUE_ABSENT));
      this.id_class = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   protected void id_class(rrEm_1 var1, E var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.id_class(this.id_protected, (T)var5.id_byte(this.id_byte).get(), (long)this.id_throws.id_class(var1.id_int));
   }

   protected boolean id_class(rrEm_1 var1, E var2) {
      return this.id_class.test((E)var2);
   }
}
