package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public interface Hx_1 {
   default void id_class() {
   }

   static Hd_1 id_class(Map<HU, lD_2> var0, lD_2 var1) {
      return new Hd_1(var1, var0);
   }

   static Hd_1 id_class(lD_2 var0) {
      return id_class(ImmutableMap.of(), var0);
   }

   Ok_1 getBuffer(HU var1);
}
