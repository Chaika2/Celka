package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class Og_1 {
   public static final Og_1 id_class = new Og_1(0, new rqO_2[0], new rqO_2[0], gw_3.id_class);
   private final int id_break;
   private final rqO_2[] id_byte;
   private final rqO_2[] id_protected;
   private final gw_3 id_throws;

   public Og_1(int var1, rqO_2[] var2, rqO_2[] var3, gw_3 var4) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
   }

   @Override
   public String toString() {
      return "AdvancementRewards{experience="
         + this.id_break
         + ", loot="
         + Arrays.toString(this.id_byte)
         + ", recipes="
         + Arrays.toString(this.id_protected)
         + ", function="
         + this.id_throws
         + "}";
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.id_break != 0) {
            var1.addProperty("experience", this.id_break);
         }

         if (this.id_byte.length > 0) {
            JsonArray var2 = new JsonArray();

            for (rqO_2 var6 : this.id_byte) {
               var2.add(var6.toString());
            }

            var1.add("loot", var2);
         }

         if (this.id_protected.length > 0) {
            JsonArray var7 = new JsonArray();

            for (rqO_2 var11 : this.id_protected) {
               var7.add(var11.toString());
            }

            var1.add("recipes", var7);
         }

         if (this.id_throws.id_class() != null) {
            var1.addProperty("function", this.id_throws.id_class().toString());
         }

         return var1;
      }
   }

   public static Og_1 id_class(JsonObject var0) throws JsonParseException {
      int var1 = rpY_2.id_class(var0, "experience", 0);
      JsonArray var2 = rpY_2.id_class(var0, "loot", new JsonArray());
      rqO_2[] var3 = new rqO_2[var2.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = new rqO_2(rpY_2.id_class(var2.get(var4), "loot[" + var4 + "]"));
      }

      JsonArray var7 = rpY_2.id_class(var0, "recipes", new JsonArray());
      rqO_2[] var5 = new rqO_2[var7.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new rqO_2(rpY_2.id_class(var7.get(var6), "recipes[" + var6 + "]"));
      }

      gw_3 var8;
      if (var0.has("function")) {
         var8 = new gw_3(new rqO_2(rpY_2.id_case(var0, "function")));
      } else {
         var8 = gw_3.id_class;
      }

      return new Og_1(var1, var3, var5, var8);
   }

   public void id_class(rhN_2 var1) {
      var1.id_this(this.id_break);
      rzr_3 var2 = new rzP_2(var1.id_continue())
         .id_class(rzQ_2.id_class, var1)
         .id_class(rzQ_2.id_case, var1.Ps())
         .id_class(var1.Sa())
         .id_class(rzz_3.id_implements);
      boolean var3 = false;

      for (rqO_2 var7 : this.id_byte) {
         for (rdn_3 var9 : var1.id_break.o().id_class(var7).id_class(var2)) {
            if (var1.id_catch(var9)) {
               ((rYB)var1.id_throws[7])
                  .id_class(
                     (rhd_3)null,
                     var1.rx(),
                     var1.re(),
                     var1.BO(),
                     rqn_3.ER,
                     rqL_2.PLAYERS,
                     0.2F,
                     ((var1.Sa().nextFloat() - var1.Sa().nextFloat()) * 0.7F + 1.0F) * 2.0F
                  );
               var3 = true;
            } else {
               rsE_2 var10 = var1.id_class(var9, false);
               if (var10 != null) {
                  var10.id_implements();
                  var10.id_break(var1.ro());
               }
            }
         }
      }

      if (var3) {
         ((rJT)var1.id_implements[3]).id_native();
      }

      if (this.id_protected.length > 0) {
         var1.id_class(this.id_protected);
      }

      rnW_2 var11 = var1.id_break;
      this.id_throws.id_class(var11.w()).ifPresent(var2x -> var11.w().id_class(var2x, var1.PL().id_finally().id_break(2)));
   }
}
