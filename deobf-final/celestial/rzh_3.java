package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzh_3<T extends rzh_3<T>> implements rNA, rWj_1<T> {
   private final List<rQz_1> class_ = Lists.newArrayList();

   protected rQz_1[] byte_() {
      return this.class_.toArray(new rQz_1[0]);
   }

   public final T class_() {
      return this.break_();
   }

   protected abstract T break_();

   public T break_(rQQ var1) {
      this.class_.add(var1.build());
      return this.break_();
   }
}
