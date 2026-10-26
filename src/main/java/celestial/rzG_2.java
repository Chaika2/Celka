/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWA;
import celestial.rWj_1;
import celestial.rzE_2;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzG_2<T extends rzG_2<T>>
implements rWj_1<T> {
    private final List<rQz_1> id_class = Lists.newArrayList();

    protected abstract T id_byte();

    @Override
    public /* synthetic */ Object id_class(rQQ rQQ2) {
        return this.id_break(rQQ2);
    }

    public rWA id_class(rzG_2<?> rzG_22) {
        return new rWA(this, rzG_22);
    }

    public abstract rzE_2 id_break();

    public T id_break(rQQ rQQ2) {
        this.id_class.add(rQQ2.build());
        return this.id_byte();
    }

    public final T id_throws() {
        return this.id_byte();
    }

    protected rQz_1[] id_case() {
        return this.id_class.toArray(new rQz_1[0]);
    }

    @Override
    public /* synthetic */ Object id_protected() {
        return this.id_throws();
    }
}

