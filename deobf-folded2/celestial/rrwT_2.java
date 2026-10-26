package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class rrwT_2 implements JsonDeserializer<LocalDateTime> {
   rrwT_2() {
   }

   public LocalDateTime id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      try {
         return LocalDateTime.parse(var1.getAsString(), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
      } catch (Exception var5) {
         throw new JsonParseException("Error parsing LocalDateTime: " + var1.getAsString(), var5);
      }
   }
}
