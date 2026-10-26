package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

enum ou_3 {
   POINTS("points", rhd_3::id_this, (var0, var1) -> {
      if (var1 >= var0.sn()) {
         return false;
      } else {
         var0.id_class(var1);
         return true;
      }
   }, var0 -> rfU_2.id_protected((Float)var0.id_implements[21] * (float)var0.sn())),
   LEVELS("levels", rhN_2::id_super, (var0, var1) -> {
      var0.id_else(var1);
      return true;
   }, var0 -> (Integer)var0.id_implements[19]);

   public final BiConsumer<rhN_2, Integer> xpAdder;
   public final BiPredicate<rhN_2, Integer> xpSetter;
   public final String name;
   final ToIntFunction<rhN_2> xpGetter;

   private ou_3(String var3, BiConsumer<rhN_2, Integer> var4, BiPredicate<rhN_2, Integer> var5, ToIntFunction<rhN_2> var6) {
      this.xpAdder = var4;
      this.name = var3;
      this.xpSetter = var5;
      this.xpGetter = var6;
   }
}
