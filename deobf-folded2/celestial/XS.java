package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class XS {
   public static final XS id_class = new XS((rlb_3<rXs_1>)null, (rXs_1)null, JS.id_class);
   private final rlb_3<rXs_1> id_break;
   private final rXs_1 id_byte;
   private final JS id_protected;

   public XS(rlb_3<rXs_1> var1, rXs_1 var2, JS var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
   }

   public boolean id_class(rrEm_1 var1, rfH_2 var2) {
      if (this == id_class) {
         return true;
      } else if (!var1.id_synchronized(var2)) {
         return false;
      } else {
         rXE var3 = var1.id_break(var2);
         rXs_1 var4 = var3.id_class();
         if (this.id_break != null && !this.id_break.id_class(var4)) {
            return false;
         } else {
            return this.id_byte != null && var4 != this.id_byte ? false : this.id_protected.id_class(var3);
         }
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_byte != null) {
            var1.addProperty("fluid", rVL.id_default.id_break(this.id_byte).toString());
         }

         if (this.id_break != null) {
            var1.addProperty("tag", rlZ_2.id_class().id_byte().id_break(this.id_break).toString());
         }

         var1.add("state", this.id_protected.id_class());
         return var1;
      }
   }

   public static XS id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "fluid");
         rXs_1 var2 = null;
         if (var1.has("fluid")) {
            rqO_2 var3 = new rqO_2(rpY_2.id_case(var1, "fluid"));
            var2 = rVL.id_default.id_class(var3);
         }

         rlb_3 var5 = null;
         if (var1.has("tag")) {
            rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "tag"));
            var5 = rlZ_2.id_class().id_byte().id_class(var4);
            if (var5 == null) {
               throw new JsonSyntaxException("Unknown fluid tag '" + var4 + "'");
            }
         }

         JS var6 = JS.id_class(var1.get("state"));
         return new XS(var5, var2, var6);
      } else {
         return id_class;
      }
   }
}
