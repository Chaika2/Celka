package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class rrJY {
   private static JsonParser id_void = new JsonParser();
   public static final String id_class = "type";
   public static final String id_break = "textureSize";
   public static final String id_byte = "usePlayerTexture";
   public static final String id_protected = "models";
   public static final String id_throws = "id";
   public static final String id_case = "baseId";
   public static final String id_catch = "type";
   public static final String id_private = "texture";
   public static final String id_implements = "textureSize";
   public static final String id_finally = "attachTo";
   public static final String id_extends = "invertAxis";
   public static final String id_native = "mirrorTexture";
   public static final String id_volatile = "translate";
   public static final String id_final = "rotate";
   public static final String id_package = "scale";
   public static final String id_int = "boxes";
   public static final String id_new = "sprites";
   public static final String id_continue = "submodel";
   public static final String id_super = "submodels";
   public static final String id_this = "textureOffset";
   public static final String id_else = "coordinates";
   public static final String id_synchronized = "sizeAdd";
   public static final String id_return = "uvDown";
   public static final String id_public = "uvUp";
   public static final String id_goto = "uvNorth";
   public static final String id_while = "uvSouth";
   public static final String id_try = "uvWest";
   public static final String id_instanceof = "uvEast";
   public static final String id_throw = "uvFront";
   public static final String id_interface = "uvBack";
   public static final String id_char = "uvLeft";
   public static final String id_abstract = "uvRight";
   public static final String id_long = "PlayerItem";
   public static final String id_float = "ModelBox";

   private rrJY() {
   }

   public static Iq_1 id_class(JsonObject var0, In_1 var1, int[] var2, String var3) {
      Iq_1 var4 = new Iq_1(var1);
      String var5 = rrWf_1.id_class(var0, "id");
      var4.id_class(var5);
      float var6 = rrWf_1.id_class(var0, "scale", 1.0F);
      var4.id_package = var6;
      var4.id_int = var6;
      var4.id_new = var6;
      String var7 = rrWf_1.id_class(var0, "texture");
      if (var7 != null) {
         var4.id_class(rrMY.id_class(var3, var7, ".png"));
      }

      int[] var8 = rrWf_1.id_break(var0.get("textureSize"), 2);
      if (var8 == null) {
         var8 = var2;
      }

      if (var8 != null) {
         var4.id_break(var8[0], var8[1]);
      }

      String var9 = rrWf_1.id_class(var0, "invertAxis", "").toLowerCase();
      boolean var10 = var9.contains("x");
      boolean var11 = var9.contains("y");
      boolean var12 = var9.contains("z");
      float[] var13 = rrWf_1.id_class(var0.get("translate"), 3, new float[3]);
      if (var10) {
         var13[0] = -var13[0];
      }

      if (var11) {
         var13[1] = -var13[1];
      }

      if (var12) {
         var13[2] = -var13[2];
      }

      float[] var14 = rrWf_1.id_class(var0.get("rotate"), 3, new float[3]);

      for (int var15 = 0; var15 < var14.length; var15++) {
         var14[var15] = var14[var15] / 180.0F * rfU_2.id_break;
      }

      if (var10) {
         var14[0] = -var14[0];
      }

      if (var11) {
         var14[1] = -var14[1];
      }

      if (var12) {
         var14[2] = -var14[2];
      }

      var4.id_class(var13[0], var13[1], var13[2]);
      var4.id_case = var14[0];
      var4.id_catch = var14[1];
      var4.id_private = var14[2];
      String var26 = rrWf_1.id_class(var0, "mirrorTexture", "").toLowerCase();
      boolean var16 = var26.contains("u");
      boolean var17 = var26.contains("v");
      if (var16) {
         var4.id_implements = true;
      }

      if (var17) {
         var4.id_final = true;
      }

      JsonArray var18 = var0.getAsJsonArray("boxes");
      if (var18 != null) {
         for (int var19 = 0; var19 < var18.size(); var19++) {
            JsonObject var20 = var18.get(var19).getAsJsonObject();
            int[] var21 = rrWf_1.id_break(var20.get("textureOffset"), 2);
            int[][] var22 = id_break(var20);
            if (var21 == null && var22 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var23 = rrWf_1.id_class(var20.get("coordinates"), 6);
            if (var23 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var10) {
               var23[0] = -var23[0] - var23[3];
            }

            if (var11) {
               var23[1] = -var23[1] - var23[4];
            }

            if (var12) {
               var23[2] = -var23[2] - var23[5];
            }

            float var24 = rrWf_1.id_class(var20, "sizeAdd", 0.0F);
            if (var22 != null) {
               var4.id_class(var22, var23[0], var23[1], var23[2], var23[3], var23[4], var23[5], var24);
            } else {
               var4.id_class(var21[0], var21[1]);
               var4.id_class(var23[0], var23[1], var23[2], (float)((int)var23[3]), (float)((int)var23[4]), (float)((int)var23[5]), var24);
            }
         }
      }

      JsonArray var27 = var0.getAsJsonArray("sprites");
      if (var27 != null) {
         for (int var28 = 0; var28 < var27.size(); var28++) {
            JsonObject var30 = var27.get(var28).getAsJsonObject();
            int[] var33 = rrWf_1.id_break(var30.get("textureOffset"), 2);
            if (var33 == null) {
               throw new JsonParseException("Texture offset not specified");
            }

            float[] var35 = rrWf_1.id_class(var30.get("coordinates"), 6);
            if (var35 == null) {
               throw new JsonParseException("Coordinates not specified");
            }

            if (var10) {
               var35[0] = -var35[0] - var35[3];
            }

            if (var11) {
               var35[1] = -var35[1] - var35[4];
            }

            if (var12) {
               var35[2] = -var35[2] - var35[5];
            }

            float var37 = rrWf_1.id_class(var30, "sizeAdd", 0.0F);
            var4.id_class(var33[0], var33[1]);
            var4.id_class(var35[0], var35[1], var35[2], (int)var35[3], (int)var35[4], (int)var35[5], var37);
         }
      }

      JsonObject var29 = (JsonObject)var0.get("submodel");
      if (var29 != null) {
         Iq_1 var31 = id_class(var29, var1, var8, var3);
         var4.id_break(var31);
      }

      JsonArray var32 = (JsonArray)var0.get("submodels");
      if (var32 != null) {
         for (int var34 = 0; var34 < var32.size(); var34++) {
            JsonObject var36 = (JsonObject)var32.get(var34);
            Iq_1 var38 = id_class(var36, var1, var8, var3);
            if (var38.id_byte() != null) {
               Iq_1 var25 = var4.id_break(var38.id_byte());
               if (var25 != null) {
                  rrbb_3.id_protected("Duplicate model ID: " + var38.id_byte());
               }
            }

            var4.id_break(var38);
         }
      }

      return var4;
   }

   public static rrJo_1 id_class(JsonObject var0, Dimension var1) {
      String var2 = rrWf_1.id_class(var0, "type");
      if (!rrbb_3.id_class((Object)var2, (Object)"ModelBox")) {
         rrbb_3.id_protected("Unknown model type: " + var2);
         return null;
      } else {
         String var3 = rrWf_1.id_class(var0, "attachTo");
         int var4 = id_break(var3);
         rrJj_1 var5 = new rrJj_1(HU::id_protected);
         var5.id_return = var1.width;
         var5.id_public = var1.height;
         Iq_1 var6 = id_class(var0, var5, (int[])null, (String)null);
         return new rrJo_1(var4, var6);
      }
   }

   public static rrJR id_class(JsonObject var0) {
      String var1 = rrWf_1.id_class(var0, "type");
      if (!rrbb_3.id_class((Object)var1, (Object)"PlayerItem")) {
         throw new JsonParseException("Unknown model type: " + var1);
      } else {
         int[] var2 = rrWf_1.id_break(var0.get("textureSize"), 2);
         id_class(var2, "Missing texture size");
         Dimension var3 = new Dimension(var2[0], var2[1]);
         boolean var4 = rrWf_1.id_class(var0, "usePlayerTexture", false);
         JsonArray var5 = (JsonArray)var0.get("models");
         id_class(var5, "Missing elements");
         HashMap var6 = new HashMap();
         ArrayList var7 = new ArrayList();
         new ArrayList();

         for (int var8 = 0; var8 < var5.size(); var8++) {
            JsonObject var9 = (JsonObject)var5.get(var8);
            String var10 = rrWf_1.id_class(var9, "baseId");
            if (var10 != null) {
               JsonObject var11 = (JsonObject)var6.get(var10);
               if (var11 == null) {
                  rrbb_3.id_protected("BaseID not found: " + var10);
                  continue;
               }

               for (Entry var13 : var11.entrySet()) {
                  if (!var9.has((String)var13.getKey())) {
                     var9.add((String)var13.getKey(), (JsonElement)var13.getValue());
                  }
               }
            }

            String var15 = rrWf_1.id_class(var9, "id");
            if (var15 != null) {
               if (!var6.containsKey(var15)) {
                  var6.put(var15, var9);
               } else {
                  rrbb_3.id_protected("Duplicate model ID: " + var15);
               }
            }

            rrJo_1 var16 = id_class(var9, var3);
            if (var16 != null) {
               var7.add(var16);
            }
         }

         rrJo_1[] var14 = var7.toArray(new rrJo_1[var7.size()]);
         return new rrJR(var3, var4, var14);
      }
   }

   private static rqO_2 id_class(String var0) {
      int var1 = var0.indexOf(58);
      if (var1 < 0) {
         return new rqO_2(var0);
      } else {
         String var2 = var0.substring(0, var1);
         String var3 = var0.substring(var1 + 1);
         return new rqO_2(var2, var3);
      }
   }

   private static void id_class(Object var0, String var1) {
      if (var0 == null) {
         throw new JsonParseException(var1);
      }
   }

   private static int id_break(String var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.equals("body")) {
         return 0;
      } else if (var0.equals("head")) {
         return 1;
      } else if (var0.equals("leftArm")) {
         return 2;
      } else if (var0.equals("rightArm")) {
         return 3;
      } else if (var0.equals("leftLeg")) {
         return 4;
      } else if (var0.equals("rightLeg")) {
         return 5;
      } else if (var0.equals("cape")) {
         return 6;
      } else {
         rrbb_3.id_protected("Unknown attachModel: " + var0);
         return 0;
      }
   }

   private static int[][] id_break(JsonObject var0) {
      int[][] var1 = new int[][]{
         rrWf_1.id_break(var0.get("uvDown"), 4),
         rrWf_1.id_break(var0.get("uvUp"), 4),
         rrWf_1.id_break(var0.get("uvNorth"), 4),
         rrWf_1.id_break(var0.get("uvSouth"), 4),
         rrWf_1.id_break(var0.get("uvWest"), 4),
         rrWf_1.id_break(var0.get("uvEast"), 4)
      };
      if (var1[2] == null) {
         var1[2] = rrWf_1.id_break(var0.get("uvFront"), 4);
      }

      if (var1[3] == null) {
         var1[3] = rrWf_1.id_break(var0.get("uvBack"), 4);
      }

      if (var1[4] == null) {
         var1[4] = rrWf_1.id_break(var0.get("uvLeft"), 4);
      }

      if (var1[5] == null) {
         var1[5] = rrWf_1.id_break(var0.get("uvRight"), 4);
      }

      boolean var2 = false;

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3] != null) {
            var2 = true;
         }
      }

      return !var2 ? (int[][])null : var1;
   }
}
