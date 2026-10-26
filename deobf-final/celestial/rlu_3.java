package celestial;

import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class rlu_3 implements rAc_1 {
   private final rlv_3<xd_3> class_ = new rlv_3<>(rVL.strictfp_::break_, "tags/blocks", "block");
   private final rlv_3<rdb_3> break_ = new rlv_3<>(rVL.for_::break_, "tags/items", "item");
   private final rlv_3<rXs_1> byte_ = new rlv_3<>(rVL.default_::break_, "tags/fluids", "fluid");
   private final rlv_3<aI_2<?>> protected_ = new rlv_3<>(rVL.transient_::break_, "tags/entity_types", "entity_type");
   private rlQ_2 throws_ = rlQ_2.class_;

   @Override
   public CompletableFuture<Void> class_(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      CompletableFuture var5 = this.class_.class_(var2, var3);
      CompletableFuture var6 = this.break_.class_(var2, var3);
      CompletableFuture var7 = this.byte_.class_(var2, var3);
      CompletableFuture var8 = this.protected_.class_(var2, var3);
      return CompletableFuture.allOf(var5, var6, var7, var8)
         .thenCompose(var1::class_)
         .thenAcceptAsync(
            var5x -> {
               rlW_2 var6x = this.class_.class_((Map<rqO_2, rlM_2>)var5.join());
               rlW_2 var7x = this.break_.class_((Map<rqO_2, rlM_2>)var6.join());
               rlW_2 var8x = this.byte_.class_((Map<rqO_2, rlM_2>)var7.join());
               rlW_2 var9 = this.protected_.class_((Map<rqO_2, rlM_2>)var8.join());
               rlQ_2 var10 = rlQ_2.class_(var6x, var7x, var8x, var9);
               Multimap var11 = rlA_2.break_(var10);
               if (!var11.isEmpty()) {
                  throw new IllegalStateException(
                     "Missing required tags: "
                        + var11.entries().stream().map(var0 -> var0.getKey() + ":" + var0.getValue()).sorted().collect(Collectors.joining(","))
                  );
               } else {
                  rlZ_2.class_(var10);
                  this.throws_ = var10;
               }
            },
            var4
         );
   }

   public rlQ_2 break_() {
      return this.throws_;
   }
}
