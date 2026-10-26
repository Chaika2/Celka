package celestial;

import java.util.Map.Entry;
import java.util.function.Function;

class rCC implements Function<Entry<rCZ<?>, Comparable<?>>, String> {
   public String class_(Entry<rCZ<?>, Comparable<?>> var1) {
      if (var1 == null) {
         return "<NULL>";
      } else {
         rCZ var2 = (rCZ)var1.getKey();
         return var2.throws_() + "=" + this.class_(var2, (Comparable<?>)var1.getValue());
      }
   }

   private <T extends Comparable<T>> String class_(rCZ<T> var1, Comparable<?> var2) {
      return var1.class_((T)var2);
   }
}
