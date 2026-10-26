package celestial;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fp_3 implements AutoCloseable {
   private final Map<rqO_2, fJ_2> id_class;

   public fp_3(Collection<fJ_2> var1) {
      this.id_class = var1.stream().collect(Collectors.toMap(fJ_2::id_protected, Function.identity()));
   }

   public fj_3 id_class(Ig_1 var1) {
      return this.id_class.get(var1.id_class()).id_break(var1.id_break());
   }

   public fJ_2 id_class(rqO_2 var1) {
      return this.id_class.get(var1);
   }

   @Override
   public void close() {
      this.id_class.values().forEach(fJ_2::id_byte);
      this.id_class.clear();
   }
}
