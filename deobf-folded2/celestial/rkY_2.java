package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

class rkY_2 implements rkR_2 {
   private final rdn_3 id_class;

   rkY_2(rdn_3 var1) {
      this.id_class = var1;
   }

   @Override
   public Collection<rdn_3> id_class() {
      return Collections.singleton(this.id_class);
   }

   @Override
   public JsonObject id_break() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("item", rVL.id_for.id_break(this.id_class.id_break()).toString());
      return var1;
   }
}
