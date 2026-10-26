package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class rrJg_1 {
   private String id_protected = null;
   public static final String id_class = "items";
   public static final String id_break = "type";
   public static final String id_byte = "active";

   public rrJg_1(String var1) {
      this.id_protected = var1;
   }

   private fN_2 id_class(String var1) {
      String var2 = rrJA.id_class() + "/" + var1;

      try {
         byte[] var3 = rrJN.id_break(var2, QY.id_instanceof().W());
         return fN_2.id_class(new ByteArrayInputStream(var3));
      } catch (IOException var4) {
         rrbb_3.id_protected("Error loading item texture " + var1 + ": " + var4.getClass().getName() + ": " + var4.getMessage());
         return null;
      }
   }

   public rrJV id_class(JsonElement var1) {
      if (var1 == null) {
         throw new JsonParseException("JSON object is null, player: " + this.id_protected);
      } else {
         JsonObject var2 = (JsonObject)var1;
         rrJV var3 = new rrJV();
         JsonArray var4 = (JsonArray)var2.get("items");
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.size(); var5++) {
               JsonObject var6 = (JsonObject)var4.get(var5);
               boolean var7 = rrWf_1.id_class(var6, "active", true);
               if (var7) {
                  String var8 = rrWf_1.id_class(var6, "type");
                  if (var8 == null) {
                     rrbb_3.id_protected("Item type is null, player: " + this.id_protected);
                  } else {
                     String var9 = rrWf_1.id_class(var6, "model");
                     if (var9 == null) {
                        var9 = "items/" + var8 + "/model.cfg";
                     }

                     rrJR var10 = this.id_break(var9);
                     if (var10 != null) {
                        if (!var10.id_protected()) {
                           String var11 = rrWf_1.id_class(var6, "texture");
                           if (var11 == null) {
                              var11 = "items/" + var8 + "/users/" + this.id_protected + ".png";
                           }

                           fN_2 var12 = this.id_class(var11);
                           if (var12 == null) {
                              continue;
                           }

                           var10.id_class(var12);
                           rqO_2 var13 = new rqO_2("optifine.net", var11);
                           var10.id_class(var13);
                        }

                        var3.id_class(var10);
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   private rrJR id_break(String var1) {
      String var2 = rrJA.id_class() + "/" + var1;

      try {
         byte[] var3 = rrJN.id_break(var2, QY.id_instanceof().W());
         String var4 = new String(var3, "ASCII");
         JsonParser var5 = new JsonParser();
         JsonObject var6 = (JsonObject)var5.parse(var4);
         return rrJY.id_class(var6);
      } catch (Exception var7) {
         rrbb_3.id_protected("Error loading item model " + var1 + ": " + var7.getClass().getName() + ": " + var7.getMessage());
         return null;
      }
   }
}
