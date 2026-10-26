package celestial;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class XS {
   public static final XS class_ = new XS((rlb_3<rXs_1>)null, (rXs_1)null, JS.class_);
   private final rlb_3<rXs_1> break_;
   private final rXs_1 byte_;
   private final JS protected_;

   public XS(rlb_3<rXs_1> var1, rXs_1 var2, JS var3) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
   }

   public boolean class_(rrEm_1 var1, rfH_2 var2) {
      if (this == class_) {
         return true;
      } else if (!var1.synchronized_(var2)) {
         return false;
      } else {
         rXE var3 = var1.break_(var2);
         rXs_1 var4 = var3.class_();
         if (this.break_ != null && !this.break_.class_(var4)) {
            return false;
         } else {
            return this.byte_ != null && var4 != this.byte_ ? false : this.protected_.class_(var3);
         }
      }
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.byte_ != null) {
            var1.addProperty("fluid", rVL.default_.break_(this.byte_).toString());
         }

         if (this.break_ != null) {
            var1.addProperty("tag", rlZ_2.class_().byte_().break_(this.break_).toString());
         }

         var1.add("state", this.protected_.class_());
         return var1;
      }
   }

   public static XS class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "fluid");
         rXs_1 var2 = null;
         if (var1.has("fluid")) {
            rqO_2 var3 = new rqO_2(rpY_2.case_(var1, "fluid"));
            var2 = rVL.default_.class_(var3);
         }

         rlb_3 var5 = null;
         if (var1.has("tag")) {
            rqO_2 var4 = new rqO_2(rpY_2.case_(var1, "tag"));
            var5 = rlZ_2.class_().byte_().class_(var4);
            if (var5 == null) {
               throw new JsonSyntaxException("Unknown fluid tag '" + var4 + "'");
            }
         }

         JS var6 = JS.class_(var1.get("state"));
         return new XS(var5, var2, var6);
      } else {
         return class_;
      }
   }
}
