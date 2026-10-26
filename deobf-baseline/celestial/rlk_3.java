package celestial;

import com.google.gson.JsonArray;
import java.util.function.Consumer;
import java.util.function.Function;

public class rlk_3 implements rlh_3 {
   private final rqO_2 id_class;

   public rlk_3(rqO_2 var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "#" + this.id_class;
   }

   @Override
   public <T> boolean id_class(Function<rqO_2, rlb_3<T>> var1, Function<rqO_2, T> var2, Consumer<T> var3) {
      rlb_3 var4 = (rlb_3)var1.apply(this.id_class);
      if (var4 == null) {
         return false;
      } else {
         var4.id_class().forEach(var3);
         return true;
      }
   }

   @Override
   public void id_class(JsonArray var1) {
      var1.add("#" + this.id_class);
   }
}
