package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class DQ<T1 extends Comparable<T1>> extends Dd_1 {
   private final rCZ<T1> class_;

   DQ(rCZ<T1> var1) {
      this.class_ = var1;
   }

   public DQ<T1> class_(T1 var1, DS var2) {
      return this.class_((T1)var1, Collections.singletonList(var2));
   }

   public Dd_1 class_(Function<T1, DS> var1) {
      this.class_.class_().forEach(var2 -> this.class_((T1)var2, (DS)var1.apply(var2)));
      return this;
   }

   public DQ<T1> class_(T1 var1, List<DS> var2) {
      Uz_1 var3 = Uz_1.class_(this.class_.break_((T1)var1));
      this.class_(var3, var2);
      return this;
   }

   @Override
   public List<rCZ<?>> break_() {
      return ImmutableList.of(this.class_);
   }
}
