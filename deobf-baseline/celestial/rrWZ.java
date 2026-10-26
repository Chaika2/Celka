package celestial;

import java.util.HashSet;
import java.util.Set;

public class rrWZ {
   private static Set<String> id_class = new HashSet<>();

   public static boolean id_byte(String var0) {
      synchronized (id_class) {
         return id_class.contains(var0);
      }
   }

   public static void id_class(String var0) {
      synchronized (id_class) {
         id_class.add(var0);
      }
   }

   public static boolean id_break(String var0) {
      synchronized (id_class) {
         return id_class.remove(var0);
      }
   }

   public static boolean id_protected(String var0) {
      return id_break(var0);
   }
}
