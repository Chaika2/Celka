package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class he_3 extends hD_2 {
   private final rlb_3<aI_2<?>> id_break;

   public he_3(rlb_3<aI_2<?>> var1) {
      this.id_break = var1;
   }

   @Override
   public boolean id_class(aI_2<?> var1) {
      return this.id_break.id_class(var1);
   }

   @Override
   public JsonElement id_class() {
      return new JsonPrimitive("#" + rlZ_2.id_class().id_protected().id_break(this.id_break));
   }
}
