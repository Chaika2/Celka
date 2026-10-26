/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.DS;
import celestial.Dd_1;
import celestial.Uz_1;
import celestial.rCZ;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class DQ<T1 extends Comparable<T1>>
extends Dd_1 {
    private final rCZ<T1> id_class;

    public DQ(rCZ<T1> rCZ2) {
        this.id_class = rCZ2;
    }

    public DQ<T1> id_class(T1 T1, DS dS) {
        return this.id_class(T1, Collections.singletonList(dS));
    }

    public Dd_1 id_class(Function<T1, DS> function) {
        this.id_class.id_class().forEach(comparable -> this.id_class(comparable, (DS)function.apply(comparable)));
        return this;
    }

    public DQ<T1> id_class(T1 T1, List<DS> list) {
        Uz_1 uz_1 = Uz_1.id_class(this.id_class.id_break(T1));
        this.id_class(uz_1, list);
        return this;
    }

    @Override
    public List<rCZ<?>> id_break() {
        return ImmutableList.of(this.id_class);
    }
}

