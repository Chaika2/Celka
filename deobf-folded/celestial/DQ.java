package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class DQ<T1 extends Comparable<T1>> extends Dd_1 {
   private final rCZ<T1> id_class;

   DQ(rCZ<T1> var1) {
      this.id_class = var1;
   }

   public DQ<T1> id_class(T1 var1, DS var2) {
      return this.id_class((T1)var1, Collections.singletonList(var2));
   }

   public Dd_1 id_class(Function<T1, DS> var1) {
      this.id_class.id_class().forEach(var2 -> this.id_class((T1)var2, (DS)var1.apply(var2)));
      return this;
   }

   public DQ<T1> id_class(T1 var1, List<DS> var2) {
      Uz_1 var3 = Uz_1.id_class(this.id_class.id_break((T1)var1));
      this.id_class(var3, var2);
      return this;
   }

   @Override
   public List<rCZ<?>> id_break() {
      return ImmutableList.of(this.id_class);
   }
}
