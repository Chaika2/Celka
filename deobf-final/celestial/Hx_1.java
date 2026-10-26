package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public interface Hx_1 {
   default void class_() {
   }

   static Hd_1 class_(Map<HU, lD_2> var0, lD_2 var1) {
      return new Hd_1(var1, var0);
   }

   static Hd_1 class_(lD_2 var0) {
      return class_(ImmutableMap.of(), var0);
   }

   Ok_1 getBuffer(HU var1);
}
