package celestial;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class rrWu_1 {
   private static final Map<aI_2, Integer> id_class = new HashMap<>();
   private static final Map<String, Integer> id_break = new HashMap<>();
   private static final Map<String, Integer> id_byte = new HashMap<>();

   static {
      for (aI_2 var1 : rVL.id_transient) {
         int var2 = rVL.id_transient.id_class(var1);
         rqO_2 var3 = rVL.id_transient.id_break(var1);
         String var4 = var3.toString();
         String var5 = var3.id_break();
         if (id_class.containsKey(var1)) {
            rrbb_3.id_protected("Duplicate entity type: " + var1 + ", id1: " + id_class.get(var1) + ", id2: " + var2);
         }

         if (id_break.containsKey(var4)) {
            rrbb_3.id_protected("Duplicate entity location: " + var4 + ", id1: " + id_break.get(var4) + ", id2: " + var2);
         }

         if (id_byte.containsKey(var4)) {
            rrbb_3.id_protected("Duplicate entity name: " + var5 + ", id1: " + id_byte.get(var5) + ", id2: " + var2);
         }

         id_class.put(var1, var2);
         id_break.put(var4, var2);
         id_byte.put(var5, var2);
      }
   }

   public static int id_class(String var0) {
      Integer var1 = id_break.get(var0);
      return var1 == null ? -1 : var1;
   }

   public static int id_class(an_3 var0) {
      return var0 == null ? -1 : id_class(var0.BC());
   }

   public static int id_class(aI_2 var0) {
      Integer var1 = id_class.get(var0);
      return var1 == null ? -1 : var1;
   }

   public static int id_break(String var0) {
      var0 = var0.toLowerCase(Locale.ROOT);
      Integer var1 = id_byte.get(var0);
      return var1 == null ? -1 : var1;
   }
}
