package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSyntaxException;
import java.util.UUID;

class rNt_1 {
   final String class_;
   final iJ_2 break_;
   final id_3 byte_;
   final rzV_2 protected_;
   final UUID throws_;
   final rXQ[] case_;

   private rNt_1(String var1, iJ_2 var2, id_3 var3, rzV_2 var4, rXQ[] var5, UUID var6) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var6;
      this.case_ = var5;
   }

   private static id_3 class_(String var0) {
      switch (var0) {
         case "addition":
            return id_3.ADDITION;
         case "multiply_base":
            return id_3.MULTIPLY_BASE;
         case "multiply_total":
            return id_3.MULTIPLY_TOTAL;
         default:
            throw new JsonSyntaxException("Unknown attribute modifier operation " + var0);
      }
   }

   private static String class_(id_3 var0) {
      switch (var0) {
         case ADDITION:
            return "addition";
         case MULTIPLY_BASE:
            return "multiply_base";
         case MULTIPLY_TOTAL:
            return "multiply_total";
         default:
            throw new IllegalArgumentException("Unknown operation " + var0);
      }
   }

   public static rNt_1 class_(JsonObject var0, JsonDeserializationContext var1) {
      String var2 = rpY_2.case_(var0, "name");
      rqO_2 var3 = new rqO_2(rpY_2.case_(var0, "attribute"));
      iJ_2 var4 = rVL.O.class_(var3);
      if (var4 == null) {
         throw new JsonSyntaxException("Unknown attribute: " + var3);
      } else {
         id_3 var5 = class_(rpY_2.case_(var0, "operation"));
         rzV_2 var6 = rpY_2.class_(var0, "amount", var1, rzV_2.class);
         UUID var7 = null;
         rXQ[] var8;
         if (rpY_2.class_(var0, "slot")) {
            var8 = new rXQ[]{rXQ.class_(rpY_2.case_(var0, "slot"))};
         } else {
            if (!rpY_2.byte_(var0, "slot")) {
               throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }

            JsonArray var9 = rpY_2.volatile_(var0, "slot");
            var8 = new rXQ[var9.size()];
            int var10 = 0;

            for (JsonElement var12 : var9) {
               var8[var10++] = rXQ.class_(rpY_2.class_(var12, "slot"));
            }

            if (var8.length == 0) {
               throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
         }

         if (var0.has("id")) {
            String var14 = rpY_2.case_(var0, "id");

            try {
               var7 = UUID.fromString(var14);
            } catch (IllegalArgumentException var13) {
               throw new JsonSyntaxException("Invalid attribute modifier id '" + var14 + "' (must be UUID format, with dashes)");
            }
         }

         return new rNt_1(var2, var4, var5, var6, var8, var7);
      }
   }

   public JsonObject class_(JsonSerializationContext var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("name", this.class_);
      var2.addProperty("attribute", rVL.O.break_(this.break_).toString());
      var2.addProperty("operation", class_(this.byte_));
      var2.add("amount", var1.serialize(this.protected_));
      if (this.throws_ != null) {
         var2.addProperty("id", this.throws_.toString());
      }

      if (this.case_.length == 1) {
         var2.addProperty("slot", this.case_[0].protected_());
      } else {
         JsonArray var3 = new JsonArray();

         for (rXQ var7 : this.case_) {
            var3.add(new JsonPrimitive(var7.protected_()));
         }

         var2.add("slot", var3);
      }

      return var2;
   }
}
