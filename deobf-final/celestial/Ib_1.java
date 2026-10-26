package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class Ib_1 implements JsonDeserializer<IG> {
   private rpr_3 byte_(JsonObject var1) {
      String var2 = rpY_2.class_(var1, "cullface", "");
      return rpr_3.class_(var2);
   }

   protected Ib_1() {
   }

   public IG class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rpr_3 var5 = this.byte_(var4);
      int var6 = this.class_(var4);
      String var7 = this.break_(var4);
      wD_2 var8 = (wD_2)var3.deserialize(var4, wD_2.class);
      return new IG(var5, var6, var7, var8);
   }

   protected int class_(JsonObject var1) {
      return rpY_2.class_(var1, "tintindex", -1);
   }

   private String break_(JsonObject var1) {
      return rpY_2.case_(var1, "texture");
   }
}
