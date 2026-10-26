package celestial;

import java.util.List;
import java.util.function.Function;

public enum rAT {
   TOP,
   BOTTOM;

   public <T> int class_(List<T> var1, T var2, Function<T, rAp_1> var3, boolean var4) {
      rAT var5 = var4 ? this.class_() : this;
      if (var5 == BOTTOM) {
         int var8;
         for (var8 = 0; var8 < var1.size(); var8++) {
            rAp_1 var9 = (rAp_1)var3.apply(var1.get(var8));
            if (!var9.catch_() || var9.private_() != this) {
               break;
            }
         }

         var1.add(var8, var2);
         return var8;
      } else {
         int var6;
         for (var6 = var1.size() - 1; var6 >= 0; var6--) {
            rAp_1 var7 = (rAp_1)var3.apply(var1.get(var6));
            if (!var7.catch_() || var7.private_() != this) {
               break;
            }
         }

         var1.add(var6 + 1, var2);
         return var6 + 1;
      }
   }

   public rAT class_() {
      return this == TOP ? BOTTOM : TOP;
   }
}
