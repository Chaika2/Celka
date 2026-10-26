package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class rYa_1 {
   static final Map<rqO_2, rYa_1> break_ = Maps.newHashMap();
   public static final rYa_1 class_ = new rYa_1(
      new rqO_2("nether"),
      (var0, var1, var2) -> new rYD(
            var2,
            ImmutableList.of(
               Pair.of(new rYM(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.byte_(rYl_1.implements_)),
               Pair.of(new rYM(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.byte_(rYl_1.C)),
               Pair.of(new rYM(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.byte_(rYl_1.l)),
               Pair.of(new rYM(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), (Supplier<rYG>)() -> var1.byte_(rYl_1.H)),
               Pair.of(new rYM(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), (Supplier<rYG>)() -> var1.byte_(rYl_1.y))
            ),
            Optional.of(Pair.of(var1, var0))
         )
   );
   final rqO_2 byte_;
   private final Function3<rYa_1, rVL<rYG>, Long, rYD> protected_;

   public rYa_1(rqO_2 var1, Function3<rYa_1, rVL<rYG>, Long, rYD> var2) {
      this.byte_ = var1;
      this.protected_ = var2;
      break_.put(var1, this);
   }

   public rYD class_(rVL<rYG> var1, long var2) {
      return (rYD)this.protected_.apply(this, var1, var2);
   }
}
