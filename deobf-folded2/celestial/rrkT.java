package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrkT {
   private static Map<Integer, rrzO_2> id_class = new HashMap<>();
   private static rrWd_1 id_break = new rrWd_1(1);

   public static float id_class(int var0, float var1, float var2, float var3) {
      synchronized (id_class) {
         Integer var5 = var0;
         rrzO_2 var6 = id_class.get(var5);
         if (var6 == null) {
            var6 = new rrzO_2(var1, var2, var3);
            id_class.put(var5, var6);
         }

         return var6.id_class(var1, var2, var3);
      }
   }

   public static int id_class() {
      synchronized (id_break) {
         return id_break.id_class();
      }
   }

   public static void id_break() {
      synchronized (id_class) {
         id_class.clear();
      }
   }
}
