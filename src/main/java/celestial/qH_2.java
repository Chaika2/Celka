/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rMK;
import celestial.rqO_2;
import celestial.wX_2;

public class qH_2
extends qc_3<rMK, wX_2<rMK>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/bear/polarbear.png");

    public qH_2(pg_3 pg_32) {
        super(pg_32, new wX_2(), 0.9f);
    }

    @Override
    public rqO_2 id_class(rMK rMK2) {
        return id_class;
    }

    @Override
    protected void id_class(rMK rMK2, Ml_1 ml_1, float f) {
        ml_1.id_class(1.2f, 1.2f, 1.2f);
        super.id_class(rMK2, ml_1, f);
    }
}

