package celestial;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class rrJg_1 {
   private String protected_ = null;
   public static final String class_ = "items";
   public static final String break_ = "type";
   public static final String byte_ = "active";

   public rrJg_1(String var1) {
      this.protected_ = var1;
   }

   private fN_2 class_(String var1) {
      String var2 = rrJA.class_() + "/" + var1;

      try {
         byte[] var3 = rrJN.break_(var2, QY.instanceof_().W());
         return fN_2.class_(new ByteArrayInputStream(var3));
      } catch (IOException var4) {
         rrbb_3.protected_("Error loading item texture " + var1 + ": " + var4.getClass().getName() + ": " + var4.getMessage());
         return null;
      }
   }

   public rrJV class_(JsonElement var1) {
      if (var1 == null) {
         throw new JsonParseException("JSON object is null, player: " + this.protected_);
      } else {
         JsonObject var2 = (JsonObject)var1;
         rrJV var3 = new rrJV();
         JsonArray var4 = (JsonArray)var2.get("items");
         if (var4 != null) {
            for (int var5 = 0; var5 < var4.size(); var5++) {
               JsonObject var6 = (JsonObject)var4.get(var5);
               boolean var7 = rrWf_1.class_(var6, "active", true);
               if (var7) {
                  String var8 = rrWf_1.class_(var6, "type");
                  if (var8 == null) {
                     rrbb_3.protected_("Item type is null, player: " + this.protected_);
                  } else {
                     String var9 = rrWf_1.class_(var6, "model");
                     if (var9 == null) {
                        var9 = "items/" + var8 + "/model.cfg";
                     }

                     rrJR var10 = this.break_(var9);
                     if (var10 != null) {
                        if (!var10.protected_()) {
                           String var11 = rrWf_1.class_(var6, "texture");
                           if (var11 == null) {
                              var11 = "items/" + var8 + "/users/" + this.protected_ + ".png";
                           }

                           fN_2 var12 = this.class_(var11);
                           if (var12 == null) {
                              continue;
                           }

                           var10.class_(var12);
                           rqO_2 var13 = new rqO_2("optifine.net", var11);
                           var10.class_(var13);
                        }

                        var3.class_(var10);
                     }
                  }
               }
            }
         }

         return var3;
      }
   }

   private rrJR break_(String var1) {
      String var2 = rrJA.class_() + "/" + var1;

      try {
         byte[] var3 = rrJN.break_(var2, QY.instanceof_().W());
         String var4 = new String(var3, "ASCII");
         JsonParser var5 = new JsonParser();
         JsonObject var6 = (JsonObject)var5.parse(var4);
         return rrJY.class_(var6);
      } catch (Exception var7) {
         rrbb_3.protected_("Error loading item model " + var1 + ": " + var7.getClass().getName() + ": " + var7.getMessage());
         return null;
      }
   }
}
