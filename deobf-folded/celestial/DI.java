package celestial;

import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.function.Supplier;

public interface DI extends Supplier<JsonElement> {
   void id_class(rCF<?, ?> var1);

   static Dj_1 id_class() {
      return new Dj_1();
   }

   static DI id_class(DI... var0) {
      return new DV(Df_1.OR, Arrays.asList(var0));
   }
}
