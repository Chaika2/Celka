package celestial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class rrxM_2 {
   private static final List<rrJi_1> class_ = Collections.synchronizedList(new ArrayList<>());
   private static boolean break_ = false;

   protected static void class_(rrJi_1 var0) {
      if (!break_) {
         class_.add(var0);
      } else {
         var0.class_();
      }
   }

   public static void class_() {
      if (!break_) {
         for (rrJi_1 var1 : class_) {
            var1.class_();
         }

         break_ = true;
      }
   }
}
