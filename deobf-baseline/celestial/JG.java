package celestial;

import com.google.gson.JsonElement;
import java.util.function.Consumer;

abstract class JG {
   private final String id_class;

   public JG(String var1) {
      this.id_class = var1;
   }

   public void id_class(rCF<?, ?> var1, Consumer<String> var2) {
      rCZ var3 = var1.id_class(this.id_class);
      if (var3 == null) {
         var2.accept(this.id_class);
      }
   }

   public abstract JsonElement id_class();

   protected abstract <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> var1, rCZ<T> var2);

   public <S extends rCn_1<?, S>> boolean id_class(rCF<?, S> var1, S var2) {
      rCZ var3 = var1.id_class(this.id_class);
      return var3 == null ? false : this.id_class(var2, var3);
   }

   public String id_break() {
      return this.id_class;
   }
}
