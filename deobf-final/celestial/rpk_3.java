package celestial;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Map;

class rpk_3 extends TypeAdapter<T> {
   rpk_3(rpd_3 var1, Map var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   public void write(JsonWriter var1, T var2) throws IOException {
      if (var2 == null) {
         var1.nullValue();
      } else {
         var1.value(this.break_.class_(var2));
      }
   }

   public T read(JsonReader var1) throws IOException {
      if (var1.peek() == JsonToken.NULL) {
         var1.nextNull();
         return null;
      } else {
         return (T)this.class_.get(var1.nextString());
      }
   }
}
