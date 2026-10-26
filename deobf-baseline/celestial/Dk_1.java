package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class Dk_1<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
   extends Dd_1 {
   private final rCZ<T1> id_class;
   private final rCZ<T2> id_break;
   private final rCZ<T3> id_byte;
   private final rCZ<T4> id_protected;
   private final rCZ<T5> id_throws;

   Dk_1(rCZ<T1> var1, rCZ<T2> var2, rCZ<T3> var3, rCZ<T4> var4, rCZ<T5> var5) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var5;
   }

   public Dk_1<T1, T2, T3, T4, T5> id_class(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, DS var6) {
      return this.id_class((T1)var1, (T2)var2, (T3)var3, (T4)var4, (T5)var5, Collections.singletonList(var6));
   }

   public Dk_1<T1, T2, T3, T4, T5> id_class(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, List<DS> var6) {
      Uz_1 var7 = Uz_1.id_class(
         this.id_class.id_break((T1)var1),
         this.id_break.id_break((T2)var2),
         this.id_byte.id_break((T3)var3),
         this.id_protected.id_break((T4)var4),
         this.id_throws.id_break((T5)var5)
      );
      this.id_class(var7, var6);
      return this;
   }

   @Override
   public List<rCZ<?>> id_break() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }
}
