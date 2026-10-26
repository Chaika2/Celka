package celestial;

import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.ToIntFunction;

enum ou_3 {
   POINTS("points", rhd_3::this_, (var0, var1) -> {
      if (var1 >= var0.sn()) {
         return false;
      } else {
         var0.class_(var1);
         return true;
      }
   }, var0 -> rfU_2.protected_((Float)var0.implements_[21] * (float)var0.sn())),
   LEVELS("levels", rhN_2::super_, (var0, var1) -> {
      var0.else_(var1);
      return true;
   }, var0 -> (Integer)var0.implements_[19]);

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
