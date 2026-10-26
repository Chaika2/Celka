package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrWN {
   private static final Map<String, ev_3> class_ = new HashMap<>();

   public static ev_3 class_(String var0) {
      ev_3 var1 = class_.get(var0);
      if (var1 == null) {
         rqO_2 var2 = new rqO_2(var0);
         if (rVL.boolean_.byte_(var2)) {
            var1 = rVL.boolean_.class_(var2);
         }

         class_.put(var0, var1);
      }

      return var1;
   }

   public static ev_3 class_(rqO_2 var0) {
      return !rVL.boolean_.byte_(var0) ? null : rVL.boolean_.class_(var0);
   }
}
