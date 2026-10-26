package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class rAD implements rAo_1<rAK> {
   @Override
   public String class_() {
      return "pack";
   }

   public rAK class_(JsonObject var1) {
      rVi_1 var2 = rgB_2.class_(var1.get("description"));
      if (var2 == null) {
         throw new JsonParseException("Invalid/missing description!");
      } else {
         int var3 = rpY_2.extends_(var1, "pack_format");
         return new rAK(var2, var3);
      }
   }
}
