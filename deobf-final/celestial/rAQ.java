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
   private static final Logger class_ = LogManager.getLogger();
   private static final int break_ = "functions/".length();
   private static final int byte_ = ".mcfunction".length();
   private volatile Map<rqO_2, gt_3> protected_ = ImmutableMap.of();
   private final rlv_3<gt_3> throws_ = new rlv_3<>(this::class_, "tags/functions", "function");
   private volatile rlW_2<gt_3> case_ = rlW_2.byte_();
   private final int catch_;
   private final CommandDispatcher<gy_3> private_;

   public rlW_2<gt_3> byte_() {
      return this.case_;
   }

   public rAQ(int var1, CommandDispatcher<gy_3> var2) {
      this.catch_ = var1;
      this.private_ = var2;
   }

   public Optional<gt_3> class_(rqO_2 var1) {
      return Optional.ofNullable(this.protected_.get(var1));
   }

   @Override
   public CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      CompletableFuture var5 = this.throws_.class_(var2, var3);
      CompletableFuture var6 = CompletableFuture.<Collection<rqO_2>>supplyAsync(() -> var2.class_("functions", var0x -> var0x.endsWith(".mcfunction")), var3)
         .thenCompose(var3x -> {
            HashMap var4x = Maps.newHashMap();
            gy_3 var5x = new gy_3(gV_2.byte_, rjU_2.class_, rjK_2.class_, (rrEm_1)null, this.catch_, "", rgN_2.byte_, (rnW_2)null, (an_3)null);

            for (rqO_2 var7 : var3x) {
               String var8 = var7.break_();
               rqO_2 var9 = new rqO_2(var7.byte_(), var8.substring(break_, var8.length() - byte_));
               var4x.put(var9, CompletableFuture.supplyAsync(() -> {
                  List var5xx = class_(var2, var7);
                  return gt_3.class_(var9, this.private_, var5x, var5xx);
               }, var3));
            }

            CompletableFuture[] var10 = var4x.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf(var10).handle((var1xx, var2xx) -> var4x);
         });
      return var5.thenCombine(var6, Pair::of).thenCompose(var1::class_).thenAcceptAsync(var1x -> {
         Map var2x = (Map)var1x.getSecond();
         Builder var3x = ImmutableMap.builder();
         var2x.forEach((var1xx, var2xx) -> var2xx.handle((var2xxx, var3xx) -> {
               if (var3xx != null) {
                  class_.error("Failed to load function {}", var1xx, var3xx);
               } else {
                  var3x.put(var1xx, var2xxx);
               }

               return null;
            }).join());
         this.protected_ = var3x.build();
         this.case_ = this.throws_.class_((Map<rqO_2, rlM_2>)var1x.getFirst());
      }, var4);
   }

   private static List<String> class_(rAL var0, rqO_2 var1) {
      try {
         List var3;
         try (rAF var2 = var0.class_(var1)) {
            var3 = IOUtils.readLines(var2.break_(), StandardCharsets.UTF_8);
         }

         return var3;
      } catch (IOException var7) {
         throw new CompletionException(var7);
      }
   }

   public Map<rqO_2, gt_3> break_() {
      return this.protected_;
   }

   public rlb_3<gt_3> break_(rqO_2 var1) {
      return this.case_.break_(var1);
   }
}
