package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Iv_1 implements JsonDeserializer<IZ> {
   protected Iv_1() {
   }

   protected Map<rqO_2, Float> class_(JsonObject var1) {
      LinkedHashMap var2 = Maps.newLinkedHashMap();
      JsonObject var3 = rpY_2.native_(var1, "predicate");

      for (Entry var5 : var3.entrySet()) {
         var2.put(new rqO_2((String)var5.getKey()), rpY_2.protected_((JsonElement)var5.getValue(), (String)var5.getKey()));
      }

      return var2;
   }

   public IZ class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rqO_2 var5 = new rqO_2(rpY_2.case_(var4, "model"));
      Map var6 = this.class_(var4);
      return new IZ(var5, var6);
   }
}
