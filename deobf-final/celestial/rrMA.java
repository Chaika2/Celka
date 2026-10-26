package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class rrMA extends VN {
   public rrMA(String var1) {
      super(var1, (BiConsumer<Qw_1, Integer>)null, (BiFunction<Qw_1, VN, rgP_2>)null);
      super.rF = this::break_;
      super.rL = this::class_;
   }

   public rgP_2 class_(Qw_1 var1, VN var2) {
      return var1.break_(var2);
   }

   public void break_(Qw_1 var1, int var2) {
      var1.class_(this, var2);
   }
}
