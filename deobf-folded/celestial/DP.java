package celestial;

import com.google.gson.JsonElement;
import java.util.function.Function;

public class DP<T> {
   final String id_class;
   final Function<T, JsonElement> id_break;

   public DP(String var1, Function<T, JsonElement> var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   public DP<T>.celestial/DB id_class(T var1) {
      return new DB((T)this, var1);
   }
}
