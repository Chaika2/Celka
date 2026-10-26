package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class hO_2 {
   public static final hO_2 class_ = new hO_2((rlb_3<xd_3>)null, (xd_3)null, JS.class_, XC.class_);
   private final rlb_3<xd_3> break_;
   private final xd_3 byte_;
   private final JS protected_;
   private final XC throws_;

   public hO_2(rlb_3<xd_3> var1, xd_3 var2, JS var3, XC var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   public boolean class_(rrEm_1 var1, rfH_2 var2) {
      if (this == class_) {
         return true;
      } else if (!var1.synchronized_(var2)) {
         return false;
      } else {
         xc_3 var3 = var1.byte_(var2);
         xd_3 var4 = var3.break_();
         if (this.break_ != null && !this.break_.class_(var4)) {
            return false;
         } else if (this.byte_ != null && var4 != this.byte_) {
            return false;
         } else if (!this.protected_.class_(var3)) {
            return false;
         } else {
            if (this.throws_ != XC.class_) {
               ryO_2 var5 = var1.class_(var2);
               if (var5 == null || !this.throws_.class_(var5.class_(new rcd_3()))) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.byte_ != null) {
            var1.addProperty("block", rVL.strictfp_.break_(this.byte_).toString());
         }

         if (this.break_ != null) {
            var1.addProperty("tag", rlZ_2.class_().class_().break_(this.break_).toString());
         }

         var1.add("nbt", this.throws_.class_());
         var1.add("state", this.protected_.class_());
         return var1;
      }
   }

   public static hO_2 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "block");
         XC var2 = XC.class_(var1.get("nbt"));
         xd_3 var3 = null;
         if (var1.has("block")) {
            rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "block"));
            var3 = rVL.strictfp_.class_(var4);
         }

         rlb_3 var6 = null;
         if (var1.has("tag")) {
            rqO_2 var5 = new rqO_2(rpY_2.case_(var1, "tag"));
            var6 = rlZ_2.class_().class_().class_(var5);
            if (var6 == null) {
               throw new JsonSyntaxException("Unknown block tag '" + var5 + "'");
            }
         }

         JS var7 = JS.class_(var1.get("state"));
         return new hO_2(var6, var3, var7, var2);
      } else {
         return class_;
      }
   }
}
