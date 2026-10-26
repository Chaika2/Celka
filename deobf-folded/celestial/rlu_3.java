package celestial;

import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class rlu_3 implements rAc_1 {
   private final rlv_3<xd_3> id_class = new rlv_3<>(rVL.id_strictfp::id_break, "tags/blocks", "block");
   private final rlv_3<rdb_3> id_break = new rlv_3<>(rVL.id_for::id_break, "tags/items", "item");
   private final rlv_3<rXs_1> id_byte = new rlv_3<>(rVL.id_default::id_break, "tags/fluids", "fluid");
   private final rlv_3<aI_2<?>> id_protected = new rlv_3<>(rVL.id_transient::id_break, "tags/entity_types", "entity_type");
   private rlQ_2 id_throws = rlQ_2.id_class;

   @Override
   public CompletableFuture<Void> id_class(rAu_1 var1, rAL var2, Executor var3, Executor var4) {
      CompletableFuture var5 = this.id_class.id_class(var2, var3);
      CompletableFuture var6 = this.id_break.id_class(var2, var3);
      CompletableFuture var7 = this.id_byte.id_class(var2, var3);
      CompletableFuture var8 = this.id_protected.id_class(var2, var3);
      return CompletableFuture.allOf(var5, var6, var7, var8)
         .thenCompose(var1::id_class)
         .thenAcceptAsync(
            var5x -> {
               rlW_2 var6x = this.id_class.id_class((Map<rqO_2, rlM_2>)var5.join());
               rlW_2 var7x = this.id_break.id_class((Map<rqO_2, rlM_2>)var6.join());
               rlW_2 var8x = this.id_byte.id_class((Map<rqO_2, rlM_2>)var7.join());
               rlW_2 var9 = this.id_protected.id_class((Map<rqO_2, rlM_2>)var8.join());
               rlQ_2 var10 = rlQ_2.id_class(var6x, var7x, var8x, var9);
               Multimap var11 = rlA_2.id_break(var10);
               if (!var11.isEmpty()) {
                  throw new IllegalStateException(
                     "Missing required tags: "
                        + var11.entries().stream().map(var0 -> var0.getKey() + ":" + var0.getValue()).sorted().collect(Collectors.joining(","))
                  );
               } else {
                  rlZ_2.id_class(var10);
                  this.id_throws = var10;
               }
            },
            var4
         );
   }

   public rlQ_2 id_break() {
      return this.id_throws;
   }
}
