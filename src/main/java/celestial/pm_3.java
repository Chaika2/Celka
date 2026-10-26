/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.TC;
import celestial.TT;
import celestial.Tp_1;
import celestial.is_3;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rqO_2;
import celestial.tW_2;

public class pm_3<T extends is_3, M extends tW_2<T>>
extends qc_3<T, M> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/steve.png");

    public pm_3(pg_3 pg_32, M m, float f) {
        this(pg_32, m, f, 1.0f, 1.0f, 1.0f);
    }

    public pm_3(pg_3 pg_32, M m, float f, float f2, float f3, float f4) {
        super(pg_32, m, f);
        this.id_class(new Tp_1(this, f2, f3, f4));
        this.id_class(new TC(this));
        this.id_class(new TT(this));
    }

    @Override
    public rqO_2 id_class(T t) {
        return id_class;
    }
}

