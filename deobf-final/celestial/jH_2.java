package celestial;

import java.util.UUID;

public class jH_2 {
   private static final rqO_2 class_ = new rqO_2("textures/entity/steve.png");
   private static final rqO_2 break_ = new rqO_2("textures/entity/alex.png");

   private static boolean byte_(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }

   public static rqO_2 class_(UUID var0) {
      return byte_(var0) ? break_ : class_;
   }

   public static rqO_2 class_() {
      return class_;
   }

   public static String break_(UUID var0) {
      return byte_(var0) ? "slim" : "default";
   }
}
