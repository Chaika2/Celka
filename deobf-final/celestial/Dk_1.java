package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class Dk_1<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
   extends Dd_1 {
   private final rCZ<T1> class_;
   private final rCZ<T2> break_;
   private final rCZ<T3> byte_;
   private final rCZ<T4> protected_;
   private final rCZ<T5> throws_;

   Dk_1(rCZ<T1> var1, rCZ<T2> var2, rCZ<T3> var3, rCZ<T4> var4, rCZ<T5> var5) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
   }

   public Dk_1<T1, T2, T3, T4, T5> class_(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, DS var6) {
      return this.class_((T1)var1, (T2)var2, (T3)var3, (T4)var4, (T5)var5, Collections.singletonList(var6));
   }

   public Dk_1<T1, T2, T3, T4, T5> class_(T1 var1, T2 var2, T3 var3, T4 var4, T5 var5, List<DS> var6) {
      Uz_1 var7 = Uz_1.class_(
         this.class_.break_((T1)var1),
         this.break_.break_((T2)var2),
         this.byte_.break_((T3)var3),
         this.protected_.break_((T4)var4),
         this.throws_.break_((T5)var5)
      );
      this.class_(var7, var6);
      return this;
   }

   @Override
   public List<rCZ<?>> break_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_, this.throws_);
   }
}
