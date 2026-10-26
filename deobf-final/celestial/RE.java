package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import java.util.function.Supplier;

public class RE<T extends ArgumentType<?>> implements RI<T> {
   private final Supplier<T> class_;

   public RE(Supplier<T> var1) {
      this.class_ = var1;
   }

   @Override
   public void class_(T var1, JsonObject var2) {
   }

   @Override
   public T class_(ruu_3 var1) {
      return this.class_.get();
   }

   @Override
   public void class_(T var1, ruu_3 var2) {
   }
}
