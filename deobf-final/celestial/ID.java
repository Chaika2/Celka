package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ID implements JsonDeserializer<IK> {
   protected int byte_(JsonObject var1) {
      int var2 = rpY_2.class_(var1, "weight", 1);
      if (var2 < 1) {
         throw new JsonParseException("Invalid weight " + var2 + " found, expected integer >= 1");
      } else {
         return var2;
      }
   }

   protected If_1 class_(JsonObject var1) {
      int var2 = rpY_2.class_(var1, "x", 0);
      int var3 = rpY_2.class_(var1, "y", 0);
      If_1 var4 = If_1.class_(var2, var3);
      if (var4 == null) {
         throw new JsonParseException("Invalid BlockModelRotation x: " + var2 + ", y: " + var3);
      } else {
         return var4;
      }
   }

   public IK class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      rqO_2 var5 = this.break_(var4);
      If_1 var6 = this.class_(var4);
      boolean var7 = this.protected_(var4);
      int var8 = this.byte_(var4);
      return new IK(var5, var6.class_(), var7, var8);
   }

   protected rqO_2 break_(JsonObject var1) {
      return new rqO_2(rpY_2.case_(var1, "model"));
   }

   private boolean protected_(JsonObject var1) {
      return rpY_2.class_(var1, "uvlock", false);
   }
}
