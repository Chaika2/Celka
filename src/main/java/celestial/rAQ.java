/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.datafixers.util.Pair
 *  org.apache.commons.io.IOUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.gV_2;
import celestial.gt_3;
import celestial.gy_3;
import celestial.rAF;
import celestial.rAL;
import celestial.rAc_1;
import celestial.rAu_1;
import celestial.rgN_2;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rlM_2;
import celestial.rlW_2;
import celestial.rlb_3;
import celestial.rlv_3;
import celestial.rqO_2;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rAQ
implements rAc_1 {
    private static final Logger id_class = LogManager.getLogger();
    private static final int id_break = "functions/".length();
    private static final int id_byte = ".mcfunction".length();
    private volatile Map<rqO_2, gt_3> id_protected = ImmutableMap.of();
    private final rlv_3<gt_3> id_throws = new rlv_3(this::id_class, "tags/functions", "function");
    private volatile rlW_2<gt_3> id_case = rlW_2.id_byte();
    private final int id_catch;
    private final CommandDispatcher<gy_3> id_private;

    public rlW_2<gt_3> id_byte() {
        return this.id_case;
    }

    public rAQ(int n, CommandDispatcher<gy_3> commandDispatcher) {
        this.id_catch = n;
        this.id_private = commandDispatcher;
    }

    public Optional<gt_3> id_class(rqO_2 rqO_22) {
        return Optional.ofNullable(this.id_protected.get(rqO_22));
    }

    @Override
    public CompletableFuture<Void> id_class(rAu_1 rAu_12, rAL rAL2, Executor executor, Executor executor2) {
        CompletableFuture<Map<rqO_2, rlM_2>> completableFuture = this.id_throws.id_class(rAL2, executor);
        CompletionStage completionStage = CompletableFuture.supplyAsync(() -> rAL2.id_class("functions", string -> string.endsWith(".mcfunction")), executor).thenCompose(collection -> {
            HashMap hashMap = Maps.newHashMap();
            gy_3 gy_32 = new gy_3(gV_2.id_byte, rjU_2.id_class, rjK_2.id_class, null, this.id_catch, "", rgN_2.id_byte, null, null);
            for (rqO_2 rqO_22 : collection) {
                String string = rqO_22.id_break();
                rqO_2 rqO_23 = new rqO_2(rqO_22.id_byte(), string.substring(id_break, string.length() - id_byte));
                hashMap.put(rqO_23, CompletableFuture.supplyAsync(() -> {
                    List<String> list = rAQ.id_class(rAL2, rqO_22);
                    return gt_3.id_class(rqO_23, this.id_private, gy_32, list);
                }, executor));
            }
            CompletableFuture[] completableFutureArray = hashMap.values().toArray(new CompletableFuture[0]);
            return CompletableFuture.allOf(completableFutureArray).handle((void_, throwable) -> hashMap);
        });
        return ((CompletableFuture)((CompletableFuture)completableFuture.thenCombine(completionStage, Pair::of)).thenCompose(rAu_12::id_class)).thenAcceptAsync(pair -> {
            Map map = (Map)pair.getSecond();
            ImmutableMap.Builder builder = ImmutableMap.builder();
            map.forEach((rqO_22, completableFuture) -> ((CompletableFuture)completableFuture.handle((gt_32, throwable) -> {
                if (throwable != null) {
                    id_class.error("Failed to load function {}", rqO_22, throwable);
                } else {
                    builder.put(rqO_22, gt_32);
                }
                return null;
            })).join());
            this.id_protected = builder.build();
            this.id_case = this.id_throws.id_class((Map)pair.getFirst());
        }, executor2);
    }

    private static List<String> id_class(rAL rAL2, rqO_2 rqO_22) {
        List list;
        block8: {
            rAF rAF2 = rAL2.id_class(rqO_22);
            try {
                list = IOUtils.readLines((InputStream)rAF2.id_break(), (Charset)StandardCharsets.UTF_8);
                if (rAF2 == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (rAF2 != null) {
                        try {
                            rAF2.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    throw new CompletionException(iOException);
                }
            }
            rAF2.close();
        }
        return list;
    }

    public Map<rqO_2, gt_3> id_break() {
        return this.id_protected;
    }

    public rlb_3<gt_3> id_break(rqO_2 rqO_22) {
        return this.id_case.id_break(rqO_22);
    }
}

