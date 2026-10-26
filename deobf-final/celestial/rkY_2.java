package celestial;

import com.google.gson.JsonObject;
import java.util.Collection;
import java.util.Collections;

class rkY_2 implements rkR_2 {
   private final rdn_3 class_;

   rkY_2(rdn_3 var1) {
      this.class_ = var1;
   }

   @Override
   public Collection<rdn_3> class_() {
      return Collections.singleton(this.class_);
   }

   @Override
   public JsonObject break_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("item", rVL.for_.break_(this.class_.break_()).toString());
      return var1;
   }
}
