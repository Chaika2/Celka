package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;

class XV implements XY {
   private final boolean class_;

   public XV(boolean var1) {
      this.class_ = var1;
   }

   @Override
   public JsonElement class_() {
      return new JsonPrimitive(this.class_);
   }

   public boolean class_(Oj_1 var1) {
      return var1.class_() == this.class_;
   }
}
