package celestial;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;

public class rQS extends rza_3<rQP> {
   protected rQP class_(JsonObject var1, JsonDeserializationContext var2, int var3, int var4, rQz_1[] var5, rNL[] var6) {
      rqO_2 var7 = new rqO_2(rpY_2.case_(var1, "name"));
      rlb_3 var8 = rlZ_2.class_().break_().class_(var7);
      if (var8 == null) {
         throw new JsonParseException("Can't find tag: " + var7);
      } else {
         boolean var9 = rpY_2.private_(var1, "expand");
         return new rQP(var8, var9, var3, var4, var5, var6);
      }
   }

   public void class_(JsonObject var1, rQP var2, JsonSerializationContext var3) {
      super.class_(var1, (rQP)var2, var3);
      var1.addProperty("name", rlZ_2.class_().break_().break_(var2.catch_).toString());
      var1.addProperty("expand", var2.private_);
   }
}
