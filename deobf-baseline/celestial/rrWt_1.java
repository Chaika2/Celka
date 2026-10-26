package celestial;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class rrWt_1 {
   private static Deque<rrWI<Object>> id_class = new ArrayDeque<>();

   static {
      for (int var0 = 0; var0 < 1000; var0++) {
         rrWw_1 var1 = new rrWw_1();
         id_class.add(var1);
      }
   }

   public static Iterator<Object> id_class(List var0) {
      synchronized (id_class) {
         Object var2 = id_class.pollFirst();
         if (var2 == null) {
            var2 = new rrWw_1();
         }

         ((rrWI)var2).id_class(var0);
         return (Iterator<Object>)var2;
      }
   }

   static void id_class(rrWI<Object> var0) {
      synchronized (id_class) {
         if (id_class.size() <= 1000) {
            var0.id_class((List)null);
            id_class.addLast(var0);
         }
      }
   }
}
