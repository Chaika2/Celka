package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class XV implements XY {
   private final boolean id_class;

   public XV(boolean var1) {
      this.id_class = var1;
   }

   @Override
   public JsonElement id_class() {
      return new JsonPrimitive(this.id_class);
   }

   public boolean id_class(Oj_1 var1) {
      return var1.id_class() == this.id_class;
   }
}
