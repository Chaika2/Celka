package celestial;

import java.util.HashMap;
import java.util.Map;

public class rrkT {
   private static Map<Integer, rrzO_2> class_ = new HashMap<>();
   private static rrWd_1 break_ = new rrWd_1(1);

   public static float class_(int var0, float var1, float var2, float var3) {
      synchronized (class_) {
         Integer var5 = var0;
         rrzO_2 var6 = class_.get(var5);
         if (var6 == null) {
            var6 = new rrzO_2(var1, var2, var3);
            class_.put(var5, var6);
         }

         return var6.class_(var1, var2, var3);
      }
   }

   public static int class_() {
      synchronized (break_) {
         return break_.class_();
      }
   }

   public static void break_() {
      synchronized (class_) {
         class_.clear();
      }
   }
}
