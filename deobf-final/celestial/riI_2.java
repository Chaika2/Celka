package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum riI_2 {
   ON_LAND_SURFACE("on_land_surface"),
   PARTLY_BURIED("partly_buried"),
   ON_OCEAN_FLOOR("on_ocean_floor"),
   IN_MOUNTAIN("in_mountain"),
   UNDERGROUND("underground"),
   IN_NETHER("in_nether");

   private static final Map<String, riI_2> field_237038_g_ = Arrays.stream(values()).collect(Collectors.toMap(riI_2::class_, var0 -> (riI_2)var0));
   private final String field_237039_h_;

   private riI_2(String var3) {
      this.field_237039_h_ = var3;
   }

   public static riI_2 class_(String var0) {
      return field_237038_g_.get(var0);
   }

   public String class_() {
      return this.field_237039_h_;
   }
}
