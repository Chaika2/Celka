package celestial;

import java.util.UUID;

public class jH_2 {
   private static final rqO_2 id_class = new rqO_2("textures/entity/steve.png");
   private static final rqO_2 id_break = new rqO_2("textures/entity/alex.png");

   private static boolean id_byte(UUID var0) {
      return (var0.hashCode() & 1) == 1;
   }

   public static rqO_2 id_class(UUID var0) {
      return id_byte(var0) ? id_break : id_class;
   }

   public static rqO_2 id_class() {
      return id_class;
   }

   public static String id_break(UUID var0) {
      return id_byte(var0) ? "slim" : "default";
   }
}
