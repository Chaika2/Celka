/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rCZ;
import celestial.rNL;
import celestial.rQa_1;
import celestial.rzh_3;
import celestial.xd_3;
import com.google.common.collect.Sets;
import java.util.Set;

public class rQi_1
extends rzh_3<rQi_1> {
    private final xd_3 id_class;
    private final Set<rCZ<?>> id_break = Sets.newHashSet();

    public rQi_1(xd_3 xd_32) {
        this.id_class = xd_32;
    }

    public rQi_1 id_class(rCZ<?> rCZ2) {
        if (!this.id_class.id_new().id_protected().contains(rCZ2)) {
            throw new IllegalStateException("Property " + rCZ2 + " is not present on block " + this.id_class);
        }
        this.id_break.add(rCZ2);
        return this;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rQi_1 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return new rQa_1(this.id_byte(), this.id_class, this.id_break);
    }
}

