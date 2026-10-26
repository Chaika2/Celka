package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class DN<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends Dd_1 {
   private final rCZ<T1> class_;
   private final rCZ<T2> break_;
   private final rCZ<T3> byte_;

   DN(rCZ<T1> var1, rCZ<T2> var2, rCZ<T3> var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public Dd_1 class_(Dz_1<T1, T2, T3, DS> var1) {
      this.class_
         .class_()
         .forEach(
            var2 -> this.break_
                  .class_()
                  .forEach(var3 -> this.byte_.class_().forEach(var4 -> this.class_((T1)var2, (T2)var3, (T3)var4, (DS)var1.apply(var2, var3, var4))))
         );
      return this;
   }

   public DN<T1, T2, T3> class_(T1 var1, T2 var2, T3 var3, DS var4) {
      return this.class_((T1)var1, (T2)var2, (T3)var3, Collections.singletonList(var4));
   }

   public DN<T1, T2, T3> class_(T1 var1, T2 var2, T3 var3, List<DS> var4) {
      Uz_1 var5 = Uz_1.class_(this.class_.break_((T1)var1), this.break_.break_((T2)var2), this.byte_.break_((T3)var3));
      this.class_(var5, var4);
      return this;
   }

   @Override
   public List<rCZ<?>> break_() {
      return ImmutableList.of(this.class_, this.break_, this.byte_);
   }
}
