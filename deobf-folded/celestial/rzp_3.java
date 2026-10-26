package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

public interface rzp_3<T> {
   JsonElement id_class(T var1, JsonSerializationContext var2);

   T id_class(JsonElement var1, JsonDeserializationContext var2);
}
