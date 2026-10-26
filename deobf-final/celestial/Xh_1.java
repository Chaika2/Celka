package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import java.util.Map;

public class Xh_1 {
   public static final Xh_1 class_ = new Xh_1();
   private final rlb_3<rdb_3> break_;
   private final rdb_3 byte_;
   private final XF protected_;
   private final XF throws_;
   private final hT_2[] case_;
   private final hT_2[] catch_;
   private final rLi_1 private_;
   private final XC implements_;

   public Xh_1() {
      this.break_ = null;
      this.byte_ = null;
      this.private_ = null;
      this.protected_ = XF.throws_;
      this.throws_ = XF.throws_;
      this.case_ = hT_2.break_;
      this.catch_ = hT_2.break_;
      this.implements_ = XC.class_;
   }

   public Xh_1(rlb_3<rdb_3> var1, rdb_3 var2, XF var3, XF var4, hT_2[] var5, hT_2[] var6, rLi_1 var7, XC var8) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.byte_ != null) {
            var1.addProperty("item", rVL.for_.break_(this.byte_).toString());
         }

         if (this.break_ != null) {
            var1.addProperty("tag", rlZ_2.class_().break_().break_(this.break_).toString());
         }

         var1.add("count", this.protected_.protected_());
         var1.add("durability", this.throws_.protected_());
         var1.add("nbt", this.implements_.class_());
         if (this.case_.length > 0) {
            JsonArray var2 = new JsonArray();

            for (hT_2 var6 : this.case_) {
               var2.add(var6.class_());
            }

            var1.add("enchantments", var2);
         }

         if (this.catch_.length > 0) {
            JsonArray var7 = new JsonArray();

            for (hT_2 var11 : this.catch_) {
               var7.add(var11.class_());
            }

            var1.add("stored_enchantments", var7);
         }

         if (this.private_ != null) {
            var1.addProperty("potion", rVL.double_.break_(this.private_).toString());
         }

         return var1;
      }
   }

   public static Xh_1 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "item");
         XF var2 = XF.class_(var1.get("count"));
         XF var3 = XF.class_(var1.get("durability"));
         if (var1.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            XC var4 = XC.class_(var1.get("nbt"));
            rdb_3 var5 = null;
            if (var1.has("item")) {
               rqO_2 var6 = new rqO_2(rpY_2.case_(var1, "item"));
               var5 = rVL.for_.break_(var6).orElseThrow(() -> new JsonSyntaxException("Unknown item id '" + var6 + "'"));
            }

            rlb_3 var10 = null;
            if (var1.has("tag")) {
               rqO_2 var7 = new rqO_2(rpY_2.case_(var1, "tag"));
               var10 = rlZ_2.class_().break_().class_(var7);
               if (var10 == null) {
                  throw new JsonSyntaxException("Unknown item tag '" + var7 + "'");
               }
            }

            rLi_1 var11 = null;
            if (var1.has("potion")) {
               rqO_2 var8 = new rqO_2(rpY_2.case_(var1, "potion"));
               var11 = rVL.double_.break_(var8).orElseThrow(() -> new JsonSyntaxException("Unknown potion '" + var8 + "'"));
            }

            hT_2[] var12 = hT_2.break_(var1.get("enchantments"));
            hT_2[] var9 = hT_2.break_(var1.get("stored_enchantments"));
            return new Xh_1(var10, var5, var2, var3, var12, var9, var11, var4);
         }
      } else {
         return class_;
      }
   }

   public boolean class_(rdn_3 var1) {
      if (this == class_) {
         return true;
      } else if (this.break_ != null && !this.break_.class_(var1.break_())) {
         return false;
      } else if (this.byte_ != null && var1.break_() != this.byte_) {
         return false;
      } else if (!this.protected_.byte_(var1.char_())) {
         return false;
      } else if (!this.throws_.byte_() && !var1.throws_()) {
         return false;
      } else if (!this.throws_.byte_(var1.private_() - var1.catch_())) {
         return false;
      } else if (!this.implements_.class_(var1)) {
         return false;
      } else {
         if (this.case_.length > 0) {
            Map var2 = eA_2.class_(var1.new_());

            for (hT_2 var6 : this.case_) {
               if (!var6.class_(var2)) {
                  return false;
               }
            }
         }

         if (this.catch_.length > 0) {
            Map var7 = eA_2.class_(rxy_3.protected_(var1));

            for (hT_2 var12 : this.catch_) {
               if (!var12.class_(var7)) {
                  return false;
               }
            }
         }

         rLi_1 var8 = rAB.protected_(var1);
         return this.private_ == null || this.private_ == var8;
      }
   }

   public static Xh_1[] break_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonArray var1 = rpY_2.implements_(var0, "items");
         Xh_1[] var2 = new Xh_1[var1.size()];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = class_(var1.get(var3));
         }

         return var2;
      } else {
         return new Xh_1[0];
      }
   }
}
