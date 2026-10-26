package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.Optional;

class JE extends JG {
   private final String id_class;

   public JE(String var1, String var2) {
      super(var1);
      this.id_class = var2;
   }

   @Override
   protected <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> var1, rCZ<T> var2) {
      Comparable var3 = var1.id_byte(var2);
      Optional var4 = var2.id_break(this.id_class);
      return var4.isPresent() && var3.compareTo((Comparable)var4.get()) == 0;
   }

   @Override
   public JsonElement id_class() {
      return new JsonPrimitive(this.id_class);
   }
}
