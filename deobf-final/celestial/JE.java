package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

class JE extends JG {
   private final String class_;

   public JE(String var1, String var2) {
      super(var1);
      this.class_ = var2;
   }

   @Override
   protected <T extends Comparable<T>> boolean class_(rCn_1<?, ?> var1, rCZ<T> var2) {
      Comparable var3 = var1.byte_(var2);
      Optional var4 = var2.break_(this.class_);
      return var4.isPresent() && var3.compareTo((Comparable)var4.get()) == 0;
   }

   @Override
   public JsonElement class_() {
      return new JsonPrimitive(this.class_);
   }
}
