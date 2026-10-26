/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Tc_1;
import celestial.iB_2;
import celestial.pg_3;
import celestial.pm_3;
import celestial.rbB_2;
import celestial.rqO_2;
import celestial.wg_3;

public abstract class pW_2<T extends rbB_2, M extends wg_3<T>>
extends pm_3<T, M> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/zombie/zombie.png");

    protected pW_2(pg_3 pg_32, M m, M m2, M m3) {
        super(pg_32, m, 0.5f);
        this.id_class(new Tc_1(this, m2, m3));
    }

    @Override
    public rqO_2 id_class(rbB_2 rbB_22) {
        return id_class;
    }

    @Override
    protected /* synthetic */ boolean id_class(iB_2 iB_22) {
        return this.id_break((T)((rbB_2)iB_22));
    }

    @Override
    protected boolean id_break(T t) {
        return ((rbB_2)t).sQ();
    }
}

