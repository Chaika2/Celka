package celestial;

import java.util.Map;
import java.util.stream.Collectors;

public class Hv_1 {
   private final Map<HU, lD_2> id_class = HU.id_public().stream().collect(Collectors.toMap(var0 -> (HU)var0, var0 -> new lD_2(var0.id_goto())));

   public void id_class() {
      this.id_class.values().forEach(lD_2::id_native);
   }

   public lD_2 id_class(HU var1) {
      return this.id_class.get(var1);
   }

   public void id_break() {
      this.id_class.values().forEach(lD_2::id_volatile);
   }
}
