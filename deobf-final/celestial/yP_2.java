package celestial;

import it.unimi.dsi.fastutil.Hash.Strategy;
import java.util.Objects;

enum yP_2 implements Strategy<yr_3> {
   INSTANCE;

   public boolean class_(yr_3 var1, yr_3 var2) {
      if (var1 == var2) {
         return true;
      } else {
         return var1 != null && var2 != null ? Objects.equals(var1.G, var2.G) : false;
      }
   }

   public int class_(yr_3 var1) {
      return var1 == null ? 0 : var1.b;
   }
}
