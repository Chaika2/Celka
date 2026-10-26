package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Vv_1 extends VF {
   @Override
   public double byte_(double var1) {
      return this.rL * Math.pow(Math.E, Math.log(this.rA / this.rL) * var1);
   }

   public Vv_1(String var1, double var2, double var4, float var6, Function<Qw_1, Double> var7, BiConsumer<Qw_1, Double> var8, BiFunction<Qw_1, VF, rgP_2> var9) {
      super(var1, var2, var4, var6, var7, var8, var9);
   }

   @Override
   public double break_(double var1) {
      return Math.log(var1 / this.rL) / Math.log(this.rA / this.rL);
   }
}
