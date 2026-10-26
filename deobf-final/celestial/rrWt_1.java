package celestial;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class rrWt_1 {
   private static Deque<rrWI<Object>> class_ = new ArrayDeque<>();

   static {
      for (int var0 = 0; var0 < 1000; var0++) {
         rrWw_1 var1 = new rrWw_1();
         class_.add(var1);
      }
   }

   public static Iterator<Object> class_(List var0) {
      synchronized (class_) {
         Object var2 = class_.pollFirst();
         if (var2 == null) {
            var2 = new rrWw_1();
         }

         ((rrWI)var2).class_(var0);
         return (Iterator<Object>)var2;
      }
   }

   static void class_(rrWI<Object> var0) {
      synchronized (class_) {
         if (class_.size() <= 1000) {
            var0.class_((List)null);
            class_.addLast(var0);
         }
      }
   }
}
