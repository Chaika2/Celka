package celestial;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class rrzh_3 {
   private static final Map<String, Object> class_ = Collections.synchronizedMap(new HashMap<>());

   public static long class_(String var0, long var1, long var3) {
      long var5 = class_(var0, var3);
      Long var7 = var1;
      class_.put(var0, var7);
      return var5;
   }

   public static boolean class_(String var0) {
      return class_.containsKey(var0);
   }

   public static int class_(String var0, int var1) {
      return !(class_.get(var0) instanceof Integer var3) ? var1 : var3;
   }

   public static long class_(String var0, long var1) {
      return !(class_.get(var0) instanceof Long var4) ? var1 : var4;
   }

   public static void class_(String var0, Object var1) {
      class_.put(var0, var1);
   }

   public static int break_(String var0, int var1) {
      int var2 = class_(var0, 0);
      Integer var3 = var1;
      class_.put(var0, var3);
      return var2;
   }

   public static long break_(String var0, long var1, long var3) {
      long var5 = class_(var0, var3);
      var5 += var1;
      break_(var0, var5);
      return var5;
   }

   public static void break_(String var0, long var1) {
      Long var3 = var1;
      class_.put(var0, var3);
   }

   public static Object break_(String var0) {
      return class_.get(var0);
   }
}
