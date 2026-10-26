/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.Tp_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rsi_3;
import celestial.tK_2;

public abstract class qG_2<T extends rsi_3>
extends qc_3<T, tK_2<T>> {
    protected qG_2(pg_3 pg_32, tK_2<T> tK_22, float f) {
        super(pg_32, tK_22, f);
        this.id_class(new Tp_1(this));
    }

    @Override
    protected void id_class(T t, Ml_1 ml_1, float f) {
        float f2 = 0.9375f;
        ml_1.id_class(0.9375f, 0.9375f, 0.9375f);
    }
}

