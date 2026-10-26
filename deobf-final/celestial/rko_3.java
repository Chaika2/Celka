package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;

class rko_3 implements rkR_2 {
   private final rlb_3<rdb_3> class_;

   rko_3(rlb_3<rdb_3> var1) {
      this.class_ = var1;
   }

   @Override
   public Collection<rdn_3> class_() {
      ArrayList var1 = Lists.newArrayList();

      for (rdb_3 var3 : this.class_.class_()) {
         var1.add(new rdn_3(var3));
      }

      return var1;
   }

   @Override
   public JsonObject break_() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("tag", rlZ_2.class_().break_().break_(this.class_).toString());
      return var1;
   }
}
