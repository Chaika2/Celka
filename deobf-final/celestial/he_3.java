package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class he_3 extends hD_2 {
   private final rlb_3<aI_2<?>> break_;

   public he_3(rlb_3<aI_2<?>> var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_(aI_2<?> var1) {
      return this.break_.class_(var1);
   }

   @Override
   public JsonElement class_() {
      return new JsonPrimitive("#" + rlZ_2.class_().protected_().break_(this.break_));
   }
}
