package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hO_2 {
   public static final hO_2 id_class = new hO_2((rlb_3<xd_3>)null, (xd_3)null, JS.id_class, XC.id_class);
   private final rlb_3<xd_3> id_break;
   private final xd_3 id_byte;
   private final JS id_protected;
   private final XC id_throws;

   public hO_2(rlb_3<xd_3> var1, xd_3 var2, JS var3, XC var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   public boolean id_class(rrEm_1 var1, rfH_2 var2) {
      if (this == id_class) {
         return true;
      } else if (!var1.id_synchronized(var2)) {
         return false;
      } else {
         xc_3 var3 = var1.id_byte(var2);
         xd_3 var4 = var3.id_break();
         if (this.id_break != null && !this.id_break.id_class(var4)) {
            return false;
         } else if (this.id_byte != null && var4 != this.id_byte) {
            return false;
         } else if (!this.id_protected.id_class(var3)) {
            return false;
         } else {
            if (this.id_throws != XC.id_class) {
               ryO_2 var5 = var1.id_class(var2);
               if (var5 == null || !this.id_throws.id_class(var5.id_class(new rcd_3()))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_byte != null) {
            var1.addProperty("block", rVL.id_strictfp.id_break(this.id_byte).toString());
         }

         if (this.id_break != null) {
            var1.addProperty("tag", rlZ_2.id_class().id_class().id_break(this.id_break).toString());
         }

         var1.add("nbt", this.id_throws.id_class());
         var1.add("state", this.id_protected.id_class());
         return var1;
      }
   }

   public static hO_2 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "block");
         XC var2 = XC.id_class(var1.get("nbt"));
         xd_3 var3 = null;
         if (var1.has("block")) {
            rqO_2 var4 = new rqO_2(rpY_2.id_case(var1, "block"));
            var3 = rVL.id_strictfp.id_class(var4);
         }

         rlb_3 var6 = null;
         if (var1.has("tag")) {
            rqO_2 var5 = new rqO_2(rpY_2.id_case(var1, "tag"));
            var6 = rlZ_2.id_class().id_class().id_class(var5);
            if (var6 == null) {
               throw new JsonSyntaxException("Unknown block tag '" + var5 + "'");
            }
         }

         JS var7 = JS.id_class(var1.get("state"));
         return new hO_2(var6, var3, var7, var2);
      } else {
         return id_class;
      }
   }
}
