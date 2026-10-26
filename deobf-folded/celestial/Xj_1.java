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
   public static final Xj_1 id_class = new XR().id_class();
   private final XF id_break;
   private final rRl_1 id_byte;
   private final Map<rCi_1<?>, XF> id_protected;
   private final Object2BooleanMap<rqO_2> id_throws;
   private final Map<rqO_2, XY> id_case;

   Xj_1(XF var1, rRl_1 var2, Map<rCi_1<?>, XF> var3, Object2BooleanMap<rqO_2> var4, Map<rqO_2, XY> var5) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_case = var5;
   }

   public JsonElement id_class() {
      if (this == id_class) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject var1 = new JsonObject();
         var1.add("level", this.id_break.id_protected());
         if (this.id_byte != rRl_1.NOT_SET) {
            var1.addProperty("gamemode", this.id_byte.id_break());
         }

         if (!this.id_protected.isEmpty()) {
            JsonArray var2 = new JsonArray();
            this.id_protected.forEach((var1x, var2x) -> {
               JsonObject var3x = new JsonObject();
               var3x.addProperty("type", rVL.h.id_break(var1x.id_protected()).toString());
               var3x.addProperty("stat", id_class((rCi_1<?>)var1x).toString());
               var3x.add("value", var2x.id_protected());
               var2.add(var3x);
            });
            var1.add("stats", var2);
         }

         if (!this.id_throws.isEmpty()) {
            JsonObject var3 = new JsonObject();
            this.id_throws.forEach((var1x, var2x) -> var3.addProperty(var1x.toString(), var2x));
            var1.add("recipes", var3);
         }

         if (!this.id_case.isEmpty()) {
            JsonObject var4 = new JsonObject();
            this.id_case.forEach((var1x, var2x) -> var4.add(var1x.toString(), var2x.id_class()));
            var1.add("advancements", var4);
         }

         return var1;
      }
   }

   public boolean id_class(an_3 var1) {
      if (this == id_class) {
         return true;
      } else if (!(var1 instanceof rhN_2 var2)) {
         return false;
      } else if (!this.id_break.id_byte((Integer)var2.id_implements[19])) {
         return false;
      } else if (this.id_byte != rRl_1.NOT_SET && this.id_byte != var2.id_finally.id_break()) {
         return false;
      } else {
         rCa_1 var3 = var2.id_long();

         for (Entry var5 : this.id_protected.entrySet()) {
            int var6 = var3.id_class((rCi_1<?>)var5.getKey());
            if (!((XF)var5.getValue()).id_byte(var6)) {
               return false;
            }
         }

         rWs_1 var10 = var2.id_float();
         ObjectIterator var11 = this.id_throws.object2BooleanEntrySet().iterator();

         while (var11.hasNext()) {
            it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry var13 = (it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry)var11.next();
            if (var10.id_break((rqO_2)var13.getKey()) != var13.getBooleanValue()) {
               return false;
            }
         }

         if (!this.id_case.isEmpty()) {
            hs_3 var12 = var2.r();
            Of_1 var14 = var2.rC().t();

            for (Entry var8 : this.id_case.entrySet()) {
               OT var9 = var14.id_class((rqO_2)var8.getKey());
               if (var9 == null || !((XY)var8.getValue()).test(var12.id_break(var9))) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public static Xj_1 id_class(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var1 = rpY_2.id_private(var0, "player");
         XF var2 = XF.id_class(var1.get("level"));
         String var3 = rpY_2.id_class(var1, "gamemode", "");
         rRl_1 var4 = rRl_1.id_class(var3, rRl_1.NOT_SET);
         HashMap var5 = Maps.newHashMap();
         JsonArray var6 = rpY_2.id_class(var1, "stats", (JsonArray)null);
         if (var6 != null) {
            for (JsonElement var8 : var6) {
               JsonObject var9 = rpY_2.id_private(var8, "stats entry");
               rqO_2 var10 = new rqO_2(rpY_2.id_case(var9, "type"));
               rlr_3 var11 = rVL.h.id_class(var10);
               if (var11 == null) {
                  throw new JsonParseException("Invalid stat type: " + var10);
               }

               rqO_2 var12 = new rqO_2(rpY_2.id_case(var9, "stat"));
               rCi_1 var13 = id_class(var11, var12);
               XF var14 = XF.id_class(var9.get("value"));
               var5.put(var13, var14);
            }
         }

         Object2BooleanOpenHashMap var15 = new Object2BooleanOpenHashMap();
         JsonObject var16 = rpY_2.id_class(var1, "recipes", new JsonObject());

         for (Entry var19 : var16.entrySet()) {
            rqO_2 var21 = new rqO_2((String)var19.getKey());
            boolean var23 = rpY_2.id_byte((JsonElement)var19.getValue(), "recipe present");
            var15.put(var21, var23);
         }

         HashMap var18 = Maps.newHashMap();
         JsonObject var20 = rpY_2.id_class(var1, "advancements", new JsonObject());

         for (Entry var24 : var20.entrySet()) {
            rqO_2 var25 = new rqO_2((String)var24.getKey());
            XY var26 = id_break((JsonElement)var24.getValue());
            var18.put(var25, var26);
         }

         return new Xj_1(var2, var4, var5, var15, var18);
      } else {
         return id_class;
      }
   }

   private static <T> rCi_1<T> id_class(rlr_3<T> var0, rqO_2 var1) {
      rVL var2 = var0.id_class();
      Object var3 = var2.id_class(var1);
      if (var3 == null) {
         throw new JsonParseException("Unknown object " + var1 + " for stat type " + rVL.h.id_break(var0));
      } else {
         return (rCi_1<T>)var0.id_break(var3);
      }
   }

   private static <T> rqO_2 id_class(rCi_1<T> var0) {
      return var0.id_protected().id_class().id_break(var0.id_throws());
   }

   private static XY id_break(JsonElement var0) {
      if (var0.isJsonPrimitive()) {
         boolean var3 = var0.getAsBoolean();
         return new XV(var3);
      } else {
         Object2BooleanOpenHashMap var1 = new Object2BooleanOpenHashMap();
         JsonObject var2 = rpY_2.id_private(var0, "criterion data");
         var2.entrySet().forEach(var1x -> {
            boolean var2x = rpY_2.id_byte((JsonElement)var1x.getValue(), "criterion test");
            var1.put((String)var1x.getKey(), var2x);
         });
         return new Xg_1(var1);
      }
   }
}
