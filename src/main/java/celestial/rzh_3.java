/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNA;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWj_1;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzh_3<T extends rzh_3<T>>
implements rNA,
rWj_1<T> {
    private final List<rQz_1> id_class = Lists.newArrayList();

    protected rQz_1[] id_byte() {
        return this.id_class.toArray(new rQz_1[0]);
    }

    @Override
    public /* synthetic */ Object id_class(rQQ rQQ2) {
        return this.id_break(rQQ2);
    }

    public final T id_class() {
        return this.id_break();
    }

    protected abstract T id_break();

    public T id_break(rQQ rQQ2) {
        this.id_class.add(rQQ2.build());
        return this.id_break();
    }

    @Override
    public /* synthetic */ Object id_protected() {
        return this.id_class();
    }
}

