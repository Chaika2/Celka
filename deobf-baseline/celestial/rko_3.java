package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;

class rko_3 implements rkR_2 {
   private final rlb_3<rdb_3> id_class;

   rko_3(rlb_3<rdb_3> var1) {
      this.id_class = var1;
   }

   @Override
   public Collection<rdn_3> id_class() {
      ArrayList var1 = Lists.newArrayList();

      for (rdb_3 var3 : this.id_class.id_class()) {
         var1.add(new rdn_3(var3));
      }

      return var1;
   }

   @Override
   public JsonObject id_break() {
      JsonObject var1 = new JsonObject();
      var1.addProperty("tag", rlZ_2.id_class().id_break().id_break(this.id_class).toString());
      return var1;
   }
}
