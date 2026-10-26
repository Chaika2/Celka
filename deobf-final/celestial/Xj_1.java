package celestial;

import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Xj_1 {
   public static final Xj_1 class_ = new XR().class_();
   private final XF break_;
   private final rRl_1 byte_;
   private final Map<rCi_1<?>, XF> protected_;
   private final Object2BooleanMap<rqO_2> throws_;
   private final Map<rqO_2, XY> case_;

   Xj_1(XF var1, rRl_1 var2, Map<rCi_1<?>, XF> var3, Object2BooleanMap<rqO_2> var4, Map<rqO_2, XY> var5) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   public JsonElement class_() {
      if (this == class_) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("level", this.break_.protected_());
         if (this.byte_ != rRl_1.NOT_SET) {
            var1.addProperty("gamemode", this.byte_.break_());
         }

         if (!this.protected_.isEmpty()) {
            JsonArray var2 = new JsonArray();
            this.protected_.forEach((var1x, var2x) -> {
               JsonObject var3x = new JsonObject();
               var3x.addProperty("type", rVL.h.break_(var1x.protected_()).toString());
               var3x.addProperty("stat", class_((rCi_1<?>)var1x).toString());
               var3x.add("value", var2x.protected_());
               var2.add(var3x);
            });
            var1.add("stats", var2);
         }

         if (!this.throws_.isEmpty()) {
            JsonObject var3 = new JsonObject();
            this.throws_.forEach((var1x, var2x) -> var3.addProperty(var1x.toString(), var2x));
            var1.add("recipes", var3);
         }

         if (!this.case_.isEmpty()) {
            JsonObject var4 = new JsonObject();
            this.case_.forEach((var1x, var2x) -> var4.add(var1x.toString(), var2x.class_()));
            var1.add("advancements", var4);
         }

         return var1;
      }
   }

   public boolean class_(an_3 var1) {
      if (this == class_) {
         return true;
      } else if (!(var1 instanceof rhN_2 var2)) {
         return false;
      } else if (!this.break_.byte_((Integer)var2.implements_[19])) {
         return false;
      } else if (this.byte_ != rRl_1.NOT_SET && this.byte_ != var2.finally_.break_()) {
         return false;
      } else {
         rCa_1 var3 = var2.long_();

         for (Entry var5 : this.protected_.entrySet()) {
            int var6 = var3.class_((rCi_1<?>)var5.getKey());
            if (!((XF)var5.getValue()).byte_(var6)) {
               return false;
            }
         }

         rWs_1 var10 = var2.float_();
         ObjectIterator var11 = this.throws_.object2BooleanEntrySet().iterator();

         while (var11.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry var13 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var11.next();
            if (var10.break_((rqO_2)var13.getKey()) != var13.getBooleanValue()) {
               return false;
            }
         }

         if (!this.case_.isEmpty()) {
            hs_3 var12 = var2.r();
            Of_1 var14 = var2.rC().t();

            for (Entry var8 : this.case_.entrySet()) {
               OT var9 = var14.class_((rqO_2)var8.getKey());
               if (var9 == null || !((XY)var8.getValue()).test(var12.break_(var9))) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static Xj_1 class_(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.private_(var0, "player");
         XF var2 = XF.class_(var1.get("level"));
         String var3 = rpY_2.class_(var1, "gamemode", "");
         rRl_1 var4 = rRl_1.class_(var3, rRl_1.NOT_SET);
         HashMap var5 = Maps.newHashMap();
         JsonArray var6 = rpY_2.class_(var1, "stats", (JsonArray)null);
         if (var6 != null) {
            for (JsonElement var8 : var6) {
               JsonObject var9 = rpY_2.private_(var8, "stats entry");
               rqO_2 var10 = new rqO_2(rpY_2.case_(var9, "type"));
               rlr_3 var11 = rVL.h.class_(var10);
               if (var11 == null) {
                  throw new JsonParseException("Invalid stat type: " + var10);
               }

               rqO_2 var12 = new rqO_2(rpY_2.case_(var9, "stat"));
               rCi_1 var13 = class_(var11, var12);
               XF var14 = XF.class_(var9.get("value"));
               var5.put(var13, var14);
            }
         }

         Object2BooleanOpenHashMap var15 = new Object2BooleanOpenHashMap();
         JsonObject var16 = rpY_2.class_(var1, "recipes", new JsonObject());

         for (Entry var19 : var16.entrySet()) {
            rqO_2 var21 = new rqO_2((String)var19.getKey());
            boolean var23 = rpY_2.byte_((JsonElement)var19.getValue(), "recipe present");
            var15.put(var21, var23);
         }

         HashMap var18 = Maps.newHashMap();
         JsonObject var20 = rpY_2.class_(var1, "advancements", new JsonObject());

         for (Entry var24 : var20.entrySet()) {
            rqO_2 var25 = new rqO_2((String)var24.getKey());
            XY var26 = break_((JsonElement)var24.getValue());
            var18.put(var25, var26);
         }

         return new Xj_1(var2, var4, var5, var15, var18);
      } else {
         return class_;
      }
   }

   private static <T> rCi_1<T> class_(rlr_3<T> var0, rqO_2 var1) {
      rVL var2 = var0.class_();
      Object var3 = var2.class_(var1);
      if (var3 == null) {
         throw new JsonParseException("Unknown object " + var1 + " for stat type " + rVL.h.break_(var0));
      } else {
         return (rCi_1<T>)var0.break_(var3);
      }
   }

   private static <T> rqO_2 class_(rCi_1<T> var0) {
      return var0.protected_().class_().break_(var0.throws_());
   }

   private static XY break_(JsonElement var0) {
      if (var0.isJsonPrimitive()) {
         boolean var3 = var0.getAsBoolean();
         return new XV(var3);
      } else {
         Object2BooleanOpenHashMap var1 = new Object2BooleanOpenHashMap();
         JsonObject var2 = rpY_2.private_(var0, "criterion data");
         var2.entrySet().forEach(var1x -> {
            boolean var2x = rpY_2.byte_((JsonElement)var1x.getValue(), "criterion test");
            var1.put((String)var1x.getKey(), var2x);
         });
         return new Xg_1(var1);
      }
   }
}
