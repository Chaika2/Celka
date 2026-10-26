package celestial;

import java.util.HashSet;
import java.util.Set;

public class rrWZ {
   private static Set<String> class_ = new HashSet<>();

   public static boolean byte_(String var0) {
      synchronized (class_) {
         return class_.contains(var0);
      }
   }

   public static void class_(String var0) {
      synchronized (class_) {
         class_.add(var0);
      }
   }

   public static boolean break_(String var0) {
      synchronized (class_) {
         return class_.remove(var0);
      }
   }

   public static boolean protected_(String var0) {
      return break_(var0);
   }
}
