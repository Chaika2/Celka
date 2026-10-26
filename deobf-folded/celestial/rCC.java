package celestial;

import java.util.Map.Entry;
import java.util.function.Function;

class rCC implements Function<Entry<rCZ<?>, Comparable<?>>, String> {
   public String id_class(Entry<rCZ<?>, Comparable<?>> var1) {
      if (var1 == null) {
         return "<NULL>";
      } else {
         rCZ var2 = (rCZ)var1.getKey();
         return var2.id_throws() + "=" + this.id_class(var2, (Comparable<?>)var1.getValue());
      }
   }

   private <T extends Comparable<T>> String id_class(rCZ<T> var1, Comparable<?> var2) {
      return var1.id_class((T)var2);
   }
}
