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
   final String id_class;
   final iJ_2 id_break;
   final id_3 id_byte;
   final rzV_2 id_protected;
   final UUID id_throws;
   final rXQ[] id_case;

   private rNt_1(String var1, iJ_2 var2, id_3 var3, rzV_2 var4, rXQ[] var5, UUID var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
      this.id_throws = var6;
      this.id_case = var5;
   }

   private static id_3 id_class(String var0) {
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

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static String id_class(id_3 var0) {
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

   public static rNt_1 id_class(JsonObject var0, JsonDeserializationContext var1) {
      String var2 = rpY_2.id_case(var0, "name");
      rqO_2 var3 = new rqO_2(rpY_2.id_case(var0, "attribute"));
      iJ_2 var4 = rVL.O.id_class(var3);
      if (var4 == null) {
         throw new JsonSyntaxException("Unknown attribute: " + var3);
      } else {
         id_3 var5 = id_class(rpY_2.id_case(var0, "operation"));
         rzV_2 var6 = rpY_2.id_class(var0, "amount", var1, rzV_2.class);
         UUID var7 = null;
         rXQ[] var8;
         if (rpY_2.id_class(var0, "slot")) {
            var8 = new rXQ[]{rXQ.id_class(rpY_2.id_case(var0, "slot"))};
         } else {
            if (!rpY_2.id_byte(var0, "slot")) {
               throw new JsonSyntaxException("Invalid or missing attribute modifier slot; must be either string or array of strings.");
            }

            JsonArray var9 = rpY_2.id_volatile(var0, "slot");
            var8 = new rXQ[var9.size()];
            int var10 = 0;

            for (JsonElement var12 : var9) {
               var8[var10++] = rXQ.id_class(rpY_2.id_class(var12, "slot"));
            }

            if (var8.length == 0) {
               throw new JsonSyntaxException("Invalid attribute modifier slot; must contain at least one entry.");
            }
         }

         if (var0.has("id")) {
            String var14 = rpY_2.id_case(var0, "id");

            try {
               var7 = UUID.fromString(var14);
            } catch (IllegalArgumentException var13) {
               throw new JsonSyntaxException("Invalid attribute modifier id '" + var14 + "' (must be UUID format, with dashes)");
            }
         }

         return new rNt_1(var2, var4, var5, var6, var8, var7);
      }
   }

   public JsonObject id_class(JsonSerializationContext var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("name", this.id_class);
      var2.addProperty("attribute", rVL.O.id_break(this.id_break).toString());
      var2.addProperty("operation", id_class(this.id_byte));
      var2.add("amount", var1.serialize(this.id_protected));
      if (this.id_throws != null) {
         var2.addProperty("id", this.id_throws.toString());
      }

      if (this.id_case.length == 1) {
         var2.addProperty("slot", this.id_case[0].id_protected());
      } else {
         JsonArray var3 = new JsonArray();

         for (rXQ var7 : this.id_case) {
            var3.add(new JsonPrimitive(var7.id_protected()));
         }

         var2.add("slot", var3);
      }

      return var2;
   }
}
