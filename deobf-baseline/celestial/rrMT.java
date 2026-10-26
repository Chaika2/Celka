package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class rrMT extends VF {
   private double id_byte(Qw_1 var1) {
      return var1.id_class(this);
   }

   public rrMT(String var1) {
      this(var1, 0.0, 1.0, 0.0F);
   }

   public rrMT(String var1, double var2, double var4, double[] var6) {
      super(var1, var2, var4, var6, (Function<Qw_1, Double>)null, (BiConsumer<Qw_1, Double>)null, (BiFunction<Qw_1, VF, rgP_2>)null);
      super.rn = this::id_byte;
      super.rC = this::id_break;
      super.rl = this::id_class;
   }

   public rrMT(String var1, double var2, double var4, float var6) {
      super(var1, var2, var4, var6, (Function<Qw_1, Double>)null, (BiConsumer<Qw_1, Double>)null, (BiFunction<Qw_1, VF, rgP_2>)null);
      super.rn = this::id_byte;
      super.rC = this::id_break;
      super.rl = this::id_class;
   }

   private rgP_2 id_class(Qw_1 var1, VF var2) {
      return var1.id_break(var2);
   }

   private void id_break(Qw_1 var1, double var2) {
      var1.id_class(this, var2);
   }
}
