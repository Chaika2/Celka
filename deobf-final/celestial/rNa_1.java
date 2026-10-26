package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class rNa_1 extends rzX_2<rNe_1> {
   public void class_(JsonObject var1, rNe_1 var2, JsonSerializationContext var3) {
      super.class_(var1, (rNe_1)var2, var3);
      var1.addProperty("tag", var2.break_.toString());
   }

   public rNe_1 break_(JsonObject var1, JsonDeserializationContext var2, rQz_1[] var3) {
      try {
         rcd_3 var4 = rcH_2.class_(rpY_2.case_(var1, "tag"));
         return new rNe_1(var3, var4);
      } catch (CommandSyntaxException var5) {
         throw new JsonSyntaxException(var5.getMessage());
      }
   }
}
