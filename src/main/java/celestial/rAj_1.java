/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.util.Supplier
 */
package celestial;

import celestial.rAC;
import celestial.rAE;
import celestial.rAF;
import celestial.rAI;
import celestial.rAL;
import celestial.rAN;
import celestial.rAV;
import celestial.rAX;
import celestial.rAc_1;
import celestial.rAg_1;
import celestial.rAv_1;
import celestial.rAx_1;
import celestial.rqO_2;
import celestial.rqg_3;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class rAj_1
implements rAv_1 {
    private static final Logger id_class = LogManager.getLogger();
    private final Map<String, rAx_1> id_break = Maps.newHashMap();
    private final List<rAc_1> id_byte = Lists.newArrayList();
    private final List<rAc_1> id_protected = Lists.newArrayList();
    private final Set<String> id_throws = Sets.newLinkedHashSet();
    private final List<rAC> id_case = Lists.newArrayList();
    private final rAI id_catch;

    private void id_byte() {
        this.id_break.clear();
        this.id_throws.clear();
        this.id_case.forEach(rAC::close);
        this.id_case.clear();
    }

    @Override
    public List<rAF> id_byte(rqO_2 rqO_22) throws IOException {
        rAL rAL2 = this.id_break.get(rqO_22.id_byte());
        if (rAL2 != null) {
            return rAL2.id_byte(rqO_22);
        }
        throw new FileNotFoundException(rqO_22.toString());
    }

    public rAj_1(rAI rAI2) {
        this.id_catch = rAI2;
    }

    @Override
    public void id_class(rAc_1 rAc_12) {
        this.id_byte.add(rAc_12);
        this.id_protected.add(rAc_12);
    }

    @Override
    public rAN id_class(Executor executor, Executor executor2, CompletableFuture<rqg_3> completableFuture, List<rAC> list) {
        this.id_byte();
        id_class.info("Reloading ResourceManager: {}", new Supplier[]{() -> list.stream().map(rAC::id_class).collect(Collectors.joining(", "))});
        for (rAC rAC2 : list) {
            try {
                this.id_class(rAC2);
            }
            catch (Exception exception) {
                id_class.error("Failed to add resource pack {}", (Object)rAC2.id_class(), (Object)exception);
                return new rAg_1(new rAV(rAC2, (Throwable)exception));
            }
        }
        return this.id_break(executor, executor2, this.id_byte, completableFuture);
    }

    @Override
    public rAF id_class(rqO_2 rqO_22) throws IOException {
        rAL rAL2 = this.id_break.get(rqO_22.id_byte());
        if (rAL2 != null) {
            return rAL2.id_class(rqO_22);
        }
        throw new FileNotFoundException(rqO_22.toString());
    }

    @Override
    public Set<String> id_class() {
        return this.id_throws;
    }

    public void id_class(rAC rAC2) {
        this.id_case.add(rAC2);
        for (String string : rAC2.id_class(this.id_catch)) {
            this.id_throws.add(string);
            rAx_1 rAx_12 = this.id_break.get(string);
            if (rAx_12 == null) {
                rAx_12 = new rAx_1(this.id_catch, string);
                this.id_break.put(string, rAx_12);
            }
            rAx_12.id_class(rAC2);
        }
    }

    @Override
    public Collection<rqO_2> id_class(String string, Predicate<String> predicate) {
        HashSet hashSet = Sets.newHashSet();
        for (rAx_1 rAx_12 : this.id_break.values()) {
            hashSet.addAll(rAx_12.id_class(string, predicate));
        }
        ArrayList arrayList = Lists.newArrayList((Iterable)hashSet);
        Collections.sort(arrayList);
        return arrayList;
    }

    @Override
    public void close() {
        this.id_byte();
    }

    @Override
    public Stream<rAC> id_break() {
        return this.id_case.stream();
    }

    protected rAN id_break(Executor executor, Executor executor2, List<rAc_1> list, CompletableFuture<rqg_3> completableFuture) {
        rAX rAX2 = id_class.isDebugEnabled() ? new rAX(this, Lists.newArrayList(list), executor, executor2, completableFuture) : rAE.id_class(this, Lists.newArrayList(list), executor, executor2, completableFuture);
        this.id_protected.clear();
        return rAX2;
    }

    @Override
    public boolean id_break(rqO_2 rqO_22) {
        rAL rAL2 = this.id_break.get(rqO_22.id_byte());
        return rAL2 != null ? rAL2.id_break(rqO_22) : false;
    }
}

