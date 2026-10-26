/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNA;
import celestial.rNL;
import celestial.rWg_1;
import celestial.rzG_2;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class rzK_2<T extends rzK_2<T>>
extends rzG_2<T>
implements rWg_1<T> {
    protected int id_class = 1;
    protected int id_break = 0;
    private final List<rNL> id_byte = Lists.newArrayList();

    @Override
    public /* synthetic */ Object id_class(rNA rNA2) {
        return this.id_break(rNA2);
    }

    public T id_class(int n) {
        this.id_class = n;
        return (T)((rzK_2)this.id_byte());
    }

    protected rNL[] id_class() {
        return this.id_byte.toArray(new rNL[0]);
    }

    public T id_break(int n) {
        this.id_break = n;
        return (T)((rzK_2)this.id_byte());
    }

    public T id_break(rNA rNA2) {
        this.id_byte.add(rNA2.id_case());
        return (T)((rzK_2)this.id_byte());
    }
}

