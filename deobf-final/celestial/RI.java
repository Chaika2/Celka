package celestial;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public interface RI<T extends ArgumentType<?>> {
   void class_(T var1, ruu_3 var2);

   T class_(ruu_3 var1);

   void class_(T var1, JsonObject var2);
}
