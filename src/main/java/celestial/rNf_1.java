/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rNI;
import celestial.rNL;
import celestial.rzE_2;
import celestial.rzG_2;
import celestial.rzh_3;
import com.google.common.collect.Lists;
import java.util.List;

public class rNf_1
extends rzh_3<rNf_1> {
    private final List<rzE_2> id_class = Lists.newArrayList();

    public rNf_1 id_class(rzG_2<?> rzG_22) {
        this.id_class.add(rzG_22.id_break());
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNf_1 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNI(this.id_byte(), this.id_class);
    }
}

