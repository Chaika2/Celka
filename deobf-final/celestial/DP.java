package celestial;

import com.google.gson.JsonElement;
import java.util.function.Function;

public class DP<T> {
   final String class_;
   final Function<T, JsonElement> break_;

   public DP(String var1, Function<T, JsonElement> var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public String toString() {
      return this.class_;
   }

   public DP<T>.celestial/DB class_(T var1) {
      return new DB((T)this, var1);
   }
}
