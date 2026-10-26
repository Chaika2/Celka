package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface RI<T extends ArgumentType<?>> {
   void id_class(T var1, ruu_3 var2);

   T id_class(ruu_3 var1);

   void id_class(T var1, JsonObject var2);
}
