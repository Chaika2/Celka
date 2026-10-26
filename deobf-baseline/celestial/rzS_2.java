package celestial;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

public class rzS_2 extends TypeAdapter<rzB_2> {
   public rzB_2 id_class(JsonReader var1) throws IOException {
      return rzB_2.id_class(var1.nextString());
   }

   public void id_class(JsonWriter var1, rzB_2 var2) throws IOException {
      var1.value(var2.targetType);
   }
}
