package celestial;

import com.google.common.base.Joiner;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public abstract class hD_2 {
   public static final hD_2 id_class = new hU_2();
   private static final Joiner id_break = Joiner.on(", ");

   public static hD_2 id_class(rlb_3<aI_2<?>> var0) {
      return new he_3(var0);
   }

   public abstract boolean id_class(aI_2<?> var1);

   public static hD_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         String var1 = rpY_2.id_class(var0, "type");
         if (var1.startsWith("#")) {
            rqO_2 var4 = new rqO_2(var1.substring(1));
            return new he_3(rlZ_2.id_class().id_protected().id_break(var4));
         } else {
            rqO_2 var2 = new rqO_2(var1);
            aI_2 var3 = rVL.id_transient
               .id_break(var2)
               .orElseThrow(
                  () -> new JsonSyntaxException("Unknown entity type '" + var2 + "', valid types are: " + id_break.join(rVL.id_transient.id_protected()))
               );
            return new ha_3(var3);
         }
      } else {
         return id_class;
      }
   }

   public abstract JsonElement id_class();

   public static hD_2 id_break(aI_2<?> var0) {
      return new ha_3(var0);
   }
}
