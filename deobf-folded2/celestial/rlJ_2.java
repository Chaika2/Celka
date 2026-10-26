package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlJ_2 implements rlh_3 {
   private final rqO_2 id_class;

   public rlJ_2(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return this.id_class.toString() + "?";
   }

   @Override
   public <T> boolean id_class(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2, Consumer<T> var3) {
      Object var4 = var2.apply(this.id_class);
      if (var4 != null) {
         var3.accept(var4);
      }

      return true;
   }

   @Override
   public void id_class(JsonArray var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", this.id_class.toString());
      var2.addProperty("required", false);
      var1.add(var2);
   }
}
