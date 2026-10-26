package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrWL {
   private static Map<String, Integer> id_class = new HashMap<>();

   public static boolean id_class(String var0, int var1) {
      synchronized (id_class) {
         int var3 = ((yX_2)QY.id_instanceof().id_class[8]).id_public();
         if (var3 <= 0) {
            return false;
         } else {
            Integer var4 = id_class.get(var0);
            if (var4 == null) {
               var4 = new Integer(var3);
               id_class.put(var0, var4);
            }

            int var5 = var4;
            if (var3 > var5 && var3 < var5 + var1) {
               return false;
            } else {
               id_class.put(var0, new Integer(var3));
               return true;
            }
         }
      }
   }
}
