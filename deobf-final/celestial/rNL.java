package celestial;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface rNL extends BiFunction<rdn_3, rzr_3, rdn_3>, rWo_1 {
   static Consumer<rdn_3> class_(BiFunction<rdn_3, rzr_3, rdn_3> var0, Consumer<rdn_3> var1, rzr_3 var2) {
      return var3 -> var1.accept((rdn_3)var0.apply(var3, var2));
   }

   rzx_3 break_();
}
