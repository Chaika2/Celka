package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzh_3<T extends rzh_3<T>> implements rNA, rWj_1<T> {
   private final List<rQz_1> id_class = Lists.newArrayList();

   protected rQz_1[] id_byte() {
      return this.id_class.toArray(new rQz_1[0]);
   }

   public final T id_class() {
      return this.id_break();
   }

   protected abstract T id_break();

   public T id_break(rQQ var1) {
      this.id_class.add(var1.build());
      return this.id_break();
   }
}
