package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzK_2<T extends rzK_2<T>> extends rzG_2<T> implements rWg_1<T> {
   protected int class_ = 1;
   protected int break_ = 0;
   private final List<rNL> byte_ = Lists.newArrayList();

   public T class_(int var1) {
      this.class_ = var1;
      return this.byte_();
   }

   protected rNL[] class_() {
      return this.byte_.toArray(new rNL[0]);
   }

   public T break_(int var1) {
      this.break_ = var1;
      return this.byte_();
   }

   public T break_(rNA var1) {
      this.byte_.add(var1.case_());
      return this.byte_();
   }
}
