package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrzQ_2 {
   private static Map<String, Long> class_ = new HashMap<>();

   public static boolean class_(String var0, long var1) {
      synchronized (class_) {
         long var4 = System.currentTimeMillis();
         Long var6 = class_.get(var0);
         if (var6 == null) {
            var6 = new Long(var4);
            class_.put(var0, var6);
         }

         long var7 = var6;
         if (var4 < var7 + var1) {
            return false;
         } else {
            class_.put(var0, new Long(var4));
            return true;
         }
      }
   }
}
