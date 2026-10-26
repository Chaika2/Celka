package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rWA extends rzG_2<rWA> {
   private final List<rzE_2> class_ = Lists.newArrayList();

   public rWA(rzG_2<?>... var1) {
      for (rzG_2 var5 : var1) {
         this.class_.add(var5.break_());
      }
   }

   protected rWA class_() {
      return this;
   }

   @Override
   public rWA class_(rzG_2<?> var1) {
      this.class_.add(var1.break_());
      return this;
   }

   @Override
   public rzE_2 break_() {
      return new rWL(this.class_.toArray(new rzE_2[0]), this.case_());
   }
}
