package celestial;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rlv_3<T> {
   private static final Logger id_class = LogManager.getLogger();
   private static final Gson id_break = new Gson();
   private static final int id_byte = ".json".length();
   private final Function<rqO_2, Optional<T>> id_protected;
   private final String id_throws;
   private final String id_case;

   public rlv_3(Function<rqO_2, Optional<T>> var1, String var2, String var3) {
      this.id_protected = var1;
      this.id_throws = var2;
      this.id_case = var3;
   }

   public rlW_2<T> id_class(Map<rqO_2, rlM_2> var1) {
      HashMap var2 = Maps.newHashMap();
      Function var3 = var2::get;
      Function var4 = var1x -> this.id_protected.apply(var1x).orElse(null);

      while (!var1.isEmpty()) {
         boolean var5 = false;
         Iterator var6 = var1.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Optional var8 = ((rlM_2)var7.getValue()).id_class(var3, var4);
            if (var8.isPresent()) {
               var2.put((rqO_2)var7.getKey(), (rlb_3)var8.get());
               var6.remove();
               var5 = true;
            }
         }

         if (!var5) {
            break;
         }
      }

      var1.forEach(
         (var3x, var4x) -> id_class.error(
               "Couldn't load {} tag {} as it is missing following references: {}",
               this.id_case,
               var3x,
               var4x.id_break(var3, var4).map(Objects::toString).collect(Collectors.joining(","))
            )
      );
      return rlW_2.id_class(var2);
   }

   public CompletableFuture<Map<rqO_2, rlM_2>> id_class(rAL var1, Executor var2) {
      return CompletableFuture.supplyAsync(() -> {
         HashMap var2x = Maps.newHashMap();

         for (rqO_2 var4 : var1.id_class(this.id_throws, var0 -> var0.endsWith(".json"))) {
            String var5 = var4.id_break();
            rqO_2 var6 = new rqO_2(var4.id_byte(), var5.substring(this.id_throws.length() + 1, var5.length() - id_byte));

            try {
               for (rAF var8 : var1.id_byte(var4)) {
                  try (
                     InputStream var9 = var8.id_break();
                     BufferedReader var10 = new BufferedReader(new InputStreamReader(var9, StandardCharsets.UTF_8));
                  ) {
                     JsonObject var11 = rpY_2.id_class(id_break, var10, JsonObject.class);
                     if (var11 == null) {
                        id_class.error("Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", this.id_case, var6, var4, var8.id_byte());
                     } else {
                        var2x.computeIfAbsent(var6, var0 -> rlM_2.id_class()).id_class(var11, var8.id_byte());
                     }
                  } catch (IOException | RuntimeException var25) {
                     id_class.error("Couldn't read {} tag list {} from {} in data pack {}", this.id_case, var6, var4, var8.id_byte(), var25);
                  } finally {
                     IOUtils.closeQuietly(var8);
                  }
               }
            } catch (IOException var27) {
               id_class.error("Couldn't read {} tag list {} from {}", this.id_case, var6, var4, var27);
            }
         }

         return var2x;
      }, var2);
   }
}
