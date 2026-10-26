package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class Xh_1 {
   public static final Xh_1 id_class = new Xh_1();
   private final rlb_3<rdb_3> id_break;
   private final rdb_3 id_byte;
   private final XF id_protected;
   private final XF id_throws;
   private final hT_2[] id_case;
   private final hT_2[] id_catch;
   private final rLi_1 id_private;
   private final XC id_implements;

   public Xh_1() {
      this.id_break = null;
      this.id_byte = null;
      this.id_private = null;
      this.id_protected = XF.id_throws;
      this.id_throws = XF.id_throws;
      this.id_case = hT_2.id_break;
      this.id_catch = hT_2.id_break;
      this.id_implements = XC.id_class;
   }

   public Xh_1(rlb_3<rdb_3> var1, rdb_3 var2, XF var3, XF var4, hT_2[] var5, hT_2[] var6, rLi_1 var7, XC var8) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
      this.id_catch = var6;
      this.id_private = var7;
      this.id_implements = var8;
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_byte != null) {
            var1.addProperty("item", rVL.id_for.id_break(this.id_byte).toString());
         }

         if (this.id_break != null) {
            var1.addProperty("tag", rlZ_2.id_class().id_break().id_break(this.id_break).toString());
         }

         var1.add("count", this.id_protected.id_protected());
         var1.add("durability", this.id_throws.id_protected());
         var1.add("nbt", this.id_implements.id_class());
         if (this.id_case.length > 0) {
            JsonArray var2 = new JsonArray();

            for (hT_2 var6 : this.id_case) {
               var2.add(var6.id_class());
            }

            var1.add("enchantments", var2);
         }

         if (this.id_catch.length > 0) {
            JsonArray var7 = new JsonArray();

            for (hT_2 var11 : this.id_catch) {
               var7.add(var11.id_class());
            }

            var1.add("stored_enchantments", var7);
         }

         if (this.id_private != null) {
            var1.addProperty("potion", rVL.id_double.id_break(this.id_private).toString());
         }

         return var1;
      }
   }

   public static Xh_1 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "item");
         XF var2 = XF.id_class(var1.get("count"));
         XF var3 = XF.id_class(var1.get("durability"));
         if (var1.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            XC var4 = XC.id_class(var1.get("nbt"));
            rdb_3 var5 = null;
            if (var1.has("item")) {
               rqO_2 var6 = new rqO_2(rpY_2.id_case(var1, "item"));
               var5 = rVL.id_for.id_break(var6).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + var6 + "'"));
            }

            rlb_3 var10 = null;
            if (var1.has("tag")) {
               rqO_2 var7 = new rqO_2(rpY_2.id_case(var1, "tag"));
               var10 = rlZ_2.id_class().id_break().id_class(var7);
               if (var10 == null) {
                  throw new JsonSyntaxException("Unknown item tag '" + var7 + "'");
               }
            }

            rLi_1 var11 = null;
            if (var1.has("potion")) {
               rqO_2 var8 = new rqO_2(rpY_2.id_case(var1, "potion"));
               var11 = rVL.id_double.id_break(var8).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var8 + "'"));
            }

            hT_2[] var12 = hT_2.id_break(var1.get("enchantments"));
            hT_2[] var9 = hT_2.id_break(var1.get("stored_enchantments"));
            return new Xh_1(var10, var5, var2, var3, var12, var9, var11, var4);
         }
      } else {
         return id_class;
      }
   }

   public boolean id_class(rdn_3 var1) {
      if (this == id_class) {
         return true;
      } else if (this.id_break != null && !this.id_break.id_class(var1.id_break())) {
         return false;
      } else if (this.id_byte != null && var1.id_break() != this.id_byte) {
         return false;
      } else if (!this.id_protected.id_byte(var1.id_char())) {
         return false;
      } else if (!this.id_throws.id_byte() && !var1.id_throws()) {
         return false;
      } else if (!this.id_throws.id_byte(var1.id_private() - var1.id_catch())) {
         return false;
      } else if (!this.id_implements.id_class(var1)) {
         return false;
      } else {
         if (this.id_case.length > 0) {
            Map var2 = eA_2.id_class(var1.id_new());

            for (hT_2 var6 : this.id_case) {
               if (!var6.id_class(var2)) {
                  return false;
               }
            }
         }

         if (this.id_catch.length > 0) {
            Map var7 = eA_2.id_class(rxy_3.id_protected(var1));

            for (hT_2 var12 : this.id_catch) {
               if (!var12.id_class(var7)) {
                  return false;
               }
            }
         }

         rLi_1 var8 = rAB.id_protected(var1);
         return this.id_private == null || this.id_private == var8;
      }
   }

   public static Xh_1[] id_break(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var1 = rpY_2.id_implements(var0, "items");
         Xh_1[] var2 = new Xh_1[var1.size()];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = id_class(var1.get(var3));
         }

         return var2;
      } else {
         return new Xh_1[0];
      }
   }
}
