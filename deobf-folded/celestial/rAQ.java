package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAQ implements rAc_1 {
   private static final Logger id_class = LogManager.getLogger();
   private static final int id_break = "functions/".length();
   private static final int id_byte = ".mcfunction".length();
   private volatile Map<rqO_2, gt_3> id_protected = ImmutableMap.of();
   private final rlv_3<gt_3> id_throws = new rlv_3<>(this::id_class, "tags/functions", "function");
   private volatile rlW_2<gt_3> id_case = rlW_2.id_byte();
   private final int id_catch;
   private final CommandDispatcher<gy_3> id_private;

   public rlW_2<gt_3> id_byte() {
      return this.id_case;
   }

   public rAQ(int var1, CommandDispatcher<gy_3> var2) {
      this.id_catch = var1;
      this.id_private = var2;
   }

   public Optional<gt_3> id_class(rqO_2 var1) {
      return Optional.ofNullable(this.id_protected.get(var1));
   }

   @Override
   public CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      CompletableFuture var5 = this.id_throws.id_class(var2, var3);
      CompletableFuture var6 = CompletableFuture.<Collection<rqO_2>>supplyAsync(() -> var2.id_class("functions", var0x -> var0x.endsWith(".mcfunction")), var3)
         .thenCompose(var3x -> {
            HashMap var4x = Maps.newHashMap();
            gy_3 var5x = new gy_3(gV_2.id_byte, rjU_2.id_class, rjK_2.id_class, (rrEm_1)null, this.id_catch, "", rgN_2.id_byte, (rnW_2)null, (an_3)null);

            for (rqO_2 var7 : var3x) {
               String var8 = var7.id_break();
               rqO_2 var9 = new rqO_2(var7.id_byte(), var8.substring(id_break, var8.length() - id_byte));
               var4x.put(var9, CompletableFuture.supplyAsync(() -> {
                  List var5xx = id_class(var2, var7);
                  return gt_3.id_class(var9, this.id_private, var5x, var5xx);
               }, var3));
            }

            CompletableFuture[] var10 = var4x.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf(var10).handle((var1xx, var2xx) -> var4x);
         });
      return var5.thenCombine(var6, Pair::of).thenCompose(var1::id_class).thenAcceptAsync(var1x -> {
         Map var2x = (Map)var1x.getSecond();
         Builder var3x = ImmutableMap.builder();
         var2x.forEach((var1xx, var2xx) -> var2xx.handle((var2xxx, var3xx) -> {
               if (var3xx != null) {
                  id_class.error("Failed to load function {}", var1xx, var3xx);
               } else {
                  var3x.put(var1xx, var2xxx);
               }

               return null;
            }).join());
         this.id_protected = var3x.build();
         this.id_case = this.id_throws.id_class((Map<rqO_2, rlM_2>)var1x.getFirst());
      }, var4);
   }

   private static List<String> id_class(rAL var0, rqO_2 var1) {
      try {
         List var3;
         try (rAF var2 = var0.id_class(var1)) {
            var3 = IOUtils.readLines(var2.id_break(), StandardCharsets.UTF_8);
         }

         return var3;
      } catch (IOException var7) {
         throw new CompletionException(var7);
      }
   }

   public Map<rqO_2, gt_3> id_break() {
      return this.id_protected;
   }

   public rlb_3<gt_3> id_break(rqO_2 var1) {
      return this.id_case.id_break(var1);
   }
}
