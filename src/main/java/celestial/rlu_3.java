/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.aI_2;
import celestial.rAL;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rVL;
import celestial.rXs_1;
import celestial.rdb_3;
import celestial.rlA_2;
import celestial.rlM_2;
import celestial.rlQ_2;
import celestial.rlW_2;
import celestial.rlZ_2;
import celestial.rlv_3;
import celestial.rqO_2;
import celestial.xd_3;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class rlu_3
implements rAc_1 {
    private final rlv_3<xd_3> id_class = new rlv_3(rVL.id_strictfp::id_break, "tags/blocks", "block");
    private final rlv_3<rdb_3> id_break = new rlv_3(rVL.id_for::id_break, "tags/items", "item");
    private final rlv_3<rXs_1> id_byte = new rlv_3(rVL.id_default::id_break, "tags/fluids", "fluid");
    private final rlv_3<aI_2<?>> id_protected = new rlv_3(rVL.id_transient::id_break, "tags/entity_types", "entity_type");
    private rlQ_2 id_throws = rlQ_2.id_class;

    @Override
    public CompletableFuture<Void> id_class(rAu_1 rAu_12, rAL rAL2, Executor executor, Executor executor2) {
        CompletableFuture<Map<rqO_2, rlM_2>> completableFuture = this.id_class.id_class(rAL2, executor);
        CompletableFuture<Map<rqO_2, rlM_2>> completableFuture2 = this.id_break.id_class(rAL2, executor);
        CompletableFuture<Map<rqO_2, rlM_2>> completableFuture3 = this.id_byte.id_class(rAL2, executor);
        CompletableFuture<Map<rqO_2, rlM_2>> completableFuture4 = this.id_protected.id_class(rAL2, executor);
        return ((CompletableFuture)CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3, completableFuture4).thenCompose(rAu_12::id_class)).thenAcceptAsync(void_ -> {
            rlW_2<aI_2<?>> rlW_22;
            rlW_2<rXs_1> rlW_23;
            rlW_2<rdb_3> rlW_24;
            rlW_2<xd_3> rlW_25 = this.id_class.id_class((Map)completableFuture.join());
            rlQ_2 rlQ_22 = rlQ_2.id_class(rlW_25, rlW_24 = this.id_break.id_class((Map)completableFuture2.join()), rlW_23 = this.id_byte.id_class((Map)completableFuture3.join()), rlW_22 = this.id_protected.id_class((Map)completableFuture4.join()));
            Multimap<rqO_2, rqO_2> multimap = rlA_2.id_break(rlQ_22);
            if (!multimap.isEmpty()) {
                throw new IllegalStateException("Missing required tags: " + multimap.entries().stream().map(entry -> entry.getKey() + ":" + entry.getValue()).sorted().collect(Collectors.joining(",")));
            }
            rlZ_2.id_class(rlQ_22);
            this.id_throws = rlQ_22;
        }, executor2);
    }

    public rlQ_2 id_break() {
        return this.id_throws;
    }
}

