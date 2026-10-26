package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class rrbo_3 {
   private static boolean class_ = false;
   private static long break_ = -1L;
   private static Int2ObjectOpenHashMap<rrbK_2> byte_ = new Int2ObjectOpenHashMap();
   private static final long protected_ = 3000L;
   private static final int throws_ = 10;

   public static void class_() {
      class_ = true;
      if (!byte_.isEmpty()) {
         if (break_ < 0L) {
            break_ = System.currentTimeMillis();
         }

         if (System.currentTimeMillis() > break_ + 3000L) {
            ObjectIterator var0 = byte_.values().iterator();

            while (var0.hasNext()) {
               rrbK_2 var1 = (rrbK_2)var0.next();
               var1.class_();
            }

            break_ = System.currentTimeMillis();
         }
      }
   }

   public static boolean class_(int var0) {
      if (!class_) {
         return true;
      } else {
         rrbK_2 var1 = break_(var0);
         return var1.break_();
      }
   }

   private static rrbK_2 break_(int var0) {
      rrbK_2 var1 = (rrbK_2)byte_.get(var0);
      if (var1 == null) {
         var1 = new rrbK_2(var0);
         byte_.put(var0, var1);
      }

      return var1;
   }
}
