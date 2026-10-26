package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlx_3 implements rlh_3 {
   private final rqO_2 id_class;

   public rlx_3(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "#" + this.id_class + "?";
   }

   @Override
   public <T> boolean id_class(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2, Consumer<T> var3) {
      rlb_3 var4 = (rlb_3)var1.apply(this.id_class);
      if (var4 != null) {
         var4.id_class().forEach(var3);
      }

      return true;
   }

   @Override
   public void id_class(JsonArray var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("id", "#" + this.id_class);
      var2.addProperty("required", false);
      var1.add(var2);
   }
}
