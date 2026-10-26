package celestial;

import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
interface rWV {
   rWV class_ = (var0, var1) -> false;
   rWV break_ = (var0, var1) -> true;

   boolean expand(rzr_3 var1, Consumer<rWR> var2);

   default rWV class_(rWV var1) {
      Objects.requireNonNull(var1);
      return (var2, var3) -> this.expand(var2, var3) && var1.expand(var2, var3);
   }

   default rWV break_(rWV var1) {
      Objects.requireNonNull(var1);
      return (var2, var3) -> this.expand(var2, var3) || var1.expand(var2, var3);
   }
}
