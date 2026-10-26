package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rNa_1 extends rzX_2<rNe_1> {
   public void id_class(JsonObject var1, rNe_1 var2, JsonSerializationContext var3) {
      super.id_class(var1, (rNe_1)var2, var3);
      var1.addProperty("tag", var2.id_break.toString());
   }

   public rNe_1 id_break(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      try {
         rcd_3 var4 = rcH_2.id_class(rpY_2.id_case(var1, "tag"));
         return new rNe_1(var3, var4);
      } catch (CommandSyntaxException var5) {
         throw new JsonSyntaxException(var5.getMessage());
      }
   }
}
