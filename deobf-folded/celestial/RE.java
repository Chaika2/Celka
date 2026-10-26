package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class RE<T extends ArgumentType<?>> implements RI<T> {
   private final Supplier<T> id_class;

   public RE(Supplier<T> var1) {
      this.id_class = var1;
   }

   @Override
   public void id_class(T var1, JsonObject var2) {
   }

   @Override
   public T id_class(ruu_3 var1) {
      return this.id_class.get();
   }

   @Override
   public void id_class(T var1, ruu_3 var2) {
   }
}
