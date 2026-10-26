package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.BiFunction;

public enum Rm_1 {
   FEET("feet", (var0, var1) -> var0),
   EYES("eyes", (var0, var1) -> new rjU_2(var0.break_, var0.byte_ + (double)var1.Bx(), var0.protected_));

   static final Map<String, Rm_1> BY_NAME = rqR_2.class_(Maps.newHashMap(), var0 -> {
      for (Rm_1 var4 : values()) {
         var0.put(var4.name, var4);
      }
   });
   private final String name;
   private final BiFunction<rjU_2, an_3, rjU_2> offsetFunc;

   private Rm_1(String var3, BiFunction<rjU_2, an_3, rjU_2> var4) {
      this.name = var3;
      this.offsetFunc = var4;
   }

   public rjU_2 class_(gy_3 var1) {
      an_3 var2 = var1.package_();
      return var2 == null ? var1.volatile_() : this.offsetFunc.apply(var1.volatile_(), var2);
   }

   public static Rm_1 class_(String var0) {
      return BY_NAME.get(var0);
   }

   public rjU_2 class_(an_3 var1) {
      return this.offsetFunc.apply(var1.Ps(), var1);
   }
}
