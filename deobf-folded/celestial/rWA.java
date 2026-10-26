package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class rWA extends rzG_2<rWA> {
   private final List<rzE_2> id_class = Lists.newArrayList();

   public rWA(rzG_2<?>... var1) {
      for (rzG_2 var5 : var1) {
         this.id_class.add(var5.id_break());
      }
   }

   protected rWA id_class() {
      return this;
   }

   @Override
   public rWA id_class(rzG_2<?> var1) {
      this.id_class.add(var1.id_break());
      return this;
   }

   @Override
   public rzE_2 id_break() {
      return new rWL(this.id_class.toArray(new rzE_2[0]), this.id_case());
   }
}
