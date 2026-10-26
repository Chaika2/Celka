package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrzQ_2 {
   private static Map<String, Long> id_class = new HashMap<>();

   public static boolean id_class(String var0, long var1) {
      synchronized (id_class) {
         long var4 = System.currentTimeMillis();
         Long var6 = id_class.get(var0);
         if (var6 == null) {
            var6 = new Long(var4);
            id_class.put(var0, var6);
         }

         long var7 = var6;
         if (var4 < var7 + var1) {
            return false;
         } else {
            id_class.put(var0, new Long(var4));
            return true;
         }
      }
   }
}
