package celestial;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.regex.Pattern;

public class rgB_2 implements JsonDeserializer<rVi_1>, JsonSerializer<rgP_2> {
   private static final Gson id_class = rqR_2.id_class((Supplier<Gson>)(() -> {
      GsonBuilder var0 = new GsonBuilder();
      var0.disableHtmlEscaping();
      var0.registerTypeHierarchyAdapter(rgP_2.class, new rgB_2());
      var0.registerTypeHierarchyAdapter(rgc_3.class, new rgm_3());
      var0.registerTypeAdapterFactory(new rpd_3());
      return var0.create();
   }));
   private static final Field id_break = rqR_2.id_class((Supplier<Field>)(() -> {
      try {
         new JsonReader(new StringReader(""));
         Field var0 = JsonReader.class.getDeclaredField("pos");
         var0.setAccessible(true);
         return var0;
      } catch (NoSuchFieldException var1) {
         throw new IllegalStateException("Couldn't get field 'pos' for JsonReader", var1);
      }
   }));
   private static final Field id_byte = rqR_2.id_class((Supplier<Field>)(() -> {
      try {
         new JsonReader(new StringReader(""));
         Field var0 = JsonReader.class.getDeclaredField("lineStart");
         var0.setAccessible(true);
         return var0;
      } catch (NoSuchFieldException var1) {
         throw new IllegalStateException("Couldn't get field 'lineStart' for JsonReader", var1);
      }
   }));

   private void id_class(rgc_3 var1, JsonObject var2, JsonSerializationContext var3) {
      JsonElement var4 = var3.serialize(var1);
      if (var4.isJsonObject()) {
         JsonObject var5 = (JsonObject)var4;

         for (Entry var7 : var5.entrySet()) {
            var2.add((String)var7.getKey(), (JsonElement)var7.getValue());
         }
      }
   }

   public static rVi_1 id_class(com.mojang.brigadier.StringReader var0) {
      try {
         JsonReader var1 = new JsonReader(new StringReader(var0.getRemaining()));
         var1.setLenient(false);
         rVi_1 var2 = (rVi_1)id_class.getAdapter(rVi_1.class).read(var1);
         var0.setCursor(var0.getCursor() + id_class(var1));
         return var2;
      } catch (IOException | StackOverflowError var3) {
         throw new JsonParseException(var3);
      }
   }

   private static int id_class(JsonReader var0) {
      try {
         return id_break.getInt(var0) - id_byte.getInt(var0) + 1;
      } catch (IllegalAccessException var2) {
         throw new IllegalStateException("Couldn't read position of JsonReader", var2);
      }
   }

   public rVi_1 id_class(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      boolean var4 = (cq_3)QY.id_instanceof().id_class[19] != null
         && (rrfq_3)rrfp_3.id_class[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]
         && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_throws().id_super();
      if (var1.isJsonPrimitive()) {
         if (var4) {
            String var15 = var1.getAsString();
            if (((Pattern)StreamerMode.id_break[3]).matcher(var15).find()) {
               return new rgN_2(((Pattern)StreamerMode.id_break[3]).matcher(var15).replaceAll("celestial"));
            }

            if (((Pattern)StreamerMode.id_break[4]).matcher(var15).find()) {
               return new rgN_2(((Pattern)StreamerMode.id_break[4]).matcher(var15).replaceAll("CelAC"));
            }
         }

         return new rgN_2(var1.getAsString());
      } else if (!var1.isJsonObject()) {
         if (var1.isJsonArray()) {
            JsonArray var14 = var1.getAsJsonArray();
            rVi_1 var16 = null;

            for (JsonElement var26 : var14) {
               rVi_1 var29 = this.id_class(var26, var26.getClass(), var3);
               if (var16 == null) {
                  var16 = var29;
               } else {
                  var16.id_class(var29);
               }
            }

            return var16;
         } else {
            throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
         }
      } else {
         JsonObject var5 = var1.getAsJsonObject();
         Object var6;
         if (var5.has("text")) {
            if (var4) {
               String var7 = rpY_2.id_case(var5, "text");
               if (((Pattern)StreamerMode.id_break[3]).matcher(var7).find()) {
                  var6 = new rgN_2(((Pattern)StreamerMode.id_break[3]).matcher(var7).replaceAll("celestial"));
               } else if (((Pattern)StreamerMode.id_break[4]).matcher(var7).find()) {
                  var6 = new rgN_2(((Pattern)StreamerMode.id_break[4]).matcher(var7).replaceAll("CelAC"));
               } else {
                  var6 = new rgN_2(rpY_2.id_case(var5, "text"));
               }
            } else {
               var6 = new rgN_2(rpY_2.id_case(var5, "text"));
            }
         } else if (var5.has("translate")) {
            String var17 = rpY_2.id_case(var5, "translate");
            if (var5.has("with")) {
               JsonArray var8 = rpY_2.id_volatile(var5, "with");
               Object[] var9 = new Object[var8.size()];

               for (int var10 = 0; var10 < var9.length; var10++) {
                  var9[var10] = this.id_class(var8.get(var10), var2, var3);
                  if (var9[var10] instanceof rgN_2) {
                     rgN_2 var11 = (rgN_2)var9[var10];
                     if (var11.id_class().id_catch() && var11.id_protected().isEmpty()) {
                        var9[var10] = var11.id_private();
                     }
                  }
               }

               var6 = new rgn_3(var17, var9);
            } else {
               var6 = new rgn_3(var17);
            }
         } else if (var5.has("score")) {
            JsonObject var18 = rpY_2.id_native(var5, "score");
            if (!var18.has("name") || !var18.has("objective")) {
               throw new JsonParseException("A score component needs a least a name and an objective");
            }

            var6 = new rgz_3(rpY_2.id_case(var18, "name"), rpY_2.id_case(var18, "objective"));
         } else if (var5.has("selector")) {
            var6 = new rgQ_2(rpY_2.id_case(var5, "selector"));
         } else if (var5.has("keybind")) {
            var6 = new rgh_3(rpY_2.id_case(var5, "keybind"));
         } else {
            if (!var5.has("nbt")) {
               throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
            }

            String var19 = rpY_2.id_case(var5, "nbt");
            boolean var23 = rpY_2.id_class(var5, "interpret", false);
            if (var5.has("block")) {
               var6 = new rgd_3(var19, var23, rpY_2.id_case(var5, "block"));
            } else if (var5.has("entity")) {
               var6 = new rgk_3(var19, var23, rpY_2.id_case(var5, "entity"));
            } else {
               if (!var5.has("storage")) {
                  throw new JsonParseException("Don't know how to turn " + var1 + " into a Component");
               }

               var6 = new rgW_2(var19, var23, new rqO_2(rpY_2.id_case(var5, "storage")));
            }
         }

         if (var5.has("extra")) {
            JsonArray var20 = rpY_2.id_volatile(var5, "extra");
            if (var20.size() <= 0) {
               throw new JsonParseException("Unexpected empty array of components");
            }

            for (int var24 = 0; var24 < var20.size(); var24++) {
               ((rVi_1)var6).id_class(this.id_class(var20.get(var24), var2, var3));
            }
         }

         ((rVi_1)var6).id_class((rgc_3)var3.deserialize(var1, rgc_3.class));
         if (var4) {
            String var21 = ((rVi_1)var6).getString().toLowerCase();
            if (var21.contains("funtime")) {
               StreamerMode.id_class((rVi_1)var6, "funtime", (Map<Integer, String>)StreamerMode.id_break[5]);
            }

            if (var21.contains("фантайм")) {
               StreamerMode.id_class((rVi_1)var6, "фантайм", (Map<Integer, String>)StreamerMode.id_break[5]);
            }

            if (var21.contains("funac")) {
               StreamerMode.id_class((rVi_1)var6, "funac", (Map<Integer, String>)StreamerMode.id_break[6]);
            }

            rgc_3 var25 = ((rVi_1)var6).id_class();
            if (var25.id_class() != null) {
               int var27 = var25.id_class().id_class();
               if (StreamerMode.id_class(var27)) {
                  ((rVi_1)var6).id_class(var25.id_class((rVa_1)StreamerMode.id_break[7]));
               }
            }

            for (rgP_2 var30 : ((rVi_1)var6).id_protected()) {
               if (var30 instanceof rVi_1) {
                  rVi_1 var31 = (rVi_1)var30;
                  rgc_3 var12 = var31.id_class();
                  if (var12.id_class() != null) {
                     int var13 = var12.id_class().id_class();
                     if (StreamerMode.id_class(var13)) {
                        var31.id_class(var12.id_class((rVa_1)StreamerMode.id_break[7]));
                     }
                  }
               }
            }
         }

         return (rVi_1)var6;
      }
   }

   public static String id_class(rgP_2 var0) {
      return id_class.toJson(var0);
   }

   public JsonElement id_class(rgP_2 var1, Type var2, JsonSerializationContext var3) {
      JsonObject var4 = new JsonObject();
      if (!var1.id_class().id_catch()) {
         this.id_class(var1.id_class(), var4, var3);
      }

      if (!var1.id_protected().isEmpty()) {
         JsonArray var5 = new JsonArray();

         for (rgP_2 var7 : var1.id_protected()) {
            var5.add(this.id_class(var7, var7.getClass(), var3));
         }

         var4.add("extra", var5);
      }

      if (var1 instanceof rgN_2) {
         var4.addProperty("text", ((rgN_2)var1).id_private());
      } else if (var1 instanceof rgn_3 var11) {
         var4.addProperty("translate", var11.id_implements());
         if (var11.id_extends() != null && var11.id_extends().length > 0) {
            JsonArray var16 = new JsonArray();

            for (Object var10 : var11.id_extends()) {
               if (var10 instanceof rgP_2) {
                  var16.add(this.id_class((rgP_2)var10, var10.getClass(), var3));
               } else {
                  var16.add(new JsonPrimitive(String.valueOf(var10)));
               }
            }

            var4.add("with", var16);
         }
      } else if (var1 instanceof rgz_3 var12) {
         JsonObject var17 = new JsonObject();
         var17.addProperty("name", var12.id_private());
         var17.addProperty("objective", var12.id_implements());
         var4.add("score", var17);
      } else if (var1 instanceof rgQ_2 var13) {
         var4.addProperty("selector", var13.id_private());
      } else if (var1 instanceof rgh_3 var14) {
         var4.addProperty("keybind", var14.id_implements());
      } else {
         if (!(var1 instanceof rgx_3 var15)) {
            throw new IllegalArgumentException("Don't know how to serialize " + var1 + " as a Component");
         }

         var4.addProperty("nbt", var15.id_private());
         var4.addProperty("interpret", var15.id_implements());
         if (var1 instanceof rgd_3 var18) {
            var4.addProperty("block", var18.id_extends());
         } else if (var1 instanceof rgk_3 var19) {
            var4.addProperty("entity", var19.id_extends());
         } else {
            if (!(var1 instanceof rgW_2 var20)) {
               throw new IllegalArgumentException("Don't know how to serialize " + var1 + " as a Component");
            }

            var4.addProperty("storage", var20.id_extends().toString());
         }
      }

      return var4;
   }

   public static rVi_1 id_class(String var0) {
      return rpY_2.id_class(id_class, var0, rVi_1.class, false);
   }

   public static rVi_1 id_class(JsonElement var0) {
      return (rVi_1)id_class.fromJson(var0, rVi_1.class);
   }

   public static JsonElement id_break(rgP_2 var0) {
      return id_class.toJsonTree(var0);
   }

   public static rVi_1 id_break(String var0) {
      return rpY_2.id_class(id_class, var0, rVi_1.class, true);
   }
}
