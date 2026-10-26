/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rOD;
import celestial.tV_2;

public abstract class pk_3<T extends rOD, M extends tV_2<T>>
extends qc_3<T, M> {
    private final float id_class;

    public pk_3(pg_3 pg_32, M m, float f) {
        super(pg_32, m, 0.75f);
        this.id_class = f;
    }

    @Override
    protected void id_class(T t, Ml_1 ml_1, float f) {
        ml_1.id_class(this.id_class, this.id_class, this.id_class);
        super.id_class(t, ml_1, f);
    }
}

