package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.function.Supplier;

public class DV implements DI {
   private final Df_1 class_;
   private final List<DI> break_;

   DV(Df_1 var1, List<DI> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public void class_(rCF<?, ?> var1) {
      this.break_.forEach(var1x -> var1x.class_(var1));
   }

   public JsonElement break_() {
      JsonArray var1 = new JsonArray();
      this.break_.stream().map(Supplier::get).forEach(var1::add);
      JsonObject var2 = new JsonObject();
      var2.add(this.class_.field_240094_c_, var1);
      return var2;
   }
}
