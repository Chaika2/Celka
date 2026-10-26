package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;

public interface rzp_3<T> {
   JsonElement class_(T var1, JsonSerializationContext var2);

   T class_(JsonElement var1, JsonDeserializationContext var2);
}
