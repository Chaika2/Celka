package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class DN<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends Dd_1 {
   private final rCZ<T1> id_class;
   private final rCZ<T2> id_break;
   private final rCZ<T3> id_byte;

   DN(rCZ<T1> var1, rCZ<T2> var2, rCZ<T3> var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public Dd_1 id_class(Dz_1<T1, T2, T3, DS> var1) {
      this.id_class
         .id_class()
         .forEach(
            var2 -> this.id_break
                  .id_class()
                  .forEach(var3 -> this.id_byte.id_class().forEach(var4 -> this.id_class((T1)var2, (T2)var3, (T3)var4, (DS)var1.apply(var2, var3, var4))))
         );
      return this;
   }

   public DN<T1, T2, T3> id_class(T1 var1, T2 var2, T3 var3, DS var4) {
      return this.id_class((T1)var1, (T2)var2, (T3)var3, Collections.singletonList(var4));
   }

   public DN<T1, T2, T3> id_class(T1 var1, T2 var2, T3 var3, List<DS> var4) {
      Uz_1 var5 = Uz_1.id_class(this.id_class.id_break((T1)var1), this.id_break.id_break((T2)var2), this.id_byte.id_break((T3)var3));
      this.id_class(var5, var4);
      return this;
   }

   @Override
   public List<rCZ<?>> id_break() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte);
   }
}
