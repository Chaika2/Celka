package celestial;

import com.google.gson.JsonElement;
import java.util.Arrays;
import java.util.function.Supplier;

public interface DI extends Supplier<JsonElement> {
   void class_(rCF<?, ?> var1);

   static Dj_1 class_() {
      return new Dj_1();
   }

   static DI class_(DI... var0) {
      return new DV(Df_1.OR, Arrays.asList(var0));
   }
}
