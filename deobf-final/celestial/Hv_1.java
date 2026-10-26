package celestial;

import java.util.Map;
import java.util.stream.Collectors;

public class Hv_1 {
   private final Map<HU, lD_2> class_ = HU.public_().stream().collect(Collectors.toMap(var0 -> (HU)var0, var0 -> new lD_2(var0.goto_())));

   public void class_() {
      this.class_.values().forEach(lD_2::native_);
   }

   public lD_2 class_(HU var1) {
      return this.class_.get(var1);
   }

   public void break_() {
      this.class_.values().forEach(lD_2::volatile_);
   }
}
