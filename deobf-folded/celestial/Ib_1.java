package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class Ib_1 implements JsonDeserializer<IG> {
   private rpr_3 id_byte(JsonObject var1) {
      String var2 = rpY_2.id_class(var1, "cullface", "");
      return rpr_3.id_class(var2);
   }

   protected Ib_1() {
   }

   public IG id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rpr_3 var5 = this.id_byte(var4);
      int var6 = this.id_class(var4);
      String var7 = this.id_break(var4);
      wD_2 var8 = (wD_2)var3.deserialize(var4, wD_2.class);
      return new IG(var5, var6, var7, var8);
   }

   protected int id_class(JsonObject var1) {
      return rpY_2.id_class(var1, "tintindex", -1);
   }

   private String id_break(JsonObject var1) {
      return rpY_2.id_case(var1, "texture");
   }
}
