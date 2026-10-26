package celestial;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class fs_3 implements JsonDeserializer<fS_2> {
   private final IP id_class;

   public fs_3(IP var1) {
      this.id_class = var1;
   }

   private List<fb_3> id_class(JsonDeserializationContext var1, JsonArray var2) {
      ArrayList var3 = Lists.newArrayList();

      for (JsonElement var5 : var2) {
         var3.add((fb_3)var1.deserialize(var5, fb_3.class));
      }

      return var3;
   }

   public fS_2 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new fS_2(this.id_class.id_class(), this.id_class(var3, var1.getAsJsonArray()));
   }
}
