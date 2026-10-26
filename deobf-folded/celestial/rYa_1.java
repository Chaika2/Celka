package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class rYa_1 {
   static final Map<rqO_2, rYa_1> id_break = Maps.newHashMap();
   public static final rYa_1 id_class = new rYa_1(
      new rqO_2("nether"),
      (var0, var1, var2) -> new rYD(
            var2,
            ImmutableList.of(
               Pair.of(new rYM(0.0F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.id_byte(rYl_1.id_implements)),
               Pair.of(new rYM(0.0F, -0.5F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.id_byte(rYl_1.C)),
               Pair.of(new rYM(0.4F, 0.0F, 0.0F, 0.0F, 0.0F), (Supplier<rYG>)() -> var1.id_byte(rYl_1.l)),
               Pair.of(new rYM(0.0F, 0.5F, 0.0F, 0.0F, 0.375F), (Supplier<rYG>)() -> var1.id_byte(rYl_1.H)),
               Pair.of(new rYM(-0.5F, 0.0F, 0.0F, 0.0F, 0.175F), (Supplier<rYG>)() -> var1.id_byte(rYl_1.y))
            ),
            Optional.of(Pair.of(var1, var0))
         )
   );
   final rqO_2 id_byte;
   private final Function3<rYa_1, rVL<rYG>, Long, rYD> id_protected;

   public rYa_1(rqO_2 var1, Function3<rYa_1, rVL<rYG>, Long, rYD> var2) {
      this.id_byte = var1;
      this.id_protected = var2;
      id_break.put(var1, this);
   }

   public rYD id_class(rVL<rYG> var1, long var2) {
      return (rYD)this.id_protected.apply(this, var1, var2);
   }
}
