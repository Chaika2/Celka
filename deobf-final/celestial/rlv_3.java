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
   private static final Logger class_ = LogManager.getLogger();
   private static final Gson break_ = new Gson();
   private static final int byte_ = ".json".length();
   private final Function<rqO_2, Optional<T>> protected_;
   private final String throws_;
   private final String case_;

   public rlv_3(Function<rqO_2, Optional<T>> var1, String var2, String var3) {
      this.protected_ = var1;
      this.throws_ = var2;
      this.case_ = var3;
   }

   public rlW_2<T> class_(Map<rqO_2, rlM_2> var1) {
      HashMap var2 = Maps.newHashMap();
      Function var3 = var2::get;
      Function var4 = var1x -> this.protected_.apply(var1x).orElse(null);

      while (!var1.isEmpty()) {
         boolean var5 = false;
         Iterator var6 = var1.entrySet().iterator();

         while (var6.hasNext()) {
            Entry var7 = (Entry)var6.next();
            Optional var8 = ((rlM_2)var7.getValue()).class_(var3, var4);
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
         (var3x, var4x) -> class_.error(
               "Couldn't load {} tag {} as it is missing following references: {}",
               this.case_,
               var3x,
               var4x.break_(var3, var4).map(Objects::toString).collect(Collectors.joining(","))
            )
      );
      return rlW_2.class_(var2);
   }

   public CompletableFuture<Map<rqO_2, rlM_2>> class_(rAL var1, Executor var2) {
      return CompletableFuture.supplyAsync(() -> {
         HashMap var2x = Maps.newHashMap();

         for (rqO_2 var4 : var1.class_(this.throws_, var0 -> var0.endsWith(".json"))) {
            String var5 = var4.break_();
            rqO_2 var6 = new rqO_2(var4.byte_(), var5.substring(this.throws_.length() + 1, var5.length() - byte_));

            try {
               for (rAF var8 : var1.byte_(var4)) {
                  try (
                     InputStream var9 = var8.break_();
                     BufferedReader var10 = new BufferedReader(new InputStreamReader(var9, StandardCharsets.UTF_8));
                  ) {
                     JsonObject var11 = rpY_2.class_(break_, var10, JsonObject.class);
                     if (var11 == null) {
                        class_.error("Couldn't load {} tag list {} from {} in data pack {} as it is empty or null", this.case_, var6, var4, var8.byte_());
                     } else {
                        var2x.computeIfAbsent(var6, var0 -> rlM_2.class_()).class_(var11, var8.byte_());
                     }
                  } catch (IOException | RuntimeException var25) {
                     class_.error("Couldn't read {} tag list {} from {} in data pack {}", this.case_, var6, var4, var8.byte_(), var25);
                  } finally {
                     IOUtils.closeQuietly(var8);
                  }
               }
            } catch (IOException var27) {
               class_.error("Couldn't read {} tag list {} from {}", this.case_, var6, var4, var27);
            }
         }

         return var2x;
      }, var2);
   }
}
