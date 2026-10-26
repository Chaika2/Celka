package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class ha_3 extends hD_2 {
   private final aI_2<?> id_break;

   public ha_3(aI_2<?> var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class(aI_2<?> var1) {
      return this.id_break == var1;
   }

   @Override
   public JsonElement id_class() {
      return new JsonPrimitive(rVL.id_transient.id_break(this.id_break).toString());
   }
}
