package celestial;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;

public class rrbo_3 {
   private static boolean id_class = false;
   private static long id_break = -1L;
   private static Int2ObjectOpenHashMap<rrbK_2> id_byte = new Int2ObjectOpenHashMap();
   private static final long id_protected = 3000L;
   private static final int id_throws = 10;

   public static void id_class() {
      id_class = true;
      if (!id_byte.isEmpty()) {
         if (id_break < 0L) {
            id_break = System.currentTimeMillis();
         }

         if (System.currentTimeMillis() > id_break + 3000L) {
            ObjectIterator var0 = id_byte.values().iterator();

            while (var0.hasNext()) {
               rrbK_2 var1 = (rrbK_2)var0.next();
               var1.id_class();
            }

            id_break = System.currentTimeMillis();
         }
      }
   }

   public static boolean id_class(int var0) {
      if (!id_class) {
         return true;
      } else {
         rrbK_2 var1 = id_break(var0);
         return var1.id_break();
      }
   }

   private static rrbK_2 id_break(int var0) {
      rrbK_2 var1 = (rrbK_2)id_byte.get(var0);
      if (var1 == null) {
         var1 = new rrbK_2(var0);
         id_byte.put(var0, var1);
      }

      return var1;
   }
}
