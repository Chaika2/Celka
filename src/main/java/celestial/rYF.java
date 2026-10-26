/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rDM;
import celestial.rDX;
import celestial.rDg_1;
import celestial.rKm_1;
import celestial.rKu_1;
import celestial.rYv_1;
import celestial.reP_2;
import celestial.rrSR;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

public class rYF {
    private Optional<Supplier<rrSR<?>>> id_class = Optional.empty();
    private final Map<rKu_1, List<Supplier<rDM<?>>>> id_break = Maps.newLinkedHashMap();
    private final List<List<Supplier<rDg_1<?, ?>>>> id_byte = Lists.newArrayList();
    private final List<Supplier<reP_2<?, ?>>> id_protected = Lists.newArrayList();

    public rYv_1 id_class() {
        return new rYv_1(this.id_class.orElseThrow(() -> new IllegalStateException("Missing surface builder")), (Map)this.id_break.entrySet().stream().collect(ImmutableMap.toImmutableMap(Map.Entry::getKey, entry -> ImmutableList.copyOf((Collection)((Collection)entry.getValue())))), (List)this.id_byte.stream().map(ImmutableList::copyOf).collect(ImmutableList.toImmutableList()), (List<Supplier<reP_2<?, ?>>>)ImmutableList.copyOf(this.id_protected));
    }

    private void id_class(int n) {
        while (this.id_byte.size() <= n) {
            this.id_byte.add(Lists.newArrayList());
        }
    }

    public rYF id_class(rKm_1 rKm_12, rDg_1<?, ?> rDg_12) {
        return this.id_class(rKm_12.ordinal(), () -> rDg_12);
    }

    public rYF id_class(rrSR<?> rrSR2) {
        return this.id_class(() -> rrSR2);
    }

    public rYF id_class(Supplier<rrSR<?>> supplier) {
        this.id_class = Optional.of(supplier);
        return this;
    }

    public rYF id_class(reP_2<?, ?> reP_22) {
        this.id_protected.add(() -> reP_22);
        return this;
    }

    public <C extends rDX> rYF id_class(rKu_1 rKu_13, rDM<C> rDM2) {
        this.id_break.computeIfAbsent(rKu_13, rKu_12 -> Lists.newArrayList()).add(() -> rDM2);
        return this;
    }

    public rYF id_class(int n, Supplier<rDg_1<?, ?>> supplier) {
        this.id_class(n);
        this.id_byte.get(n).add(supplier);
        return this;
    }
}

