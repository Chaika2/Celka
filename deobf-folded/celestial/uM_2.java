package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class uM_2 extends jY_2<Map<rqO_2, List<uc_3>>> {
   uM_2(ub_3 var1) {
      this.id_class = var1;
   }

   protected Map<rqO_2, List<uc_3>> id_class(rAL var1) {
      Gson var2 = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
      HashMap var3 = Maps.newHashMap();

      for (rqO_2 var5 : var1.id_class("font", var0 -> var0.endsWith(".json"))) {
         String var6 = var5.id_break();
         rqO_2 var7 = new rqO_2(var5.id_byte(), var6.substring("font/".length(), var6.length() - ".json".length()));
         List var8 = var3.computeIfAbsent(var7, var0 -> Lists.newArrayList(new uc_3[]{new uQ_2()}));

         try {
            for (rAF var10 : var1.id_byte(var5)) {
               try (
                  InputStream var11 = var10.id_break();
                  BufferedReader var12 = new BufferedReader(new InputStreamReader(var11, StandardCharsets.UTF_8));
               ) {
                  JsonArray var13 = rpY_2.id_volatile(rpY_2.id_class(var2, var12, JsonObject.class), "providers");

                  for (int var14 = var13.size() - 1; var14 >= 0; var14--) {
                     JsonObject var15 = rpY_2.id_private(var13.get(var14), "providers[" + var14 + "]");

                     try {
                        String var16 = rpY_2.id_case(var15, "type");
                        uN_2 var17 = uN_2.id_class(var16);
                        uc_3 var18 = var17.id_class(var15).id_class(var1);
                        if (var18 != null) {
                           var8.add(var18);
                        }
                     } catch (RuntimeException var21) {
                        ub_3.id_break.warn("Unable to read definition '{}' in fonts.json in resourcepack: '{}': {}", var7, var10.id_byte(), var21.getMessage());
                     }
                  }
               } catch (RuntimeException var24) {
                  ub_3.id_break.warn("Unable to load font '{}' in fonts.json in resourcepack: '{}': {}", var7, var10.id_byte(), var24.getMessage());
               }
            }
         } catch (IOException var25) {
            ub_3.id_break.warn("Unable to load font '{}' in fonts.json: {}", var7, var25.getMessage());
         }

         IntOpenHashSet var26 = new IntOpenHashSet();

         for (uc_3 var28 : var8) {
            var26.addAll(var28.id_class());
         }

         var26.forEach(var1x -> {
            if (var1x != 32) {
               for (uc_3 var3x : Lists.reverse(var8)) {
                  if (var3x.id_class(var1x) != null) {
                     break;
                  }
               }
            }
         });
      }

      return var3;
   }

   protected void id_class(Map<rqO_2, List<uc_3>> var1, rAL var2) {
      this.id_class.id_protected.values().forEach(uG_2::close);
      this.id_class.id_protected.clear();
      var1.forEach((var1x, var2x) -> {
         uG_2 var3 = new uG_2(this.id_class.id_throws, var1x);
         var3.id_class(Lists.reverse(var2x));
         this.id_class.id_protected.put(var1x, var3);
      });
   }

   @Override
   public String i_() {
      return "FontManager";
   }
}
