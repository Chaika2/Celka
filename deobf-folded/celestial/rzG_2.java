package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzG_2<T extends rzG_2<T>> implements rWj_1<T> {
   private final List<rQz_1> id_class = Lists.newArrayList();

   protected abstract T id_byte();

   public rWA id_class(rzG_2<?> var1) {
      return new rWA(this, var1);
   }

   public abstract rzE_2 id_break();

   public T id_break(rQQ var1) {
      this.id_class.add(var1.build());
      return this.id_byte();
   }

   public final T id_throws() {
      return this.id_byte();
   }

   protected rQz_1[] id_case() {
      return this.id_class.toArray(new rQz_1[0]);
   }
}
