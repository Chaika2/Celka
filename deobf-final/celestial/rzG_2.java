package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzG_2<T extends rzG_2<T>> implements rWj_1<T> {
   private final List<rQz_1> class_ = Lists.newArrayList();

   protected abstract T byte_();

   public rWA class_(rzG_2<?> var1) {
      return new rWA(this, var1);
   }

   public abstract rzE_2 break_();

   public T break_(rQQ var1) {
      this.class_.add(var1.build());
      return this.byte_();
   }

   public final T throws_() {
      return this.byte_();
   }

   protected rQz_1[] case_() {
      return this.class_.toArray(new rQz_1[0]);
   }
}
