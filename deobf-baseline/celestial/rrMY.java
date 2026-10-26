package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class rrMY {
   public static final String id_class = "entity";
   public static final String id_break = "texture";
   public static final String id_byte = "shadowSize";
   public static final String id_protected = "type";
   public static final String id_throws = "textureSize";
   public static final String id_case = "usePlayerTexture";
   public static final String id_catch = "models";
   public static final String id_private = "animations";
   public static final String id_implements = "id";
   public static final String id_finally = "baseId";
   public static final String id_extends = "model";
   public static final String id_native = "type";
   public static final String id_volatile = "part";
   public static final String id_final = "attach";
   public static final String id_package = "invertAxis";
   public static final String id_int = "mirrorTexture";
   public static final String id_new = "translate";
   public static final String id_continue = "rotate";
   public static final String id_super = "scale";
   public static final String id_this = "boxes";
   public static final String id_else = "sprites";
   public static final String id_synchronized = "submodel";
   public static final String id_return = "submodels";
   public static final String id_public = "textureOffset";
   public static final String id_goto = "coordinates";
   public static final String id_while = "sizeAdd";
   public static final String id_try = "EntityModel";
   public static final String id_instanceof = "EntityModelPart";

   public static rqO_2 id_class(String var0, String var1, String var2) {
      if (!var1.endsWith(var2)) {
         var1 = var1 + var2;
      }

      if (!var1.contains("/")) {
         var1 = var0 + "/" + var1;
      } else if (var1.startsWith("./")) {
         var1 = var0 + "/" + var1.substring(2);
      } else if (var1.startsWith("~/")) {
         var1 = "optifine/" + var1.substring(2);
      }

      return new rqO_2(var1);
   }

   public static rrMU id_class(JsonObject var0, int[] var1, String var2) {
      String var3 = rrWf_1.id_class(var0, "part");
      id_class(var3, "Model part not specified, missing \"replace\" or \"attachTo\".");
      boolean var4 = rrWf_1.id_class(var0, "attach", false);
      rrMR var5 = new rrMR(HU::id_protected);
      if (var1 != null) {
         var5.id_return = var1[0];
         var5.id_public = var1[1];
      }

      rrXx_1 var6 = null;
      JsonArray var7 = (JsonArray)var0.get("animations");
      if (var7 != null) {
         ArrayList var8 = new ArrayList();

         for (int var9 = 0; var9 < var7.size(); var9++) {
            JsonObject var10 = (JsonObject)var7.get(var9);

            for (Entry var12 : var10.entrySet()) {
               String var13 = (String)var12.getKey();
               String var14 = ((JsonElement)var12.getValue()).getAsString();
               rrXz_1 var15 = new rrXz_1(var13, var14);
               var8.add(var15);
            }
         }

         if (var8.size() > 0) {
            rrXz_1[] var17 = var8.toArray(new rrXz_1[var8.size()]);
            var6 = new rrXx_1(var17);
         }
      }

      Iq_1 var16 = rrJY.id_class(var0, var5, var1, var2);
      return new rrMU(var3, var4, var16, var6);
   }

   private static void id_class(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   public static JsonObject id_class(rqO_2 var0) throws IOException, JsonParseException {
      InputStream var1 = rrbb_3.id_class(var0);
      if (var1 == null) {
         return null;
      } else {
         String var2 = rrbb_3.id_class(var1, "ASCII");
         var1.close();
         JsonParser var3 = new JsonParser();
         return (JsonObject)var3.parse(var2);
      }
   }

   public static rrMK id_class(JsonObject var0, String var1) {
      rrMz_1 var2 = new rrMz_1("CustomEntityModels");
      String var3 = var2.id_class(var1);
      String var4 = var2.id_break(var1);
      String var5 = rrWf_1.id_class(var0, "texture");
      int[] var6 = rrWf_1.id_break(var0.get("textureSize"), 2);
      float var7 = rrWf_1.id_class(var0, "shadowSize", -1.0F);
      JsonArray var8 = (JsonArray)var0.get("models");
      id_class(var8, "Missing models");
      HashMap var9 = new HashMap();
      ArrayList var10 = new ArrayList();

      for (int var11 = 0; var11 < var8.size(); var11++) {
         JsonObject var12 = (JsonObject)var8.get(var11);
         id_class(var12, var9);
         id_class(var12, var9, var4);
         id_break(var12, var9);
         rrMU var13 = id_class(var12, var6, var4);
         if (var13 != null) {
            var10.add(var13);
         }
      }

      rrMU[] var14 = var10.toArray(new rrMU[var10.size()]);
      rqO_2 var15 = null;
      if (var5 != null) {
         var15 = id_class(var4, var5, ".png");
      }

      return new rrMK(var3, var4, var15, var14, var7);
   }

   private static void id_class(JsonObject var0, Map var1) {
      String var2 = rrWf_1.id_class(var0, "baseId");
      if (var2 != null) {
         JsonObject var3 = (JsonObject)var1.get(var2);
         if (var3 == null) {
            rrbb_3.id_protected("BaseID not found: " + var2);
         } else {
            id_class(var3, var0);
         }
      }
   }

   private static void id_class(JsonObject var0, Map var1, String var2) {
      String var3 = rrWf_1.id_class(var0, "model");
      if (var3 != null) {
         rqO_2 var4 = id_class(var2, var3, ".jpm");

         try {
            JsonObject var5 = id_class(var4);
            if (var5 == null) {
               rrbb_3.id_protected("Model not found: " + var4);
               return;
            }

            id_class(var5, var0);
         } catch (IOException var6) {
            rrbb_3.id_throws(var6.getClass().getName() + ": " + var6.getMessage());
         } catch (JsonParseException var7) {
            rrbb_3.id_throws(var7.getClass().getName() + ": " + var7.getMessage());
         } catch (Exception var8) {
            var8.printStackTrace();
         }
      }
   }

   private static void id_class(JsonObject var0, JsonObject var1) {
      for (Entry var3 : var0.entrySet()) {
         if (!((String)var3.getKey()).equals("id") && !var1.has((String)var3.getKey())) {
            var1.add((String)var3.getKey(), (JsonElement)var3.getValue());
         }
      }
   }

   private static void id_break(JsonObject var0, Map var1) {
      String var2 = rrWf_1.id_class(var0, "id");
      if (var2 != null) {
         if (var2.length() < 1) {
            rrbb_3.id_protected("Empty model ID: " + var2);
         } else if (var1.containsKey(var2)) {
            rrbb_3.id_protected("Duplicate model ID: " + var2);
         } else {
            var1.put(var2, var0);
         }
      }
   }
}
