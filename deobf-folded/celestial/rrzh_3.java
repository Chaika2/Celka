package celestial;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class rrzh_3 {
   private static final Map<String, Object> id_class = Collections.synchronizedMap(new HashMap<>());

   public static long id_class(String var0, long var1, long var3) {
      long var5 = id_class(var0, var3);
      Long var7 = var1;
      id_class.put(var0, var7);
      return var5;
   }

   public static boolean id_class(String var0) {
      return id_class.containsKey(var0);
   }

   public static int id_class(String var0, int var1) {
      return !(id_class.get(var0) instanceof Integer var3) ? var1 : var3;
   }

   public static long id_class(String var0, long var1) {
      return !(id_class.get(var0) instanceof Long var4) ? var1 : var4;
   }

   public static void id_class(String var0, Object var1) {
      id_class.put(var0, var1);
   }

   public static int id_break(String var0, int var1) {
      int var2 = id_class(var0, 0);
      Integer var3 = var1;
      id_class.put(var0, var3);
      return var2;
   }

   public static long id_break(String var0, long var1, long var3) {
      long var5 = id_class(var0, var3);
      var5 += var1;
      id_break(var0, var5);
      return var5;
   }

   public static void id_break(String var0, long var1) {
      Long var3 = var1;
      id_class.put(var0, var3);
   }

   public static Object id_break(String var0) {
      return id_class.get(var0);
   }
}
