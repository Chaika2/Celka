package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class ha_3 extends hD_2 {
   private final aI_2<?> break_;

   public ha_3(aI_2<?> var1) {
      this.break_ = var1;
   }

   @Override
   public boolean class_(aI_2<?> var1) {
      return this.break_ == var1;
   }

   @Override
   public JsonElement class_() {
      return new JsonPrimitive(rVL.transient_.break_(this.break_).toString());
   }
}
