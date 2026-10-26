/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.ev_3;
import celestial.rNL;
import celestial.rNx_1;
import celestial.rzh_3;
import com.google.common.collect.Sets;
import java.util.Set;

public class rNd_1
extends rzh_3<rNd_1> {
    private final Set<ev_3> id_class = Sets.newHashSet();

    public rNd_1 id_class(ev_3 ev_32) {
        this.id_class.add(ev_32);
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rNd_1 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rNx_1(this.id_byte(), this.id_class);
    }
}

