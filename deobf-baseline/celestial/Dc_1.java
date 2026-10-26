package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

public class Dc_1<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends Dd_1 {
   private final rCZ<T1> id_class;
   private final rCZ<T2> id_break;

   Dc_1(rCZ<T1> var1, rCZ<T2> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public Dd_1 id_class(BiFunction<T1, T2, DS> var1) {
      this.id_class.id_class().forEach(var2 -> this.id_break.id_class().forEach(var3 -> this.id_class((T1)var2, (T2)var3, (DS)var1.apply(var2, var3))));
      return this;
   }

   public Dc_1<T1, T2> id_class(T1 var1, T2 var2, List<DS> var3) {
      Uz_1 var4 = Uz_1.id_class(this.id_class.id_break((T1)var1), this.id_break.id_break((T2)var2));
      this.id_class(var4, var3);
      return this;
   }

   public Dc_1<T1, T2> id_class(T1 var1, T2 var2, DS var3) {
      return this.id_class((T1)var1, (T2)var2, Collections.singletonList(var3));
   }

   public Dd_1 id_break(BiFunction<T1, T2, List<DS>> var1) {
      this.id_class.id_class().forEach(var2 -> this.id_break.id_class().forEach(var3 -> this.id_class((T1)var2, (T2)var3, (List<DS>)var1.apply(var2, var3))));
      return this;
   }

   @Override
   public List<rCZ<?>> id_break() {
      return ImmutableList.of(this.id_class, this.id_break);
   }
}
