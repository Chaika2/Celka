package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class DV implements DI {
   private final Df_1 id_class;
   private final List<DI> id_break;

   DV(Df_1 var1, List<DI> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public void id_class(rCF<?, ?> var1) {
      this.id_break.forEach(var1x -> var1x.id_class(var1));
   }

   public JsonElement id_break() {
      JsonArray var1 = new JsonArray();
      this.id_break.stream().map(Supplier::get).forEach(var1::add);
      JsonObject var2 = new JsonObject();
      var2.add(this.id_class.field_240094_c_, var1);
      return var2;
   }
}
