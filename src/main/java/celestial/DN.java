/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.DS;
import celestial.Dd_1;
import celestial.Dz_1;
import celestial.Uz_1;
import celestial.rCZ;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class DN<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>>
extends Dd_1 {
    private final rCZ<T1> id_class;
    private final rCZ<T2> id_break;
    private final rCZ<T3> id_byte;

    public DN(rCZ<T1> rCZ2, rCZ<T2> rCZ3, rCZ<T3> rCZ4) {
        this.id_class = rCZ2;
        this.id_break = rCZ3;
        this.id_byte = rCZ4;
    }

    public Dd_1 id_class(Dz_1<T1, T2, T3, DS> dz_1) {
        this.id_class.id_class().forEach(comparable -> this.id_break.id_class().forEach(comparable2 -> this.id_byte.id_class().forEach(comparable3 -> this.id_class(comparable, comparable2, comparable3, (DS)dz_1.apply(comparable, comparable2, comparable3)))));
        return this;
    }

    public DN<T1, T2, T3> id_class(T1 T1, T2 T2, T3 T3, DS dS) {
        return this.id_class(T1, T2, T3, Collections.singletonList(dS));
    }

    public DN<T1, T2, T3> id_class(T1 T1, T2 T2, T3 T3, List<DS> list) {
        Uz_1 uz_1 = Uz_1.id_class(this.id_class.id_break(T1), this.id_break.id_break(T2), this.id_byte.id_break(T3));
        this.id_class(uz_1, list);
        return this;
    }

    @Override
    public List<rCZ<?>> id_break() {
        return ImmutableList.of(this.id_class, this.id_break, this.id_byte);
    }
}

