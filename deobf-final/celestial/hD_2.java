package celestial;

import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public abstract class hD_2 {
   public static final hD_2 class_ = new hU_2();
   private static final Joiner break_ = Joiner.on(", ");

   public static hD_2 class_(rlb_3<aI_2<?>> var0) {
      return new he_3(var0);
   }

   public abstract boolean class_(aI_2<?> var1);

   public static hD_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         String var1 = rpY_2.class_(var0, "type");
         if (var1.startsWith("#")) {
            rqO_2 var4 = new rqO_2(var1.substring(1));
            return new he_3(rlZ_2.class_().protected_().break_(var4));
         } else {
            rqO_2 var2 = new rqO_2(var1);
            aI_2 var3 = rVL.transient_
               .break_(var2)
               .orElseThrow(() -> new JsonSyntaxException("Unknown entity type '" + var2 + "', valid types are: " + break_.join(rVL.transient_.protected_())));
            return new ha_3(var3);
         }
      } else {
         return class_;
      }
   }

   public abstract JsonElement class_();

   public static hD_2 break_(aI_2<?> var0) {
      return new ha_3(var0);
   }
}
