package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Arrays;

public class Og_1 {
   public static final Og_1 class_ = new Og_1(0, new rqO_2[0], new rqO_2[0], gw_3.class_);
   private final int break_;
   private final rqO_2[] byte_;
   private final rqO_2[] protected_;
   private final gw_3 throws_;

   public Og_1(int var1, rqO_2[] var2, rqO_2[] var3, gw_3 var4) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
   }

   @Override
   public String toString() {
      return "AdvancementRewards{experience="
         + this.break_
         + ", loot="
         + Arrays.toString(this.byte_)
         + ", recipes="
         + Arrays.toString(this.protected_)
         + ", function="
         + this.throws_
         + "}";
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         if (this.break_ != 0) {
            var1.addProperty("experience", this.break_);
         }

         if (this.byte_.length > 0) {
            JsonArray var2 = new JsonArray();

            for (rqO_2 var6 : this.byte_) {
               var2.add(var6.toString());
            }

            var1.add("loot", var2);
         }

         if (this.protected_.length > 0) {
            JsonArray var7 = new JsonArray();

            for (rqO_2 var11 : this.protected_) {
               var7.add(var11.toString());
            }

            var1.add("recipes", var7);
         }

         if (this.throws_.class_() != null) {
            var1.addProperty("function", this.throws_.class_().toString());
         }

         return var1;
      }
   }

   public static Og_1 class_(JsonObject var0) throws JsonParseException {
      int var1 = rpY_2.class_(var0, "experience", 0);
      JsonArray var2 = rpY_2.class_(var0, "loot", new JsonArray());
      rqO_2[] var3 = new rqO_2[var2.size()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = new rqO_2(rpY_2.class_(var2.get(var4), "loot[" + var4 + "]"));
      }

      JsonArray var7 = rpY_2.class_(var0, "recipes", new JsonArray());
      rqO_2[] var5 = new rqO_2[var7.size()];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new rqO_2(rpY_2.class_(var7.get(var6), "recipes[" + var6 + "]"));
      }

      gw_3 var8;
      if (var0.has("function")) {
         var8 = new gw_3(new rqO_2(rpY_2.case_(var0, "function")));
      } else {
         var8 = gw_3.class_;
      }

      return new Og_1(var1, var3, var5, var8);
   }

   public void class_(rhN_2 var1) {
      var1.this_(this.break_);
      rzr_3 var2 = new rzP_2(var1.continue_()).class_(rzQ_2.class_, var1).class_(rzQ_2.case_, var1.Ps()).class_(var1.Sa()).class_(rzz_3.implements_);
      boolean var3 = false;

      for (rqO_2 var7 : this.byte_) {
         for (rdn_3 var9 : var1.break_.o().class_(var7).class_(var2)) {
            if (var1.catch_(var9)) {
               ((rYB)var1.throws_[7])
                  .class_(
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
               rsE_2 var10 = var1.class_(var9, false);
               if (var10 != null) {
                  var10.implements_();
                  var10.break_(var1.ro());
               }
            }
         }
      }

      if (var3) {
         ((rJT)var1.implements_[3]).native_();
      }

      if (this.protected_.length > 0) {
         var1.class_(this.protected_);
      }

      rnW_2 var11 = var1.break_;
      this.throws_.class_(var11.w()).ifPresent(var2x -> var11.w().class_(var2x, var1.PL().finally_().break_(2)));
   }
}
