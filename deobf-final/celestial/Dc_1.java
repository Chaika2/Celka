package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Dc_1<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends Dd_1 {
   private final rCZ<T1> class_;
   private final rCZ<T2> break_;

   Dc_1(rCZ<T1> var1, rCZ<T2> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public Dd_1 class_(BiFunction<T1, T2, DS> var1) {
      this.class_.class_().forEach(var2 -> this.break_.class_().forEach(var3 -> this.class_((T1)var2, (T2)var3, (DS)var1.apply(var2, var3))));
      return this;
   }

   public Dc_1<T1, T2> class_(T1 var1, T2 var2, List<DS> var3) {
      Uz_1 var4 = Uz_1.class_(this.class_.break_((T1)var1), this.break_.break_((T2)var2));
      this.class_(var4, var3);
      return this;
   }

   public Dc_1<T1, T2> class_(T1 var1, T2 var2, DS var3) {
      return this.class_((T1)var1, (T2)var2, Collections.singletonList(var3));
   }

   public Dd_1 break_(BiFunction<T1, T2, List<DS>> var1) {
      this.class_.class_().forEach(var2 -> this.break_.class_().forEach(var3 -> this.class_((T1)var2, (T2)var3, (List<DS>)var1.apply(var2, var3))));
      return this;
   }

   @Override
   public List<rCZ<?>> break_() {
      return ImmutableList.of(this.class_, this.break_);
   }
}
