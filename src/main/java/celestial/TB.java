/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.pg_3;
import celestial.qc_3;
import celestial.rON;
import celestial.rqO_2;
import celestial.wt_3;

public class TB
extends qc_3<rON, wt_3<rON>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/turtle/big_sea_turtle.png");

    public TB(pg_3 pg_32) {
        super(pg_32, new wt_3(0.0f), 0.7f);
    }

    @Override
    public void id_class(rON rON2, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (rON2.n_()) {
            this.id_byte *= 0.5f;
        }
        super.id_class(rON2, f, f2, ml_1, hx_1, n);
    }

    @Override
    public rqO_2 id_class(rON rON2) {
        return id_class;
    }
}

