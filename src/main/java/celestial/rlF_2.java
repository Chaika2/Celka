/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rlL_2;
import celestial.rlO_2;
import celestial.rlQ_2;
import celestial.rlW_2;
import celestial.rlm_3;
import celestial.rqO_2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class rlF_2<T> {
    private rlW_2<T> id_class = rlW_2.id_byte();
    private final List<rlL_2<T>> id_break = Lists.newArrayList();
    private final Function<rlQ_2, rlW_2<T>> id_byte;

    public List<? extends rlO_2<T>> id_byte() {
        return this.id_break;
    }

    public rlF_2(Function<rlQ_2, rlW_2<T>> function) {
        this.id_byte = function;
    }

    public rlO_2<T> id_class(String string) {
        rlL_2 rlL_22 = new rlL_2(new rqO_2(string));
        this.id_break.add(rlL_22);
        return rlL_22;
    }

    public void id_class() {
        this.id_class = rlW_2.id_byte();
        rlm_3 rlm_32 = rlm_3.id_break();
        this.id_break.forEach(rlL_22 -> rlL_22.id_class((rqO_2 rqO_22) -> rlm_32));
    }

    public void id_class(rlQ_2 rlQ_22) {
        rlW_2 rlW_22 = this.id_byte.apply(rlQ_22);
        this.id_class = rlW_22;
        this.id_break.forEach(rlL_22 -> rlL_22.id_class(rlW_22::id_class));
    }

    public Set<rqO_2> id_break(rlQ_2 rlQ_22) {
        rlW_2<T> rlW_22 = this.id_byte.apply(rlQ_22);
        Set set = this.id_break.stream().map(rlL_2::id_break).collect(Collectors.toSet());
        ImmutableSet immutableSet = ImmutableSet.copyOf(rlW_22.id_break());
        return Sets.difference(set, (Set)immutableSet);
    }

    public rlW_2<T> id_break() {
        return this.id_class;
    }
}

