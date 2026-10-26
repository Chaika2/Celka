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

   private IL class_(JsonDeserializationContext var1, JsonObject var2, String var3) {
      return var2.has(var3) ? (IL)var1.deserialize(var2.get(var3), IL.class) : IL.class_;
   }

   public Ik_1 class_(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      JsonObject var4 = var1.getAsJsonObject();
      IL var5 = this.class_(var3, var4, "thirdperson_righthand");
      IL var6 = this.class_(var3, var4, "thirdperson_lefthand");
      if (var6 == IL.class_) {
         var6 = var5;
      }

      IL var7 = this.class_(var3, var4, "firstperson_righthand");
      IL var8 = this.class_(var3, var4, "firstperson_lefthand");
      if (var8 == IL.class_) {
         var8 = var7;
      }

      IL var9 = this.class_(var3, var4, "head");
      IL var10 = this.class_(var3, var4, "gui");
      IL var11 = this.class_(var3, var4, "ground");
      IL var12 = this.class_(var3, var4, "fixed");
      return new Ik_1(var6, var5, var8, var7, var9, var10, var11, var12);
   }
}
