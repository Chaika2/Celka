package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class rrMA extends VN {
   public rrMA(String var1) {
      super(var1, (BiConsumer<Qw_1, Integer>)null, (BiFunction<Qw_1, VN, rgP_2>)null);
      super.rF = this::id_break;
      super.rL = this::id_class;
   }

   public rgP_2 id_class(Qw_1 var1, VN var2) {
      return var1.id_break(var2);
   }

   public void id_break(Qw_1 var1, int var2) {
      var1.id_class(this, var2);
   }
}
