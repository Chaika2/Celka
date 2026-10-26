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
   private static final Logger class_ = LogManager.getLogger();
   private static final int break_ = ".json".length();
   private final Gson byte_;
   private final String protected_;

   public jf_3(Gson var1, String var2) {
      this.byte_ = var1;
      this.protected_ = var2;
   }

   protected Map<rqO_2, JsonElement> class_(rAL var1) {
      HashMap var2 = Maps.newHashMap();
      int var3 = this.protected_.length() + 1;

      for (rqO_2 var5 : var1.class_(this.protected_, var0 -> var0.endsWith(".json"))) {
         String var6 = var5.break_();
         rqO_2 var7 = new rqO_2(var5.byte_(), var6.substring(var3, var6.length() - break_));

         try (
            rAF var8 = var1.class_(var5);
            InputStream var9 = var8.break_();
            BufferedReader var10 = new BufferedReader(new InputStreamReader(var9, StandardCharsets.UTF_8));
         ) {
            JsonElement var11 = rpY_2.class_(this.byte_, var10, JsonElement.class);
            if (var11 != null) {
               JsonElement var12 = var2.put(var7, var11);
               if (var12 != null) {
                  throw new IllegalStateException("Duplicate data file ignored with ID " + var7);
               }
            } else {
               class_.error("Couldn't load data file {} from {} as it's null or empty", var7, var5);
            }
         } catch (IOException | JsonParseException | IllegalArgumentException var19) {
            class_.error("Couldn't parse data file {} from {}", var7, var5, var19);
         }
      }

      return var2;
   }
}
