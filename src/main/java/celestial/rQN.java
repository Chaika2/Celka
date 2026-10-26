/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQQ;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rzd_3;
import celestial.rzr_3;
import java.util.Set;

public class rQN
implements rQz_1 {
    public final rQz_1 id_class;

    public rQN(rQz_1 rQz_12) {
        this.id_class = rQz_12;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public static rQQ id_class(rQQ rQQ2) {
        rQN rQN2 = new rQN(rQQ2.build());
        return () -> rQN2;
    }

    @Override
    public void id_class(rQs_1 rQs_12) {
        rQz_1.super.id_class(rQs_12);
        this.id_class.id_class(rQs_12);
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return this.id_class.id_class();
    }

    public final boolean id_class(rzr_3 rzr_32) {
        return !this.id_class.test(rzr_32);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_class;
    }
}

