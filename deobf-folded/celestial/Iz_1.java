package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class Iz_1 implements JsonDeserializer<Ik_1> {
   protected Iz_1() {
   }

   private IL id_class(JsonDeserializationContext var1, JsonObject var2, String var3) {
      return var2.has(var3) ? (IL)var1.deserialize(var2.get(var3), IL.class) : IL.id_class;
   }

   public Ik_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      IL var5 = this.id_class(var3, var4, "thirdperson_righthand");
      IL var6 = this.id_class(var3, var4, "thirdperson_lefthand");
      if (var6 == IL.id_class) {
         var6 = var5;
      }

      IL var7 = this.id_class(var3, var4, "firstperson_righthand");
      IL var8 = this.id_class(var3, var4, "firstperson_lefthand");
      if (var8 == IL.id_class) {
         var8 = var7;
      }

      IL var9 = this.id_class(var3, var4, "head");
      IL var10 = this.id_class(var3, var4, "gui");
      IL var11 = this.id_class(var3, var4, "ground");
      IL var12 = this.id_class(var3, var4, "fixed");
      return new Ik_1(var6, var5, var8, var7, var9, var10, var11, var12);
   }
}
