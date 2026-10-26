package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrWN {
   private static final Map<String, ev_3> id_class = new HashMap<>();

   public static ev_3 id_class(String var0) {
      ev_3 var1 = id_class.get(var0);
      if (var1 == null) {
         rqO_2 var2 = new rqO_2(var0);
         if (rVL.id_boolean.id_byte(var2)) {
            var1 = rVL.id_boolean.id_class(var2);
         }

         id_class.put(var0, var1);
      }

      return var1;
   }

   public static ev_3 id_class(rqO_2 var0) {
      return !rVL.id_boolean.id_byte(var0) ? null : rVL.id_boolean.id_class(var0);
   }
}
