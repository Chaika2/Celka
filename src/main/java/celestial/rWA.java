/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rWL;
import celestial.rzE_2;
import celestial.rzG_2;
import com.google.common.collect.Lists;
import java.util.List;

public class rWA
extends rzG_2<rWA> {
    private final List<rzE_2> id_class = Lists.newArrayList();

    @Override
    protected /* synthetic */ rzG_2 id_byte() {
        return this.id_class();
    }

    public rWA(rzG_2<?> ... rzG_2Array) {
        for (rzG_2<?> rzG_22 : rzG_2Array) {
            this.id_class.add(rzG_22.id_break());
        }
    }

    protected rWA id_class() {
        return this;
    }

    @Override
    public rWA id_class(rzG_2<?> rzG_22) {
        this.id_class.add(rzG_22.id_break());
        return this;
    }

    @Override
    public rzE_2 id_break() {
        return new rWL(this.id_class.toArray(new rzE_2[0]), this.id_case());
    }
}

