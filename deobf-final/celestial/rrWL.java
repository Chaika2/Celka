package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrWL {
   private static Map<String, Integer> class_ = new HashMap<>();

   public static boolean class_(String var0, int var1) {
      synchronized (class_) {
         int var3 = ((yX_2)QY.instanceof_().class_[8]).public_();
         if (var3 <= 0) {
            return false;
         } else {
            Integer var4 = class_.get(var0);
            if (var4 == null) {
               var4 = new Integer(var3);
               class_.put(var0, var4);
            }

            int var5 = var4;
            if (var3 > var5 && var3 < var5 + var1) {
               return false;
            } else {
               class_.put(var0, new Integer(var3));
               return true;
            }
         }
      }
   }
}
