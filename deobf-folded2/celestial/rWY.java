package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;

public interface rWY<T> {
   void id_class(JsonObject var1, T var2, JsonSerializationContext var3);

   T id_class(JsonObject var1, JsonDeserializationContext var2);
}
