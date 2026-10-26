package celestial;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fp_3 implements AutoCloseable {
   private final Map<rqO_2, fJ_2> class_;

   public fp_3(Collection<fJ_2> var1) {
      this.class_ = var1.stream().collect(Collectors.toMap(fJ_2::protected_, Function.identity()));
   }

   public fj_3 class_(Ig_1 var1) {
      return this.class_.get(var1.class_()).break_(var1.break_());
   }

   public fJ_2 class_(rqO_2 var1) {
      return this.class_.get(var1);
   }

   @Override
   public void close() {
      this.class_.values().forEach(fJ_2::byte_);
      this.class_.clear();
   }
}
