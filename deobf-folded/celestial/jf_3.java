package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class jf_3 extends jY_2<Map<rqO_2, JsonElement>> {
   private static final Logger id_class = LogManager.getLogger();
   private static final int id_break = ".json".length();
   private final Gson id_byte;
   private final String id_protected;

   public jf_3(Gson var1, String var2) {
      this.id_byte = var1;
      this.id_protected = var2;
   }

   protected Map<rqO_2, JsonElement> id_class(rAL var1) {
      HashMap var2 = Maps.newHashMap();
      int var3 = this.id_protected.length() + 1;

      for (rqO_2 var5 : var1.id_class(this.id_protected, var0 -> var0.endsWith(".json"))) {
         String var6 = var5.id_break();
         rqO_2 var7 = new rqO_2(var5.id_byte(), var6.substring(var3, var6.length() - id_break));

         try (
            rAF var8 = var1.id_class(var5);
            InputStream var9 = var8.id_break();
            BufferedReader var10 = new BufferedReader(new InputStreamReader(var9, StandardCharsets.UTF_8));
         ) {
            JsonElement var11 = rpY_2.id_class(this.id_byte, var10, JsonElement.class);
            if (var11 != null) {
               JsonElement var12 = var2.put(var7, var11);
               if (var12 != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + var7);
               }
            } else {
               id_class.error("Couldn't load data file {} from {} as it's null or empty", var7, var5);
            }
         } catch (IOException | JsonParseException | IllegalArgumentException var19) {
            id_class.error("Couldn't parse data file {} from {}", var7, var5, var19);
         }
      }

      return var2;
   }
}
